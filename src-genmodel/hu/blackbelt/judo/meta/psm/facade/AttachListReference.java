/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach List Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.AttachListReference#getAttachExpr <em>Attach Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAttachListReference()
 * @model
 * @generated
 */
public interface AttachListReference extends AttachListNavigation {
    /**
     * Returns the value of the '<em><b>Attach Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attach Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attach Expr</em>' attribute.
     * @see #setAttachExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAttachListReference_AttachExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.EntitySetExpr" required="true"
     * @generated
     */
    String getAttachExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.AttachListReference#getAttachExpr <em>Attach Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attach Expr</em>' attribute.
     * @see #getAttachExpr()
     * @generated
     */
    void setAttachExpr(String value);

} // AttachListReference
