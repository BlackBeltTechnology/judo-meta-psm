/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;

import hu.blackbelt.judo.meta.psm.type.Primitive;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#getClaimType <em>Claim Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferAttributeImpl extends NamedElementImpl implements TransferAttribute
{
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getClaimType() <em>Claim Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimType()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferAttributeImpl()
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
		return ServicePackage.Literals.TRANSFER_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED, ServicePackage.Literals.TRANSFER_ATTRIBUTE__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired)
	{
		eDynamicSet(ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED, ServicePackage.Literals.TRANSFER_ATTRIBUTE__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveAccessor getDefaultValue()
	{
		return (PrimitiveAccessor)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveAccessor basicGetDefaultValue()
	{
		return (PrimitiveAccessor)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__DEFAULT_VALUE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(PrimitiveAccessor newDefaultValue)
	{
		eDynamicSet(ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Primitive getDataType()
	{
		return (Primitive)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive basicGetDataType()
	{
		return (Primitive)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__DATA_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(Primitive newDataType)
	{
		eDynamicSet(ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypedElement getBinding()
	{
		return (PrimitiveTypedElement)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__BINDING, ServicePackage.Literals.TRANSFER_ATTRIBUTE__BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypedElement basicGetBinding()
	{
		return (PrimitiveTypedElement)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__BINDING, ServicePackage.Literals.TRANSFER_ATTRIBUTE__BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinding(PrimitiveTypedElement newBinding)
	{
		eDynamicSet(ServicePackage.TRANSFER_ATTRIBUTE__BINDING, ServicePackage.Literals.TRANSFER_ATTRIBUTE__BINDING, newBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClaimType()
	{
		return (String)eDynamicGet(ServicePackage.TRANSFER_ATTRIBUTE__CLAIM_TYPE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__CLAIM_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClaimType(String newClaimType)
	{
		eDynamicSet(ServicePackage.TRANSFER_ATTRIBUTE__CLAIM_TYPE, ServicePackage.Literals.TRANSFER_ATTRIBUTE__CLAIM_TYPE, newClaimType);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
				return isRequired();
			case ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
			case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ServicePackage.TRANSFER_ATTRIBUTE__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case ServicePackage.TRANSFER_ATTRIBUTE__CLAIM_TYPE:
				return getClaimType();
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
			case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((PrimitiveAccessor)newValue);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
				setDataType((Primitive)newValue);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__BINDING:
				setBinding((PrimitiveTypedElement)newValue);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__CLAIM_TYPE:
				setClaimType((String)newValue);
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
			case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((PrimitiveAccessor)null);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
				setDataType((Primitive)null);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__BINDING:
				setBinding((PrimitiveTypedElement)null);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE__CLAIM_TYPE:
				setClaimType(CLAIM_TYPE_EDEFAULT);
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
			case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case ServicePackage.TRANSFER_ATTRIBUTE__DEFAULT_VALUE:
				return basicGetDefaultValue() != null;
			case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
				return basicGetDataType() != null;
			case ServicePackage.TRANSFER_ATTRIBUTE__BINDING:
				return basicGetBinding() != null;
			case ServicePackage.TRANSFER_ATTRIBUTE__CLAIM_TYPE:
				return CLAIM_TYPE_EDEFAULT == null ? getClaimType() != null : !CLAIM_TYPE_EDEFAULT.equals(getClaimType());
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
			case ServicePackage.TRANSFER_ATTRIBUTE___IS_PRIMITIVE:
				return isPrimitive();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransferAttributeImpl
