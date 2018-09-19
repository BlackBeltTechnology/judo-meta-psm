/**
 */
package hu.blackbelt.judo.meta.psm.type;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Member#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getMember()
 * @model
 * @generated
 */
public interface Member extends NamedElement {
    /**
     * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ordinal</em>' attribute.
     * @see #setOrdinal(int)
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getMember_Ordinal()
     * @model required="true"
     * @generated
     */
    int getOrdinal();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.Member#getOrdinal <em>Ordinal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ordinal</em>' attribute.
     * @see #getOrdinal()
     * @generated
     */
    void setOrdinal(int value);

} // Member
