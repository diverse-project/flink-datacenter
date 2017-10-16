package flink.datacenter.sources.delayed;

import java.time.Duration;

import flink.datacenter.sources.AbstractDatacenterSourceFunction;

public abstract class AbstractDelayedDatacenterSourceFunction extends AbstractDatacenterSourceFunction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected boolean isRunning = true;
	
	
	@Override
	public void cancel() {
		isRunning = false;	
	}
	
	public AbstractDelayedDatacenterSourceFunction(String filePath) {
		super(filePath);
	}

	/**
	 * The interval 
	 * @return
	 */
	protected abstract Duration delay();

}
