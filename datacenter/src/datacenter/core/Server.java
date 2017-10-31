/**
 */
package datacenter.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.Server#getLocation <em>Location</em>}</li>
 *   <li>{@link datacenter.core.Server#getHostedMachines <em>Hosted Machines</em>}</li>
 *   <li>{@link datacenter.core.Server#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.core.Server#getTotalCores <em>Total Cores</em>}</li>
 *   <li>{@link datacenter.core.Server#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link datacenter.core.Server#getTotalDisk <em>Total Disk</em>}</li>
 *   <li>{@link datacenter.core.Server#getRemainingMemory <em>Remaining Memory</em>}</li>
 *   <li>{@link datacenter.core.Server#getRemainingCores <em>Remaining Cores</em>}</li>
 *   <li>{@link datacenter.core.Server#getRemainingDisk <em>Remaining Disk</em>}</li>
 * </ul>
 *
 * @see datacenter.core.CorePackage#getServer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CPUavailabilityCheck memoryAvailabilityCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CPUavailabilityCheck='Tuple {\n\tmessage : String = \'Cannot assign more than available resources\',\n\tstatus : Boolean = \n\t\t\tremainingCores >= 0\n}.status' memoryAvailabilityCheck='Tuple {\n\tmessage : String = \'Cannot assign more than available resources\',\n\tstatus : Boolean = \n\t\t\tremainingMemory >=0\n}.status'"
 * @generated
 */
public interface Server extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(GeoLocation)
	 * @see datacenter.core.CorePackage#getServer_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeoLocation getLocation();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GeoLocation value);

	/**
	 * Returns the value of the '<em><b>Hosted Machines</b></em>' containment reference list.
	 * The list contents are of type {@link datacenter.core.Machine}.
	 * It is bidirectional and its opposite is '{@link datacenter.core.Machine#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Machines</em>' containment reference list.
	 * @see datacenter.core.CorePackage#getServer_HostedMachines()
	 * @see datacenter.core.Machine#getServer
	 * @model opposite="server" containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Machine> getHostedMachines();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacenter.core.CloudNetwork#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(CloudNetwork)
	 * @see datacenter.core.CorePackage#getServer_Network()
	 * @see datacenter.core.CloudNetwork#getServers
	 * @model opposite="servers" required="true" transient="false"
	 * @generated
	 */
	CloudNetwork getNetwork();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CloudNetwork value);

	/**
	 * Returns the value of the '<em><b>Total Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cores</em>' attribute.
	 * @see #setTotalCores(int)
	 * @see datacenter.core.CorePackage#getServer_TotalCores()
	 * @model required="true"
	 * @generated
	 */
	int getTotalCores();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getTotalCores <em>Total Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cores</em>' attribute.
	 * @see #getTotalCores()
	 * @generated
	 */
	void setTotalCores(int value);

	/**
	 * Returns the value of the '<em><b>Total Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Memory</em>' attribute.
	 * @see #setTotalMemory(float)
	 * @see datacenter.core.CorePackage#getServer_TotalMemory()
	 * @model required="true"
	 * @generated
	 */
	float getTotalMemory();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getTotalMemory <em>Total Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Memory</em>' attribute.
	 * @see #getTotalMemory()
	 * @generated
	 */
	void setTotalMemory(float value);

	/**
	 * Returns the value of the '<em><b>Total Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Disk</em>' attribute.
	 * @see #setTotalDisk(float)
	 * @see datacenter.core.CorePackage#getServer_TotalDisk()
	 * @model required="true"
	 * @generated
	 */
	float getTotalDisk();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getTotalDisk <em>Total Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Disk</em>' attribute.
	 * @see #getTotalDisk()
	 * @generated
	 */
	void setTotalDisk(float value);

	/**
	 * Returns the value of the '<em><b>Remaining Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Memory</em>' attribute.
	 * @see #setRemainingMemory(float)
	 * @see datacenter.core.CorePackage#getServer_RemainingMemory()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='hostedMachines->collect(assignedMemory)->sum()'"
	 * @generated
	 */
	float getRemainingMemory();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getRemainingMemory <em>Remaining Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Memory</em>' attribute.
	 * @see #getRemainingMemory()
	 * @generated
	 */
	void setRemainingMemory(float value);

	/**
	 * Returns the value of the '<em><b>Remaining Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Cores</em>' attribute.
	 * @see #setRemainingCores(float)
	 * @see datacenter.core.CorePackage#getServer_RemainingCores()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='hostedMachines->collect(assignedCores)->sum()'"
	 * @generated
	 */
	float getRemainingCores();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getRemainingCores <em>Remaining Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Cores</em>' attribute.
	 * @see #getRemainingCores()
	 * @generated
	 */
	void setRemainingCores(float value);

	/**
	 * Returns the value of the '<em><b>Remaining Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Disk</em>' attribute.
	 * @see #setRemainingDisk(float)
	 * @see datacenter.core.CorePackage#getServer_RemainingDisk()
	 * @model required="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='hostedMachines->collect(assignedDisk)->sum()'"
	 * @generated
	 */
	float getRemainingDisk();

	/**
	 * Sets the value of the '{@link datacenter.core.Server#getRemainingDisk <em>Remaining Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Disk</em>' attribute.
	 * @see #getRemainingDisk()
	 * @generated
	 */
	void setRemainingDisk(float value);

} // Server
