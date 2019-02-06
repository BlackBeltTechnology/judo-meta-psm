/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical.impl;

import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

import hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage;
import hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undefined Navigation Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedNavigationComparisonImpl#getObjectExression <em>Object Exression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UndefinedNavigationComparisonImpl extends MinimalEObjectImpl.Container implements UndefinedNavigationComparison {
	/**
	 * The cached value of the '{@link #getObjectExression() <em>Object Exression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExression()
	 * @generated
	 * @ordered
	 */
	protected ObjectExpression objectExression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndefinedNavigationComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalPackage.Literals.UNDEFINED_NAVIGATION_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExpression getObjectExression() {
		return objectExression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectExression(ObjectExpression newObjectExression, NotificationChain msgs) {
		ObjectExpression oldObjectExression = objectExression;
		objectExression = newObjectExression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION, oldObjectExression, newObjectExression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectExression(ObjectExpression newObjectExression) {
		if (newObjectExression != objectExression) {
			NotificationChain msgs = null;
			if (objectExression != null)
				msgs = ((InternalEObject)objectExression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION, null, msgs);
			if (newObjectExression != null)
				msgs = ((InternalEObject)newObjectExression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION, null, msgs);
			msgs = basicSetObjectExression(newObjectExression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION, newObjectExression, newObjectExression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION:
				return basicSetObjectExression(null, msgs);
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
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION:
				return getObjectExression();
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
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION:
				setObjectExression((ObjectExpression)newValue);
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
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION:
				setObjectExression((ObjectExpression)null);
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
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION:
				return objectExression != null;
		}
		return super.eIsSet(featureID);
	}

} //UndefinedNavigationComparisonImpl
