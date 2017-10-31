/**
 */
package datacenter.core.impl;

import datacenter.core.CloudNetwork;
import datacenter.core.CorePackage;
import datacenter.core.Job;
import datacenter.core.Server;

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
 *   <li>{@link datacenter.core.impl.CloudNetworkImpl#getID <em>ID</em>}</li>
 *   <li>{@link datacenter.core.impl.CloudNetworkImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link datacenter.core.impl.CloudNetworkImpl#getJobs <em>Jobs</em>}</li>
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
		return CorePackage.Literals.CLOUD_NETWORK;
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
		return (String)eGet(CorePackage.Literals.CLOUD_NETWORK__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(CorePackage.Literals.CLOUD_NETWORK__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Server> getServers() {
		return (EList<Server>)eGet(CorePackage.Literals.CLOUD_NETWORK__SERVERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Job> getJobs() {
		return (EList<Job>)eGet(CorePackage.Literals.CLOUD_NETWORK__JOBS, true);
	}

} //CloudNetworkImpl
