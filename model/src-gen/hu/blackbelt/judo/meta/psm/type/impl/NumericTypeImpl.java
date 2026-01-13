/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericTypeImpl extends FlatPrimitiveTypeImpl implements NumericType
{
	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericTypeImpl()
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
		return TypePackage.Literals.NUMERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrecision()
	{
		return (Integer)eDynamicGet(TypePackage.NUMERIC_TYPE__PRECISION, TypePackage.Literals.NUMERIC_TYPE__PRECISION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(int newPrecision)
	{
		eDynamicSet(TypePackage.NUMERIC_TYPE__PRECISION, TypePackage.Literals.NUMERIC_TYPE__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScale()
	{
		return (Integer)eDynamicGet(TypePackage.NUMERIC_TYPE__SCALE, TypePackage.Literals.NUMERIC_TYPE__SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(int newScale)
	{
		eDynamicSet(TypePackage.NUMERIC_TYPE__SCALE, TypePackage.Literals.NUMERIC_TYPE__SCALE, newScale);
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
			case TypePackage.NUMERIC_TYPE__PRECISION:
				return getPrecision();
			case TypePackage.NUMERIC_TYPE__SCALE:
				return getScale();
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
			case TypePackage.NUMERIC_TYPE__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case TypePackage.NUMERIC_TYPE__SCALE:
				setScale((Integer)newValue);
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
			case TypePackage.NUMERIC_TYPE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case TypePackage.NUMERIC_TYPE__SCALE:
				setScale(SCALE_EDEFAULT);
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
			case TypePackage.NUMERIC_TYPE__PRECISION:
				return getPrecision() != PRECISION_EDEFAULT;
			case TypePackage.NUMERIC_TYPE__SCALE:
				return getScale() != SCALE_EDEFAULT;
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
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return TypePackage.NUMERIC_TYPE___TO_STRING;
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
			case TypePackage.NUMERIC_TYPE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NumericTypeImpl
