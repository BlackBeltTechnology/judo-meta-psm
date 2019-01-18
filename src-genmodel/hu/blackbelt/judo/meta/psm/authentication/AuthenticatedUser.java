/**
 */
package hu.blackbelt.judo.meta.psm.authentication;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authenticated User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authentication.AuthenticatedUser#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage#getAuthenticatedUser()
 * @model abstract="true"
 * @generated
 */
public interface AuthenticatedUser extends EObject {
    /**
     * Returns the value of the '<em><b>User</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User</em>' reference.
     * @see #setUser(EntityType)
     * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage#getAuthenticatedUser_User()
     * @model required="true"
     * @generated
     */
    EntityType getUser();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.authentication.AuthenticatedUser#getUser <em>User</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>User</em>' reference.
     * @see #getUser()
     * @generated
     */
    void setUser(EntityType value);

} // AuthenticatedUser
