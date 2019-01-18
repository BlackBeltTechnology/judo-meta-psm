/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Position#getContainer <em>Container</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Position#getContainment <em>Containment</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends IntegerExpression {
    /**
     * Returns the value of the '<em><b>Container</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' containment reference.
     * @see #setContainer(StringExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getPosition_Container()
     * @model containment="true" required="true"
     * @generated
     */
    StringExpression getContainer();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Position#getContainer <em>Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' containment reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(StringExpression value);

    /**
     * Returns the value of the '<em><b>Containment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containment</em>' reference.
     * @see #setContainment(StringExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getPosition_Containment()
     * @model required="true"
     * @generated
     */
    StringExpression getContainment();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Position#getContainment <em>Containment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Containment</em>' reference.
     * @see #getContainment()
     * @generated
     */
    void setContainment(StringExpression value);

} // Position
