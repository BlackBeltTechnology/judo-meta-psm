/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;
import hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType;

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
 * An implementation of the model object '<em><b>Mapped Actor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl#isManaged <em>Managed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedActorTypeImpl extends AbstractActorTypeImpl implements MappedActorType
{
	/**
	 * The default value of the '{@link #isManaged() <em>Managed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManaged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANAGED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedActorTypeImpl()
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
		return AccesspointPackage.Literals.MAPPED_ACTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntityType()
	{
		return (EntityType)eDynamicGet(AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetEntityType()
	{
		return (EntityType)eDynamicGet(AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityType(EntityType newEntityType)
	{
		eDynamicSet(AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, newEntityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpressionType getFilter()
	{
		return (LogicalExpressionType)eDynamicGet(AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(LogicalExpressionType newFilter, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newFilter, AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER, msgs);
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
		eDynamicSet(AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER, ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE__FILTER, newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManaged()
	{
		return (Boolean)eDynamicGet(AccesspointPackage.MAPPED_ACTOR_TYPE__MANAGED, AccesspointPackage.Literals.MAPPED_ACTOR_TYPE__MANAGED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManaged(boolean newManaged)
	{
		eDynamicSet(AccesspointPackage.MAPPED_ACTOR_TYPE__MANAGED, AccesspointPackage.Literals.MAPPED_ACTOR_TYPE__MANAGED, newManaged);
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
			case AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER:
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
			case AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
			case AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER:
				return getFilter();
			case AccesspointPackage.MAPPED_ACTOR_TYPE__MANAGED:
				return isManaged();
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
			case AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE:
				setEntityType((EntityType)newValue);
				return;
			case AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER:
				setFilter((LogicalExpressionType)newValue);
				return;
			case AccesspointPackage.MAPPED_ACTOR_TYPE__MANAGED:
				setManaged((Boolean)newValue);
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
			case AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE:
				setEntityType((EntityType)null);
				return;
			case AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER:
				setFilter((LogicalExpressionType)null);
				return;
			case AccesspointPackage.MAPPED_ACTOR_TYPE__MANAGED:
				setManaged(MANAGED_EDEFAULT);
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
			case AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE:
				return basicGetEntityType() != null;
			case AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER:
				return getFilter() != null;
			case AccesspointPackage.MAPPED_ACTOR_TYPE__MANAGED:
				return isManaged() != MANAGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == MappedTransferObjectType.class)
		{
			switch (derivedFeatureID)
			{
				case AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE: return ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE;
				case AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER: return ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == MappedTransferObjectType.class)
		{
			switch (baseFeatureID)
			{
				case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE: return AccesspointPackage.MAPPED_ACTOR_TYPE__ENTITY_TYPE;
				case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__FILTER: return AccesspointPackage.MAPPED_ACTOR_TYPE__FILTER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == MappedTransferObjectType.class)
		{
			switch (baseOperationID)
			{
				case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE___IS_ABSTRACT: return AccesspointPackage.MAPPED_ACTOR_TYPE___IS_ABSTRACT;
				case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE___IS_INSTANTIABLE: return AccesspointPackage.MAPPED_ACTOR_TYPE___IS_INSTANTIABLE;
				default: return -1;
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
			case AccesspointPackage.MAPPED_ACTOR_TYPE___IS_ABSTRACT:
				return isAbstract();
			case AccesspointPackage.MAPPED_ACTOR_TYPE___IS_INSTANTIABLE:
				return isInstantiable();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MappedActorTypeImpl
