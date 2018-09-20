/**
 */
package hu.blackbelt.judo.meta.psm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getPartner <em>Partner</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends Reference {
    /**
     * Returns the value of the '<em><b>Partner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Partner</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Partner</em>' reference.
     * @see #setPartner(Endpoint)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint_Partner()
     * @model
     * @generated
     */
    Endpoint getPartner();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getPartner <em>Partner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Partner</em>' reference.
     * @see #getPartner()
     * @generated
     */
    void setPartner(Endpoint value);

} // Endpoint
