/**
 */
package datacenter.core.impl;

import datacenter.core.CorePackage;
import datacenter.core.Machine;
import datacenter.core.Server;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.impl.MachineImpl#getServer <em>Server</em>}</li>
 *   <li>{@link datacenter.core.impl.MachineImpl#getAssignedCores <em>Assigned Cores</em>}</li>
 *   <li>{@link datacenter.core.impl.MachineImpl#getAssignedMemory <em>Assigned Memory</em>}</li>
 *   <li>{@link datacenter.core.impl.MachineImpl#getAssignedDisk <em>Assigned Disk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends DynamicElementImpl implements Machine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return (Server)eGet(CorePackage.Literals.MACHINE__SERVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		eSet(CorePackage.Literals.MACHINE__SERVER, newServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssignedCores() {
		return (Integer)eGet(CorePackage.Literals.MACHINE__ASSIGNED_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedCores(int newAssignedCores) {
		eSet(CorePackage.Literals.MACHINE__ASSIGNED_CORES, newAssignedCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAssignedMemory() {
		return (Float)eGet(CorePackage.Literals.MACHINE__ASSIGNED_MEMORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedMemory(float newAssignedMemory) {
		eSet(CorePackage.Literals.MACHINE__ASSIGNED_MEMORY, newAssignedMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAssignedDisk() {
		return (Float)eGet(CorePackage.Literals.MACHINE__ASSIGNED_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedDisk(float newAssignedDisk) {
		eSet(CorePackage.Literals.MACHINE__ASSIGNED_DISK, newAssignedDisk);
	}

} //MachineImpl
