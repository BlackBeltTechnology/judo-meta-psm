/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.service.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.ActionMenuItem#getExposedService <em>Exposed Service</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getActionMenuItem()
 * @model
 * @generated
 */
public interface ActionMenuItem extends MenuItem {
    /**
     * Returns the value of the '<em><b>Exposed Service</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exposed Service</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exposed Service</em>' reference.
     * @see #setExposedService(Operation)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getActionMenuItem_ExposedService()
     * @model required="true"
     * @generated
     */
    Operation getExposedService();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.ActionMenuItem#getExposedService <em>Exposed Service</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exposed Service</em>' reference.
     * @see #getExposedService()
     * @generated
     */
    void setExposedService(Operation value);

} // ActionMenuItem
