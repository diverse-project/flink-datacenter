/**
 */
package datacenter.core.impl;

import datacenter.core.CloudNetwork;
import datacenter.core.CorePackage;
import datacenter.core.GeoLocation;
import datacenter.core.Machine;
import datacenter.core.Server;

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
 *   <li>{@link datacenter.core.impl.ServerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getHostedMachines <em>Hosted Machines</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getTotalCores <em>Total Cores</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getTotalMemory <em>Total Memory</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getTotalDisk <em>Total Disk</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getRemainingMemory <em>Remaining Memory</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getRemainingCores <em>Remaining Cores</em>}</li>
 *   <li>{@link datacenter.core.impl.ServerImpl#getRemainingDisk <em>Remaining Disk</em>}</li>
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
		return CorePackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation getLocation() {
		return (GeoLocation)eGet(CorePackage.Literals.SERVER__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(GeoLocation newLocation) {
		eSet(CorePackage.Literals.SERVER__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Machine> getHostedMachines() {
		return (EList<Machine>)eGet(CorePackage.Literals.SERVER__HOSTED_MACHINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNetwork getNetwork() {
		return (CloudNetwork)eGet(CorePackage.Literals.SERVER__NETWORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(CloudNetwork newNetwork) {
		eSet(CorePackage.Literals.SERVER__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCores() {
		return (Integer)eGet(CorePackage.Literals.SERVER__TOTAL_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCores(int newTotalCores) {
		eSet(CorePackage.Literals.SERVER__TOTAL_CORES, newTotalCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalMemory() {
		return (Float)eGet(CorePackage.Literals.SERVER__TOTAL_MEMORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalMemory(float newTotalMemory) {
		eSet(CorePackage.Literals.SERVER__TOTAL_MEMORY, newTotalMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalDisk() {
		return (Float)eGet(CorePackage.Literals.SERVER__TOTAL_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDisk(float newTotalDisk) {
		eSet(CorePackage.Literals.SERVER__TOTAL_DISK, newTotalDisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingMemory() {
		return (Float)eGet(CorePackage.Literals.SERVER__REMAINING_MEMORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingMemory(float newRemainingMemory) {
		eSet(CorePackage.Literals.SERVER__REMAINING_MEMORY, newRemainingMemory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingCores() {
		return (Float)eGet(CorePackage.Literals.SERVER__REMAINING_CORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingCores(float newRemainingCores) {
		eSet(CorePackage.Literals.SERVER__REMAINING_CORES, newRemainingCores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemainingDisk() {
		return (Float)eGet(CorePackage.Literals.SERVER__REMAINING_DISK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingDisk(float newRemainingDisk) {
		eSet(CorePackage.Literals.SERVER__REMAINING_DISK, newRemainingDisk);
	}

} //ServerImpl
