/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntityType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl#isIdentifier <em>Identifier</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends PrimitiveTypedElementImpl implements Attribute
{
	/**
	 * The default value of the '{@link #isIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTIFIER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnmappedDefaultOnly() <em>Unmapped Default Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmappedDefaultOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNMAPPED_DEFAULT_ONLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl()
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
		return DataPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIdentifier()
	{
		return (Boolean)eDynamicGet(DataPackage.ATTRIBUTE__IDENTIFIER, DataPackage.Literals.ATTRIBUTE__IDENTIFIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(boolean newIdentifier)
	{
		eDynamicSet(DataPackage.ATTRIBUTE__IDENTIFIER, DataPackage.Literals.ATTRIBUTE__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnmappedDefaultOnly()
	{
		return (Boolean)eDynamicGet(DataPackage.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY, DataPackage.Literals.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmappedDefaultOnly(boolean newUnmappedDefaultOnly)
	{
		eDynamicSet(DataPackage.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY, DataPackage.Literals.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY, newUnmappedDefaultOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.attributeToString(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimitive()
	{
		return getDataType() instanceof hu.blackbelt.judo.meta.psm.type.Primitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntityType()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getEntityTypeOfAttribute(this).get();
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
			case DataPackage.ATTRIBUTE__IDENTIFIER:
				return isIdentifier();
			case DataPackage.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY:
				return isUnmappedDefaultOnly();
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
			case DataPackage.ATTRIBUTE__IDENTIFIER:
				setIdentifier((Boolean)newValue);
				return;
			case DataPackage.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY:
				setUnmappedDefaultOnly((Boolean)newValue);
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
			case DataPackage.ATTRIBUTE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case DataPackage.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY:
				setUnmappedDefaultOnly(UNMAPPED_DEFAULT_ONLY_EDEFAULT);
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
			case DataPackage.ATTRIBUTE__IDENTIFIER:
				return isIdentifier() != IDENTIFIER_EDEFAULT;
			case DataPackage.ATTRIBUTE__UNMAPPED_DEFAULT_ONLY:
				return isUnmappedDefaultOnly() != UNMAPPED_DEFAULT_ONLY_EDEFAULT;
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
			case DataPackage.ATTRIBUTE___TO_STRING:
				return toString();
			case DataPackage.ATTRIBUTE___IS_PRIMITIVE:
				return isPrimitive();
			case DataPackage.ATTRIBUTE___GET_ENTITY_TYPE:
				return getEntityType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AttributeImpl
