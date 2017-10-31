/**
 */
package datacenter.core.util;

import datacenter.core.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see datacenter.core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "datacenter.core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CorePackage.DYNAMIC_ELEMENT:
				return validateDynamicElement((DynamicElement)value, diagnostics, context);
			case CorePackage.CLOUD_NETWORK:
				return validateCloudNetwork((CloudNetwork)value, diagnostics, context);
			case CorePackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			case CorePackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case CorePackage.JOB:
				return validateJob((Job)value, diagnostics, context);
			case CorePackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case CorePackage.GEO_LOCATION:
				return validateGeoLocation((GeoLocation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicElement(DynamicElement dynamicElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudNetwork(CloudNetwork cloudNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(server, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_CPUavailabilityCheck(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_memoryAvailabilityCheck(server, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CPUavailabilityCheck constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVER__CP_UAVAILABILITY_CHECK__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Cannot assign more than available resources',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tremainingCores >= 0\n" +
		"}.status";

	/**
	 * Validates the CPUavailabilityCheck constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_CPUavailabilityCheck(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.SERVER,
				 server,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CPUavailabilityCheck",
				 SERVER__CP_UAVAILABILITY_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the memoryAvailabilityCheck constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVER__MEMORY_AVAILABILITY_CHECK__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Cannot assign more than available resources',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tremainingMemory >=0\n" +
		"}.status";

	/**
	 * Validates the memoryAvailabilityCheck constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_memoryAvailabilityCheck(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.SERVER,
				 server,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "memoryAvailabilityCheck",
				 SERVER__MEMORY_AVAILABILITY_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJob(Job job, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(job, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoLocation(GeoLocation geoLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(geoLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocation_latitudeCheck(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocation_longitudeCheck(geoLocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the latitudeCheck constraint of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GEO_LOCATION__LATITUDE_CHECK__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Latitude should range from -90 to 90 degrees',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlatitude  > 90 and latitude > -90\n" +
		"}.status";

	/**
	 * Validates the latitudeCheck constraint of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoLocation_latitudeCheck(GeoLocation geoLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.GEO_LOCATION,
				 geoLocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "latitudeCheck",
				 GEO_LOCATION__LATITUDE_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the longitudeCheck constraint of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GEO_LOCATION__LONGITUDE_CHECK__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Longitude should range from 0 to 180 degrees',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tlongitude > 0 and longitude < 180\n" +
		"}.status";

	/**
	 * Validates the longitudeCheck constraint of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoLocation_longitudeCheck(GeoLocation geoLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.GEO_LOCATION,
				 geoLocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "longitudeCheck",
				 GEO_LOCATION__LONGITUDE_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CoreValidator
