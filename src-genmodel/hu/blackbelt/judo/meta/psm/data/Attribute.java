/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Attribute#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Attribute#isIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
    /**
     * Returns the value of the '<em><b>Primitive</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primitive</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primitive</em>' reference.
     * @see #setPrimitive(Primitive)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute_Primitive()
     * @model required="true"
     * @generated
     */
    Primitive getPrimitive();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#getPrimitive <em>Primitive</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primitive</em>' reference.
     * @see #getPrimitive()
     * @generated
     */
    void setPrimitive(Primitive value);

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
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute_Required()
     * @model required="true"
     * @generated
     */
    boolean isRequired();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isRequired <em>Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required</em>' attribute.
     * @see #isRequired()
     * @generated
     */
    void setRequired(boolean value);

    /**
     * Returns the value of the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identifier</em>' attribute.
     * @see #setIdentifier(boolean)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute_Identifier()
     * @model required="true"
     * @generated
     */
    boolean isIdentifier();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isIdentifier <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identifier</em>' attribute.
     * @see #isIdentifier()
     * @generated
     */
    void setIdentifier(boolean value);

} // Attribute
