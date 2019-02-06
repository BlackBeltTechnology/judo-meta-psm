/**
 */
package hu.blackbelt.judo.meta.psm.expression.string.impl;

import hu.blackbelt.judo.meta.psm.expression.StringExpression;

import hu.blackbelt.judo.meta.psm.expression.string.Replace;
import hu.blackbelt.judo.meta.psm.expression.string.StringPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl#getReplacement <em>Replacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplaceImpl extends MinimalEObjectImpl.Container implements Replace {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression expression;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected StringExpression pattern;

	/**
	 * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacement()
	 * @generated
	 * @ordered
	 */
	protected StringExpression replacement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringPackage.Literals.REPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(StringExpression newExpression, NotificationChain msgs) {
		StringExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.REPLACE__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(StringExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.REPLACE__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.REPLACE__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.REPLACE__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(StringExpression newPattern, NotificationChain msgs) {
		StringExpression oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.REPLACE__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(StringExpression newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.REPLACE__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.REPLACE__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.REPLACE__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getReplacement() {
		return replacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacement(StringExpression newReplacement, NotificationChain msgs) {
		StringExpression oldReplacement = replacement;
		replacement = newReplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.REPLACE__REPLACEMENT, oldReplacement, newReplacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacement(StringExpression newReplacement) {
		if (newReplacement != replacement) {
			NotificationChain msgs = null;
			if (replacement != null)
				msgs = ((InternalEObject)replacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.REPLACE__REPLACEMENT, null, msgs);
			if (newReplacement != null)
				msgs = ((InternalEObject)newReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.REPLACE__REPLACEMENT, null, msgs);
			msgs = basicSetReplacement(newReplacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.REPLACE__REPLACEMENT, newReplacement, newReplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StringPackage.REPLACE__EXPRESSION:
				return basicSetExpression(null, msgs);
			case StringPackage.REPLACE__PATTERN:
				return basicSetPattern(null, msgs);
			case StringPackage.REPLACE__REPLACEMENT:
				return basicSetReplacement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StringPackage.REPLACE__EXPRESSION:
				return getExpression();
			case StringPackage.REPLACE__PATTERN:
				return getPattern();
			case StringPackage.REPLACE__REPLACEMENT:
				return getReplacement();
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
			case StringPackage.REPLACE__EXPRESSION:
				setExpression((StringExpression)newValue);
				return;
			case StringPackage.REPLACE__PATTERN:
				setPattern((StringExpression)newValue);
				return;
			case StringPackage.REPLACE__REPLACEMENT:
				setReplacement((StringExpression)newValue);
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
			case StringPackage.REPLACE__EXPRESSION:
				setExpression((StringExpression)null);
				return;
			case StringPackage.REPLACE__PATTERN:
				setPattern((StringExpression)null);
				return;
			case StringPackage.REPLACE__REPLACEMENT:
				setReplacement((StringExpression)null);
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
			case StringPackage.REPLACE__EXPRESSION:
				return expression != null;
			case StringPackage.REPLACE__PATTERN:
				return pattern != null;
			case StringPackage.REPLACE__REPLACEMENT:
				return replacement != null;
		}
		return super.eIsSet(featureID);
	}

} //ReplaceImpl
