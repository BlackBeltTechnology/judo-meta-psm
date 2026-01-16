/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType;
import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferOperation;

import hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#isQueryCustomizer <em>Query Customizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransferObjectTypeImpl extends DataTypeImpl implements TransferObjectType
{
	/**
	 * The default value of the '{@link #isQueryCustomizer() <em>Query Customizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQueryCustomizer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUERY_CUSTOMIZER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferObjectTypeImpl()
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
		return ServicePackage.Literals.TRANSFER_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferAttribute getRepresentation()
	{
		return (TransferAttribute)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__REPRESENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttribute basicGetRepresentation()
	{
		return (TransferAttribute)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__REPRESENTATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentation(TransferAttribute newRepresentation)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__REPRESENTATION, newRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransferObjectRelation> getRelations()
	{
		return (EList<TransferObjectRelation>)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransferAttribute> getAttributes()
	{
		return (EList<TransferAttribute>)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransferOperation> getOperations()
	{
		return (EList<TransferOperation>)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractActorType getActorType()
	{
		return (AbstractActorType)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActorType basicGetActorType()
	{
		return (AbstractActorType)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActorType(AbstractActorType newActorType, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newActorType, ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActorType(AbstractActorType newActorType)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, newActorType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectType getOverride()
	{
		return (TransferObjectType)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__OVERRIDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetOverride()
	{
		return (TransferObjectType)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__OVERRIDE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverride(TransferObjectType newOverride)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__OVERRIDE, newOverride);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isQueryCustomizer()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueryCustomizer(boolean newQueryCustomizer)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER, ServicePackage.Literals.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER, newQueryCustomizer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAccessPoint()
	{
		return getActorType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE:
				AbstractActorType actorType = basicGetActorType();
				if (actorType != null)
					msgs = ((InternalEObject)actorType).eInverseRemove(this, AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, AbstractActorType.class, msgs);
				return basicSetActorType((AbstractActorType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE:
				return basicSetActorType(null, msgs);
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				return getRelations();
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				return getAttributes();
			case ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS:
				return getOperations();
			case ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE:
				if (resolve) return getActorType();
				return basicGetActorType();
			case ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE:
				if (resolve) return getOverride();
				return basicGetOverride();
			case ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER:
				return isQueryCustomizer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				setRepresentation((TransferAttribute)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends TransferObjectRelation>)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends TransferAttribute>)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends TransferOperation>)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE:
				setActorType((AbstractActorType)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE:
				setOverride((TransferObjectType)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER:
				setQueryCustomizer((Boolean)newValue);
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				setRepresentation((TransferAttribute)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				getRelations().clear();
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE:
				setActorType((AbstractActorType)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE:
				setOverride((TransferObjectType)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER:
				setQueryCustomizer(QUERY_CUSTOMIZER_EDEFAULT);
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				return basicGetRepresentation() != null;
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				return !getRelations().isEmpty();
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS:
				return !getOperations().isEmpty();
			case ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE:
				return basicGetActorType() != null;
			case ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE:
				return basicGetOverride() != null;
			case ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER:
				return isQueryCustomizer() != QUERY_CUSTOMIZER_EDEFAULT;
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
			case ServicePackage.TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT:
				return isAccessPoint();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransferObjectTypeImpl
