/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getRight <em>Right</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getObjectComparison()
 * @model
 * @generated
 */
public interface ObjectComparison extends LogicalExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ObjectExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getObjectComparison_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectExpression getLeft();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ObjectExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ObjectExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getObjectComparison_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectExpression getRight();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ObjectExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator
	 * @see #setOperator(ObjectComparator)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getObjectComparison_Operator()
	 * @model required="true"
	 * @generated
	 */
	ObjectComparator getOperator();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ObjectComparator value);

} // ObjectComparison
