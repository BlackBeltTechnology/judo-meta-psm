/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Link#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(View)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getLink_Target()
     * @model required="true"
     * @generated
     */
    View getTarget();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Link#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(View value);

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getLink_Path()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.NavigationExpression" required="true"
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Link#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

} // Link
