/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unbound Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getUnboundOperation()
 * @model
 * @generated
 */
public interface UnboundOperation extends Operation, NamespaceElement {
    /**
     * Returns the value of the '<em><b>Input</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input</em>' reference.
     * @see #setInput(TransferObjectType)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getUnboundOperation_Input()
     * @model
     * @generated
     */
    TransferObjectType getInput();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#getInput <em>Input</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' reference.
     * @see #getInput()
     * @generated
     */
    void setInput(TransferObjectType value);

} // UnboundOperation
