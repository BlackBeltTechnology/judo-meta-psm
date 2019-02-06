/**
 */
package hu.blackbelt.judo.meta.psm.expression.string.impl;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;

import hu.blackbelt.judo.meta.psm.expression.string.StringPackage;
import hu.blackbelt.judo.meta.psm.expression.string.SubString;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubStringImpl extends MinimalEObjectImpl.Container implements SubString {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression position;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression length;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringPackage.Literals.SUB_STRING;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.SUB_STRING__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.SUB_STRING__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.SUB_STRING__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.SUB_STRING__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(IntegerExpression newPosition, NotificationChain msgs) {
		IntegerExpression oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.SUB_STRING__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IntegerExpression newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.SUB_STRING__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.SUB_STRING__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.SUB_STRING__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(IntegerExpression newLength, NotificationChain msgs) {
		IntegerExpression oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.SUB_STRING__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(IntegerExpression newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.SUB_STRING__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.SUB_STRING__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.SUB_STRING__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StringPackage.SUB_STRING__EXPRESSION:
				return basicSetExpression(null, msgs);
			case StringPackage.SUB_STRING__POSITION:
				return basicSetPosition(null, msgs);
			case StringPackage.SUB_STRING__LENGTH:
				return basicSetLength(null, msgs);
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
			case StringPackage.SUB_STRING__EXPRESSION:
				return getExpression();
			case StringPackage.SUB_STRING__POSITION:
				return getPosition();
			case StringPackage.SUB_STRING__LENGTH:
				return getLength();
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
			case StringPackage.SUB_STRING__EXPRESSION:
				setExpression((StringExpression)newValue);
				return;
			case StringPackage.SUB_STRING__POSITION:
				setPosition((IntegerExpression)newValue);
				return;
			case StringPackage.SUB_STRING__LENGTH:
				setLength((IntegerExpression)newValue);
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
			case StringPackage.SUB_STRING__EXPRESSION:
				setExpression((StringExpression)null);
				return;
			case StringPackage.SUB_STRING__POSITION:
				setPosition((IntegerExpression)null);
				return;
			case StringPackage.SUB_STRING__LENGTH:
				setLength((IntegerExpression)null);
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
			case StringPackage.SUB_STRING__EXPRESSION:
				return expression != null;
			case StringPackage.SUB_STRING__POSITION:
				return position != null;
			case StringPackage.SUB_STRING__LENGTH:
				return length != null;
		}
		return super.eIsSet(featureID);
	}

} //SubStringImpl
