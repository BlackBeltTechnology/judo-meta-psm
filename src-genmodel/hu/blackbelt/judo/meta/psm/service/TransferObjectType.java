/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.type.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType()
 * @model abstract="true"
 * @generated
 */
public interface TransferObjectType extends DataType {
    /**
     * Returns the value of the '<em><b>Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Representation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Representation</em>' reference.
     * @see #setRepresentation(TransferAttribute)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Representation()
     * @model
     * @generated
     */
    TransferAttribute getRepresentation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRepresentation <em>Representation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Representation</em>' reference.
     * @see #getRepresentation()
     * @generated
     */
    void setRepresentation(TransferAttribute value);

    /**
     * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relations</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Relations()
     * @model containment="true"
     * @generated
     */
    EList<TransferRelation> getRelations();

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<TransferAttribute> getAttributes();

} // TransferObjectType
