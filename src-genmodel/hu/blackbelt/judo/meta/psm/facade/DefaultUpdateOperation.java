/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Update Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPreUpdateOperation <em>Pre Update Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPostUpdateOperation <em>Post Update Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDefaultUpdateOperation()
 * @model
 * @generated
 */
public interface DefaultUpdateOperation extends UpdateOperation {
    /**
     * Returns the value of the '<em><b>Pre Update Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pre Update Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pre Update Operation</em>' attribute.
     * @see #setPreUpdateOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDefaultUpdateOperation_PreUpdateOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script"
     * @generated
     */
    String getPreUpdateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPreUpdateOperation <em>Pre Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pre Update Operation</em>' attribute.
     * @see #getPreUpdateOperation()
     * @generated
     */
    void setPreUpdateOperation(String value);

    /**
     * Returns the value of the '<em><b>Post Update Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Post Update Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Post Update Operation</em>' attribute.
     * @see #setPostUpdateOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDefaultUpdateOperation_PostUpdateOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script"
     * @generated
     */
    String getPostUpdateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPostUpdateOperation <em>Post Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Post Update Operation</em>' attribute.
     * @see #getPostUpdateOperation()
     * @generated
     */
    void setPostUpdateOperation(String value);

} // DefaultUpdateOperation
