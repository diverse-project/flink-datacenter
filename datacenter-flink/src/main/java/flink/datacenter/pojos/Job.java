package flink.datacenter.pojos;

import java.util.LinkedList;
import java.util.List;

public class Job {
	
	private Long _id;
	
	private String name;
	
//	private List<Machine>  hostMachines = new LinkedList<Machine>();
	
	private List<Task> tasks = new LinkedList<Task>();
	
	/**
	 * 
	 */
	public Job() {
		super();
	}
	/**
	 * @param _id
	 * @param hostMachine
	 */
	public Job(Long _id, List<Machine> hostMachines) {
		this._id = _id;
		//this.hostMachines = hostMachines;
	}

	/**
	 * @return the _id
	 */
	public Long get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(Long _id) {
		this._id = _id;
	}

//	/**
//	 * @return the hostMachines
//	 */
//	public List<Machine> getHostMachines() {
//		return hostMachines;
//	}
//
//
//	
	/**
	 * @return hostMachines
	 */
	public List<Task> getTasks() {
		return tasks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
