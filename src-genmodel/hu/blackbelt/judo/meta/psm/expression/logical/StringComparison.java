/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.StringComparator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getRight <em>Right</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getStringComparison()
 * @model
 * @generated
 */
public interface StringComparison extends LogicalExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(StringExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getStringComparison_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getLeft();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(StringExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getStringComparison_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getRight();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.StringComparator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.StringComparator
	 * @see #setOperator(StringComparator)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getStringComparison_Operator()
	 * @model required="true"
	 * @generated
	 */
	StringComparator getOperator();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.StringComparator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(StringComparator value);

} // StringComparison
