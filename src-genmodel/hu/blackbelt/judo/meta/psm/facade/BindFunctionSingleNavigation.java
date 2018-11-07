/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Function Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation#getBindOperation <em>Bind Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getBindFunctionSingleNavigation()
 * @model
 * @generated
 */
public interface BindFunctionSingleNavigation extends BindSingleNavigation {
    /**
     * Returns the value of the '<em><b>Bind Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bind Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bind Operation</em>' attribute.
     * @see #setBindOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getBindFunctionSingleNavigation_BindOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getBindOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation#getBindOperation <em>Bind Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bind Operation</em>' attribute.
     * @see #getBindOperation()
     * @generated
     */
    void setBindOperation(String value);

} // BindFunctionSingleNavigation
