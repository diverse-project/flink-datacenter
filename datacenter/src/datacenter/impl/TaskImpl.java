/**
 */
package datacenter.impl;

import datacenter.DatacenterPackage;
import datacenter.Job;
import datacenter.Task;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.TaskImpl#getDurantion <em>Durantion</em>}</li>
 *   <li>{@link datacenter.impl.TaskImpl#getConsumedDisk <em>Consumed Disk</em>}</li>
 *   <li>{@link datacenter.impl.TaskImpl#getConsumedCPUrate <em>Consumed CP Urate</em>}</li>
 *   <li>{@link datacenter.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link datacenter.impl.TaskImpl#getParentJob <em>Parent Job</em>}</li>
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
		return DatacenterPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurantion() {
		return (Integer)eGet(DatacenterPackage.Literals.TASK__DURANTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurantion(int newDurantion) {
		eSet(DatacenterPackage.Literals.TASK__DURANTION, newDurantion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConsumedDisk() {
		return (Float)eGet(DatacenterPackage.Literals.TASK__CONSUMED_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedDisk(float newConsumedDisk) {
		eSet(DatacenterPackage.Literals.TASK__CONSUMED_DISK, newConsumedDisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConsumedCPUrate() {
		return (Float)eGet(DatacenterPackage.Literals.TASK__CONSUMED_CP_URATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedCPUrate(float newConsumedCPUrate) {
		eSet(DatacenterPackage.Literals.TASK__CONSUMED_CP_URATE, newConsumedCPUrate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatus() {
		return (Integer)eGet(DatacenterPackage.Literals.TASK__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(int newStatus) {
		eSet(DatacenterPackage.Literals.TASK__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job getParentJob() {
		return (Job)eGet(DatacenterPackage.Literals.TASK__PARENT_JOB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentJob(Job newParentJob) {
		eSet(DatacenterPackage.Literals.TASK__PARENT_JOB, newParentJob);
	}

} //TaskImpl
