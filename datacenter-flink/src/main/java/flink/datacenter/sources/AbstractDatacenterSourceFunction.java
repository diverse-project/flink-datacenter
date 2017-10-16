package flink.datacenter.sources;

import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flink.datacenter.pojos.Task;
import flink.datacenter.util.DataCenterUtils;


public abstract class AbstractDatacenterSourceFunction implements SourceFunction<flink.datacenter.pojos.Task> {

	
	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;

	protected static final Logger LOG = LoggerFactory.getLogger(AbstractDatacenterSourceFunction.class);
	
	protected String datacenterFilePath;
	
	
	/**
	 * @param filePath
	 */
	public AbstractDatacenterSourceFunction(String filePath) {
		this.setDatacenterFilePath(filePath);
	}

	/**
	 * @return the datacenterFilePath
	 */
	public String getDatacenterFilePath() {
		return datacenterFilePath;
	}

	/**
	 * @param datacenterFilePath the datacenterFilePath to set
	 */
	public void setDatacenterFilePath(String datacenterFilePath) {
		this.datacenterFilePath = datacenterFilePath;
	}
	
	protected Iterable<Task> iterable() throws Exception {	
		try {
			return (Iterable<Task>)DataCenterUtils.readDataFromPath(datacenterFilePath)::iterator;
		} catch (Exception e) {
			LOG.error(e.getLocalizedMessage());
			throw e;
		}
	}
}
