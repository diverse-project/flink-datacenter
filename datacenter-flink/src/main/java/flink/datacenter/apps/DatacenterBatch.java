/**
 * 
 */
package flink.datacenter.apps;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.flink.api.common.functions.FoldFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.core.fs.FileSystem.WriteMode;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.timestamps.AscendingTimestampExtractor;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flink.datacenter.pojos.Task;
import flink.datacenter.sources.DatacenterSourceFunction;


/**
 * @author amine
 *
 */
@SuppressWarnings("deprecation")
public class DatacenterBatch {
	
	
	private static final String FILE = "f";
	
	private static final String FILE_LONG = "file";	
	
	private static final String PARALLELISM = "p";	
	
	private static final String PARALLELISM_LONG = "parallelism";
		
	private static final Logger LOG = LoggerFactory.getLogger(DatacenterBatch.class);
	
	private static String filePath = "/home/amine/git/flink-datacenter/datacenter-flink/src/main/resources/part-00000-of-00500.csv.gz";
	
	private static int parallelism = 1;
	/**
	 * 
	 */
	public DatacenterBatch() {
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

        env.setStreamTimeCharacteristic(TimeCharacteristic.IngestionTime);

        env.setParallelism(parallelism);
        
        @SuppressWarnings("serial")
        //FIXME write a proper timestamp extractor
		DataStream<Task> stream = env.addSource(new DatacenterSourceFunction(filePath));
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
        															 
        
		DataStream<Tuple2<String,Float>> windowedCPUSumbyMachine = stream
				   										     .map(task -> new Tuple2<String,Float>("machine#"+task.getParentJob().get_id() , task.getCanonicalMemUsage()))
														     .keyBy(0)
														     .timeWindow(Time.seconds(10))
														     .sum(1)
														     .filter(tuple-> tuple.f1 > 0.02f);	
//        															 .fold(new Tuple2<Float,Float>(0.0f,0.0f), new FoldFunction<Task, Tuple2<Float,Float>>() {
//        																 @Override
//        																 public Tuple2<Float, Float> fold(Tuple2<Float,Float> acc, Task task) {
//		        																acc.f0 = task.getCPURate();
//		        																acc.f1 = task.getAssignedMemUsage();
//		        																return acc;
//        																 		}
//        																 });
        LOG.info("Finished the keying machine");
        //FIXME not writing to output
        //sumCPUbyMachine.writeAsCsv("/home/amine/git/flink-datacenter/datacenter-flink/target/output/part-00000-of-00500.out.cvs",WriteMode.OVERWRITE);
        windowedCPUSumbyMachine.print();
        try {
			env.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
