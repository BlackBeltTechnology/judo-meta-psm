/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Set Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.EntitySetSelector#getGetExpr <em>Get Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getEntitySetSelector()
 * @model
 * @generated
 */
public interface EntitySetSelector extends EntitySelector {
    /**
     * Returns the value of the '<em><b>Get Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Get Expr</em>' attribute.
     * @see #setGetExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getEntitySetSelector_GetExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.EntitySetExpr" required="true"
     * @generated
     */
    String getGetExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.EntitySetSelector#getGetExpr <em>Get Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Get Expr</em>' attribute.
     * @see #getGetExpr()
     * @generated
     */
    void setGetExpr(String value);

} // EntitySetSelector
