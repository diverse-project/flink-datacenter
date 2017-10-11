package flink.datacenter.pojos;

import java.util.LinkedList;
import java.util.List;

public class Job {
	
	private Long _id;
	
	private Machine hostMachine;
	
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
	public Job(Long _id, Machine hostMachine) {
		this._id = _id;
		this.hostMachine = hostMachine;
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

	/**
	 * @return the hostMachine
	 */
	public Machine getHostMachine() {
		return hostMachine;
	}

	/**
	 * @param hostMachine the hostMachine to set
	 */
	public void setHostMachine(Machine hostMachine) {
		this.hostMachine = hostMachine;
	}
	
	public List<Task> getTasks() {
		return tasks;
	}

}
