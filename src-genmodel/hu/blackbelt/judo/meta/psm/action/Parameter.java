/**
 */
package hu.blackbelt.judo.meta.psm.action;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.Parameter#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends EObject {
    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.action.Direction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.action.Direction
     * @see #setDirection(Direction)
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getParameter_Direction()
     * @model
     * @generated
     */
    Direction getDirection();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.action.Parameter#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.action.Direction
     * @see #getDirection()
     * @generated
     */
    void setDirection(Direction value);

} // Parameter
