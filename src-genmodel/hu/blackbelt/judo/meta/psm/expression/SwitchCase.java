/**
 */
package hu.blackbelt.judo.meta.psm.expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getSwitchCase()
 * @model
 * @generated
 */
public interface SwitchCase extends EObject {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getSwitchCase_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalExpression getCondition();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(LogicalExpression value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(DataExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getSwitchCase_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataExpression getExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(DataExpression value);

} // SwitchCase
