/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl#getGetterExpression <em>Getter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl#getSetterExpression <em>Setter Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PrimitiveAccessorImpl extends PrimitiveTypedElementImpl implements PrimitiveAccessor {
	/**
	 * The cached value of the '{@link #getGetterExpression() <em>Getter Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterExpression()
	 * @generated
	 * @ordered
	 */
	protected DataExpression getterExpression;

	/**
	 * The cached value of the '{@link #getSetterExpression() <em>Setter Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterExpression()
	 * @generated
	 * @ordered
	 */
	protected AttributeSelector setterExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveAccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DerivedPackage.Literals.PRIMITIVE_ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExpression getGetterExpression() {
		return getterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetterExpression(DataExpression newGetterExpression, NotificationChain msgs) {
		DataExpression oldGetterExpression = getterExpression;
		getterExpression = newGetterExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, oldGetterExpression, newGetterExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterExpression(DataExpression newGetterExpression) {
		if (newGetterExpression != getterExpression) {
			NotificationChain msgs = null;
			if (getterExpression != null)
				msgs = ((InternalEObject)getterExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, null, msgs);
			if (newGetterExpression != null)
				msgs = ((InternalEObject)newGetterExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, null, msgs);
			msgs = basicSetGetterExpression(newGetterExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, newGetterExpression, newGetterExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSelector getSetterExpression() {
		return setterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetterExpression(AttributeSelector newSetterExpression, NotificationChain msgs) {
		AttributeSelector oldSetterExpression = setterExpression;
		setterExpression = newSetterExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, oldSetterExpression, newSetterExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetterExpression(AttributeSelector newSetterExpression) {
		if (newSetterExpression != setterExpression) {
			NotificationChain msgs = null;
			if (setterExpression != null)
				msgs = ((InternalEObject)setterExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, null, msgs);
			if (newSetterExpression != null)
				msgs = ((InternalEObject)newSetterExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, null, msgs);
			msgs = basicSetSetterExpression(newSetterExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, newSetterExpression, newSetterExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				return basicSetGetterExpression(null, msgs);
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				return basicSetSetterExpression(null, msgs);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				return getGetterExpression();
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				return getSetterExpression();
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				setGetterExpression((DataExpression)newValue);
				return;
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				setSetterExpression((AttributeSelector)newValue);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				setGetterExpression((DataExpression)null);
				return;
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				setSetterExpression((AttributeSelector)null);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				return getterExpression != null;
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				return setterExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveAccessorImpl
