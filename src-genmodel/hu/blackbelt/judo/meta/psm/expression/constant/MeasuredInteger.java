/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import hu.blackbelt.judo.meta.psm.expression.MeasureName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getUnitName <em>Unit Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getMeasuredInteger()
 * @model
 * @generated
 */
public interface MeasuredInteger extends IntegerConstant {
	/**
	 * Returns the value of the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Name</em>' attribute.
	 * @see #setUnitName(String)
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getMeasuredInteger_UnitName()
	 * @model required="true"
	 * @generated
	 */
	String getUnitName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getUnitName <em>Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Name</em>' attribute.
	 * @see #getUnitName()
	 * @generated
	 */
	void setUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' reference.
	 * @see #setMeasure(MeasureName)
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getMeasuredInteger_Measure()
	 * @model
	 * @generated
	 */
	MeasureName getMeasure();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getMeasure <em>Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureName value);

} // MeasuredInteger
