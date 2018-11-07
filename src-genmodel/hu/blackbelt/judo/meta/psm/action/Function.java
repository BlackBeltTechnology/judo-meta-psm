/**
 */
package hu.blackbelt.judo.meta.psm.action;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.Function#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getFunction()
 * @model abstract="true"
 * @generated
 */
public interface Function extends EObject {
    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.action.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getFunction_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

    /**
     * Returns the value of the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' attribute.
     * @see #setBody(String)
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#getFunction_Body()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getBody();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.action.Function#getBody <em>Body</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' attribute.
     * @see #getBody()
     * @generated
     */
    void setBody(String value);

} // Function
