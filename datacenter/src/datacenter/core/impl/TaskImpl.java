/**
 */
package datacenter.core.impl;

import datacenter.core.CorePackage;
import datacenter.core.Job;
import datacenter.core.Machine;
import datacenter.core.Task;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.impl.TaskImpl#getDurantion <em>Durantion</em>}</li>
 *   <li>{@link datacenter.core.impl.TaskImpl#getConsumedDisk <em>Consumed Disk</em>}</li>
 *   <li>{@link datacenter.core.impl.TaskImpl#getConsumedCPUrate <em>Consumed CP Urate</em>}</li>
 *   <li>{@link datacenter.core.impl.TaskImpl#getParentJob <em>Parent Job</em>}</li>
 *   <li>{@link datacenter.core.impl.TaskImpl#getHostMachine <em>Host Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends DynamicElementImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurantion() {
		return (Integer)eGet(CorePackage.Literals.TASK__DURANTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurantion(int newDurantion) {
		eSet(CorePackage.Literals.TASK__DURANTION, newDurantion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConsumedDisk() {
		return (Float)eGet(CorePackage.Literals.TASK__CONSUMED_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedDisk(float newConsumedDisk) {
		eSet(CorePackage.Literals.TASK__CONSUMED_DISK, newConsumedDisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConsumedCPUrate() {
		return (Float)eGet(CorePackage.Literals.TASK__CONSUMED_CP_URATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedCPUrate(float newConsumedCPUrate) {
		eSet(CorePackage.Literals.TASK__CONSUMED_CP_URATE, newConsumedCPUrate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job getParentJob() {
		return (Job)eGet(CorePackage.Literals.TASK__PARENT_JOB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentJob(Job newParentJob) {
		eSet(CorePackage.Literals.TASK__PARENT_JOB, newParentJob);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getHostMachine() {
		return (Machine)eGet(CorePackage.Literals.TASK__HOST_MACHINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostMachine(Machine newHostMachine) {
		eSet(CorePackage.Literals.TASK__HOST_MACHINE, newHostMachine);
	}

} //TaskImpl
