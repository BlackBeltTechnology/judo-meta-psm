/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.expression.DataExpression;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#isRequired <em>Required</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute()
 * @model
 * @generated
 */
public interface TransferAttribute extends NamedElement, PrimitiveTypedElement {
    /**
     * Returns the value of the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Required</em>' attribute.
     * @see #setRequired(boolean)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_Required()
     * @model required="true"
     * @generated
     */
    boolean isRequired();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#isRequired <em>Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required</em>' attribute.
     * @see #isRequired()
     * @generated
     */
    void setRequired(boolean value);

    /**
     * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init Expression</em>' containment reference.
     * @see #setInitExpression(DataExpression)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_InitExpression()
     * @model containment="true"
     * @generated
     */
    DataExpression getInitExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getInitExpression <em>Init Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Expression</em>' containment reference.
     * @see #getInitExpression()
     * @generated
     */
    void setInitExpression(DataExpression value);

} // TransferAttribute
