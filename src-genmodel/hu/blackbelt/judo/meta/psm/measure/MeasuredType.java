/**
 */
package hu.blackbelt.judo.meta.psm.measure;

import hu.blackbelt.judo.meta.psm.type.NumericType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.MeasuredType#getStoreUnit <em>Store Unit</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasuredType()
 * @model
 * @generated
 */
public interface MeasuredType extends NumericType {
	/**
	 * Returns the value of the '<em><b>Store Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Unit</em>' reference.
	 * @see #setStoreUnit(Unit)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasuredType_StoreUnit()
	 * @model required="true"
	 * @generated
	 */
	Unit getStoreUnit();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.MeasuredType#getStoreUnit <em>Store Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Unit</em>' reference.
	 * @see #getStoreUnit()
	 * @generated
	 */
	void setStoreUnit(Unit value);

} // MeasuredType
