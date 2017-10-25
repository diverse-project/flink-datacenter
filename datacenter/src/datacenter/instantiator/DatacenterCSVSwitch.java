package datacenter.instantiator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Nonnull;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import datacenter.CloudNetwork;
import datacenter.DynamicElement;
import datacenter.GeoLocation;
import datacenter.Job;
import datacenter.Machine;
import datacenter.Server;
import datacenter.Task;
import datacenter.util.DatacenterSwitch;

public class DatacenterCSVSwitch extends DatacenterSwitch<Object> {

	private static final char MISSING = 'M'; 
	
	private Map<Integer, PrintWriter> streamFiles;
	private String samplePath;
	
	private boolean append = false;
	private boolean autoFlush = true;
	private String charset = "UTF-8";

	public DatacenterCSVSwitch (@Nonnull String samplePath) throws Exception {
		super();
		streamFiles = new HashMap<Integer, PrintWriter>();
		this.samplePath = samplePath;
		
		prepareCSV(modelPackage.getCloudNetwork());
		prepareCSV(modelPackage.getServer());
		prepareCSV(modelPackage.getMachine());
	//	prepareCSV(modelPackage.getGeoLocation());
		prepareCSV(modelPackage.getJob());
		prepareCSV(modelPackage.getTask());
		
	}

	private void prepareCSV(@Nonnull EClass eClass) throws Exception {
		File csvDirectory = new File(samplePath+"/datacenter/csv/");
		
		if(!csvDirectory.exists()) 
			csvDirectory.mkdirs();
		File csvFile = new File(samplePath+"/datacenter/csv/"+eClass.getName()+".csv");
		
		FileOutputStream csvfos = new FileOutputStream(csvFile, append);
		OutputStreamWriter csvosw = new OutputStreamWriter(csvfos, charset);
		BufferedWriter csvbw = new BufferedWriter(csvosw);
		PrintWriter csvpw = new PrintWriter(csvbw, autoFlush);
		
		StringBuilder sb = new StringBuilder();
		for (EAttribute attr :eClass.getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = attr.getName();	
			sb.append(value);
			sb.append(',');
		}
		for (EReference eRef : eClass.getEAllReferences()) {
			if (eRef.getUpperBound()== -1) continue;
			Object eType = eRef.getEReferenceType();
				if (!eType.equals(modelPackage.getGeoLocation())) {
					Object name = eRef.getName();
					sb.append(name);
				} else { // case of GeoLocation
					sb.append(modelPackage.getGeoLocation_Latitude().getName());
					sb.append(',');
					sb.append(modelPackage.getGeoLocation_Longitude().getName());
				}

			sb.append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		
		csvpw.write(sb.toString());
		streamFiles.put(eClass.getClassifierID(), csvpw);
	}
	
	// normally this method should not be triggered 
	@Override 
	public Object caseDynamicElement(DynamicElement theEObject) {
		throw new UnsupportedOperationException("This method should not be called");
	}
	
	@Override
	public Object caseCloudNetwork (CloudNetwork theEObjet) {
		StringBuilder sb = new StringBuilder();
		
		for (EAttribute attr : theEObjet.eClass().getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = theEObjet.eGet(attr);
			if (value != null) {
				sb.append(value);
			} else {
				sb.append(MISSING);
			}
			sb.append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		streamFiles.get(theEObjet.eClass().getClassifierID()).write(sb.toString());
		return Boolean.TRUE;
	}
	
	@Override
	public Object caseServer(Server theEObjet) {
		StringBuilder sb = new StringBuilder();

		for (EAttribute attr : theEObjet.eClass().getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = theEObjet.eGet(attr);
			if (value != null) {
				sb.append(value);
			} else {
				sb.append(MISSING);
			}
			sb.append(',');
		}
		for (EReference eRef : theEObjet.eClass().getEAllReferences()) {
			if (eRef.getUpperBound()== -1) continue;
			Object value = theEObjet.eGet(eRef);
			if (value != null)
				if (value instanceof DynamicElement)
					sb.append(((DynamicElement)value).eGet(modelPackage.getDynamicElement_ID()));
				else if (value instanceof CloudNetwork){
					sb.append(((CloudNetwork)value).eGet(modelPackage.getCloudNetwork_ID()));
				} 
				else { // case of 
					sb.append(((GeoLocation)value).eGet(modelPackage.getGeoLocation_Latitude()));
					sb.append(',');
					sb.append(((GeoLocation)value).eGet(modelPackage.getGeoLocation_Longitude()));
				}
			else 
				sb.append(MISSING);
			sb.append(',');
		}
		
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		streamFiles.get(theEObjet.eClass().getClassifierID()).write(sb.toString());

		return Boolean.TRUE;
		
	}

	@Override
	public Object caseMachine(Machine theEObjet) {
		StringBuilder sb = new StringBuilder();

		for (EAttribute attr : theEObjet.eClass().getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = theEObjet.eGet(attr);
			if (value != null) {
				sb.append(value);
			} else {
				sb.append(MISSING);
			}
			sb.append(',');
		}
		for (EReference eRef : theEObjet.eClass().getEAllReferences()) {
			if (eRef.getUpperBound()== -1) continue;
			Object value = theEObjet.eGet(eRef);
			if (value != null)
				if (value instanceof DynamicElement)
					sb.append(((DynamicElement)value).eGet(modelPackage.getDynamicElement_ID()));
				else if (value instanceof CloudNetwork){
					sb.append(((CloudNetwork)value).eGet(modelPackage.getCloudNetwork_ID()));
				} 
			else 
				sb.append(MISSING);
			sb.append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		streamFiles.get(theEObjet.eClass().getClassifierID()).write(sb.toString());

		return Boolean.TRUE;
	}

	@Override
	public Object caseJob(Job theEObjet) {
		StringBuilder sb = new StringBuilder();

		for (EAttribute attr : theEObjet.eClass().getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = theEObjet.eGet(attr);
			if (value != null) {
				sb.append(value);
			} else {
				sb.append(MISSING);
			}
			sb.append(',');
		}
		for (EReference eRef : theEObjet.eClass().getEAllReferences()) {
			if (eRef.getUpperBound()== -1) continue;
			Object value = theEObjet.eGet(eRef);
			if (value != null)
				if (value instanceof DynamicElement)
					sb.append(((DynamicElement)value).eGet(modelPackage.getDynamicElement_ID()));
				else if (value instanceof CloudNetwork){
					sb.append(((CloudNetwork)value).eGet(modelPackage.getCloudNetwork_ID()));
				} else 
				sb.append(MISSING);
			
			sb.append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		streamFiles.get(theEObjet.eClass().getClassifierID()).write(sb.toString());

		return Boolean.TRUE;
	}

	@Override
	public Object caseTask(Task theEObjet) {
		StringBuilder sb = new StringBuilder();

		for (EAttribute attr : theEObjet.eClass().getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = theEObjet.eGet(attr);
			if (value != null) {
				sb.append(value);
			} else {
				sb.append(MISSING);
			}
			sb.append(',');
		}
		for (EReference eRef : theEObjet.eClass().getEAllReferences()) {
			if (eRef.getUpperBound()== -1) continue;
			Object value = theEObjet.eGet(eRef);
			if (value != null)
				if (value instanceof DynamicElement)
					sb.append(((DynamicElement)value).eGet(modelPackage.getDynamicElement_ID()));
				else if (value instanceof CloudNetwork){
					sb.append(((CloudNetwork)value).eGet(modelPackage.getCloudNetwork_ID()));
				} else 
				sb.append(MISSING);
			
			sb.append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		streamFiles.get(theEObjet.eClass().getClassifierID()).write(sb.toString());

		return Boolean.TRUE;
	}

	@Override
	public Object caseGeoLocation(GeoLocation theEObjet) {
		return Boolean.TRUE;
	}
	
	/**
	 * Flushes printWrters and closes them
	 */
	public void close() {
		
		for (Entry <Integer, PrintWriter> entry: streamFiles.entrySet()) {
			PrintWriter pt = entry.getValue();
			pt.flush();
			pt.close();	
		}
	}
}
