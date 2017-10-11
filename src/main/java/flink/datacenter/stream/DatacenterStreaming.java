/**
 * 
 */
package flink.datacenter.stream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.timestamps.AscendingTimestampExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flink.datacenter.pojos.Task;
import flink.datacenter.sources.DataCenterSourceFunction;


/**
 * @author amine
 *
 */
public class DatacenterStreaming {
	
	
	private static final String FILE = "f";
	
	private static final String FILE_LONG = "file";	
	
	private static final String PARALLELISM = "p";	
	
	private static final String PARALLELISM_LONG = "parallelism";
		
	private static final Logger LOG = LoggerFactory.getLogger(DatacenterStreaming.class);
	
	private static String filePath = "src/main/resources/part-00000-of00500.csv.gz";
	
	private static int parallelism = 1;
	/**
	 * 
	 */
	public DatacenterStreaming() {
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

        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);

        env.setParallelism(parallelism);
        
        @SuppressWarnings("serial")
		DataStream<Task> stream = env.addSource(new DataCenterSourceFunction(filePath))
        		.assignTimestampsAndWatermarks(new AscendingTimestampExtractor<Task>(){ 
                    
        			/* (non-Javadoc)
        			 * Sorting data stream based on tasks start time
        			 * @see org.apache.flink.streaming.api.functions.timestamps.AscendingTimestampExtractor#extractAscendingTimestamp(java.lang.Object)
        			 */
        			@Override
                    public long extractAscendingTimestamp(Task task) {
                        return task.getStartTime();
                    }
                });
        

		/**
		 * organizing data by machine 
		 */
        
        KeyedStream<Task,Long> taskByMachine = stream.keyBy(task -> task.getParentJob().getHostMachine().get_id());
        
        try {
			env.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
			

}
