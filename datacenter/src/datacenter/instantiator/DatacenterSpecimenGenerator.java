package datacenter.instantiator;

import static com.google.common.collect.Iterables.get;

import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.math3.distribution.IntegerDistribution;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;

import datacenter.DatacenterPackage;
import fr.obeo.emf.specimen.ISpecimenConfiguration;
import fr.obeo.emf.specimen.SpecimenGenerator;

public class DatacenterSpecimenGenerator extends SpecimenGenerator {

	protected EObject rootNetwork;
	protected DatacenterPackage pck = DatacenterPackage.eINSTANCE;
	public DatacenterSpecimenGenerator(ISpecimenConfiguration configuration, long seed) {
		super(configuration, seed);
	}

	@Override 
	public void generate(Resource resource) {
		
		resource.setModified(true);
		
		ListMultimap<EClass, EObject> indexByKind = ArrayListMultimap.create();

		ImmutableSet<EClass> possibleRootEClasses = configuration.possibleRootEClasses();

		currentDepth = 0;
		currentMaxDepth = 0;
		currentObjects = 0;
		goalObjects = configuration.getResourceSizeDistribution().sample();

		// loop for creating the topology
		while (currentObjects < goalObjects) {
			EClass eClass = configuration.getNextRootEClass(possibleRootEClasses);
			IntegerDistribution dist = configuration.getDepthDistributionFor(eClass);
			if (dist == null) continue;
			currentMaxDepth = dist.sample();
			if (currentMaxDepth == 0) currentMaxDepth++;
			
			if (rootNetwork == null) {
				Optional<EObject> generateEObject = generateTopologyEObject(eClass, indexByKind);
				if (generateEObject.isPresent()) {
					rootNetwork = generateEObject.get();
				}
			} else {
				// generate more servers
				generateEContainmentReference(rootNetwork,
											  DatacenterPackage.Literals.CLOUD_NETWORK__SERVERS,
											  indexByKind);
			}
		}
		
		//generating tasks
		currentObjects = 0;
		currentDepth = 0;
		currentMaxDepth = Integer.MAX_VALUE;
		goalObjects *= ((DatacenterMetamodelConfig)configuration).getFactor();
		while(currentObjects < goalObjects ){
			generateEContainmentReference(rootNetwork,
					  DatacenterPackage.Literals.CLOUD_NETWORK__JOBS,
					  indexByKind);
		}
		
		resource.getContents().add(rootNetwork);

		LOGGER.info("Generating cross-references");

		int totalEObjects = currentObjects;
		int currentEObject = 0;
		TreeIterator<EObject> eAllContents = resource.getAllContents();
		while (eAllContents.hasNext()) {
			currentEObject++;
			LOGGER.fine(MessageFormat.format("Generating cross references {0} / {1}", currentEObject, totalEObjects));
			EObject eObject = eAllContents.next();
			generateCrossReferences(eObject, indexByKind);
		}

		LOGGER.info(MessageFormat.format("Requested #EObject={0}", goalObjects));
		
		LOGGER.info(MessageFormat.format("Actual #EObject={0}", ImmutableSet.copyOf(indexByKind.values()).size()));

		for (Map.Entry<EClass, Collection<EObject>> entry : indexByKind.asMap().entrySet()) {
			// Log number of elements for resolved EClasses
			EClass eClass = entry.getKey();
			if (!eClass.eIsProxy() || (eClass.eIsProxy() && EcoreUtil.resolve(eClass, resource) != eClass)) {
				LOGGER.info(MessageFormat.format("#{0}::{1}={2}", 
						eClass.getEPackage().getNsURI(),
						eClass.getName(),
						entry.getValue().size()));
			}
		}
		
		for (Map.Entry<EClass, Collection<EObject>> entry : indexByKind.asMap().entrySet()) {
			EClass eClass = entry.getKey();
			if (eClass.eIsProxy() && EcoreUtil.resolve(eClass, resource) == eClass) {
				// Warn about unresolved EClasses
				LOGGER.warning(MessageFormat.format("#{0} (unresolved)={1}", 
						EcoreUtil.getURI(eClass),
						entry.getValue().size()));
			}
		}
		LOGGER.info(MessageFormat.format("Generation finished for resource ''{0}''", resource.getURI()));
	}
	
	private Optional<EObject> generateTopologyEObject(EClass eClass, ListMultimap<EClass, EObject> indexByKind) {
		final EObject eObject;
		currentObjects++;
		LOGGER.fine(MessageFormat.format("Generating EObject {0} / ~{1} (EClass={2})", 
				currentObjects, goalObjects, eClass.getName()));
		eObject = createEObject(eClass, indexByKind);
		generateEAttributes(eObject, eClass);
		generateEContainmentReferences(eObject, eClass, indexByKind);
		return Optional.fromNullable(eObject);
	}

	@Override 	
	protected void generateSingleContainmentReference(EObject eObject, EReference eReference,
			ListMultimap<EClass, EObject> indexByKind, ImmutableMultiset<EClass> eAllConcreteSubTypesOrSelf) {
		
		// Not repopulate already existing elements 
		if (eObject.eGet(eReference) != null) return;
		
		IntegerDistribution distribution = configuration.getDistributionFor(eReference);
		if (eReference.isRequired() || booleanInDistribution(distribution)) {
			LOGGER.fine(MessageFormat.format("Generating EReference ''{0}'' in EObject {1}", eReference.getName(), eObject.toString()));
			int idx = generator.nextInt(eAllConcreteSubTypesOrSelf.size());
			final Optional<EObject> nextEObject = generateEObject(get(eAllConcreteSubTypesOrSelf, idx), indexByKind);
			if (nextEObject.isPresent()) {
				eObject.eSet(eReference, nextEObject.get());
			}
		}
	}
	
	@Override 
	protected Object nextObject(Class<?> instanceClass) {
		if (instanceClass == String.class) {
			return RandomStringUtils.random(
					configuration.getValueDistributionFor(instanceClass).sample(), 
					0, 0, true, true, null, generator);
		} else if (instanceClass == java.sql.Timestamp.class){
			return new Timestamp(System.currentTimeMillis());
		} else {
			LOGGER.warning(
					MessageFormat.format("Do not know how to randomly generate ''{0}'' object",
					instanceClass.getName()));
		}
		return null;
	}
	
	protected void generateSingleAttribute(EObject eObject, EAttribute eAttribute, IntegerDistribution distribution,
			Class<?> instanceClass) {
		if (eAttribute.isRequired() || booleanInDistribution(distribution)) {
			final Object value;
			EDataType eAttributeType = eAttribute.getEAttributeType();
			if (eAttributeType instanceof EEnum) {
				assert instanceClass == null;
				EEnum eEnum = (EEnum) eAttributeType;
				instanceClass = int.class;
				int randomValue = Math.abs((Integer) nextValue(instanceClass));
				int size = eEnum.getELiterals().size();
				value = eEnum.getELiterals().get(randomValue % size); 
			} else {
				value = nextValueForAttribute(eAttribute);
			}
			eObject.eSet(eAttribute, value);
		}
	}

	protected Object nextValueForAttribute(EAttribute eAttribute) {
		// TODO Auto-generated method stub
		if(eAttribute.equals(DatacenterPackage.eINSTANCE.getDynamicElement_ID()))
				return nextValue(String.class);
		if(eAttribute.equals(pck.getGeoLocation_Latitude()))
				return generator.nextFloat()* (90.0f - (-90.0f)) + (-90.0f);
		if(eAttribute.equals(pck.getGeoLocation_Longitude()))
			return generator.nextFloat() * (180.0f - (0.0f)) + (-0.0f);
		if(eAttribute.equals(pck.getServer_TotalCores()))
			return 32 * ((generator.nextInt() % 4)+1);
		if(eAttribute.equals(pck.getServer_TotalDisk()))
			return 16.0f * 512 * ((generator.nextInt() % 8)+1); // In Gb
		if (eAttribute.equals(pck.getServer_TotalMemory()))
			return 16.0f * ((generator.nextInt() % 8)+1); // In Gb
		if (eAttribute.equals(pck.getMachine_AssignedCores()))
			return (generator.nextInt()%2) + 1;
		if (eAttribute.equals(pck.getMachine_AssignedDisk()))
			return 128.0f * ((generator.nextInt() % 8)+1); // In Gb
		if (eAttribute.equals(pck.getMachine_AssignedMemory()))
			return 1.0f * ((generator.nextInt() % 8)+1); // In Gb
		if (eAttribute.equals(pck.getTask_Durantion()))
			return generator.nextInt() * (10000 - (100)) + (100);//ms
		return nextValue(eAttribute.getEAttributeType().getInstanceClass());
	}
}