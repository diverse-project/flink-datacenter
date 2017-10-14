package flink.datacenter.pojos;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DataCenterFactory {

	public static DataCenterFactory instance = new DataCenterFactory();
	
	private Map<Long, Machine> machinesMap = new HashMap<Long,Machine>();
	private Map<Long, Job> jobsMap = new HashMap<Long, Job>();
	private Random rnd = new Random();
	
 	private DataCenterFactory() {
		super();
	}
	
	public static DataCenterFactory getInstance() {
		return instance;
	}

	public Job createOrGetJobwithID(long jobID) {
		if (! jobsMap.containsKey(jobID)) {
			Job result = new Job();
			result.set_id(jobID);
			result.setName(Long.toHexString(rnd.nextLong()));
			jobsMap.put(jobID, result);
			return result;
		}
		return jobsMap.get(jobID);
	}

	public Machine createOrGetMachinewithID(long machineID) {
		if (! machinesMap.containsKey(machineID)) {
			Machine result = new Machine();
			result.set_id(machineID);
			result.setName(Long.toHexString(rnd.nextLong()));
			machinesMap.put(machineID, result);
			return result;
		}
		return machinesMap.get(machineID);
	}
	
}
