/**
 */
package hu.blackbelt.judo.meta.psm.action;

import hu.blackbelt.judo.meta.psm.type.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.PrimitiveParameter#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getPrimitiveParameter()
 * @model
 * @generated
 */
public interface PrimitiveParameter extends Parameter {
    /**
     * Returns the value of the '<em><b>Primitive Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primitive Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primitive Type</em>' reference.
     * @see #setPrimitiveType(Primitive)
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getPrimitiveParameter_PrimitiveType()
     * @model required="true"
     * @generated
     */
    Primitive getPrimitiveType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.action.PrimitiveParameter#getPrimitiveType <em>Primitive Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primitive Type</em>' reference.
     * @see #getPrimitiveType()
     * @generated
     */
    void setPrimitiveType(Primitive value);

} // PrimitiveParameter
