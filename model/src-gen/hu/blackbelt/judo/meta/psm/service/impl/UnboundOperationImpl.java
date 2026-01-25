/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.OperationBody;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unbound Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl#isInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnboundOperationImpl extends TransferOperationImpl implements UnboundOperation
{
	/**
	 * The default value of the '{@link #isInitializer() <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnboundOperationImpl()
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
		return ServicePackage.Literals.UNBOUND_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBody getImplementation()
	{
		return (OperationBody)eDynamicGet(ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION, ServicePackage.Literals.UNBOUND_OPERATION__IMPLEMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(OperationBody newImplementation, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newImplementation, ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(OperationBody newImplementation)
	{
		eDynamicSet(ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION, ServicePackage.Literals.UNBOUND_OPERATION__IMPLEMENTATION, newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInitializer()
	{
		return (Boolean)eDynamicGet(ServicePackage.UNBOUND_OPERATION__INITIALIZER, ServicePackage.Literals.UNBOUND_OPERATION__INITIALIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializer(boolean newInitializer)
	{
		eDynamicSet(ServicePackage.UNBOUND_OPERATION__INITIALIZER, ServicePackage.Literals.UNBOUND_OPERATION__INITIALIZER, newInitializer);
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
			case ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
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
			case ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION:
				return getImplementation();
			case ServicePackage.UNBOUND_OPERATION__INITIALIZER:
				return isInitializer();
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
			case ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION:
				setImplementation((OperationBody)newValue);
				return;
			case ServicePackage.UNBOUND_OPERATION__INITIALIZER:
				setInitializer((Boolean)newValue);
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
			case ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION:
				setImplementation((OperationBody)null);
				return;
			case ServicePackage.UNBOUND_OPERATION__INITIALIZER:
				setInitializer(INITIALIZER_EDEFAULT);
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
			case ServicePackage.UNBOUND_OPERATION__IMPLEMENTATION:
				return getImplementation() != null;
			case ServicePackage.UNBOUND_OPERATION__INITIALIZER:
				return isInitializer() != INITIALIZER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //UnboundOperationImpl
