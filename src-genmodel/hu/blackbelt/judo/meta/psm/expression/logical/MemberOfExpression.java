/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getMemberOfExpression()
 * @model
 * @generated
 */
public interface MemberOfExpression extends LogicalExpression {
    /**
     * Returns the value of the '<em><b>Collection Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collection Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collection Expression</em>' containment reference.
     * @see #setCollectionExpression(CollectionExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getMemberOfExpression_CollectionExpression()
     * @model containment="true" required="true"
     * @generated
     */
    CollectionExpression getCollectionExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getCollectionExpression <em>Collection Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collection Expression</em>' containment reference.
     * @see #getCollectionExpression()
     * @generated
     */
    void setCollectionExpression(CollectionExpression value);

    /**
     * Returns the value of the '<em><b>Object Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Expression</em>' containment reference.
     * @see #setObjectExpression(ObjectExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getMemberOfExpression_ObjectExpression()
     * @model containment="true" required="true"
     * @generated
     */
    ObjectExpression getObjectExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Expression</em>' containment reference.
     * @see #getObjectExpression()
     * @generated
     */
    void setObjectExpression(ObjectExpression value);

} // MemberOfExpression
