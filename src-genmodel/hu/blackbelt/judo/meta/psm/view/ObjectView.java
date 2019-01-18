/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getTransferObject <em>Transfer Object</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getViewType <em>View Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getObjectView()
 * @model
 * @generated
 */
public interface ObjectView extends Container, NamespaceElement {
    /**
     * Returns the value of the '<em><b>Transfer Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transfer Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transfer Object</em>' reference.
     * @see #setTransferObject(TransferObjectType)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getObjectView_TransferObject()
     * @model required="true"
     * @generated
     */
    TransferObjectType getTransferObject();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getTransferObject <em>Transfer Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transfer Object</em>' reference.
     * @see #getTransferObject()
     * @generated
     */
    void setTransferObject(TransferObjectType value);

    /**
     * Returns the value of the '<em><b>View Type</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.view.ViewType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Type</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.ViewType
     * @see #setViewType(ViewType)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getObjectView_ViewType()
     * @model required="true"
     * @generated
     */
    ViewType getViewType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getViewType <em>View Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>View Type</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.ViewType
     * @see #getViewType()
     * @generated
     */
    void setViewType(ViewType value);

    /**
     * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.Control}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Controls</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getObjectView_Controls()
     * @model containment="true"
     * @generated
     */
    EList<Control> getControls();

} // ObjectView
