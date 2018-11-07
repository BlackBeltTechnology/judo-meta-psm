/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detach List Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DetachListReference#getDetachExpr <em>Detach Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDetachListReference()
 * @model
 * @generated
 */
public interface DetachListReference extends DetachListNavigation {
    /**
     * Returns the value of the '<em><b>Detach Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Detach Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detach Expr</em>' attribute.
     * @see #setDetachExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDetachListReference_DetachExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.EntitySetExpr" required="true"
     * @generated
     */
    String getDetachExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DetachListReference#getDetachExpr <em>Detach Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Detach Expr</em>' attribute.
     * @see #getDetachExpr()
     * @generated
     */
    void setDetachExpr(String value);

} // DetachListReference
