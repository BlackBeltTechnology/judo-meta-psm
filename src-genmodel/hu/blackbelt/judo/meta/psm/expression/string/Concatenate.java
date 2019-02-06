/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concatenate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getConcatenate()
 * @model
 * @generated
 */
public interface Concatenate extends StringExpression {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getConcatenate_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getLeft();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getLeft <em>Left</em>}' containment reference.
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
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getConcatenate_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getRight();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(StringExpression value);

} // Concatenate
