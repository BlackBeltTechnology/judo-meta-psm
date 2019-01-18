/**
 */
package hu.blackbelt.judo.meta.psm.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Object Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectContainment#getContainment <em>Containment</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectContainment()
 * @model
 * @generated
 */
public interface TransferObjectContainment extends TransferRelation {
    /**
     * Returns the value of the '<em><b>Containment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containment</em>' reference.
     * @see #setContainment(TransferObjectType)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectContainment_Containment()
     * @model required="true"
     * @generated
     */
    TransferObjectType getContainment();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectContainment#getContainment <em>Containment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Containment</em>' reference.
     * @see #getContainment()
     * @generated
     */
    void setContainment(TransferObjectType value);

} // TransferObjectContainment
