/**
 */
package hu.blackbelt.judo.meta.psm.expression.enumeration;

import hu.blackbelt.judo.meta.psm.expression.EnumerationExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationVariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage#getEnumerationVariableReference()
 * @model
 * @generated
 */
public interface EnumerationVariableReference extends EnumerationExpression, VariableReference {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(EnumerationVariable)
     * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage#getEnumerationVariableReference_Variable()
     * @model required="true"
     * @generated
     */
    EnumerationVariable getVariable();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationVariableReference#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(EnumerationVariable value);

} // EnumerationVariableReference
