/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import hu.blackbelt.judo.meta.psm.expression.FilteringExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getObjectExpression <em>Object Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectFilterExpression()
 * @model
 * @generated
 */
public interface ObjectFilterExpression extends ObjectExpression, FilteringExpression {
	/**
	 * Returns the value of the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Expression</em>' containment reference.
	 * @see #setObjectExpression(ObjectExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectFilterExpression_ObjectExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectExpression getObjectExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Expression</em>' containment reference.
	 * @see #getObjectExpression()
	 * @generated
	 */
	void setObjectExpression(ObjectExpression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(LogicalExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectFilterExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalExpression getCondition();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(LogicalExpression value);

} // ObjectFilterExpression
