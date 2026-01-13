/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PrimitiveImpl extends DataTypeImpl implements Primitive
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveImpl()
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
		return TypePackage.Literals.PRIMITIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNumeric()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.NumericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInteger()
	{
		return isNumeric() && ((hu.blackbelt.judo.meta.psm.type.NumericType)this).getScale() == 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDecimal()
	{
		return isNumeric() && ((hu.blackbelt.judo.meta.psm.type.NumericType)this).getScale() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isString()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.StringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBoolean()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.BooleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDate()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.DateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTimestamp()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.TimestampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnumeration()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.EnumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMeasured()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.measure.MeasuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTime()
	{
		return this instanceof hu.blackbelt.judo.meta.psm.type.TimeType;
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
			case TypePackage.PRIMITIVE___IS_NUMERIC:
				return isNumeric();
			case TypePackage.PRIMITIVE___IS_INTEGER:
				return isInteger();
			case TypePackage.PRIMITIVE___IS_DECIMAL:
				return isDecimal();
			case TypePackage.PRIMITIVE___IS_STRING:
				return isString();
			case TypePackage.PRIMITIVE___IS_BOOLEAN:
				return isBoolean();
			case TypePackage.PRIMITIVE___IS_DATE:
				return isDate();
			case TypePackage.PRIMITIVE___IS_TIMESTAMP:
				return isTimestamp();
			case TypePackage.PRIMITIVE___IS_ENUMERATION:
				return isEnumeration();
			case TypePackage.PRIMITIVE___IS_MEASURED:
				return isMeasured();
			case TypePackage.PRIMITIVE___IS_TIME:
				return isTime();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrimitiveImpl
