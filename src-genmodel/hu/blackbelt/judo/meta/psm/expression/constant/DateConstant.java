/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import hu.blackbelt.judo.meta.psm.expression.DateExpression;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.DateConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getDateConstant()
 * @model
 * @generated
 */
public interface DateConstant extends Constant, DateExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Date)
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getDateConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	Date getValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.DateConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Date value);

} // DateConstant
