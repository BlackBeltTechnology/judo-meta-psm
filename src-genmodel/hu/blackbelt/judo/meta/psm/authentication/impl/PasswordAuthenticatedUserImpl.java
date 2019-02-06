/**
 */
package hu.blackbelt.judo.meta.psm.authentication.impl;

import hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage;
import hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser;

import hu.blackbelt.judo.meta.psm.data.Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Password Authenticated User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authentication.impl.PasswordAuthenticatedUserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authentication.impl.PasswordAuthenticatedUserImpl#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PasswordAuthenticatedUserImpl extends AuthenticatedUserImpl implements PasswordAuthenticatedUser {
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected Attribute password;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected Attribute login;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasswordAuthenticatedUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationPackage.Literals.PASSWORD_AUTHENTICATED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getPassword() {
		if (password != null && password.eIsProxy()) {
			InternalEObject oldPassword = (InternalEObject)password;
			password = (Attribute)eResolveProxy(oldPassword);
			if (password != oldPassword) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__PASSWORD, oldPassword, password));
			}
		}
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(Attribute newPassword) {
		Attribute oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getLogin() {
		if (login != null && login.eIsProxy()) {
			InternalEObject oldLogin = (InternalEObject)login;
			login = (Attribute)eResolveProxy(oldLogin);
			if (login != oldLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__LOGIN, oldLogin, login));
			}
		}
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(Attribute newLogin) {
		Attribute oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__PASSWORD:
				if (resolve) return getPassword();
				return basicGetPassword();
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__LOGIN:
				if (resolve) return getLogin();
				return basicGetLogin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__PASSWORD:
				setPassword((Attribute)newValue);
				return;
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__LOGIN:
				setLogin((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__PASSWORD:
				setPassword((Attribute)null);
				return;
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__LOGIN:
				setLogin((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__PASSWORD:
				return password != null;
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER__LOGIN:
				return login != null;
		}
		return super.eIsSet(featureID);
	}

} //PasswordAuthenticatedUserImpl
