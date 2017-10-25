/**
 */
package datacenter;

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
 *   <li>{@link datacenter.Job#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.Job#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see datacenter.DatacenterPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends DynamicElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link datacenter.CloudNetwork#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(CloudNetwork)
	 * @see datacenter.DatacenterPackage#getJob_Network()
	 * @see datacenter.CloudNetwork#getJobs
	 * @model opposite="jobs" required="true" transient="false"
	 * @generated
	 */
	CloudNetwork getNetwork();

	/**
	 * Sets the value of the '{@link datacenter.Job#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CloudNetwork value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link datacenter.Task}.
	 * It is bidirectional and its opposite is '{@link datacenter.Task#getParentJob <em>Parent Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see datacenter.DatacenterPackage#getJob_Tasks()
	 * @see datacenter.Task#getParentJob
	 * @model opposite="parentJob" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Task> getTasks();

} // Job
