package datacenter.instantiator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Nonnull;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import datacenter.core.CloudNetwork;
import datacenter.core.DynamicElement;
import datacenter.core.GeoLocation;
import datacenter.core.Job;
import datacenter.core.Machine;
import datacenter.core.Server;
import datacenter.core.Task;
import datacenter.core.util.CoreSwitch;
import datacenter.events.Event;
import datacenter.events.EventsFactory;
import datacenter.events.EventsPackage;
import datacenter.types.Action;

public class DatacenterCSVSwitch extends CoreSwitch<Object> {

	private static final char MISSING = 'M'; 
	private static final char NaN = 'N';
	
	private Map<Integer, PrintWriter> streamFiles;
	private String samplePath;
	
	private boolean append = false;
	private boolean autoFlush = true;
	private String charset = "UTF-8";

	private EventsFactory eventsFactory  = EventsFactory.eINSTANCE;
	private Resource eventsResource;
	public DatacenterCSVSwitch (@Nonnull String samplePath, @Nonnull Resource resource) throws Exception {
		super();
		streamFiles = new HashMap<Integer, PrintWriter>();
		this.samplePath = samplePath;
		this.eventsResource = resource;
		prepareCSV(modelPackage.getCloudNetwork());
		prepareCSV(modelPackage.getServer());
		prepareCSV(modelPackage.getMachine());
		prepareCSV(modelPackage.getJob());
		prepareCSV(modelPackage.getTask());
		prepareCSV(EventsPackage.Literals.EVENT);
		
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
	public Object caseDynamicElement(DynamicElement theEObject) {
		throw new UnsupportedOperationException("This method should not be called");
	}
	
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
				} else { // case of 
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

		transform(theEObjet);
		return Boolean.TRUE;
	}

	/**
	 * Generates stream events out of existing Tasks 
	 * @param theEObjet
	 */
	private void transform(Job theEObjet) {		
		try {
			
			Event jobEvent = eventsFactory.createEvent();
			jobEvent.setValue(theEObjet);
			jobEvent.setTimestamp(new Timestamp(System.currentTimeMillis()));
			jobEvent.setClassName(theEObjet.eClass().getName());
			jobEvent.setAction(Action.NEW);
			exportEvent(jobEvent);
			eventsResource.getContents().add(jobEvent);
			for (Task task : theEObjet.getTasks()) {
				Event taskEvent = eventsFactory.createEvent();
				taskEvent.setValue(task);
				taskEvent.setTimestamp(new Timestamp(System.currentTimeMillis()));
				taskEvent.setClassName(task.eClass().getName());
				taskEvent.setAction(Action.NEW);
				exportEvent(taskEvent);
				eventsResource.getContents().add(taskEvent);
				for (EStructuralFeature feature : task.eClass().getEAllStructuralFeatures()) {
					if (feature.equals(modelPackage.getDynamicElement_ID()) ||
								feature.equals(modelPackage.getDynamicElement_Timestamp()) ||
								!task.eIsSet(feature))	
						continue;
			
					Event event = eventsFactory.createEvent();
					event.setTarget(task.getID());
					event.setTimestamp(new Timestamp(System.currentTimeMillis()));
					if (task.eGet(feature) != null)
						event.setValue(task.eGet(feature));
					else System.out.println("null value"); ;
					event.setFeatureName(feature.getName());
					event.setClassName(task.eClass().getName());
					event.setAction(Action.UPDATE);
					exportEvent(event);
					eventsResource.getContents().add(event);	
				}
	
				}
			} catch (Exception e) {
				System.out.println();
			}
	}
	private void exportEvent(Event jobEvent) {
		StringBuilder sb = new StringBuilder();
		
		for (EAttribute attr : jobEvent.eClass().getEAllAttributes()) {
			if (attr.isDerived()) continue;
			Object value = jobEvent.eGet(attr);
			if (value instanceof DynamicElement)
				sb.append(((DynamicElement)value).getID());
			else if (value != null) {
				sb.append(value);
			} else {
				sb.append(MISSING);
			}
			sb.append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(System.getProperty("line.separator"));
		streamFiles.get(jobEvent.eClass().getClassifierID()).write(sb.toString());	
	}

	/**
	 * 
	 */
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

	/**
	 * 
	 */
	public Object caseGeoLocation(GeoLocation theEObjet) {
		return Boolean.TRUE;
	}
	
	/**
	 * Closes the printWriters
	 */
	public void close() {
		
		for (Entry <Integer, PrintWriter> entry: streamFiles.entrySet()) {
			PrintWriter pt = entry.getValue();
			pt.flush();
			pt.close();	
		}
	}
	
	/**
	 * 
	 * @param from
	 * @param diff
	 * @return
	 */
	private Timestamp timestampInrange(Timestamp from, long diff) {
		long offset = from.getTime();
		return new Timestamp(offset + (long)(Math.random() * diff));
		}
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	private Timestamp timestampInrange(Timestamp from, Timestamp to) {
		long offset = from.getTime();
		long end = to.getTime();
		long diff = end - offset + 1;
		return new Timestamp(offset + (long)(Math.random() * diff));
	}
}
