/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach Function List Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation#getAttachFunction <em>Attach Function</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAttachFunctionListNavigation()
 * @model
 * @generated
 */
public interface AttachFunctionListNavigation extends AttachListNavigation {
    /**
     * Returns the value of the '<em><b>Attach Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attach Function</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attach Function</em>' attribute.
     * @see #setAttachFunction(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAttachFunctionListNavigation_AttachFunction()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getAttachFunction();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation#getAttachFunction <em>Attach Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attach Function</em>' attribute.
     * @see #getAttachFunction()
     * @generated
     */
    void setAttachFunction(String value);

} // AttachFunctionListNavigation
