/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.measure.DurationType;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.TimestampType;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timestamp Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.TimestampTypeImpl#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimestampTypeImpl extends FlatPrimitiveTypeImpl implements TimestampType
{
	/**
	 * The default value of the '{@link #getBaseUnit() <em>Base Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DurationType BASE_UNIT_EDEFAULT = DurationType.SECOND;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimestampTypeImpl()
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
		return TypePackage.Literals.TIMESTAMP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DurationType getBaseUnit()
	{
		return (DurationType)eDynamicGet(TypePackage.TIMESTAMP_TYPE__BASE_UNIT, TypePackage.Literals.TIMESTAMP_TYPE__BASE_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseUnit(DurationType newBaseUnit)
	{
		eDynamicSet(TypePackage.TIMESTAMP_TYPE__BASE_UNIT, TypePackage.Literals.TIMESTAMP_TYPE__BASE_UNIT, newBaseUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return super.toString();
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
			case TypePackage.TIMESTAMP_TYPE__BASE_UNIT:
				return getBaseUnit();
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
			case TypePackage.TIMESTAMP_TYPE__BASE_UNIT:
				setBaseUnit((DurationType)newValue);
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
			case TypePackage.TIMESTAMP_TYPE__BASE_UNIT:
				setBaseUnit(BASE_UNIT_EDEFAULT);
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
			case TypePackage.TIMESTAMP_TYPE__BASE_UNIT:
				return getBaseUnit() != BASE_UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == NamespaceElement.class)
		{
			switch (baseOperationID)
			{
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return TypePackage.TIMESTAMP_TYPE___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case TypePackage.TIMESTAMP_TYPE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimestampTypeImpl
