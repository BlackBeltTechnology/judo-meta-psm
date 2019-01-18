/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.variable.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage#getVariable_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.variable.Variable#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Variable
