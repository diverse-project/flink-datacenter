/**
 */
package datacenter.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.Task#getDurantion <em>Durantion</em>}</li>
 *   <li>{@link datacenter.core.Task#getConsumedDisk <em>Consumed Disk</em>}</li>
 *   <li>{@link datacenter.core.Task#getConsumedCPUrate <em>Consumed CP Urate</em>}</li>
 *   <li>{@link datacenter.core.Task#getParentJob <em>Parent Job</em>}</li>
 *   <li>{@link datacenter.core.Task#getHostMachine <em>Host Machine</em>}</li>
 * </ul>
 *
 * @see datacenter.core.CorePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Durantion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durantion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durantion</em>' attribute.
	 * @see #setDurantion(int)
	 * @see datacenter.core.CorePackage#getTask_Durantion()
	 * @model required="true"
	 * @generated
	 */
	int getDurantion();

	/**
	 * Sets the value of the '{@link datacenter.core.Task#getDurantion <em>Durantion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durantion</em>' attribute.
	 * @see #getDurantion()
	 * @generated
	 */
	void setDurantion(int value);

	/**
	 * Returns the value of the '<em><b>Consumed Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Disk</em>' attribute.
	 * @see #setConsumedDisk(float)
	 * @see datacenter.core.CorePackage#getTask_ConsumedDisk()
	 * @model required="true"
	 * @generated
	 */
	float getConsumedDisk();

	/**
	 * Sets the value of the '{@link datacenter.core.Task#getConsumedDisk <em>Consumed Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed Disk</em>' attribute.
	 * @see #getConsumedDisk()
	 * @generated
	 */
	void setConsumedDisk(float value);

	/**
	 * Returns the value of the '<em><b>Consumed CP Urate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumed CP Urate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed CP Urate</em>' attribute.
	 * @see #setConsumedCPUrate(float)
	 * @see datacenter.core.CorePackage#getTask_ConsumedCPUrate()
	 * @model required="true"
	 * @generated
	 */
	float getConsumedCPUrate();

	/**
	 * Sets the value of the '{@link datacenter.core.Task#getConsumedCPUrate <em>Consumed CP Urate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed CP Urate</em>' attribute.
	 * @see #getConsumedCPUrate()
	 * @generated
	 */
	void setConsumedCPUrate(float value);

	/**
	 * Returns the value of the '<em><b>Parent Job</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacenter.core.Job#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Job</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Job</em>' container reference.
	 * @see #setParentJob(Job)
	 * @see datacenter.core.CorePackage#getTask_ParentJob()
	 * @see datacenter.core.Job#getTasks
	 * @model opposite="tasks" required="true" transient="false"
	 * @generated
	 */
	Job getParentJob();

	/**
	 * Sets the value of the '{@link datacenter.core.Task#getParentJob <em>Parent Job</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Job</em>' container reference.
	 * @see #getParentJob()
	 * @generated
	 */
	void setParentJob(Job value);

	/**
	 * Returns the value of the '<em><b>Host Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Machine</em>' reference.
	 * @see #setHostMachine(Machine)
	 * @see datacenter.core.CorePackage#getTask_HostMachine()
	 * @model required="true"
	 * @generated
	 */
	Machine getHostMachine();

	/**
	 * Sets the value of the '{@link datacenter.core.Task#getHostMachine <em>Host Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Machine</em>' reference.
	 * @see #getHostMachine()
	 * @generated
	 */
	void setHostMachine(Machine value);

} // Task
