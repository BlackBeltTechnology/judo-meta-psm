/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.service.TransferAttribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Control#getController <em>Controller</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Control#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends EObject {
    /**
     * Returns the value of the '<em><b>Controller</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Controller</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Controller</em>' reference.
     * @see #setController(TransferAttribute)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getControl_Controller()
     * @model required="true"
     * @generated
     */
    TransferAttribute getController();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Control#getController <em>Controller</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Controller</em>' reference.
     * @see #getController()
     * @generated
     */
    void setController(TransferAttribute value);

    /**
     * Returns the value of the '<em><b>Components</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.Component}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Components</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getControl_Components()
     * @model
     * @generated
     */
    EList<Component> getComponents();

} // Control
