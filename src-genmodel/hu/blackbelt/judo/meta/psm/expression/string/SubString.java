/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getSubString()
 * @model
 * @generated
 */
public interface SubString extends StringExpression {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getSubString_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(IntegerExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getSubString_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getPosition();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(IntegerExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getSubString_Length()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntegerExpression getLength();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(IntegerExpression value);

} // SubString
