/**
 */
package datacenter.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link datacenter.core.GeoLocation#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link datacenter.core.GeoLocation#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see datacenter.core.CorePackage#getGeoLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='latitudeCheck longitudeCheck'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot latitudeCheck='Tuple {\n\tmessage : String = \'Latitude should range from -90 to 90 degrees\',\n\tstatus : Boolean = \n\t\t\tlatitude  > 90 and latitude > -90\n}.status' longitudeCheck='Tuple {\n\tmessage : String = \'Longitude should range from 0 to 180 degrees\',\n\tstatus : Boolean = \n\t\t\tlongitude > 0 and longitude < 180\n}.status'"
 * @generated
 */
public interface GeoLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see datacenter.core.CorePackage#getGeoLocation_Longitude()
	 * @model required="true"
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link datacenter.core.GeoLocation#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see datacenter.core.CorePackage#getGeoLocation_Latitude()
	 * @model required="true"
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link datacenter.core.GeoLocation#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

} // GeoLocation
