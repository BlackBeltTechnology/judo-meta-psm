/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traverse Filterable Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#getTraverseExpr <em>Traverse Expr</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getTraverseFilterableSingleNavigation()
 * @model
 * @generated
 */
public interface TraverseFilterableSingleNavigation extends TraverseSingleNavigation {
    /**
     * Returns the value of the '<em><b>Filterable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filterable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filterable</em>' attribute.
     * @see #setFilterable(boolean)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getTraverseFilterableSingleNavigation_Filterable()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     * @generated
     */
    boolean isFilterable();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#isFilterable <em>Filterable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filterable</em>' attribute.
     * @see #isFilterable()
     * @generated
     */
    void setFilterable(boolean value);

    /**
     * Returns the value of the '<em><b>Traverse Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Traverse Expr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Traverse Expr</em>' attribute.
     * @see #setTraverseExpr(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getTraverseFilterableSingleNavigation_TraverseExpr()
     * @model dataType="hu.blackbelt.judo.meta.psm.facade.EntityExpr" required="true"
     * @generated
     */
    String getTraverseExpr();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#getTraverseExpr <em>Traverse Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Traverse Expr</em>' attribute.
     * @see #getTraverseExpr()
     * @generated
     */
    void setTraverseExpr(String value);

} // TraverseFilterableSingleNavigation
