/**
 */
package hu.blackbelt.judo.meta.psm.expression.enumeration;

import hu.blackbelt.judo.meta.psm.expression.EnumerationExpression;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.TypeName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage#getEnumerationSwitchExpression()
 * @model
 * @generated
 */
public interface EnumerationSwitchExpression extends SwitchExpression, EnumerationExpression {
	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' reference.
	 * @see #setElementName(TypeName)
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage#getEnumerationSwitchExpression_ElementName()
	 * @model required="true"
	 * @generated
	 */
	TypeName getElementName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression#getElementName <em>Element Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' reference.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(TypeName value);

} // EnumerationSwitchExpression
