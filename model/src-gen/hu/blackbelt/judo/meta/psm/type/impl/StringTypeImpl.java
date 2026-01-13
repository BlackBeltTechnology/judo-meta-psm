/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.StringTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.StringTypeImpl#getRegExp <em>Reg Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringTypeImpl extends FlatPrimitiveTypeImpl implements StringType
{
	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRegExp() <em>Reg Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExp()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_EXP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTypeImpl()
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
		return TypePackage.Literals.STRING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxLength()
	{
		return (Integer)eDynamicGet(TypePackage.STRING_TYPE__MAX_LENGTH, TypePackage.Literals.STRING_TYPE__MAX_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(int newMaxLength)
	{
		eDynamicSet(TypePackage.STRING_TYPE__MAX_LENGTH, TypePackage.Literals.STRING_TYPE__MAX_LENGTH, newMaxLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegExp()
	{
		return (String)eDynamicGet(TypePackage.STRING_TYPE__REG_EXP, TypePackage.Literals.STRING_TYPE__REG_EXP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegExp(String newRegExp)
	{
		eDynamicSet(TypePackage.STRING_TYPE__REG_EXP, TypePackage.Literals.STRING_TYPE__REG_EXP, newRegExp);
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
			case TypePackage.STRING_TYPE__MAX_LENGTH:
				return getMaxLength();
			case TypePackage.STRING_TYPE__REG_EXP:
				return getRegExp();
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
			case TypePackage.STRING_TYPE__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case TypePackage.STRING_TYPE__REG_EXP:
				setRegExp((String)newValue);
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
			case TypePackage.STRING_TYPE__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case TypePackage.STRING_TYPE__REG_EXP:
				setRegExp(REG_EXP_EDEFAULT);
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
			case TypePackage.STRING_TYPE__MAX_LENGTH:
				return getMaxLength() != MAX_LENGTH_EDEFAULT;
			case TypePackage.STRING_TYPE__REG_EXP:
				return REG_EXP_EDEFAULT == null ? getRegExp() != null : !REG_EXP_EDEFAULT.equals(getRegExp());
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
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return TypePackage.STRING_TYPE___TO_STRING;
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
			case TypePackage.STRING_TYPE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StringTypeImpl
