/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getTransferRelationBindings <em>Transfer Relation Bindings</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getTransferAttributeBindings <em>Transfer Attribute Bindings</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType()
 * @model
 * @generated
 */
public interface MappedTransferObjectType extends TransferObjectType {
    /**
     * Returns the value of the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type</em>' reference.
     * @see #setEntityType(EntityType)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType_EntityType()
     * @model required="true"
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getEntityType <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

    /**
     * Returns the value of the '<em><b>Transfer Relation Bindings</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transfer Relation Bindings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transfer Relation Bindings</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType_TransferRelationBindings()
     * @model containment="true"
     * @generated
     */
    EList<TransferRelationBinding> getTransferRelationBindings();

    /**
     * Returns the value of the '<em><b>Transfer Attribute Bindings</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transfer Attribute Bindings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transfer Attribute Bindings</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType_TransferAttributeBindings()
     * @model containment="true"
     * @generated
     */
    EList<TransferAttributeBinding> getTransferAttributeBindings();

} // MappedTransferObjectType
