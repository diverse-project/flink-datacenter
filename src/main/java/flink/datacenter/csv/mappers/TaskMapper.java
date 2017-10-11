package flink.datacenter.csv.mappers;

import de.bytefish.jtinycsvparser.builder.IObjectCreator;
import de.bytefish.jtinycsvparser.mapping.CsvMapping;

import static flink.datacenter.csv.mappers.TaskMapperConstants.*;

public class TaskMapper extends CsvMapping<flink.datacenter.csv.mappers.Task> {

	public TaskMapper(@SuppressWarnings("rawtypes") IObjectCreator creator) {
		super(creator);
		
		mapProperty(START_TIME, Long.class, Task::setStartTime);
		mapProperty(END_TIME, Long.class, Task::setEndTime);
		mapProperty(JOB_ID, Long.class, Task::setJob_id);
		mapProperty(TASK_INDEX, Integer.class, Task::setTaskIndex);
		mapProperty(MACHINE_ID, Long.class, Task::setMachine_id);
		mapProperty(CPU_RATE, Float.class, Task::setCPURate);
		mapProperty(CANONICAL_MEMORY_USAGE, Float.class, Task::setCanonicalMemUsage);
		mapProperty(ASSIGNED_MEM_USAGE, Float.class, Task::setAssignedMemUsage);
		mapProperty(UNMAPPED_CACHE, Float.class, Task::setAssignedMemUsage);
		mapProperty(TOTAL_PAGE_CACHE, Float.class, Task::setTotalPageCache);
		mapProperty(MAX_MEMORY_USAGE, Float.class, Task::setMaxMemoryUsage);
		mapProperty(IO_TIME, Float.class, Task::setIOTime);
		mapProperty(LOCAL_DISK_USAGE, Float.class, Task::setLocalDiskUsage);
		mapProperty(MAX_CPU_RATE, Float.class, Task::setMaxCPURate);
		mapProperty(MAX_DISK_IO_TIME, Float.class, Task::setMaxDiskIOTime);
		mapProperty(CYCLES_PER_INSTRUCTION, Float.class, Task::setCyclesPerInstruction);
		mapProperty(MEMORY_ACCESS_PER_INSTRUCTION, Float.class, Task::setMemoryAccessPerInstruction);
		mapProperty(SAMPLE_PORTION, Float.class, Task::setSamplePortion);
		mapProperty(AGGREGATION_TYPE, Boolean.class, Task::setAggregationType);
		mapProperty(SAMPLED_CPU_USAGE, Float.class, Task::setCPURate);
				
	}

}
