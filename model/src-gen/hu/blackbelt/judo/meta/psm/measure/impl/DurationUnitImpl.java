/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.DurationUnitImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationUnitImpl extends UnitImpl implements DurationUnit
{
	/**
	 * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final DurationType UNIT_TYPE_EDEFAULT = DurationType.NANOSECOND;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationUnitImpl()
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
		return MeasurePackage.Literals.DURATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DurationType getUnitType()
	{
		return (DurationType)eDynamicGet(MeasurePackage.DURATION_UNIT__UNIT_TYPE, MeasurePackage.Literals.DURATION_UNIT__UNIT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitType(DurationType newUnitType)
	{
		eDynamicSet(MeasurePackage.DURATION_UNIT__UNIT_TYPE, MeasurePackage.Literals.DURATION_UNIT__UNIT_TYPE, newUnitType);
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
			case MeasurePackage.DURATION_UNIT__UNIT_TYPE:
				return getUnitType();
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
			case MeasurePackage.DURATION_UNIT__UNIT_TYPE:
				setUnitType((DurationType)newValue);
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
			case MeasurePackage.DURATION_UNIT__UNIT_TYPE:
				setUnitType(UNIT_TYPE_EDEFAULT);
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
			case MeasurePackage.DURATION_UNIT__UNIT_TYPE:
				return getUnitType() != UNIT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DurationUnitImpl
