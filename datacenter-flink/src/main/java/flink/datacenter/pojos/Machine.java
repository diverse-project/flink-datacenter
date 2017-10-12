package flink.datacenter.pojos;

import java.util.LinkedList;
import java.util.List;

public class Machine {

	private Long _id;

	private List<Task> tasks = new LinkedList<Task>();
	

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public Machine(Long _id) {
		super();
		this._id = _id;
	}

	/**
	 * @param _id
	 */
	public Machine() {
		super();
	}
	public List<Task> getTasks() {
		// TODO Auto-generated method stub
		return tasks ;
	}
	

	
}
