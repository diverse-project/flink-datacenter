/**
 */
package datacenter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see datacenter.DatacenterFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DatacenterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datacenter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://flink/datacenter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datacenter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatacenterPackage eINSTANCE = datacenter.impl.DatacenterPackageImpl.init();

	/**
	 * The meta object id for the '{@link datacenter.impl.DynamicElementImpl <em>Dynamic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.DynamicElementImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getDynamicElement()
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
	 * The meta object id for the '{@link datacenter.impl.CloudNetworkImpl <em>Cloud Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.CloudNetworkImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getCloudNetwork()
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
	 * The meta object id for the '{@link datacenter.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.ServerImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getServer()
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
	 * The meta object id for the '{@link datacenter.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.MachineImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getMachine()
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
	 * The meta object id for the '{@link datacenter.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.JobImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getJob()
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
	 * The meta object id for the '{@link datacenter.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.TaskImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getTask()
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
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = DYNAMIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Job</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_JOB = DYNAMIC_ELEMENT_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link datacenter.impl.GeoLocationImpl <em>Geo Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.impl.GeoLocationImpl
	 * @see datacenter.impl.DatacenterPackageImpl#getGeoLocation()
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
	 * The meta object id for the '{@link datacenter.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacenter.Status
	 * @see datacenter.impl.DatacenterPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 7;


	/**
	 * The meta object id for the '<em>Time Stamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see datacenter.impl.DatacenterPackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 8;


	/**
	 * Returns the meta object for class '{@link datacenter.DynamicElement <em>Dynamic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Element</em>'.
	 * @see datacenter.DynamicElement
	 * @generated
	 */
	EClass getDynamicElement();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.DynamicElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see datacenter.DynamicElement#getID()
	 * @see #getDynamicElement()
	 * @generated
	 */
	EAttribute getDynamicElement_ID();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.DynamicElement#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see datacenter.DynamicElement#getTimestamp()
	 * @see #getDynamicElement()
	 * @generated
	 */
	EAttribute getDynamicElement_Timestamp();

	/**
	 * Returns the meta object for class '{@link datacenter.CloudNetwork <em>Cloud Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Network</em>'.
	 * @see datacenter.CloudNetwork
	 * @generated
	 */
	EClass getCloudNetwork();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.CloudNetwork#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see datacenter.CloudNetwork#getID()
	 * @see #getCloudNetwork()
	 * @generated
	 */
	EAttribute getCloudNetwork_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.CloudNetwork#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see datacenter.CloudNetwork#getServers()
	 * @see #getCloudNetwork()
	 * @generated
	 */
	EReference getCloudNetwork_Servers();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.CloudNetwork#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see datacenter.CloudNetwork#getJobs()
	 * @see #getCloudNetwork()
	 * @generated
	 */
	EReference getCloudNetwork_Jobs();

	/**
	 * Returns the meta object for class '{@link datacenter.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see datacenter.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the containment reference '{@link datacenter.Server#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see datacenter.Server#getLocation()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.Server#getHostedMachines <em>Hosted Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosted Machines</em>'.
	 * @see datacenter.Server#getHostedMachines()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_HostedMachines();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.Server#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see datacenter.Server#getNetwork()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Network();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Server#getTotalCores <em>Total Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cores</em>'.
	 * @see datacenter.Server#getTotalCores()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_TotalCores();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Server#getTotalMemory <em>Total Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Memory</em>'.
	 * @see datacenter.Server#getTotalMemory()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_TotalMemory();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Server#getTotalDisk <em>Total Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Disk</em>'.
	 * @see datacenter.Server#getTotalDisk()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_TotalDisk();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Server#getRemainingMemory <em>Remaining Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Memory</em>'.
	 * @see datacenter.Server#getRemainingMemory()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RemainingMemory();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Server#getRemainingCores <em>Remaining Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Cores</em>'.
	 * @see datacenter.Server#getRemainingCores()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RemainingCores();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Server#getRemainingDisk <em>Remaining Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Disk</em>'.
	 * @see datacenter.Server#getRemainingDisk()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RemainingDisk();

	/**
	 * Returns the meta object for class '{@link datacenter.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see datacenter.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.Machine#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Server</em>'.
	 * @see datacenter.Machine#getServer()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Server();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Machine#getAssignedCores <em>Assigned Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Cores</em>'.
	 * @see datacenter.Machine#getAssignedCores()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_AssignedCores();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Machine#getAssignedMemory <em>Assigned Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Memory</em>'.
	 * @see datacenter.Machine#getAssignedMemory()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_AssignedMemory();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Machine#getAssignedDisk <em>Assigned Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Disk</em>'.
	 * @see datacenter.Machine#getAssignedDisk()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_AssignedDisk();

	/**
	 * Returns the meta object for class '{@link datacenter.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see datacenter.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.Job#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Network</em>'.
	 * @see datacenter.Job#getNetwork()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link datacenter.Job#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see datacenter.Job#getTasks()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Tasks();

	/**
	 * Returns the meta object for class '{@link datacenter.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see datacenter.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Task#getDurantion <em>Durantion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durantion</em>'.
	 * @see datacenter.Task#getDurantion()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Durantion();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Task#getConsumedDisk <em>Consumed Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed Disk</em>'.
	 * @see datacenter.Task#getConsumedDisk()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ConsumedDisk();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Task#getConsumedCPUrate <em>Consumed CP Urate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed CP Urate</em>'.
	 * @see datacenter.Task#getConsumedCPUrate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ConsumedCPUrate();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see datacenter.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Status();

	/**
	 * Returns the meta object for the container reference '{@link datacenter.Task#getParentJob <em>Parent Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Job</em>'.
	 * @see datacenter.Task#getParentJob()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ParentJob();

	/**
	 * Returns the meta object for class '{@link datacenter.GeoLocation <em>Geo Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Location</em>'.
	 * @see datacenter.GeoLocation
	 * @generated
	 */
	EClass getGeoLocation();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.GeoLocation#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see datacenter.GeoLocation#getLongitude()
	 * @see #getGeoLocation()
	 * @generated
	 */
	EAttribute getGeoLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link datacenter.GeoLocation#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see datacenter.GeoLocation#getLatitude()
	 * @see #getGeoLocation()
	 * @generated
	 */
	EAttribute getGeoLocation_Latitude();

	/**
	 * Returns the meta object for enum '{@link datacenter.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see datacenter.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Stamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimeStamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatacenterFactory getDatacenterFactory();

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
		 * The meta object literal for the '{@link datacenter.impl.DynamicElementImpl <em>Dynamic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.DynamicElementImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getDynamicElement()
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
		 * The meta object literal for the '{@link datacenter.impl.CloudNetworkImpl <em>Cloud Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.CloudNetworkImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getCloudNetwork()
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
		 * The meta object literal for the '{@link datacenter.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.ServerImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getServer()
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
		 * The meta object literal for the '{@link datacenter.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.MachineImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getMachine()
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
		 * The meta object literal for the '{@link datacenter.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.JobImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getJob()
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
		 * The meta object literal for the '{@link datacenter.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.TaskImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '<em><b>Parent Job</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT_JOB = eINSTANCE.getTask_ParentJob();

		/**
		 * The meta object literal for the '{@link datacenter.impl.GeoLocationImpl <em>Geo Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.impl.GeoLocationImpl
		 * @see datacenter.impl.DatacenterPackageImpl#getGeoLocation()
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

		/**
		 * The meta object literal for the '{@link datacenter.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacenter.Status
		 * @see datacenter.impl.DatacenterPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em>Time Stamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see datacenter.impl.DatacenterPackageImpl#getTimeStamp()
		 * @generated
		 */
		EDataType TIME_STAMP = eINSTANCE.getTimeStamp();

	}

} //DatacenterPackage
