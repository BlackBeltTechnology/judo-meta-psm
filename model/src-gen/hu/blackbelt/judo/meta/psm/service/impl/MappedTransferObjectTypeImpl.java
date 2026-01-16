/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedTransferObjectTypeImpl extends TransferObjectTypeImpl implements MappedTransferObjectType
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedTransferObjectTypeImpl()
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
		return ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntityType()
	{
		return (EntityType)eDynamicGet(ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetEntityType()
	{
		return (EntityType)eDynamicGet(ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityType(EntityType newEntityType)
	{
		eDynamicSet(ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, newEntityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpressionType getFilter()
	{
		return (LogicalExpressionType)eDynamicGet(ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(LogicalExpressionType newFilter, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newFilter, ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(LogicalExpressionType newFilter)
	{
		eDynamicSet(ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.isAbstractMappedTransferObjectType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstantiable()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.isInstantiableMappedTransferObjectType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER:
				return basicSetFilter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER:
				return getFilter();
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				setEntityType((EntityType)newValue);
				return;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER:
				setFilter((LogicalExpressionType)newValue);
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				setEntityType((EntityType)null);
				return;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER:
				setFilter((LogicalExpressionType)null);
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				return basicGetEntityType() != null;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER:
				return getFilter() != null;
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE___IS_ABSTRACT:
				return isAbstract();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE___IS_INSTANTIABLE:
				return isInstantiable();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MappedTransferObjectTypeImpl
