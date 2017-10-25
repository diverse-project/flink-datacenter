/**
 */
package datacenter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.Machine#getServer <em>Server</em>}</li>
 *   <li>{@link datacenter.Machine#getAssignedCores <em>Assigned Cores</em>}</li>
 *   <li>{@link datacenter.Machine#getAssignedMemory <em>Assigned Memory</em>}</li>
 *   <li>{@link datacenter.Machine#getAssignedDisk <em>Assigned Disk</em>}</li>
 * </ul>
 *
 * @see datacenter.DatacenterPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacenter.Server#getHostedMachines <em>Hosted Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' container reference.
	 * @see #setServer(Server)
	 * @see datacenter.DatacenterPackage#getMachine_Server()
	 * @see datacenter.Server#getHostedMachines
	 * @model opposite="hostedMachines" required="true" transient="false"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link datacenter.Machine#getServer <em>Server</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' container reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

	/**
	 * Returns the value of the '<em><b>Assigned Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Cores</em>' attribute.
	 * @see #setAssignedCores(int)
	 * @see datacenter.DatacenterPackage#getMachine_AssignedCores()
	 * @model required="true"
	 * @generated
	 */
	int getAssignedCores();

	/**
	 * Sets the value of the '{@link datacenter.Machine#getAssignedCores <em>Assigned Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Cores</em>' attribute.
	 * @see #getAssignedCores()
	 * @generated
	 */
	void setAssignedCores(int value);

	/**
	 * Returns the value of the '<em><b>Assigned Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Memory</em>' attribute.
	 * @see #setAssignedMemory(float)
	 * @see datacenter.DatacenterPackage#getMachine_AssignedMemory()
	 * @model required="true"
	 * @generated
	 */
	float getAssignedMemory();

	/**
	 * Sets the value of the '{@link datacenter.Machine#getAssignedMemory <em>Assigned Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Memory</em>' attribute.
	 * @see #getAssignedMemory()
	 * @generated
	 */
	void setAssignedMemory(float value);

	/**
	 * Returns the value of the '<em><b>Assigned Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Disk</em>' attribute.
	 * @see #setAssignedDisk(float)
	 * @see datacenter.DatacenterPackage#getMachine_AssignedDisk()
	 * @model required="true"
	 * @generated
	 */
	float getAssignedDisk();

	/**
	 * Sets the value of the '{@link datacenter.Machine#getAssignedDisk <em>Assigned Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Disk</em>' attribute.
	 * @see #getAssignedDisk()
	 * @generated
	 */
	void setAssignedDisk(float value);

} // Machine
