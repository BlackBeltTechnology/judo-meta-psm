/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal.impl;

import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.TimestampDurationOperator;

import hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage;
import hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Addition Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimestampAdditionExpressionImpl extends MinimalEObjectImpl.Container implements TimestampAdditionExpression {
	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected TimestampExpression timestamp;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected NumericExpression duration;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TimestampDurationOperator OPERATOR_EDEFAULT = TimestampDurationOperator.ADD;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TimestampDurationOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimestampAdditionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemporalPackage.Literals.TIMESTAMP_ADDITION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampExpression getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(TimestampExpression newTimestamp, NotificationChain msgs) {
		TimestampExpression oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP, oldTimestamp, newTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(TimestampExpression newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericExpression getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(NumericExpression newDuration, NotificationChain msgs) {
		NumericExpression oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(NumericExpression newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampDurationOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(TimestampDurationOperator newOperator) {
		TimestampDurationOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION:
				return basicSetDuration(null, msgs);
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
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP:
				return getTimestamp();
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION:
				return getDuration();
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__OPERATOR:
				return getOperator();
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
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP:
				setTimestamp((TimestampExpression)newValue);
				return;
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION:
				setDuration((NumericExpression)newValue);
				return;
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__OPERATOR:
				setOperator((TimestampDurationOperator)newValue);
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
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP:
				setTimestamp((TimestampExpression)null);
				return;
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION:
				setDuration((NumericExpression)null);
				return;
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP:
				return timestamp != null;
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__DURATION:
				return duration != null;
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //TimestampAdditionExpressionImpl
