/**
 */
package hu.blackbelt.judo.meta.psm.measure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.DurationUnit#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getDurationUnit()
 * @model
 * @generated
 */
public interface DurationUnit extends Unit {
	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.measure.DurationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
	 * @see #setUnitType(DurationType)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getDurationUnit_UnitType()
	 * @model required="true"
	 * @generated
	 */
	DurationType getUnitType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.DurationUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(DurationType value);

} // DurationUnit
