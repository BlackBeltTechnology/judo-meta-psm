/**
 */
package hu.blackbelt.judo.meta.psm.type;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.XML#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.XML#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getXML()
 * @model
 * @generated
 */
public interface XML extends Primitive {
    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(String)
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getXML_Namespace()
     * @model
     * @generated
     */
    String getNamespace();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.XML#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(String value);

    /**
     * Returns the value of the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' attribute.
     * @see #setElement(String)
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getXML_Element()
     * @model
     * @generated
     */
    String getElement();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.XML#getElement <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' attribute.
     * @see #getElement()
     * @generated
     */
    void setElement(String value);

} // XML
