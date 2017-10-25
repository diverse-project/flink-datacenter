/**
 */
package datacenter.impl;

import datacenter.CloudNetwork;
import datacenter.DatacenterPackage;
import datacenter.GeoLocation;
import datacenter.Machine;
import datacenter.Server;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.ServerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getHostedMachines <em>Hosted Machines</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getTotalCores <em>Total Cores</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getTotalDisk <em>Total Disk</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getRemainingMemory <em>Remaining Memory</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getRemainingCores <em>Remaining Cores</em>}</li>
 *   <li>{@link datacenter.impl.ServerImpl#getRemainingDisk <em>Remaining Disk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends DynamicElementImpl implements Server {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacenterPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation getLocation() {
		return (GeoLocation)eGet(DatacenterPackage.Literals.SERVER__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GeoLocation newLocation) {
		eSet(DatacenterPackage.Literals.SERVER__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Machine> getHostedMachines() {
		return (EList<Machine>)eGet(DatacenterPackage.Literals.SERVER__HOSTED_MACHINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNetwork getNetwork() {
		return (CloudNetwork)eGet(DatacenterPackage.Literals.SERVER__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(CloudNetwork newNetwork) {
		eSet(DatacenterPackage.Literals.SERVER__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCores() {
		return (Integer)eGet(DatacenterPackage.Literals.SERVER__TOTAL_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCores(int newTotalCores) {
		eSet(DatacenterPackage.Literals.SERVER__TOTAL_CORES, newTotalCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalMemory() {
		return (Float)eGet(DatacenterPackage.Literals.SERVER__TOTAL_MEMORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalMemory(float newTotalMemory) {
		eSet(DatacenterPackage.Literals.SERVER__TOTAL_MEMORY, newTotalMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalDisk() {
		return (Float)eGet(DatacenterPackage.Literals.SERVER__TOTAL_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDisk(float newTotalDisk) {
		eSet(DatacenterPackage.Literals.SERVER__TOTAL_DISK, newTotalDisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingMemory() {
		return (Float)eGet(DatacenterPackage.Literals.SERVER__REMAINING_MEMORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingMemory(float newRemainingMemory) {
		eSet(DatacenterPackage.Literals.SERVER__REMAINING_MEMORY, newRemainingMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingCores() {
		return (Float)eGet(DatacenterPackage.Literals.SERVER__REMAINING_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingCores(float newRemainingCores) {
		eSet(DatacenterPackage.Literals.SERVER__REMAINING_CORES, newRemainingCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingDisk() {
		return (Float)eGet(DatacenterPackage.Literals.SERVER__REMAINING_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingDisk(float newRemainingDisk) {
		eSet(DatacenterPackage.Literals.SERVER__REMAINING_DISK, newRemainingDisk);
	}

} //ServerImpl
