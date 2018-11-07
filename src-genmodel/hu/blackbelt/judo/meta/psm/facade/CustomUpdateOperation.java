/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Update Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation#getUpdateOperation <em>Update Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getCustomUpdateOperation()
 * @model
 * @generated
 */
public interface CustomUpdateOperation extends UpdateOperation {
    /**
     * Returns the value of the '<em><b>Update Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Update Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Update Operation</em>' attribute.
     * @see #setUpdateOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getCustomUpdateOperation_UpdateOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getUpdateOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation#getUpdateOperation <em>Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Update Operation</em>' attribute.
     * @see #getUpdateOperation()
     * @generated
     */
    void setUpdateOperation(String value);

} // CustomUpdateOperation
