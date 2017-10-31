/**
 */
package datacenter.core.impl;

import datacenter.core.CloudNetwork;
import datacenter.core.CorePackage;
import datacenter.core.Job;
import datacenter.core.Task;

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
 *   <li>{@link datacenter.core.impl.JobImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.core.impl.JobImpl#getTasks <em>Tasks</em>}</li>
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
		return CorePackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNetwork getNetwork() {
		return (CloudNetwork)eGet(CorePackage.Literals.JOB__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(CloudNetwork newNetwork) {
		eSet(CorePackage.Literals.JOB__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Task> getTasks() {
		return (EList<Task>)eGet(CorePackage.Literals.JOB__TASKS, true);
	}

} //JobImpl
