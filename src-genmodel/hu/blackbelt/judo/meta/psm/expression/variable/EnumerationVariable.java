/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable;

import hu.blackbelt.judo.meta.psm.expression.ElementName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage#getEnumerationVariable()
 * @model abstract="true"
 * @generated
 */
public interface EnumerationVariable extends Variable {
    /**
     * Returns the value of the '<em><b>Element Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Name</em>' reference.
     * @see #setElementName(ElementName)
     * @see hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage#getEnumerationVariable_ElementName()
     * @model required="true"
     * @generated
     */
    ElementName getElementName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable#getElementName <em>Element Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Name</em>' reference.
     * @see #getElementName()
     * @generated
     */
    void setElementName(ElementName value);

} // EnumerationVariable
