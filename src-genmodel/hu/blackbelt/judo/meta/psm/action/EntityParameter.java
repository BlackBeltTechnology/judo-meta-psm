/**
 */
package hu.blackbelt.judo.meta.psm.action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.EntityParameter#getOnGetOptions <em>On Get Options</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getEntityParameter()
 * @model abstract="true"
 * @generated
 */
public interface EntityParameter extends Parameter {
    /**
     * Returns the value of the '<em><b>On Get Options</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>On Get Options</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>On Get Options</em>' attribute.
     * @see #setOnGetOptions(String)
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getEntityParameter_OnGetOptions()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.EntitySetExpr"
     * @generated
     */
    String getOnGetOptions();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.action.EntityParameter#getOnGetOptions <em>On Get Options</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Get Options</em>' attribute.
     * @see #getOnGetOptions()
     * @generated
     */
    void setOnGetOptions(String value);

} // EntityParameter
