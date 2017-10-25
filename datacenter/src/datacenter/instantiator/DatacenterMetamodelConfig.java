package datacenter.instantiator;

import org.apache.commons.lang3.Range;
import org.apache.commons.math3.distribution.IntegerDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.collect.ImmutableSet;

import fr.inria.atlanmod.instantiator.GenericMetamodelConfig;

public class DatacenterMetamodelConfig extends GenericMetamodelConfig {
	
	private int factor;
	private boolean generateCSV;
	private boolean generateModel;
	
	

	private static int DEFAULT_FACTOR = DEFAULT_AVERAGE_REFERENCES_SIZE * DEFAULT_AVERAGE_REFERENCES_SIZE;
	
	public DatacenterMetamodelConfig(Resource metamodelResource, Range<Integer> elementsRange, long seed) {
		super(metamodelResource, elementsRange, seed);
		this.factor = DEFAULT_FACTOR;
		generateCSV = true;
		generateModel = true;
	}
	
	@Override
	public EClass getNextRootEClass (ImmutableSet<EClass> rootEClasses) {
		return datacenter.DatacenterPackage.Literals.CLOUD_NETWORK;
	}
	
	@Override
	public IntegerDistribution getDistributionFor(EReference eReference) {
		IntegerDistribution distribution = distributions.get(eReference);
		if (distribution == null) {
			int upperBound = eReference.getUpperBound() == EAttribute.UNBOUNDED_MULTIPLICITY ? Integer.MAX_VALUE : eReference.getUpperBound();
			int avg = (propertiesRange.getMaximum() + propertiesRange.getMinimum())/2;
			
//			if (eReference.equals(DatacenterPackage.Literals.CLOUD_NETWORK__JOBS))
				
				distribution = new UniformIntegerDistribution(
						Math.max(Math.min(propertiesRange.getMinimum(), upperBound), eReference.getLowerBound()), 
						Math.min(referencesRange.getMaximum(), upperBound));
				
			distribution.reseedRandomGenerator(random.nextLong());
			distributions.put(eReference, distribution);
		}
		return distribution;
	}

	public void setFactor(int factor) {
		this.factor = factor;
		
	}

	public int getFactor() {
		return factor;
	}

	public boolean isGenerateModel() {
		return generateModel;
	}

	public void setGenerateModel(boolean generateModel) {
		this.generateModel = generateModel;
	}

	public boolean isGenerateCSV() {
		return generateCSV;
	}

	public void setGenerateCSV(boolean generateCSV) {
		this.generateCSV = generateCSV;
	}


}
