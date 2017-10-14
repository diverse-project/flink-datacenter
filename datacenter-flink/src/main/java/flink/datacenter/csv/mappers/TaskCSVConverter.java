package flink.datacenter.csv.mappers;

import flink.datacenter.pojos.DataCenterFactory;

public class TaskCSVConverter {

	public static flink.datacenter.pojos.Task convert (Task csvTask) {
		
		flink.datacenter.pojos.Task task = new flink.datacenter.pojos.Task ();
		
		task.set_id(csvTask.getTaskIndex());
		task.setAggregationType(csvTask.getAggregationType() == 1);
		task.setStartTime(csvTask.getStartTime());
		task.setEndTime(csvTask.getEndTime());
		task.setCPURate(csvTask.getCPURate());
		task.setCanonicalMemUsage(csvTask.getCanonicalMemUsage());
		task.setAssignedMemUsage(csvTask.getAssignedMemUsage());
		task.setUnmappedCache(csvTask.getUnmappedCache());
		task.setTotalPageCache(csvTask.getTotalPageCache());
		task.setMaxMemoryUsage(csvTask.getMaxMemoryUsage());
		task.setIOTime(csvTask.getIOTime());
		task.setLocalDiskUsage(csvTask.getLocalDiskUsage());
		task.setMaxCPURate(csvTask.getMaxCPURate());
		task.setMaxDiskIOTime(csvTask.getMaxDiskIOTime());
		task.setCyclesPerInstruction(csvTask.getCyclesPerInstruction());
		task.setMemoryAccessPerInstruction(csvTask.getMemoryAccessPerInstruction());
		task.setSamplePortion(csvTask.getSamplePortion());
		task.setSampledCPUUsage(csvTask.getSampledCPUUsage());
		
		flink.datacenter.pojos.Machine machine = DataCenterFactory.getInstance().createOrGetMachinewithID(csvTask.getMachine_id());
		
		flink.datacenter.pojos.Job job = DataCenterFactory.getInstance().createOrGetJobwithID(csvTask.getJob_id());
		
		//machine.getJobs().add(job);
		
		task.setParentJob(job);
		task.setHostMachine(machine);
		
		job.getTasks().add(task);
		machine.getTasks().add(task);
		return task;
	}
}
