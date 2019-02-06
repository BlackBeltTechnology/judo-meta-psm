/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.measure.Unit;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl#getRateDividend <em>Rate Dividend</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl#getRateDivisor <em>Rate Divisor</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends NamedElementImpl implements Unit {
	/**
	 * The default value of the '{@link #getRateDividend() <em>Rate Dividend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDividend()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_DIVIDEND_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRateDividend() <em>Rate Dividend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDividend()
	 * @generated
	 * @ordered
	 */
	protected double rateDividend = RATE_DIVIDEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateDivisor() <em>Rate Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDivisor()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_DIVISOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getRateDivisor() <em>Rate Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDivisor()
	 * @generated
	 * @ordered
	 */
	protected double rateDivisor = RATE_DIVISOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurePackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRateDividend() {
		return rateDividend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDividend(double newRateDividend) {
		double oldRateDividend = rateDividend;
		rateDividend = newRateDividend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.UNIT__RATE_DIVIDEND, oldRateDividend, rateDividend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRateDivisor() {
		return rateDivisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDivisor(double newRateDivisor) {
		double oldRateDivisor = rateDivisor;
		rateDivisor = newRateDivisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.UNIT__RATE_DIVISOR, oldRateDivisor, rateDivisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.UNIT__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurePackage.UNIT__RATE_DIVIDEND:
				return getRateDividend();
			case MeasurePackage.UNIT__RATE_DIVISOR:
				return getRateDivisor();
			case MeasurePackage.UNIT__SYMBOL:
				return getSymbol();
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
			case MeasurePackage.UNIT__RATE_DIVIDEND:
				setRateDividend((Double)newValue);
				return;
			case MeasurePackage.UNIT__RATE_DIVISOR:
				setRateDivisor((Double)newValue);
				return;
			case MeasurePackage.UNIT__SYMBOL:
				setSymbol((String)newValue);
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
			case MeasurePackage.UNIT__RATE_DIVIDEND:
				setRateDividend(RATE_DIVIDEND_EDEFAULT);
				return;
			case MeasurePackage.UNIT__RATE_DIVISOR:
				setRateDivisor(RATE_DIVISOR_EDEFAULT);
				return;
			case MeasurePackage.UNIT__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
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
			case MeasurePackage.UNIT__RATE_DIVIDEND:
				return rateDividend != RATE_DIVIDEND_EDEFAULT;
			case MeasurePackage.UNIT__RATE_DIVISOR:
				return rateDivisor != RATE_DIVISOR_EDEFAULT;
			case MeasurePackage.UNIT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
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
		result.append(" (rateDividend: ");
		result.append(rateDividend);
		result.append(", rateDivisor: ");
		result.append(rateDivisor);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
