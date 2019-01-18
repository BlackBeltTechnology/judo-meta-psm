/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.EntryMenuItem#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getEntryMenuItem()
 * @model
 * @generated
 */
public interface EntryMenuItem extends MenuItem {
    /**
     * Returns the value of the '<em><b>Selector</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selector</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' reference.
     * @see #setSelector(StaticNavigation)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getEntryMenuItem_Selector()
     * @model required="true"
     * @generated
     */
    StaticNavigation getSelector();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.EntryMenuItem#getSelector <em>Selector</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector(StaticNavigation value);

} // EntryMenuItem
