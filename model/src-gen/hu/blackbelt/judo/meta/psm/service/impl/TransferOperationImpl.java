/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.OperationBody;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#isDeleteOnResult <em>Delete On Result</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#isUpdateOnResult <em>Update On Result</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl#getInputRange <em>Input Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransferOperationImpl extends NamedElementImpl implements TransferOperation
{
	/**
	 * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMUTABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDeleteOnResult() <em>Delete On Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteOnResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_ON_RESULT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUpdateOnResult() <em>Update On Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdateOnResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_ON_RESULT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferOperationImpl()
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
		return ServicePackage.Literals.TRANSFER_OPERATION;
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
		return (EList<Parameter>)eDynamicGet(ServicePackage.TRANSFER_OPERATION__FAULTS, ServicePackage.Literals.OPERATION_DECLARATION__FAULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getOutput()
	{
		return (Parameter)eDynamicGet(ServicePackage.TRANSFER_OPERATION__OUTPUT, ServicePackage.Literals.OPERATION_DECLARATION__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Parameter newOutput, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newOutput, ServicePackage.TRANSFER_OPERATION__OUTPUT, msgs);
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
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__OUTPUT, ServicePackage.Literals.OPERATION_DECLARATION__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getInput()
	{
		return (Parameter)eDynamicGet(ServicePackage.TRANSFER_OPERATION__INPUT, ServicePackage.Literals.OPERATION_DECLARATION__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Parameter newInput, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newInput, ServicePackage.TRANSFER_OPERATION__INPUT, msgs);
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
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__INPUT, ServicePackage.Literals.OPERATION_DECLARATION__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferOperationBehaviour getBehaviour()
	{
		return (TransferOperationBehaviour)eDynamicGet(ServicePackage.TRANSFER_OPERATION__BEHAVIOUR, ServicePackage.Literals.TRANSFER_OPERATION__BEHAVIOUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviour(TransferOperationBehaviour newBehaviour, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newBehaviour, ServicePackage.TRANSFER_OPERATION__BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehaviour(TransferOperationBehaviour newBehaviour)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__BEHAVIOUR, ServicePackage.Literals.TRANSFER_OPERATION__BEHAVIOUR, newBehaviour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImmutable()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OPERATION__IMMUTABLE, ServicePackage.Literals.TRANSFER_OPERATION__IMMUTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmutable(boolean newImmutable)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__IMMUTABLE, ServicePackage.Literals.TRANSFER_OPERATION__IMMUTABLE, newImmutable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeleteOnResult()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OPERATION__DELETE_ON_RESULT, ServicePackage.Literals.TRANSFER_OPERATION__DELETE_ON_RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnResult(boolean newDeleteOnResult)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__DELETE_ON_RESULT, ServicePackage.Literals.TRANSFER_OPERATION__DELETE_ON_RESULT, newDeleteOnResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUpdateOnResult()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OPERATION__UPDATE_ON_RESULT, ServicePackage.Literals.TRANSFER_OPERATION__UPDATE_ON_RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateOnResult(boolean newUpdateOnResult)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__UPDATE_ON_RESULT, ServicePackage.Literals.TRANSFER_OPERATION__UPDATE_ON_RESULT, newUpdateOnResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectRelation getInputRange()
	{
		return (TransferObjectRelation)eDynamicGet(ServicePackage.TRANSFER_OPERATION__INPUT_RANGE, ServicePackage.Literals.TRANSFER_OPERATION__INPUT_RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectRelation basicGetInputRange()
	{
		return (TransferObjectRelation)eDynamicGet(ServicePackage.TRANSFER_OPERATION__INPUT_RANGE, ServicePackage.Literals.TRANSFER_OPERATION__INPUT_RANGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputRange(TransferObjectRelation newInputRange)
	{
		eDynamicSet(ServicePackage.TRANSFER_OPERATION__INPUT_RANGE, ServicePackage.Literals.TRANSFER_OPERATION__INPUT_RANGE, newInputRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBody getImplementation()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ServicePackage.TRANSFER_OPERATION__FAULTS:
				return ((InternalEList<?>)getFaults()).basicRemove(otherEnd, msgs);
			case ServicePackage.TRANSFER_OPERATION__OUTPUT:
				return basicSetOutput(null, msgs);
			case ServicePackage.TRANSFER_OPERATION__INPUT:
				return basicSetInput(null, msgs);
			case ServicePackage.TRANSFER_OPERATION__BEHAVIOUR:
				return basicSetBehaviour(null, msgs);
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
			case ServicePackage.TRANSFER_OPERATION__FAULTS:
				return getFaults();
			case ServicePackage.TRANSFER_OPERATION__OUTPUT:
				return getOutput();
			case ServicePackage.TRANSFER_OPERATION__INPUT:
				return getInput();
			case ServicePackage.TRANSFER_OPERATION__BEHAVIOUR:
				return getBehaviour();
			case ServicePackage.TRANSFER_OPERATION__IMMUTABLE:
				return isImmutable();
			case ServicePackage.TRANSFER_OPERATION__DELETE_ON_RESULT:
				return isDeleteOnResult();
			case ServicePackage.TRANSFER_OPERATION__UPDATE_ON_RESULT:
				return isUpdateOnResult();
			case ServicePackage.TRANSFER_OPERATION__INPUT_RANGE:
				if (resolve) return getInputRange();
				return basicGetInputRange();
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
			case ServicePackage.TRANSFER_OPERATION__FAULTS:
				getFaults().clear();
				getFaults().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__OUTPUT:
				setOutput((Parameter)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__INPUT:
				setInput((Parameter)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__BEHAVIOUR:
				setBehaviour((TransferOperationBehaviour)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__IMMUTABLE:
				setImmutable((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__DELETE_ON_RESULT:
				setDeleteOnResult((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__UPDATE_ON_RESULT:
				setUpdateOnResult((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OPERATION__INPUT_RANGE:
				setInputRange((TransferObjectRelation)newValue);
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
			case ServicePackage.TRANSFER_OPERATION__FAULTS:
				getFaults().clear();
				return;
			case ServicePackage.TRANSFER_OPERATION__OUTPUT:
				setOutput((Parameter)null);
				return;
			case ServicePackage.TRANSFER_OPERATION__INPUT:
				setInput((Parameter)null);
				return;
			case ServicePackage.TRANSFER_OPERATION__BEHAVIOUR:
				setBehaviour((TransferOperationBehaviour)null);
				return;
			case ServicePackage.TRANSFER_OPERATION__IMMUTABLE:
				setImmutable(IMMUTABLE_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OPERATION__DELETE_ON_RESULT:
				setDeleteOnResult(DELETE_ON_RESULT_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OPERATION__UPDATE_ON_RESULT:
				setUpdateOnResult(UPDATE_ON_RESULT_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OPERATION__INPUT_RANGE:
				setInputRange((TransferObjectRelation)null);
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
			case ServicePackage.TRANSFER_OPERATION__FAULTS:
				return !getFaults().isEmpty();
			case ServicePackage.TRANSFER_OPERATION__OUTPUT:
				return getOutput() != null;
			case ServicePackage.TRANSFER_OPERATION__INPUT:
				return getInput() != null;
			case ServicePackage.TRANSFER_OPERATION__BEHAVIOUR:
				return getBehaviour() != null;
			case ServicePackage.TRANSFER_OPERATION__IMMUTABLE:
				return isImmutable() != IMMUTABLE_EDEFAULT;
			case ServicePackage.TRANSFER_OPERATION__DELETE_ON_RESULT:
				return isDeleteOnResult() != DELETE_ON_RESULT_EDEFAULT;
			case ServicePackage.TRANSFER_OPERATION__UPDATE_ON_RESULT:
				return isUpdateOnResult() != UPDATE_ON_RESULT_EDEFAULT;
			case ServicePackage.TRANSFER_OPERATION__INPUT_RANGE:
				return basicGetInputRange() != null;
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
		if (baseClass == OperationDeclaration.class)
		{
			switch (derivedFeatureID)
			{
				case ServicePackage.TRANSFER_OPERATION__FAULTS: return ServicePackage.OPERATION_DECLARATION__FAULTS;
				case ServicePackage.TRANSFER_OPERATION__OUTPUT: return ServicePackage.OPERATION_DECLARATION__OUTPUT;
				case ServicePackage.TRANSFER_OPERATION__INPUT: return ServicePackage.OPERATION_DECLARATION__INPUT;
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
		if (baseClass == OperationDeclaration.class)
		{
			switch (baseFeatureID)
			{
				case ServicePackage.OPERATION_DECLARATION__FAULTS: return ServicePackage.TRANSFER_OPERATION__FAULTS;
				case ServicePackage.OPERATION_DECLARATION__OUTPUT: return ServicePackage.TRANSFER_OPERATION__OUTPUT;
				case ServicePackage.OPERATION_DECLARATION__INPUT: return ServicePackage.TRANSFER_OPERATION__INPUT;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case ServicePackage.TRANSFER_OPERATION___GET_IMPLEMENTATION:
				return getImplementation();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransferOperationImpl
