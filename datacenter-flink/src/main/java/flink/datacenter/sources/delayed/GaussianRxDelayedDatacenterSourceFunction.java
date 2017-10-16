package flink.datacenter.sources.delayed;

import java.time.Duration;

import org.apache.commons.math3.distribution.NormalDistribution;

public class GaussianRxDelayedDatacenterSourceFunction extends AbstractRxDelayedDatacenterSourceFunction{

	private static final long serialVersionUID = 1L;
	
	private NormalDistribution distribution;
	
	public GaussianRxDelayedDatacenterSourceFunction(String dataCenterFilePath) {
		super(dataCenterFilePath);
	}
	
	public GaussianRxDelayedDatacenterSourceFunction(String dataCenterFilePath, 
														double mean, 
														double sigma) {
		this(dataCenterFilePath);
		this.setDistribution(new NormalDistribution(mean, sigma));
	}
	
	@Override
	protected Duration delay() {
		return Duration.ofMillis(new Double(distribution.sample()).longValue());
	}

	public NormalDistribution getDistribution() {
		return distribution;
	}

	public void setDistribution(NormalDistribution distribution) {
		this.distribution = distribution;
	}

}
