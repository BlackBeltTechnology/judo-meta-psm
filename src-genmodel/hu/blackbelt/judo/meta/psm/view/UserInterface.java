/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.UserInterface#getMainView <em>Main View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.UserInterface#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getUserInterface()
 * @model
 * @generated
 */
public interface UserInterface extends NamespaceElement {
    /**
     * Returns the value of the '<em><b>Main View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Main View</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Main View</em>' reference.
     * @see #setMainView(ObjectView)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getUserInterface_MainView()
     * @model required="true"
     * @generated
     */
    ObjectView getMainView();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.UserInterface#getMainView <em>Main View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Main View</em>' reference.
     * @see #getMainView()
     * @generated
     */
    void setMainView(ObjectView value);

    /**
     * Returns the value of the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' containment reference.
     * @see #setSelector(StaticNavigation)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getUserInterface_Selector()
     * @model containment="true"
     * @generated
     */
    StaticNavigation getSelector();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.UserInterface#getSelector <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' containment reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector(StaticNavigation value);

} // UserInterface
