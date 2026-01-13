/**
 */
package hu.blackbelt.judo.meta.psm.type;

import hu.blackbelt.judo.meta.psm.measure.DurationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.TimeType#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getTimeType()
 * @model
 * @generated
 */
public interface TimeType extends FlatPrimitiveType
{
	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' attribute.
	 * The default value is <code>"second"</code>.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.measure.DurationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Unit</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
	 * @see #setBaseUnit(DurationType)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getTimeType_BaseUnit()
	 * @model default="second" required="true"
	 * @generated
	 */
	DurationType getBaseUnit();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.TimeType#getBaseUnit <em>Base Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(DurationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

} // TimeType
