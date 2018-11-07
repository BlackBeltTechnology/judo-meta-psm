/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Create Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation#getCreateOperation <em>Create Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getCustomCreateOperation()
 * @model
 * @generated
 */
public interface CustomCreateOperation extends CreateOperation {
    /**
     * Returns the value of the '<em><b>Create Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Create Operation</em>' attribute.
     * @see #setCreateOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getCustomCreateOperation_CreateOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getCreateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation#getCreateOperation <em>Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create Operation</em>' attribute.
     * @see #getCreateOperation()
     * @generated
     */
    void setCreateOperation(String value);

} // CustomCreateOperation
