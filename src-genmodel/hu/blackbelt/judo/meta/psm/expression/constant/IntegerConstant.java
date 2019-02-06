/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getIntegerConstant()
 * @model
 * @generated
 */
public interface IntegerConstant extends hu.blackbelt.judo.meta.psm.expression.constant.Number, IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getIntegerConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

} // IntegerConstant
