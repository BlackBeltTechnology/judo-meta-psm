/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.OperationBody;

import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Transfer Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.BoundTransferOperationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundTransferOperationImpl extends TransferOperationImpl implements BoundTransferOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundTransferOperationImpl()
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
		return ServicePackage.Literals.BOUND_TRANSFER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundOperation getBinding()
	{
		return (BoundOperation)eDynamicGet(ServicePackage.BOUND_TRANSFER_OPERATION__BINDING, ServicePackage.Literals.BOUND_TRANSFER_OPERATION__BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundOperation basicGetBinding()
	{
		return (BoundOperation)eDynamicGet(ServicePackage.BOUND_TRANSFER_OPERATION__BINDING, ServicePackage.Literals.BOUND_TRANSFER_OPERATION__BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinding(BoundOperation newBinding)
	{
		eDynamicSet(ServicePackage.BOUND_TRANSFER_OPERATION__BINDING, ServicePackage.Literals.BOUND_TRANSFER_OPERATION__BINDING, newBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBody getImplementation()
	{
		return (eContainer instanceof hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType) ? hu.blackbelt.judo.meta.psm.PsmUtils.getOperationImplementationByName(((hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType)eContainer).getEntityType(), getBinding().getName()).orElse(null) : null;
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
			case ServicePackage.BOUND_TRANSFER_OPERATION__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
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
			case ServicePackage.BOUND_TRANSFER_OPERATION__BINDING:
				setBinding((BoundOperation)newValue);
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
			case ServicePackage.BOUND_TRANSFER_OPERATION__BINDING:
				setBinding((BoundOperation)null);
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
			case ServicePackage.BOUND_TRANSFER_OPERATION__BINDING:
				return basicGetBinding() != null;
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
			case ServicePackage.BOUND_TRANSFER_OPERATION___GET_IMPLEMENTATION:
				return getImplementation();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BoundTransferOperationImpl
