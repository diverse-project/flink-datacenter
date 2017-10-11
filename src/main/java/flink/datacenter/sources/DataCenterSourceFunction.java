package flink.datacenter.sources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.util.IterableIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flink.datacenter.csv.mappers.TaskCSVConverter;
import flink.datacenter.csv.mappers.TaskCSVParser;
import flink.datacenter.pojos.Task;

@SuppressWarnings("serial")
public class DataCenterSourceFunction implements SourceFunction<flink.datacenter.pojos.Task> {

	private volatile boolean isRunning = true;
	private static final Logger LOG = LoggerFactory.getLogger(DataCenterSourceFunction.class);
	
	private String datacenterFilePath;
	
	
	/**
	 * @param filePath
	 */
	public DataCenterSourceFunction(String filePath) {
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
		
		
		//FIXME for now only two supported extensions are {csv,zip, and gz}
		//FIXME only one single file is supported 
		try {
			Path csvFilePath;
			if (datacenterFilePath.endsWith("gz") || datacenterFilePath.endsWith("zip")) {
				
				csvFilePath = unzipDataFile(datacenterFilePath);
		        
			} else if (datacenterFilePath.endsWith("csv")) {
				csvFilePath = FileSystems.getDefault().getPath(datacenterFilePath);
			} else {
				throw new UnsupportedOperationException(MessageFormat.format("Unsupported file extension {0}", datacenterFilePath.substring(datacenterFilePath.lastIndexOf('.'))));
			}
			Stream<Task> stream = getStreamFromDatacenter (csvFilePath);
			Iterator<Task> iterator = stream.iterator();
			
			while(isRunning && iterator.hasNext()) {
				context.collect(iterator.next());
			}
			
		} catch (Exception e) {
			LOG.error(e.getLocalizedMessage());
			throw e;
		} 
		
	}

	private Path unzipDataFile(String datacenterFilePath2) throws IOException {
		String tmpFile = "/tmp/myFile.csv";
		FileInputStream fis = new FileInputStream(datacenterFilePath);
		GZIPInputStream gis = new GZIPInputStream(fis);
		
		byte[] buffer = new byte[1024];
        int length;	
		
        FileOutputStream fos = new FileOutputStream(tmpFile);
        
        while ((length = gis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        
        fos.close();
        gis.close();
        fis.close();
        
        return FileSystems.getDefault().getPath(tmpFile);
	}

	private Stream<Task> getStreamFromDatacenter(Path csvFilePath) {
		
		return TaskCSVParser.TaskParser().readFromFile(csvFilePath, StandardCharsets.US_ASCII)
				.filter(x -> x.isValid())
				.map(x -> x.getResult())
				.map(csvTask -> TaskCSVConverter.convert(csvTask));
	}
	
}
