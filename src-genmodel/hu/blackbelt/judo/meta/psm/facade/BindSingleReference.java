/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Single Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.BindSingleReference#getBindExpr <em>Bind Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getBindSingleReference()
 * @model
 * @generated
 */
public interface BindSingleReference extends BindSingleNavigation {
    /**
     * Returns the value of the '<em><b>Bind Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bind Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bind Expr</em>' attribute.
     * @see #setBindExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getBindSingleReference_BindExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.SingleReferenceExpr" required="true"
     * @generated
     */
    String getBindExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.BindSingleReference#getBindExpr <em>Bind Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bind Expr</em>' attribute.
     * @see #getBindExpr()
     * @generated
     */
    void setBindExpr(String value);

} // BindSingleReference
