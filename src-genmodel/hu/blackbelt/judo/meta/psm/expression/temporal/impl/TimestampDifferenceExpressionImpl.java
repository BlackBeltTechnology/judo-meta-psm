/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal.impl;

import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

import hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage;
import hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Difference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampDifferenceExpressionImpl#getStartTimestamp <em>Start Timestamp</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampDifferenceExpressionImpl#getEndTimestamp <em>End Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimestampDifferenceExpressionImpl extends MinimalEObjectImpl.Container implements TimestampDifferenceExpression {
	/**
	 * The cached value of the '{@link #getStartTimestamp() <em>Start Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimestamp()
	 * @generated
	 * @ordered
	 */
	protected TimestampExpression startTimestamp;

	/**
	 * The cached value of the '{@link #getEndTimestamp() <em>End Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTimestamp()
	 * @generated
	 * @ordered
	 */
	protected TimestampExpression endTimestamp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimestampDifferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalPackage.Literals.TIMESTAMP_DIFFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampExpression getStartTimestamp() {
		return startTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTimestamp(TimestampExpression newStartTimestamp, NotificationChain msgs) {
		TimestampExpression oldStartTimestamp = startTimestamp;
		startTimestamp = newStartTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP, oldStartTimestamp, newStartTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimestamp(TimestampExpression newStartTimestamp) {
		if (newStartTimestamp != startTimestamp) {
			NotificationChain msgs = null;
			if (startTimestamp != null)
				msgs = ((InternalEObject)startTimestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP, null, msgs);
			if (newStartTimestamp != null)
				msgs = ((InternalEObject)newStartTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP, null, msgs);
			msgs = basicSetStartTimestamp(newStartTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP, newStartTimestamp, newStartTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampExpression getEndTimestamp() {
		return endTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndTimestamp(TimestampExpression newEndTimestamp, NotificationChain msgs) {
		TimestampExpression oldEndTimestamp = endTimestamp;
		endTimestamp = newEndTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP, oldEndTimestamp, newEndTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTimestamp(TimestampExpression newEndTimestamp) {
		if (newEndTimestamp != endTimestamp) {
			NotificationChain msgs = null;
			if (endTimestamp != null)
				msgs = ((InternalEObject)endTimestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP, null, msgs);
			if (newEndTimestamp != null)
				msgs = ((InternalEObject)newEndTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP, null, msgs);
			msgs = basicSetEndTimestamp(newEndTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP, newEndTimestamp, newEndTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP:
				return basicSetStartTimestamp(null, msgs);
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP:
				return basicSetEndTimestamp(null, msgs);
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
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP:
				return getStartTimestamp();
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP:
				return getEndTimestamp();
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
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP:
				setStartTimestamp((TimestampExpression)newValue);
				return;
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP:
				setEndTimestamp((TimestampExpression)newValue);
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
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP:
				setStartTimestamp((TimestampExpression)null);
				return;
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP:
				setEndTimestamp((TimestampExpression)null);
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
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP:
				return startTimestamp != null;
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP:
				return endTimestamp != null;
		}
		return super.eIsSet(featureID);
	}

} //TimestampDifferenceExpressionImpl
