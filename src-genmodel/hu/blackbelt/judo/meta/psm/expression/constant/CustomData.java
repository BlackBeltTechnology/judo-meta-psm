/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import hu.blackbelt.judo.meta.psm.expression.CustomExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.CustomData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getCustomData()
 * @model
 * @generated
 */
public interface CustomData extends Constant, CustomExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getCustomData_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.CustomData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CustomData
