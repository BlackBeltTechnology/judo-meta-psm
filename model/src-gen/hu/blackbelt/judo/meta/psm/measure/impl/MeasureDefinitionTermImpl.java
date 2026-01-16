/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm;
import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.measure.Unit;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureDefinitionTermImpl#getExponent <em>Exponent</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureDefinitionTermImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureDefinitionTermImpl extends MinimalEObjectImpl.Container implements MeasureDefinitionTerm
{
	/**
	 * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPONENT_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureDefinitionTermImpl()
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
		return MeasurePackage.Literals.MEASURE_DEFINITION_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExponent()
	{
		return (Integer)eDynamicGet(MeasurePackage.MEASURE_DEFINITION_TERM__EXPONENT, MeasurePackage.Literals.MEASURE_DEFINITION_TERM__EXPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponent(int newExponent)
	{
		eDynamicSet(MeasurePackage.MEASURE_DEFINITION_TERM__EXPONENT, MeasurePackage.Literals.MEASURE_DEFINITION_TERM__EXPONENT, newExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unit getUnit()
	{
		return (Unit)eDynamicGet(MeasurePackage.MEASURE_DEFINITION_TERM__UNIT, MeasurePackage.Literals.MEASURE_DEFINITION_TERM__UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit()
	{
		return (Unit)eDynamicGet(MeasurePackage.MEASURE_DEFINITION_TERM__UNIT, MeasurePackage.Literals.MEASURE_DEFINITION_TERM__UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(Unit newUnit)
	{
		eDynamicSet(MeasurePackage.MEASURE_DEFINITION_TERM__UNIT, MeasurePackage.Literals.MEASURE_DEFINITION_TERM__UNIT, newUnit);
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
			case MeasurePackage.MEASURE_DEFINITION_TERM__EXPONENT:
				return getExponent();
			case MeasurePackage.MEASURE_DEFINITION_TERM__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
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
			case MeasurePackage.MEASURE_DEFINITION_TERM__EXPONENT:
				setExponent((Integer)newValue);
				return;
			case MeasurePackage.MEASURE_DEFINITION_TERM__UNIT:
				setUnit((Unit)newValue);
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
			case MeasurePackage.MEASURE_DEFINITION_TERM__EXPONENT:
				setExponent(EXPONENT_EDEFAULT);
				return;
			case MeasurePackage.MEASURE_DEFINITION_TERM__UNIT:
				setUnit((Unit)null);
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
			case MeasurePackage.MEASURE_DEFINITION_TERM__EXPONENT:
				return getExponent() != EXPONENT_EDEFAULT;
			case MeasurePackage.MEASURE_DEFINITION_TERM__UNIT:
				return basicGetUnit() != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureDefinitionTermImpl
