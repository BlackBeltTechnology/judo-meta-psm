/**
 */
package hu.blackbelt.judo.meta.psm.action;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Entity Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.ListEntityParameter#getOnGetDefault <em>On Get Default</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getListEntityParameter()
 * @model
 * @generated
 */
public interface ListEntityParameter extends EntityParameter {
    /**
     * Returns the value of the '<em><b>On Get Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>On Get Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>On Get Default</em>' attribute.
     * @see #setOnGetDefault(String)
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getListEntityParameter_OnGetDefault()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.EntitySetExpr"
     * @generated
     */
    String getOnGetDefault();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.action.ListEntityParameter#getOnGetDefault <em>On Get Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>On Get Default</em>' attribute.
     * @see #getOnGetDefault()
     * @generated
     */
    void setOnGetDefault(String value);

} // ListEntityParameter
