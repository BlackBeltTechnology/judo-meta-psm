/**
 */
package hu.blackbelt.judo.meta.psm.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectReference#getReferenced <em>Referenced</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectReference()
 * @model
 * @generated
 */
public interface TransferObjectReference extends TransferRelation {
    /**
     * Returns the value of the '<em><b>Referenced</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referenced</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced</em>' reference.
     * @see #setReferenced(MappedTransferObjectType)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectReference_Referenced()
     * @model required="true"
     * @generated
     */
    MappedTransferObjectType getReferenced();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectReference#getReferenced <em>Referenced</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced</em>' reference.
     * @see #getReferenced()
     * @generated
     */
    void setReferenced(MappedTransferObjectType value);

} // TransferObjectReference
