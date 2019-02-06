/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.UpperCase#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getUpperCase()
 * @model
 * @generated
 */
public interface UpperCase extends StringExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(StringExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getUpperCase_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.UpperCase#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(StringExpression value);

} // UpperCase
