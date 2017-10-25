/**
 */
package datacenter.impl;

import datacenter.DatacenterPackage;
import datacenter.GeoLocation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link datacenter.impl.GeoLocationImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link datacenter.impl.GeoLocationImpl#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoLocationImpl extends MinimalEObjectImpl.Container implements GeoLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacenterPackage.Literals.GEO_LOCATION;
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
	public float getLongitude() {
		return (Float)eGet(DatacenterPackage.Literals.GEO_LOCATION__LONGITUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(float newLongitude) {
		eSet(DatacenterPackage.Literals.GEO_LOCATION__LONGITUDE, newLongitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLatitude() {
		return (Float)eGet(DatacenterPackage.Literals.GEO_LOCATION__LATITUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(float newLatitude) {
		eSet(DatacenterPackage.Literals.GEO_LOCATION__LATITUDE, newLatitude);
	}

} //GeoLocationImpl
