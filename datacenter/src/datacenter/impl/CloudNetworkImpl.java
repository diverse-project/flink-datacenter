/**
 */
package datacenter.impl;

import datacenter.CloudNetwork;
import datacenter.DatacenterPackage;
import datacenter.Job;
import datacenter.Server;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.CloudNetworkImpl#getID <em>ID</em>}</li>
 *   <li>{@link datacenter.impl.CloudNetworkImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link datacenter.impl.CloudNetworkImpl#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudNetworkImpl extends MinimalEObjectImpl.Container implements CloudNetwork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacenterPackage.Literals.CLOUD_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(DatacenterPackage.Literals.CLOUD_NETWORK__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(DatacenterPackage.Literals.CLOUD_NETWORK__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Server> getServers() {
		return (EList<Server>)eGet(DatacenterPackage.Literals.CLOUD_NETWORK__SERVERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Job> getJobs() {
		return (EList<Job>)eGet(DatacenterPackage.Literals.CLOUD_NETWORK__JOBS, true);
	}

} //CloudNetworkImpl
