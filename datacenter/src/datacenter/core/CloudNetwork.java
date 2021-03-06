/**
 */
package datacenter.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.CloudNetwork#getID <em>ID</em>}</li>
 *   <li>{@link datacenter.core.CloudNetwork#getServers <em>Servers</em>}</li>
 *   <li>{@link datacenter.core.CloudNetwork#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see datacenter.core.CorePackage#getCloudNetwork()
 * @model
 * @generated
 */
public interface CloudNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see datacenter.core.CorePackage#getCloudNetwork_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link datacenter.core.CloudNetwork#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link datacenter.core.Server}.
	 * It is bidirectional and its opposite is '{@link datacenter.core.Server#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see datacenter.core.CorePackage#getCloudNetwork_Servers()
	 * @see datacenter.core.Server#getNetwork
	 * @model opposite="network" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Server> getServers();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link datacenter.core.Job}.
	 * It is bidirectional and its opposite is '{@link datacenter.core.Job#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see datacenter.core.CorePackage#getCloudNetwork_Jobs()
	 * @see datacenter.core.Job#getNetwork
	 * @model opposite="network" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Job> getJobs();

} // CloudNetwork
