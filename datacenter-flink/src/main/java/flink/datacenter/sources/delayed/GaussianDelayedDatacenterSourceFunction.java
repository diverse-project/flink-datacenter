package flink.datacenter.sources.delayed;

import java.time.Duration;
import java.util.Iterator;

import org.apache.commons.math3.distribution.NormalDistribution;

import flink.datacenter.pojos.Task;

public class GaussianDelayedDatacenterSourceFunction extends AbstractDelayedDatacenterSourceFunction {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private NormalDistribution distribution;

//	public GaussianDelayedDatacenterSourceFunction(String filePath) {
//		super(filePath);
//	}
	
	public GaussianDelayedDatacenterSourceFunction(String filePath, double mean, double sigma) {
		super(filePath);
		distribution = new NormalDistribution(mean, sigma);
	}
	

	@Override
	public void run(SourceContext<Task> ctx)
			throws Exception {
		try {
			Iterator<Task> iterator = iterable().iterator();
			Object lock = new Object();
			synchronized (lock) {
				while(isRunning && iterator.hasNext()) {
					ctx.collect(iterator.next());
					lock.wait(delay().toMillis());
				}	
			}
					
		} catch (Exception e) {
			LOG.error(e.getLocalizedMessage());
			throw e;
		}
	}


	@Override
	protected Duration delay() {
		return Duration.ofMillis(new Double(distribution.sample()).longValue());
	}

}
