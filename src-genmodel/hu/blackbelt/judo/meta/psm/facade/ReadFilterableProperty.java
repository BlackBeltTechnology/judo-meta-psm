/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Filterable Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#isFiltareble <em>Filtareble</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#getReadExpr <em>Read Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getReadFilterableProperty()
 * @model
 * @generated
 */
public interface ReadFilterableProperty extends ReadProperty {
    /**
     * Returns the value of the '<em><b>Filtareble</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filtareble</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filtareble</em>' attribute.
     * @see #setFiltareble(boolean)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getReadFilterableProperty_Filtareble()
     * @model default="true" required="true"
     * @generated
     */
    boolean isFiltareble();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#isFiltareble <em>Filtareble</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filtareble</em>' attribute.
     * @see #isFiltareble()
     * @generated
     */
    void setFiltareble(boolean value);

    /**
     * Returns the value of the '<em><b>Read Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Expr</em>' attribute.
     * @see #setReadExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getReadFilterableProperty_ReadExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.SingleDataExpr" required="true"
     * @generated
     */
    String getReadExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#getReadExpr <em>Read Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Expr</em>' attribute.
     * @see #getReadExpr()
     * @generated
     */
    void setReadExpr(String value);

} // ReadFilterableProperty
