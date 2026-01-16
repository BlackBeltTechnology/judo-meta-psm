/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Operation Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl#getBehaviourType <em>Behaviour Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferOperationBehaviourImpl extends MinimalEObjectImpl.Container implements TransferOperationBehaviour
{
	/**
	 * The default value of the '{@link #getBehaviourType() <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourType()
	 * @generated
	 * @ordered
	 */
	protected static final TransferOperationBehaviourType BEHAVIOUR_TYPE_EDEFAULT = TransferOperationBehaviourType.GET_TEMPLATE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferOperationBehaviourImpl()
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
		return ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferOperationBehaviourType getBehaviourType()
	{
		return (TransferOperationBehaviourType)eDynamicGet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehaviourType(TransferOperationBehaviourType newBehaviourType)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE, newBehaviourType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectRelation getRelation()
	{
		return (TransferObjectRelation)eDynamicGet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__RELATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectRelation basicGetRelation()
	{
		return (TransferObjectRelation)eDynamicGet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__RELATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelation(TransferObjectRelation newRelation)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__RELATION, newRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getOwner()
	{
		return (NamedElement)eDynamicGet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetOwner()
	{
		return (NamedElement)eDynamicGet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__OWNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(NamedElement newOwner)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER, ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR__OWNER, newOwner);
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
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE:
				return getBehaviourType();
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE:
				setBehaviourType((TransferOperationBehaviourType)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION:
				setRelation((TransferObjectRelation)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER:
				setOwner((NamedElement)newValue);
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
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE:
				setBehaviourType(BEHAVIOUR_TYPE_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION:
				setRelation((TransferObjectRelation)null);
				return;
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER:
				setOwner((NamedElement)null);
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
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE:
				return getBehaviourType() != BEHAVIOUR_TYPE_EDEFAULT;
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__RELATION:
				return basicGetRelation() != null;
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR__OWNER:
				return basicGetOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransferOperationBehaviourImpl
