/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Component#getLabel <em>Label</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Component#getParentView <em>Parent View</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getComponent_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Component#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent View</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent View</em>' reference.
     * @see #setParentView(ObjectView)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getComponent_ParentView()
     * @model required="true" transient="true" derived="true"
     * @generated
     */
    ObjectView getParentView();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Component#getParentView <em>Parent View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent View</em>' reference.
     * @see #getParentView()
     * @generated
     */
    void setParentView(ObjectView value);

} // Component
