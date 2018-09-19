/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Endpoint#isComposition <em>Composition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getPartner <em>Partner</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getReference <em>Reference</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getLower <em>Lower</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends NamedElement {
    /**
     * Returns the value of the '<em><b>Composition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Composition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composition</em>' attribute.
     * @see #setComposition(boolean)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint_Composition()
     * @model required="true"
     * @generated
     */
    boolean isComposition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#isComposition <em>Composition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composition</em>' attribute.
     * @see #isComposition()
     * @generated
     */
    void setComposition(boolean value);

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

    /**
     * Returns the value of the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' reference.
     * @see #setReference(Reference)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint_Reference()
     * @model required="true"
     * @generated
     */
    Reference getReference();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(Reference value);

    /**
     * Returns the value of the '<em><b>Lower</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower</em>' attribute.
     * @see #setLower(int)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint_Lower()
     * @model default="0" required="true"
     * @generated
     */
    int getLower();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower</em>' attribute.
     * @see #getLower()
     * @generated
     */
    void setLower(int value);

    /**
     * Returns the value of the '<em><b>Upper</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper</em>' attribute.
     * @see #setUpper(int)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEndpoint_Upper()
     * @model default="1" required="true"
     * @generated
     */
    int getUpper();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getUpper <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper</em>' attribute.
     * @see #getUpper()
     * @generated
     */
    void setUpper(int value);

} // Endpoint
