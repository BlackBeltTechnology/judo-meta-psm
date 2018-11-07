/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.WriteAttribute#getWriteExpr <em>Write Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getWriteAttribute()
 * @model
 * @generated
 */
public interface WriteAttribute extends WriteProperty {
    /**
     * Returns the value of the '<em><b>Write Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Write Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Write Expr</em>' attribute.
     * @see #setWriteExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getWriteAttribute_WriteExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.SingleAttributeExpr" required="true"
     * @generated
     */
    String getWriteExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.WriteAttribute#getWriteExpr <em>Write Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Write Expr</em>' attribute.
     * @see #getWriteExpr()
     * @generated
     */
    void setWriteExpr(String value);

} // WriteAttribute
