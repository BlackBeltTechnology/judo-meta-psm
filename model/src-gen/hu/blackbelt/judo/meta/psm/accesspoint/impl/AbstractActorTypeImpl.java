/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType;
import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Actor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl#getTransferObjectType <em>Transfer Object Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl#getRealm <em>Realm</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractActorTypeImpl extends TransferObjectTypeImpl implements AbstractActorType
{
	/**
	 * The default value of the '{@link #getRealm() <em>Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealm()
	 * @generated
	 * @ordered
	 */
	protected static final String REALM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActorTypeImpl()
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
		return AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectType getTransferObjectType()
	{
		return (TransferObjectType)eDynamicGet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetTransferObjectType()
	{
		return (TransferObjectType)eDynamicGet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferObjectType(TransferObjectType newTransferObjectType, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newTransferObjectType, AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransferObjectType(TransferObjectType newTransferObjectType)
	{
		eDynamicSet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE, newTransferObjectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRealm()
	{
		return (String)eDynamicGet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__REALM, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__REALM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealm(String newRealm)
	{
		eDynamicSet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__REALM, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__REALM, newRealm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind()
	{
		return (String)eDynamicGet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__KIND, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind)
	{
		eDynamicSet(AccesspointPackage.ABSTRACT_ACTOR_TYPE__KIND, AccesspointPackage.Literals.ABSTRACT_ACTOR_TYPE__KIND, newKind);
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
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE:
				TransferObjectType transferObjectType = basicGetTransferObjectType();
				if (transferObjectType != null)
					msgs = ((InternalEObject)transferObjectType).eInverseRemove(this, ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE, TransferObjectType.class, msgs);
				return basicSetTransferObjectType((TransferObjectType)otherEnd, msgs);
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
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE:
				return basicSetTransferObjectType(null, msgs);
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
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE:
				if (resolve) return getTransferObjectType();
				return basicGetTransferObjectType();
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__REALM:
				return getRealm();
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__KIND:
				return getKind();
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
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE:
				setTransferObjectType((TransferObjectType)newValue);
				return;
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__REALM:
				setRealm((String)newValue);
				return;
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__KIND:
				setKind((String)newValue);
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
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE:
				setTransferObjectType((TransferObjectType)null);
				return;
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__REALM:
				setRealm(REALM_EDEFAULT);
				return;
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__KIND:
				setKind(KIND_EDEFAULT);
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
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE:
				return basicGetTransferObjectType() != null;
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__REALM:
				return REALM_EDEFAULT == null ? getRealm() != null : !REALM_EDEFAULT.equals(getRealm());
			case AccesspointPackage.ABSTRACT_ACTOR_TYPE__KIND:
				return KIND_EDEFAULT == null ? getKind() != null : !KIND_EDEFAULT.equals(getKind());
		}
		return super.eIsSet(featureID);
	}

} //AbstractActorTypeImpl
