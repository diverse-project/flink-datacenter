package flink.datacenter.pojos;

import java.util.HashMap;
import java.util.Map;

public class DataCenterFactory {

	public static DataCenterFactory instance = new DataCenterFactory();

	private Map<Long, Machine> machinesMap = new HashMap<Long,Machine>();
	private Map<Long, Job> jobsMap = new HashMap<Long, Job>();
	
 	private DataCenterFactory() {
		super();
	}
	
	public static DataCenterFactory getInstance() {
		return instance;
	}

	public Job createOrGetJobwithID(long jobID) {
		if (! jobsMap.containsKey(jobID)) {
			Job result = new Job();
			jobsMap.put(jobID, result);
			return result;
		}
		return jobsMap.get(jobID);
	}

	public Machine createOrGetMachinewithID(long machineID) {
		if (! machinesMap.containsKey(machineID)) {
			Machine result = new Machine();
			machinesMap.put(machineID, result);
			return result;
		}
		return machinesMap.get(machineID);
	}
	
}
