/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferRelation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferRelation#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferRelation()
 * @model abstract="true"
 * @generated
 */
public interface TransferRelation extends NamedElement {
    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinality</em>' containment reference.
     * @see #setCardinality(Cardinality)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferRelation_Cardinality()
     * @model containment="true" required="true"
     * @generated
     */
    Cardinality getCardinality();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferRelation#getCardinality <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' containment reference.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(Cardinality value);

    /**
     * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init Expression</em>' containment reference.
     * @see #setInitExpression(ReferenceExpression)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferRelation_InitExpression()
     * @model containment="true"
     * @generated
     */
    ReferenceExpression getInitExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferRelation#getInitExpression <em>Init Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Expression</em>' containment reference.
     * @see #getInitExpression()
     * @generated
     */
    void setInitExpression(ReferenceExpression value);

} // TransferRelation
