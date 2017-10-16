package flink.datacenter.sources;

import java.util.Iterator;

import flink.datacenter.pojos.Task;

public class DatacenterSourceFunction extends AbstractDatacenterSourceFunction {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private volatile boolean isRunning = true;
	
	
	
	/**
	 * @param filePath
	 */
	public DatacenterSourceFunction(String filePath) {
		super(filePath);
	}

	/**
	 * @return the isRunning
	 */
	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * @param isRunning the isRunning to set
	 */
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
 
	
	
 	/* (non-Javadoc)
 	 * @see org.apache.flink.streaming.api.functions.source.SourceFunction#cancel()
 	 */
 	@Override
	public void cancel() {
		isRunning = false;	
	}

 	
	/* (non-Javadoc)
	 * @see org.apache.flink.streaming.api.functions.source.SourceFunction#run(org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext)
	 */
	@Override
	public void run(org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext<Task> context)
			throws Exception {
	
		try {
			Iterator<Task> iterator = iterable().iterator();
			
			while(isRunning && iterator.hasNext()) {
				context.collect(iterator.next());
			}			
		} catch (Exception e) {
			LOG.error(e.getLocalizedMessage());
			throw e;
		} 
		
	}
	
}
