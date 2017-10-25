package datacenter.instantiator;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import datacenter.DatacenterFactory;
import datacenter.util.DatacenterSwitch;
import fr.inria.atlanmod.instantiator.GenerationException;
import fr.inria.atlanmod.instantiator.GenericMetamodelConfig;
import fr.inria.atlanmod.instantiator.GenericMetamodelGenerator;

public class DatacenterMetamodelGenerator extends GenericMetamodelGenerator{

	private final static Logger LOGGER = Logger.getLogger(DatacenterMetamodelGenerator.class.getName());

	protected DatacenterFactory factory; 
	
	// FIXME add it to application args
	protected boolean generateCSV = true;
	
	public DatacenterMetamodelGenerator(GenericMetamodelConfig config) throws IllegalArgumentException {
		super(config);
		generator = new DatacenterSpecimenGenerator(config, config.getSeed());
	}
	
	public void runGeneration(ResourceSet resourceSet, int numberOfModels, int averageSize, float variation) throws GenerationException {
		
		try {

			LOGGER.info(MessageFormat.format("Creating {0} models", numberOfModels));
			
			LOGGER.info(MessageFormat.format("Generator seed is ''{0}''", config.getSeed()));
			
			LOGGER.info(MessageFormat.format("Config parameters: range for models size is [{0}, {1}]", 
					config.getElementsRange().getMinimum(), config.getElementsRange().getMaximum()));
			LOGGER.info(MessageFormat.format("Config parameters: range for properties number is [{0}, {1}]", 
					config.getPropertiesRange().getMinimum(), config.getPropertiesRange().getMaximum()));
			LOGGER.info(MessageFormat.format("Config parameters: range for references number is [{0}, {1}]", 
					config.getReferencesRange().getMinimum(), config.getReferencesRange().getMaximum()));
			LOGGER.info(MessageFormat.format("Config parameters: range for values length is [{0}, {1}]", 
					config.getValuesRange().getMinimum(), config.getValuesRange().getMaximum()));
			
			for (int i = 0; i < numberOfModels; i++) {
				
				Resource resource = resourceSet.createResource(formatURI(getMetaModelResourceName(), i, averageSize));

				LOGGER.info(MessageFormat.format("Start generation of resource {0} with an average size of {1} elements", 
						resource.getURI(), averageSize));

				generator.generate(resource);
				if (resource.isModified()) {
					LOGGER.info(MessageFormat.format("Saving resource {0}", resource.getURI()));
						resource.save(Collections.emptyMap());
				}
				if (generateCSV) {
					LOGGER.info(MessageFormat.format("Exporting resource {0} to CSV", resource.getURI()));
						exportToCSV(resource);
				}
				LOGGER.info(MessageFormat.format("Unloading the content of resource {0}", resource.getURI()));
				resource.unload();
			}

			LOGGER.info("All resources have been saved");
		} catch (Exception e) {
			LOGGER.severe(e.getLocalizedMessage());
			throw new GenerationException(e);
		}
	}

	
	protected void exportToCSV(Resource resource) throws Exception {
		DatacenterCSVSwitch csvSwitch = new DatacenterCSVSwitch(samplesPath.toString());
		Iterator<EObject> resourceIterator = resource.getAllContents();
		
		EObject cursor;
		
		while (resourceIterator.hasNext()) {
			cursor = resourceIterator.next();
			csvSwitch.doSwitch(cursor);
		}
		
		csvSwitch.close();
	}
}
