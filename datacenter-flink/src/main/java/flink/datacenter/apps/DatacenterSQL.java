package flink.datacenter.apps;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.table.sources.CsvTableSource;
import org.apache.flink.table.sources.TableSource;
import org.apache.flink.table.api.java.StreamTableEnvironment;
import org.apache.flink.table.api.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flink.datacenter.csv.mappers.Task;

public class DatacenterSQL {
	
	private static final String TASK_FILE = "tf";
	
	private static final String TASK_FILE_LONG = "tasks-file";	
	
	private static final String MACHINE_FILE = "mf";
	
	private static final String MACHINE_FILE_LONG = "machines-file";
	
	private static final String PARALLELISM = "p";	
	
	private static final String PARALLELISM_LONG = "parallelism";
		
	private static final Logger LOG = LoggerFactory.getLogger(DatacenterStream.class);
	
	private static String tasksPath = "/home/amine/git/flink-datacenter/datacenter-flink/src/main/resources/task-usage.csv";
	
	private static String machinesPath = "/home/amine/git/flink-datacenter/datacenter-flink/src/main/resources/machine-events.csv";
	
	private static int parallelism = 1;
	/**
	 * 
	 */
	public DatacenterSQL() {
		super();
		
	}

	
	


	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Options options = new Options();
		options.addOption(new Option(TASK_FILE, TASK_FILE_LONG, true, "The path to the tasks csv File-- default a file "));
		options.addOption(new Option(MACHINE_FILE, MACHINE_FILE_LONG, true, "The path to the machines csv File-- default a file "));
		options.addOption(PARALLELISM, PARALLELISM_LONG, true, "Specifies the parallelism value --default is 1");
		
		try {
			CommandLine cli = new DefaultParser().parse(options, args);
			if (cli.hasOption(TASK_FILE)) {
				tasksPath = cli.getOptionValue(TASK_FILE);
			}
			if (cli.hasOption(MACHINE_FILE)) {
				machinesPath = cli.getOptionValue(MACHINE_FILE);
			}
			if (cli.hasOption(PARALLELISM)) {
				parallelism = Integer.parseInt(cli.getOptionValue(PARALLELISM));
			}
			
		} catch (ParseException e ) {
			LOG.error(e.getLocalizedMessage());
		}
		
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

		StreamTableEnvironment tableEnv = TableEnvironment.getTableEnvironment(env);
		
		TableSource tasksTable = 	CsvTableSource.builder()
												   .path(tasksPath)
												   .fieldDelimiter(",")
												   .field("startTime", Types.INT)
												   .field("endTime", Types.INT)
												   .field("jobId", Types.INT)
												   .field("taskIndex", Types.INT)
												   .field("machineID", Types.INT)
												   .field("CPURate", Types.FLOAT)
												   .field("canonicalMemoryUsage", Types.FLOAT)
												   .field("assignedMemUSage", Types.FLOAT)
												   .field("unmappedPageCache", Types.FLOAT)
												   .field("totalPageCache", Types.FLOAT)
												   .field("maxMemoryUsage", Types.FLOAT)
												   .field("diskIOTime", Types.FLOAT)
												   .field("maxCPURate", Types.FLOAT)
												   .field("maxDiskIOTime", Types.FLOAT)
												   .field("cyclesPerInstr", Types.FLOAT)
												   .field("memoryAccessPerInstr", Types.FLOAT)
												   .field("samplePortion", Types.FLOAT)
												   .field("aggregationType", Types.BOOLEAN)
												   .field("sampledCPUUsage", Types.FLOAT)
												   .build();
		tableEnv.registerTableSource("tasks", tasksTable);


												   
		TableSource<?> machinesTable = CsvTableSource.builder()
												  .path(machinesPath)
												  .fieldDelimiter(",")
												  .field("time", Types.INT)
												  .field("machineID", Types.INT)
												  .field("attributeName", Types.STRING)
												  .field("attributeValue", Types.STRING)
												  .field("attributeDeleted", Types.BOOLEAN)
												  .build();
		tableEnv.registerTableSource("machines", machinesTable);
		
		Table table = tableEnv.sql("SELECT  * FROM machines");
		
		DataStream<Task> tasksStream = tableEnv.toDataStream(table, Task.class);
		tasksStream.print();
		
		tableEnv.execEnv();
		
		
	    
	}
}
