/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getTraverseDefinition <em>Traverse Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getBindDefinition <em>Bind Definition</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getSingleNavigation()
 * @model
 * @generated
 */
public interface SingleNavigation extends Navigation {
    /**
     * Returns the value of the '<em><b>Traverse Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Traverse Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Traverse Definition</em>' containment reference.
     * @see #setTraverseDefinition(TraverseSingleNavigation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getSingleNavigation_TraverseDefinition()
     * @model containment="true"
     * @generated
     */
    TraverseSingleNavigation getTraverseDefinition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getTraverseDefinition <em>Traverse Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Traverse Definition</em>' containment reference.
     * @see #getTraverseDefinition()
     * @generated
     */
    void setTraverseDefinition(TraverseSingleNavigation value);

    /**
     * Returns the value of the '<em><b>Bind Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bind Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bind Definition</em>' containment reference.
     * @see #setBindDefinition(BindSingleNavigation)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getSingleNavigation_BindDefinition()
     * @model containment="true"
     * @generated
     */
    BindSingleNavigation getBindDefinition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getBindDefinition <em>Bind Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bind Definition</em>' containment reference.
     * @see #getBindDefinition()
     * @generated
     */
    void setBindDefinition(BindSingleNavigation value);

} // SingleNavigation
