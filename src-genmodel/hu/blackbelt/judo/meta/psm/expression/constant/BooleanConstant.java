/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getBooleanConstant()
 * @model
 * @generated
 */
public interface BooleanConstant extends Constant, LogicalExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getBooleanConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanConstant
