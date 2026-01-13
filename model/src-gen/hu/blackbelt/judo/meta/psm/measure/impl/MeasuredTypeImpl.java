/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.measure.Unit;

import hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasuredTypeImpl#getStoreUnit <em>Store Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasuredTypeImpl extends NumericTypeImpl implements MeasuredType
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredTypeImpl()
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
		return MeasurePackage.Literals.MEASURED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unit getStoreUnit()
	{
		return (Unit)eDynamicGet(MeasurePackage.MEASURED_TYPE__STORE_UNIT, MeasurePackage.Literals.MEASURED_TYPE__STORE_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetStoreUnit()
	{
		return (Unit)eDynamicGet(MeasurePackage.MEASURED_TYPE__STORE_UNIT, MeasurePackage.Literals.MEASURED_TYPE__STORE_UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreUnit(Unit newStoreUnit)
	{
		eDynamicSet(MeasurePackage.MEASURED_TYPE__STORE_UNIT, MeasurePackage.Literals.MEASURED_TYPE__STORE_UNIT, newStoreUnit);
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
			case MeasurePackage.MEASURED_TYPE__STORE_UNIT:
				if (resolve) return getStoreUnit();
				return basicGetStoreUnit();
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
			case MeasurePackage.MEASURED_TYPE__STORE_UNIT:
				setStoreUnit((Unit)newValue);
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
			case MeasurePackage.MEASURED_TYPE__STORE_UNIT:
				setStoreUnit((Unit)null);
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
			case MeasurePackage.MEASURED_TYPE__STORE_UNIT:
				return basicGetStoreUnit() != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasuredTypeImpl
