/**
 */
package hu.blackbelt.judo.meta.psm.authentication;

import hu.blackbelt.judo.meta.psm.data.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Password Authenticated User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getPassword <em>Password</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage#getPasswordAuthenticatedUser()
 * @model
 * @generated
 */
public interface PasswordAuthenticatedUser extends AuthenticatedUser {
    /**
     * Returns the value of the '<em><b>Password</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' reference.
     * @see #setPassword(Attribute)
     * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage#getPasswordAuthenticatedUser_Password()
     * @model required="true"
     * @generated
     */
    Attribute getPassword();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getPassword <em>Password</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' reference.
     * @see #getPassword()
     * @generated
     */
    void setPassword(Attribute value);

    /**
     * Returns the value of the '<em><b>Login</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Login</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Login</em>' reference.
     * @see #setLogin(Attribute)
     * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage#getPasswordAuthenticatedUser_Login()
     * @model required="true"
     * @generated
     */
    Attribute getLogin();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getLogin <em>Login</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Login</em>' reference.
     * @see #getLogin()
     * @generated
     */
    void setLogin(Attribute value);

} // PasswordAuthenticatedUser
