/**
 */
package hu.blackbelt.judo.meta.psm.constraint.impl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;
import hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl#getConstrained <em>Constrained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvariantConstraintImpl extends NamedElementImpl implements InvariantConstraint {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected LogicalExpression expression;

	/**
	 * The cached value of the '{@link #getConstrained() <em>Constrained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrained()
	 * @generated
	 * @ordered
	 */
	protected EntityType constrained;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.INVARIANT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(LogicalExpression newExpression, NotificationChain msgs) {
		LogicalExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(LogicalExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getConstrained() {
		if (constrained != null && constrained.eIsProxy()) {
			InternalEObject oldConstrained = (InternalEObject)constrained;
			constrained = (EntityType)eResolveProxy(oldConstrained);
			if (constrained != oldConstrained) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.INVARIANT_CONSTRAINT__CONSTRAINED, oldConstrained, constrained));
			}
		}
		return constrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetConstrained() {
		return constrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrained(EntityType newConstrained) {
		EntityType oldConstrained = constrained;
		constrained = newConstrained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.INVARIANT_CONSTRAINT__CONSTRAINED, oldConstrained, constrained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				return getExpression();
			case ConstraintPackage.INVARIANT_CONSTRAINT__CONSTRAINED:
				if (resolve) return getConstrained();
				return basicGetConstrained();
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				setExpression((LogicalExpression)newValue);
				return;
			case ConstraintPackage.INVARIANT_CONSTRAINT__CONSTRAINED:
				setConstrained((EntityType)newValue);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				setExpression((LogicalExpression)null);
				return;
			case ConstraintPackage.INVARIANT_CONSTRAINT__CONSTRAINED:
				setConstrained((EntityType)null);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				return expression != null;
			case ConstraintPackage.INVARIANT_CONSTRAINT__CONSTRAINED:
				return constrained != null;
		}
		return super.eIsSet(featureID);
	}

} //InvariantConstraintImpl
