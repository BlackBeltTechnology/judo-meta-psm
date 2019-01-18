/**
 */
package hu.blackbelt.judo.meta.psm.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.NavigationExpression#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getNavigationExpression()
 * @model abstract="true"
 * @generated
 */
public interface NavigationExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Name</em>' attribute.
     * @see #setReferenceName(String)
     * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getNavigationExpression_ReferenceName()
     * @model required="true"
     * @generated
     */
    String getReferenceName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.NavigationExpression#getReferenceName <em>Reference Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Name</em>' attribute.
     * @see #getReferenceName()
     * @generated
     */
    void setReferenceName(String value);

} // NavigationExpression
