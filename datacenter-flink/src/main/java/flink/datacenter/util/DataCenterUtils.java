package flink.datacenter.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

import flink.datacenter.csv.mappers.TaskCSVConverter;
import flink.datacenter.csv.mappers.TaskCSVParser;
import flink.datacenter.pojos.Task;

public class DataCenterUtils {

		//FIXME for now only two supported extensions are {csv,zip, and gz}
		//FIXME only one single file is supported 
	public static Stream<Task> readDataFromPath(String datacenterFilePath) throws Exception {
		Path csvFilePath;
		if (datacenterFilePath.endsWith("gz") || datacenterFilePath.endsWith("zip")) {
			
			csvFilePath = unzipDataFile(datacenterFilePath);
	        
		} else if (datacenterFilePath.endsWith("csv")) {
			csvFilePath = FileSystems.getDefault().getPath(datacenterFilePath);
		} else {
			throw new UnsupportedOperationException(MessageFormat.format("Unsupported file extension {0}", datacenterFilePath.substring(datacenterFilePath.lastIndexOf('.'))));
		}
		return getStreamFromDatacenter(csvFilePath);
	}
	
	private static Path unzipDataFile(String datacenterFilePath) throws IOException {
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

	private static Stream<Task> getStreamFromDatacenter(Path csvFilePath) {
		
		return TaskCSVParser.TaskParser().readFromFile(csvFilePath, StandardCharsets.US_ASCII)
				.filter(x -> x.isValid())
				.map(x -> x.getResult())
				.map(csvTask -> TaskCSVConverter.convert(csvTask));
	}
}
