/**
 */
package datacenter.impl;

import datacenter.DatacenterPackage;
import datacenter.Machine;
import datacenter.Server;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.MachineImpl#getServer <em>Server</em>}</li>
 *   <li>{@link datacenter.impl.MachineImpl#getAssignedCores <em>Assigned Cores</em>}</li>
 *   <li>{@link datacenter.impl.MachineImpl#getAssignedMemory <em>Assigned Memory</em>}</li>
 *   <li>{@link datacenter.impl.MachineImpl#getAssignedDisk <em>Assigned Disk</em>}</li>
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
		return DatacenterPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return (Server)eGet(DatacenterPackage.Literals.MACHINE__SERVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		eSet(DatacenterPackage.Literals.MACHINE__SERVER, newServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssignedCores() {
		return (Integer)eGet(DatacenterPackage.Literals.MACHINE__ASSIGNED_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedCores(int newAssignedCores) {
		eSet(DatacenterPackage.Literals.MACHINE__ASSIGNED_CORES, newAssignedCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAssignedMemory() {
		return (Float)eGet(DatacenterPackage.Literals.MACHINE__ASSIGNED_MEMORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedMemory(float newAssignedMemory) {
		eSet(DatacenterPackage.Literals.MACHINE__ASSIGNED_MEMORY, newAssignedMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAssignedDisk() {
		return (Float)eGet(DatacenterPackage.Literals.MACHINE__ASSIGNED_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedDisk(float newAssignedDisk) {
		eSet(DatacenterPackage.Literals.MACHINE__ASSIGNED_DISK, newAssignedDisk);
	}

} //MachineImpl
