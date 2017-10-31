/**
 */
package datacenter.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.Job#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.core.Job#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see datacenter.core.CorePackage#getJob()
 * @model
 * @generated
 */
public interface Job extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacenter.core.CloudNetwork#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(CloudNetwork)
	 * @see datacenter.core.CorePackage#getJob_Network()
	 * @see datacenter.core.CloudNetwork#getJobs
	 * @model opposite="jobs" required="true" transient="false"
	 * @generated
	 */
	CloudNetwork getNetwork();

	/**
	 * Sets the value of the '{@link datacenter.core.Job#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CloudNetwork value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link datacenter.core.Task}.
	 * It is bidirectional and its opposite is '{@link datacenter.core.Task#getParentJob <em>Parent Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see datacenter.core.CorePackage#getJob_Tasks()
	 * @see datacenter.core.Task#getParentJob
	 * @model opposite="parentJob" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Task> getTasks();

} // Job
