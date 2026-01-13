/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationDeclarationImpl extends MinimalEObjectImpl.Container implements OperationDeclaration
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDeclarationImpl()
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
		return ServicePackage.Literals.OPERATION_DECLARATION;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Parameter> getFaults()
	{
		return (EList<Parameter>)eDynamicGet(ServicePackage.OPERATION_DECLARATION__FAULTS, ServicePackage.Literals.OPERATION_DECLARATION__FAULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getOutput()
	{
		return (Parameter)eDynamicGet(ServicePackage.OPERATION_DECLARATION__OUTPUT, ServicePackage.Literals.OPERATION_DECLARATION__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Parameter newOutput, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newOutput, ServicePackage.OPERATION_DECLARATION__OUTPUT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(Parameter newOutput)
	{
		eDynamicSet(ServicePackage.OPERATION_DECLARATION__OUTPUT, ServicePackage.Literals.OPERATION_DECLARATION__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getInput()
	{
		return (Parameter)eDynamicGet(ServicePackage.OPERATION_DECLARATION__INPUT, ServicePackage.Literals.OPERATION_DECLARATION__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Parameter newInput, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newInput, ServicePackage.OPERATION_DECLARATION__INPUT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(Parameter newInput)
	{
		eDynamicSet(ServicePackage.OPERATION_DECLARATION__INPUT, ServicePackage.Literals.OPERATION_DECLARATION__INPUT, newInput);
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
			case ServicePackage.OPERATION_DECLARATION__FAULTS:
				return ((InternalEList<?>)getFaults()).basicRemove(otherEnd, msgs);
			case ServicePackage.OPERATION_DECLARATION__OUTPUT:
				return basicSetOutput(null, msgs);
			case ServicePackage.OPERATION_DECLARATION__INPUT:
				return basicSetInput(null, msgs);
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
			case ServicePackage.OPERATION_DECLARATION__FAULTS:
				return getFaults();
			case ServicePackage.OPERATION_DECLARATION__OUTPUT:
				return getOutput();
			case ServicePackage.OPERATION_DECLARATION__INPUT:
				return getInput();
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
			case ServicePackage.OPERATION_DECLARATION__FAULTS:
				getFaults().clear();
				getFaults().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ServicePackage.OPERATION_DECLARATION__OUTPUT:
				setOutput((Parameter)newValue);
				return;
			case ServicePackage.OPERATION_DECLARATION__INPUT:
				setInput((Parameter)newValue);
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
			case ServicePackage.OPERATION_DECLARATION__FAULTS:
				getFaults().clear();
				return;
			case ServicePackage.OPERATION_DECLARATION__OUTPUT:
				setOutput((Parameter)null);
				return;
			case ServicePackage.OPERATION_DECLARATION__INPUT:
				setInput((Parameter)null);
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
			case ServicePackage.OPERATION_DECLARATION__FAULTS:
				return !getFaults().isEmpty();
			case ServicePackage.OPERATION_DECLARATION__OUTPUT:
				return getOutput() != null;
			case ServicePackage.OPERATION_DECLARATION__INPUT:
				return getInput() != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationDeclarationImpl
