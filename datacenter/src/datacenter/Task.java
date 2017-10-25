/**
 */
package datacenter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.Task#getDurantion <em>Durantion</em>}</li>
 *   <li>{@link datacenter.Task#getConsumedDisk <em>Consumed Disk</em>}</li>
 *   <li>{@link datacenter.Task#getConsumedCPUrate <em>Consumed CP Urate</em>}</li>
 *   <li>{@link datacenter.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link datacenter.Task#getParentJob <em>Parent Job</em>}</li>
 * </ul>
 *
 * @see datacenter.DatacenterPackage#getTask()
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
	 * @see datacenter.DatacenterPackage#getTask_Durantion()
	 * @model required="true"
	 * @generated
	 */
	int getDurantion();

	/**
	 * Sets the value of the '{@link datacenter.Task#getDurantion <em>Durantion</em>}' attribute.
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
	 * @see datacenter.DatacenterPackage#getTask_ConsumedDisk()
	 * @model required="true"
	 * @generated
	 */
	float getConsumedDisk();

	/**
	 * Sets the value of the '{@link datacenter.Task#getConsumedDisk <em>Consumed Disk</em>}' attribute.
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
	 * @see datacenter.DatacenterPackage#getTask_ConsumedCPUrate()
	 * @model required="true"
	 * @generated
	 */
	float getConsumedCPUrate();

	/**
	 * Sets the value of the '{@link datacenter.Task#getConsumedCPUrate <em>Consumed CP Urate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed CP Urate</em>' attribute.
	 * @see #getConsumedCPUrate()
	 * @generated
	 */
	void setConsumedCPUrate(float value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see datacenter.DatacenterPackage#getTask_Status()
	 * @model required="true"
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link datacenter.Task#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Parent Job</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacenter.Job#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Job</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Job</em>' container reference.
	 * @see #setParentJob(Job)
	 * @see datacenter.DatacenterPackage#getTask_ParentJob()
	 * @see datacenter.Job#getTasks
	 * @model opposite="tasks" required="true" transient="false"
	 * @generated
	 */
	Job getParentJob();

	/**
	 * Sets the value of the '{@link datacenter.Task#getParentJob <em>Parent Job</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Job</em>' container reference.
	 * @see #getParentJob()
	 * @generated
	 */
	void setParentJob(Job value);

} // Task
