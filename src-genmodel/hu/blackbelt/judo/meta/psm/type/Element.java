/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Element#getType <em>Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Element#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Type)
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getElement_Type()
     * @model required="true"
     * @generated
     */
    Type getType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.Element#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Type value);

    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinality</em>' containment reference.
     * @see #setCardinality(Cardinality)
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getElement_Cardinality()
     * @model containment="true" required="true"
     * @generated
     */
    Cardinality getCardinality();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.Element#getCardinality <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' containment reference.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(Cardinality value);

} // Element
