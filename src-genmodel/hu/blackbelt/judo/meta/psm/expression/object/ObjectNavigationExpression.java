/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectNavigationExpression#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectNavigationExpression()
 * @model
 * @generated
 */
public interface ObjectNavigationExpression extends ObjectExpression, ObjectVariable, ReferenceSelector {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectNavigationExpression_ObjectExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectExpression getObjectExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectNavigationExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Expression</em>' containment reference.
	 * @see #getObjectExpression()
	 * @generated
	 */
	void setObjectExpression(ObjectExpression value);

} // ObjectNavigationExpression
