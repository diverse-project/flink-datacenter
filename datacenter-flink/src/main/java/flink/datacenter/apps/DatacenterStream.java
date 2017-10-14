/**
 * 
 */
package flink.datacenter.apps;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.core.fs.FileSystem.WriteMode;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flink.datacenter.pojos.Task;
import flink.datacenter.sources.DatacenterSourceFunction;


/**
 * @author amine
 *
 */
public class DatacenterStream {
	
	private static final String FILE = "f";
	
	private static final String FILE_LONG = "file";	
	
	private static final String PARALLELISM = "p";	
	
	private static final String PARALLELISM_LONG = "parallelism";
		
	private static final Logger LOG = LoggerFactory.getLogger(DatacenterStream.class);
	
	private static String filePath = "/home/amine/git/flink-datacenter/datacenter-flink/src/main/resources/part-00000-of-00500.csv.gz";
	
	private static int parallelism = 1;
	/**
	 * 
	 */
	public DatacenterStream() {
		super();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Options options = new Options();
		options.addOption(new Option(FILE, FILE_LONG, true, "The path to the csv File-- default a file "));
		options.addOption(PARALLELISM, PARALLELISM_LONG, true, "Specifies the parallelism value --default is 1");
		
		try {
			CommandLine cli = new DefaultParser().parse(options, args);
			if (cli.hasOption(FILE)) {
				filePath = cli.getOptionValue(FILE);
			}
			
			if (cli.hasOption(PARALLELISM)) {
				parallelism = Integer.parseInt(cli.getOptionValue(PARALLELISM));
			}
			
		} catch (ParseException e ) {
			LOG.error(e.getLocalizedMessage());
		}
		
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		
//		final StreamTableEnvironment tableEnv = TableEnvironment.getTableEnvironment(env);
		
        env.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);

        env.setParallelism(parallelism);
        
		DataStream<Task> taskStream = env.addSource(new DatacenterSourceFunction(filePath));
		
		DataStream<Tuple2<Long, String>> machineStream = taskStream.map(task -> new Tuple2<Long, String>(task.getHostMachine().get_id(),
																										 task.getHostMachine().getName()))
																   .keyBy(0)
																   .reduce((x,y) -> x);
		DataStream<Tuple2<Long,String>> jobStream = taskStream.map(task -> new Tuple2<Long, String>(task.getParentJob().get_id(),
																									task.getParentJob().getName()))
															  .keyBy(0)
															  .reduce((x,y) -> x);
		
//		Table tasksTable = tableEnv.fromDataStream(taskStream);
//		tableEnv.registerTable("tasks", tasksTable);
//		
//		Table machinesTable = tableEnv.fromDataStream(machineStream);
//		tableEnv.registerTable("machines", machinesTable);
//
//		Table jobsTable = tableEnv.fromDataStream(jobStream);
//		tableEnv.registerTable("jobs", tasksTable);
		

        jobStream.writeAsCsv("/home/amine/git/flink-datacenter/datacenter-flink/target/output/jobs.out.cvs",WriteMode.OVERWRITE);
        //taskStream.writeAsCsv("/home/amine/git/flink-datacenter/datacenter-flink/target/output/tasks.out.cvs",WriteMode.OVERWRITE);
        machineStream.writeAsCsv("/home/amine/git/flink-datacenter/datacenter-flink/target/output/machines.out.cvs",WriteMode.OVERWRITE);

        //FIXME write a proper timestamp extractor		
//        		.assignTimestampsAndWatermarks(new AscendingTimestampExtractor<Task>(){ 
//                    
//        			/* (non-Javadoc)
//        			 * Sorting data stream based on tasks start time
//        			 * @see org.apache.flink.streaming.api.functions.timestamps.AscendingTimestampExtractor#extractAscendingTimestamp(java.lang.Object)
//        			 */
//        			@Override
//                    public long extractAscendingTimestamp(Task task) {
//                        return task.getStartTime();
//                    }
//                });
        
		/**
		 * organizing data by machine 
		 */
        LOG.info("Starting the keying by machine");
        //KeyedStream<Task, Long> taskByMachine = stream.keyBy(task ->task.getParentJob().get_id());
        															 
        
		DataStream<Tuple2<String,Float>> windowedCPUSumbyMachine = taskStream
				   										     .map(task -> new Tuple2<String,Float>("machine#"+task.getHostMachine().get_id(),
				   										    		 									task.getCanonicalMemUsage()))
														     .keyBy(0)
														     .timeWindow(Time.seconds(10))
														     .sum(1)
														     .filter(tuple-> tuple.f1 > 0.02f);	
		
		DataStream<Tuple3<String, String, Integer>> jobsCountPerMachine = taskStream.map(task -> 
																							new Tuple3<String, String, Integer>("machine#"+task.getHostMachine().get_id(), 
																														        "task#"+task.getParentJob().get_id(),
																																 1))
																					.keyBy(0,1)
																					.timeWindow(Time.seconds(10))
																					.reduce((tuple1, tuple2) -> new Tuple3<String, String, Integer> (tuple1.f0,tuple1.f1,tuple1.f2 + tuple2.f2));
        LOG.info("Finished the keying machine");
        //FIXME not writing to output
        windowedCPUSumbyMachine.writeAsCsv("/home/amine/git/flink-datacenter/datacenter-flink/target/output/part-00000-of-00500.out.cvs",WriteMode.OVERWRITE);
        windowedCPUSumbyMachine.print();
        jobsCountPerMachine.print();
        try {
			env.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
