/**
 */
package datacenter.impl;

import datacenter.CloudNetwork;
import datacenter.DatacenterPackage;
import datacenter.Job;
import datacenter.Task;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.JobImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.impl.JobImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends DynamicElementImpl implements Job {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacenterPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNetwork getNetwork() {
		return (CloudNetwork)eGet(DatacenterPackage.Literals.JOB__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(CloudNetwork newNetwork) {
		eSet(DatacenterPackage.Literals.JOB__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Task> getTasks() {
		return (EList<Task>)eGet(DatacenterPackage.Literals.JOB__TASKS, true);
	}

} //JobImpl
