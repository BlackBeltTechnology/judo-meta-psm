/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getRight <em>Right</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getDecimalComparison()
 * @model
 * @generated
 */
public interface DecimalComparison extends LogicalExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(NumericExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getDecimalComparison_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericExpression getLeft();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(NumericExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(NumericExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getDecimalComparison_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericExpression getRight();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(NumericExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator
	 * @see #setOperator(DecimalComparator)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getDecimalComparison_Operator()
	 * @model required="true"
	 * @generated
	 */
	DecimalComparator getOperator();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(DecimalComparator value);

} // DecimalComparison
