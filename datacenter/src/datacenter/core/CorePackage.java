/**
 */
package datacenter.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see datacenter.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacenter/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = datacenter.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link datacenter.core.impl.DynamicElementImpl <em>Dynamic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.DynamicElementImpl
	 * @see datacenter.core.impl.CorePackageImpl#getDynamicElement()
	 * @generated
	 */
	int DYNAMIC_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datacenter.core.impl.CloudNetworkImpl <em>Cloud Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.CloudNetworkImpl
	 * @see datacenter.core.impl.CorePackageImpl#getCloudNetwork()
	 * @generated
	 */
	int CLOUD_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NETWORK__ID = 0;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NETWORK__SERVERS = 1;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NETWORK__JOBS = 2;

	/**
	 * The number of structural features of the '<em>Cloud Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cloud Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link datacenter.core.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.ServerImpl
	 * @see datacenter.core.impl.CorePackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ID = DYNAMIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TIMESTAMP = DYNAMIC_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__LOCATION = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hosted Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__HOSTED_MACHINES = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NETWORK = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Total Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TOTAL_CORES = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TOTAL_MEMORY = DYNAMIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TOTAL_DISK = DYNAMIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Remaining Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__REMAINING_MEMORY = DYNAMIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remaining Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__REMAINING_CORES = DYNAMIC_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Remaining Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__REMAINING_DISK = DYNAMIC_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacenter.core.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.MachineImpl
	 * @see datacenter.core.impl.CorePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = DYNAMIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TIMESTAMP = DYNAMIC_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Server</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SERVER = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ASSIGNED_CORES = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ASSIGNED_MEMORY = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assigned Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ASSIGNED_DISK = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacenter.core.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.JobImpl
	 * @see datacenter.core.impl.CorePackageImpl#getJob()
	 * @generated
	 */
	int JOB = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = DYNAMIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TIMESTAMP = DYNAMIC_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Network</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NETWORK = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TASKS = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacenter.core.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.TaskImpl
	 * @see datacenter.core.impl.CorePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = DYNAMIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TIMESTAMP = DYNAMIC_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Durantion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DURANTION = DYNAMIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumed Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONSUMED_DISK = DYNAMIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consumed CP Urate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONSUMED_CP_URATE = DYNAMIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Job</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_JOB = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HOST_MACHINE = DYNAMIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = DYNAMIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = DYNAMIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacenter.core.impl.GeoLocationImpl <em>Geo Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.core.impl.GeoLocationImpl
	 * @see datacenter.core.impl.CorePackageImpl#getGeoLocation()
	 * @generated
	 */
	int GEO_LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION__LATITUDE = 1;

	/**
	 * The number of structural features of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Geo Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link datacenter.core.DynamicElement <em>Dynamic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Element</em>'.
	 * @see datacenter.core.DynamicElement
	 * @generated
	 */
	EClass getDynamicElement();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.DynamicElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see datacenter.core.DynamicElement#getID()
	 * @see #getDynamicElement()
	 * @generated
	 */
	EAttribute getDynamicElement_ID();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.DynamicElement#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see datacenter.core.DynamicElement#getTimestamp()
	 * @see #getDynamicElement()
	 * @generated
	 */
	EAttribute getDynamicElement_Timestamp();

	/**
	 * Returns the meta object for class '{@link datacenter.core.CloudNetwork <em>Cloud Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Network</em>'.
	 * @see datacenter.core.CloudNetwork
	 * @generated
	 */
	EClass getCloudNetwork();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.CloudNetwork#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see datacenter.core.CloudNetwork#getID()
	 * @see #getCloudNetwork()
	 * @generated
	 */
	EAttribute getCloudNetwork_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.core.CloudNetwork#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see datacenter.core.CloudNetwork#getServers()
	 * @see #getCloudNetwork()
	 * @generated
	 */
	EReference getCloudNetwork_Servers();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.core.CloudNetwork#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see datacenter.core.CloudNetwork#getJobs()
	 * @see #getCloudNetwork()
	 * @generated
	 */
	EReference getCloudNetwork_Jobs();

	/**
	 * Returns the meta object for class '{@link datacenter.core.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see datacenter.core.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the containment reference '{@link datacenter.core.Server#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see datacenter.core.Server#getLocation()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.core.Server#getHostedMachines <em>Hosted Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosted Machines</em>'.
	 * @see datacenter.core.Server#getHostedMachines()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_HostedMachines();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.core.Server#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see datacenter.core.Server#getNetwork()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Network();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Server#getTotalCores <em>Total Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cores</em>'.
	 * @see datacenter.core.Server#getTotalCores()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_TotalCores();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Server#getTotalMemory <em>Total Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Memory</em>'.
	 * @see datacenter.core.Server#getTotalMemory()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_TotalMemory();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Server#getTotalDisk <em>Total Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Disk</em>'.
	 * @see datacenter.core.Server#getTotalDisk()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_TotalDisk();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Server#getRemainingMemory <em>Remaining Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Memory</em>'.
	 * @see datacenter.core.Server#getRemainingMemory()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RemainingMemory();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Server#getRemainingCores <em>Remaining Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cores</em>'.
	 * @see datacenter.core.Server#getRemainingCores()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RemainingCores();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Server#getRemainingDisk <em>Remaining Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Disk</em>'.
	 * @see datacenter.core.Server#getRemainingDisk()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RemainingDisk();

	/**
	 * Returns the meta object for class '{@link datacenter.core.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see datacenter.core.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.core.Machine#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Server</em>'.
	 * @see datacenter.core.Machine#getServer()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Server();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Machine#getAssignedCores <em>Assigned Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Cores</em>'.
	 * @see datacenter.core.Machine#getAssignedCores()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_AssignedCores();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Machine#getAssignedMemory <em>Assigned Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Memory</em>'.
	 * @see datacenter.core.Machine#getAssignedMemory()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_AssignedMemory();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Machine#getAssignedDisk <em>Assigned Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Disk</em>'.
	 * @see datacenter.core.Machine#getAssignedDisk()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_AssignedDisk();

	/**
	 * Returns the meta object for class '{@link datacenter.core.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see datacenter.core.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.core.Job#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see datacenter.core.Job#getNetwork()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.core.Job#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see datacenter.core.Job#getTasks()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Tasks();

	/**
	 * Returns the meta object for class '{@link datacenter.core.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see datacenter.core.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Task#getDurantion <em>Durantion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durantion</em>'.
	 * @see datacenter.core.Task#getDurantion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Durantion();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Task#getConsumedDisk <em>Consumed Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed Disk</em>'.
	 * @see datacenter.core.Task#getConsumedDisk()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ConsumedDisk();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.Task#getConsumedCPUrate <em>Consumed CP Urate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed CP Urate</em>'.
	 * @see datacenter.core.Task#getConsumedCPUrate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ConsumedCPUrate();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.core.Task#getParentJob <em>Parent Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Job</em>'.
	 * @see datacenter.core.Task#getParentJob()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ParentJob();

	/**
	 * Returns the meta object for the reference '{@link datacenter.core.Task#getHostMachine <em>Host Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host Machine</em>'.
	 * @see datacenter.core.Task#getHostMachine()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HostMachine();

	/**
	 * Returns the meta object for class '{@link datacenter.core.GeoLocation <em>Geo Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Location</em>'.
	 * @see datacenter.core.GeoLocation
	 * @generated
	 */
	EClass getGeoLocation();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.GeoLocation#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see datacenter.core.GeoLocation#getLongitude()
	 * @see #getGeoLocation()
	 * @generated
	 */
	EAttribute getGeoLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.core.GeoLocation#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see datacenter.core.GeoLocation#getLatitude()
	 * @see #getGeoLocation()
	 * @generated
	 */
	EAttribute getGeoLocation_Latitude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link datacenter.core.impl.DynamicElementImpl <em>Dynamic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.DynamicElementImpl
		 * @see datacenter.core.impl.CorePackageImpl#getDynamicElement()
		 * @generated
		 */
		EClass DYNAMIC_ELEMENT = eINSTANCE.getDynamicElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_ELEMENT__ID = eINSTANCE.getDynamicElement_ID();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_ELEMENT__TIMESTAMP = eINSTANCE.getDynamicElement_Timestamp();

		/**
		 * The meta object literal for the '{@link datacenter.core.impl.CloudNetworkImpl <em>Cloud Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.CloudNetworkImpl
		 * @see datacenter.core.impl.CorePackageImpl#getCloudNetwork()
		 * @generated
		 */
		EClass CLOUD_NETWORK = eINSTANCE.getCloudNetwork();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_NETWORK__ID = eINSTANCE.getCloudNetwork_ID();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_NETWORK__SERVERS = eINSTANCE.getCloudNetwork_Servers();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_NETWORK__JOBS = eINSTANCE.getCloudNetwork_Jobs();

		/**
		 * The meta object literal for the '{@link datacenter.core.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.ServerImpl
		 * @see datacenter.core.impl.CorePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__LOCATION = eINSTANCE.getServer_Location();

		/**
		 * The meta object literal for the '<em><b>Hosted Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__HOSTED_MACHINES = eINSTANCE.getServer_HostedMachines();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__NETWORK = eINSTANCE.getServer_Network();

		/**
		 * The meta object literal for the '<em><b>Total Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__TOTAL_CORES = eINSTANCE.getServer_TotalCores();

		/**
		 * The meta object literal for the '<em><b>Total Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__TOTAL_MEMORY = eINSTANCE.getServer_TotalMemory();

		/**
		 * The meta object literal for the '<em><b>Total Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__TOTAL_DISK = eINSTANCE.getServer_TotalDisk();

		/**
		 * The meta object literal for the '<em><b>Remaining Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__REMAINING_MEMORY = eINSTANCE.getServer_RemainingMemory();

		/**
		 * The meta object literal for the '<em><b>Remaining Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__REMAINING_CORES = eINSTANCE.getServer_RemainingCores();

		/**
		 * The meta object literal for the '<em><b>Remaining Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__REMAINING_DISK = eINSTANCE.getServer_RemainingDisk();

		/**
		 * The meta object literal for the '{@link datacenter.core.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.MachineImpl
		 * @see datacenter.core.impl.CorePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__SERVER = eINSTANCE.getMachine_Server();

		/**
		 * The meta object literal for the '<em><b>Assigned Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ASSIGNED_CORES = eINSTANCE.getMachine_AssignedCores();

		/**
		 * The meta object literal for the '<em><b>Assigned Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ASSIGNED_MEMORY = eINSTANCE.getMachine_AssignedMemory();

		/**
		 * The meta object literal for the '<em><b>Assigned Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__ASSIGNED_DISK = eINSTANCE.getMachine_AssignedDisk();

		/**
		 * The meta object literal for the '{@link datacenter.core.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.JobImpl
		 * @see datacenter.core.impl.CorePackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__NETWORK = eINSTANCE.getJob_Network();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TASKS = eINSTANCE.getJob_Tasks();

		/**
		 * The meta object literal for the '{@link datacenter.core.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.TaskImpl
		 * @see datacenter.core.impl.CorePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Durantion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DURANTION = eINSTANCE.getTask_Durantion();

		/**
		 * The meta object literal for the '<em><b>Consumed Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CONSUMED_DISK = eINSTANCE.getTask_ConsumedDisk();

		/**
		 * The meta object literal for the '<em><b>Consumed CP Urate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__CONSUMED_CP_URATE = eINSTANCE.getTask_ConsumedCPUrate();

		/**
		 * The meta object literal for the '<em><b>Parent Job</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT_JOB = eINSTANCE.getTask_ParentJob();

		/**
		 * The meta object literal for the '<em><b>Host Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HOST_MACHINE = eINSTANCE.getTask_HostMachine();

		/**
		 * The meta object literal for the '{@link datacenter.core.impl.GeoLocationImpl <em>Geo Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.core.impl.GeoLocationImpl
		 * @see datacenter.core.impl.CorePackageImpl#getGeoLocation()
		 * @generated
		 */
		EClass GEO_LOCATION = eINSTANCE.getGeoLocation();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LOCATION__LONGITUDE = eINSTANCE.getGeoLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_LOCATION__LATITUDE = eINSTANCE.getGeoLocation_Latitude();

	}

} //CorePackage
