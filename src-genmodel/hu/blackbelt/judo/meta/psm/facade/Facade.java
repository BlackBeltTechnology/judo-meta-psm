/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getPropertySet <em>Property Set</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getUpdateOperation <em>Update Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getCreateOperation <em>Create Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getDeleteOperation <em>Delete Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade()
 * @model abstract="true"
 * @generated
 */
public interface Facade extends NamedElement {
    /**
     * Returns the value of the '<em><b>Property Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Set</em>' reference.
     * @see #setPropertySet(PropertySet)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_PropertySet()
     * @model required="true"
     * @generated
     */
    PropertySet getPropertySet();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getPropertySet <em>Property Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Set</em>' reference.
     * @see #getPropertySet()
     * @generated
     */
    void setPropertySet(PropertySet value);

    /**
     * Returns the value of the '<em><b>Update Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Update Operation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Update Operation</em>' containment reference.
     * @see #setUpdateOperation(UpdateOperation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_UpdateOperation()
     * @model containment="true"
     * @generated
     */
    UpdateOperation getUpdateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getUpdateOperation <em>Update Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Update Operation</em>' containment reference.
     * @see #getUpdateOperation()
     * @generated
     */
    void setUpdateOperation(UpdateOperation value);

    /**
     * Returns the value of the '<em><b>Create Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create Operation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Create Operation</em>' containment reference.
     * @see #setCreateOperation(CreateOperation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_CreateOperation()
     * @model containment="true"
     * @generated
     */
    CreateOperation getCreateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getCreateOperation <em>Create Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create Operation</em>' containment reference.
     * @see #getCreateOperation()
     * @generated
     */
    void setCreateOperation(CreateOperation value);

    /**
     * Returns the value of the '<em><b>Delete Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete Operation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete Operation</em>' containment reference.
     * @see #setDeleteOperation(DeleteOperation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_DeleteOperation()
     * @model containment="true"
     * @generated
     */
    DeleteOperation getDeleteOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getDeleteOperation <em>Delete Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete Operation</em>' containment reference.
     * @see #getDeleteOperation()
     * @generated
     */
    void setDeleteOperation(DeleteOperation value);

} // Facade
