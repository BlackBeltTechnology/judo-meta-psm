/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.measure.Unit;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
public class UnitImpl extends NamedElementImpl implements Unit
{
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
	 * The default value of the '{@link #getRateDivisor() <em>Rate Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDivisor()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_DIVISOR_EDEFAULT = 1.0;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MeasurePackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRateDividend()
	{
		return (Double)eDynamicGet(MeasurePackage.UNIT__RATE_DIVIDEND, MeasurePackage.Literals.UNIT__RATE_DIVIDEND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateDividend(double newRateDividend)
	{
		eDynamicSet(MeasurePackage.UNIT__RATE_DIVIDEND, MeasurePackage.Literals.UNIT__RATE_DIVIDEND, newRateDividend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRateDivisor()
	{
		return (Double)eDynamicGet(MeasurePackage.UNIT__RATE_DIVISOR, MeasurePackage.Literals.UNIT__RATE_DIVISOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateDivisor(double newRateDivisor)
	{
		eDynamicSet(MeasurePackage.UNIT__RATE_DIVISOR, MeasurePackage.Literals.UNIT__RATE_DIVISOR, newRateDivisor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol()
	{
		return (String)eDynamicGet(MeasurePackage.UNIT__SYMBOL, MeasurePackage.Literals.UNIT__SYMBOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol)
	{
		eDynamicSet(MeasurePackage.UNIT__SYMBOL, MeasurePackage.Literals.UNIT__SYMBOL, newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return getSymbol() != null ? getSymbol() : getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure getMeasure()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getMeasure(this).get();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MeasurePackage.UNIT__RATE_DIVIDEND:
				return getRateDividend() != RATE_DIVIDEND_EDEFAULT;
			case MeasurePackage.UNIT__RATE_DIVISOR:
				return getRateDivisor() != RATE_DIVISOR_EDEFAULT;
			case MeasurePackage.UNIT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? getSymbol() != null : !SYMBOL_EDEFAULT.equals(getSymbol());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case MeasurePackage.UNIT___TO_STRING:
				return toString();
			case MeasurePackage.UNIT___GET_MEASURE:
				return getMeasure();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UnitImpl
