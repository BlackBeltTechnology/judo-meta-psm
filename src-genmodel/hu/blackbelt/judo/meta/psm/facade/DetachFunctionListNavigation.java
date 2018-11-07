/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detach Function List Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation#getDetachFunction <em>Detach Function</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDetachFunctionListNavigation()
 * @model
 * @generated
 */
public interface DetachFunctionListNavigation extends DetachListNavigation {
    /**
     * Returns the value of the '<em><b>Detach Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Detach Function</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detach Function</em>' attribute.
     * @see #setDetachFunction(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDetachFunctionListNavigation_DetachFunction()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getDetachFunction();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation#getDetachFunction <em>Detach Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Detach Function</em>' attribute.
     * @see #getDetachFunction()
     * @generated
     */
    void setDetachFunction(String value);

} // DetachFunctionListNavigation
