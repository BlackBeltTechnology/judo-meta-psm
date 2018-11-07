/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getTraverseDefinition <em>Traverse Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getAttachDefinition <em>Attach Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getDetachNavigation <em>Detach Navigation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getListNavigation()
 * @model
 * @generated
 */
public interface ListNavigation extends Navigation {
    /**
     * Returns the value of the '<em><b>Traverse Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Traverse Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Traverse Definition</em>' containment reference.
     * @see #setTraverseDefinition(TraverseListNavigation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getListNavigation_TraverseDefinition()
     * @model containment="true"
     * @generated
     */
    TraverseListNavigation getTraverseDefinition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getTraverseDefinition <em>Traverse Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Traverse Definition</em>' containment reference.
     * @see #getTraverseDefinition()
     * @generated
     */
    void setTraverseDefinition(TraverseListNavigation value);

    /**
     * Returns the value of the '<em><b>Attach Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attach Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attach Definition</em>' containment reference.
     * @see #setAttachDefinition(AttachListNavigation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getListNavigation_AttachDefinition()
     * @model containment="true"
     * @generated
     */
    AttachListNavigation getAttachDefinition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getAttachDefinition <em>Attach Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attach Definition</em>' containment reference.
     * @see #getAttachDefinition()
     * @generated
     */
    void setAttachDefinition(AttachListNavigation value);

    /**
     * Returns the value of the '<em><b>Detach Navigation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Detach Navigation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detach Navigation</em>' containment reference.
     * @see #setDetachNavigation(DetachListNavigation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getListNavigation_DetachNavigation()
     * @model containment="true"
     * @generated
     */
    DetachListNavigation getDetachNavigation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getDetachNavigation <em>Detach Navigation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Detach Navigation</em>' containment reference.
     * @see #getDetachNavigation()
     * @generated
     */
    void setDetachNavigation(DetachListNavigation value);

} // ListNavigation
