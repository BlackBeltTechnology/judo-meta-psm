/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undefined Navigation Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison#getObjectExression <em>Object Exression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getUndefinedNavigationComparison()
 * @model
 * @generated
 */
public interface UndefinedNavigationComparison extends LogicalExpression {
	/**
	 * Returns the value of the '<em><b>Object Exression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Exression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Exression</em>' containment reference.
	 * @see #setObjectExression(ObjectExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getUndefinedNavigationComparison_ObjectExression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectExpression getObjectExression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison#getObjectExression <em>Object Exression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Exression</em>' containment reference.
	 * @see #getObjectExression()
	 * @generated
	 */
	void setObjectExression(ObjectExpression value);

} // UndefinedNavigationComparison
