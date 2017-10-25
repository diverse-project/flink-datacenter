/**
 */
package datacenter.impl;

import datacenter.DatacenterPackage;
import datacenter.DynamicElement;
import java.sql.Timestamp;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.DynamicElementImpl#getID <em>ID</em>}</li>
 *   <li>{@link datacenter.impl.DynamicElementImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicElementImpl extends MinimalEObjectImpl.Container implements DynamicElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacenterPackage.Literals.DYNAMIC_ELEMENT;
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
		return (String)eGet(DatacenterPackage.Literals.DYNAMIC_ELEMENT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(DatacenterPackage.Literals.DYNAMIC_ELEMENT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp getTimestamp() {
		return (Timestamp)eGet(DatacenterPackage.Literals.DYNAMIC_ELEMENT__TIMESTAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Timestamp newTimestamp) {
		eSet(DatacenterPackage.Literals.DYNAMIC_ELEMENT__TIMESTAMP, newTimestamp);
	}

} //DynamicElementImpl
