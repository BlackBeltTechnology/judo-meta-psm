/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Create Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPreCreateOperation <em>Pre Create Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPostCreateOperation <em>Post Create Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDefaultCreateOperation()
 * @model
 * @generated
 */
public interface DefaultCreateOperation extends CreateOperation {
    /**
     * Returns the value of the '<em><b>Pre Create Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pre Create Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pre Create Operation</em>' attribute.
     * @see #setPreCreateOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDefaultCreateOperation_PreCreateOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script"
     * @generated
     */
    String getPreCreateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPreCreateOperation <em>Pre Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pre Create Operation</em>' attribute.
     * @see #getPreCreateOperation()
     * @generated
     */
    void setPreCreateOperation(String value);

    /**
     * Returns the value of the '<em><b>Post Create Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Post Create Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Post Create Operation</em>' attribute.
     * @see #setPostCreateOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDefaultCreateOperation_PostCreateOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script"
     * @generated
     */
    String getPostCreateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPostCreateOperation <em>Post Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Post Create Operation</em>' attribute.
     * @see #getPostCreateOperation()
     * @generated
     */
    void setPostCreateOperation(String value);

} // DefaultCreateOperation
