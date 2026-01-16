/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.OperationBody;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl#getInstanceRepresentation <em>Instance Representation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundOperationImpl extends NamedElementImpl implements BoundOperation
{
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundOperationImpl()
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
		return DataPackage.Literals.BOUND_OPERATION;
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
		return (EList<Parameter>)eDynamicGet(DataPackage.BOUND_OPERATION__FAULTS, ServicePackage.Literals.OPERATION_DECLARATION__FAULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getOutput()
	{
		return (Parameter)eDynamicGet(DataPackage.BOUND_OPERATION__OUTPUT, ServicePackage.Literals.OPERATION_DECLARATION__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Parameter newOutput, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newOutput, DataPackage.BOUND_OPERATION__OUTPUT, msgs);
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
		eDynamicSet(DataPackage.BOUND_OPERATION__OUTPUT, ServicePackage.Literals.OPERATION_DECLARATION__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getInput()
	{
		return (Parameter)eDynamicGet(DataPackage.BOUND_OPERATION__INPUT, ServicePackage.Literals.OPERATION_DECLARATION__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Parameter newInput, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newInput, DataPackage.BOUND_OPERATION__INPUT, msgs);
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
		eDynamicSet(DataPackage.BOUND_OPERATION__INPUT, ServicePackage.Literals.OPERATION_DECLARATION__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBody getImplementation()
	{
		return (OperationBody)eDynamicGet(DataPackage.BOUND_OPERATION__IMPLEMENTATION, DataPackage.Literals.BOUND_OPERATION__IMPLEMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(OperationBody newImplementation, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newImplementation, DataPackage.BOUND_OPERATION__IMPLEMENTATION, msgs);
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
		eDynamicSet(DataPackage.BOUND_OPERATION__IMPLEMENTATION, DataPackage.Literals.BOUND_OPERATION__IMPLEMENTATION, newImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappedTransferObjectType getInstanceRepresentation()
	{
		return (MappedTransferObjectType)eDynamicGet(DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION, DataPackage.Literals.BOUND_OPERATION__INSTANCE_REPRESENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedTransferObjectType basicGetInstanceRepresentation()
	{
		return (MappedTransferObjectType)eDynamicGet(DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION, DataPackage.Literals.BOUND_OPERATION__INSTANCE_REPRESENTATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceRepresentation(MappedTransferObjectType newInstanceRepresentation)
	{
		eDynamicSet(DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION, DataPackage.Literals.BOUND_OPERATION__INSTANCE_REPRESENTATION, newInstanceRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract()
	{
		return (Boolean)eDynamicGet(DataPackage.BOUND_OPERATION__ABSTRACT, DataPackage.Literals.BOUND_OPERATION__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract)
	{
		eDynamicSet(DataPackage.BOUND_OPERATION__ABSTRACT, DataPackage.Literals.BOUND_OPERATION__ABSTRACT, newAbstract);
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
			case DataPackage.BOUND_OPERATION__FAULTS:
				return ((InternalEList<?>)getFaults()).basicRemove(otherEnd, msgs);
			case DataPackage.BOUND_OPERATION__OUTPUT:
				return basicSetOutput(null, msgs);
			case DataPackage.BOUND_OPERATION__INPUT:
				return basicSetInput(null, msgs);
			case DataPackage.BOUND_OPERATION__IMPLEMENTATION:
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
			case DataPackage.BOUND_OPERATION__FAULTS:
				return getFaults();
			case DataPackage.BOUND_OPERATION__OUTPUT:
				return getOutput();
			case DataPackage.BOUND_OPERATION__INPUT:
				return getInput();
			case DataPackage.BOUND_OPERATION__IMPLEMENTATION:
				return getImplementation();
			case DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION:
				if (resolve) return getInstanceRepresentation();
				return basicGetInstanceRepresentation();
			case DataPackage.BOUND_OPERATION__ABSTRACT:
				return isAbstract();
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
			case DataPackage.BOUND_OPERATION__FAULTS:
				getFaults().clear();
				getFaults().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DataPackage.BOUND_OPERATION__OUTPUT:
				setOutput((Parameter)newValue);
				return;
			case DataPackage.BOUND_OPERATION__INPUT:
				setInput((Parameter)newValue);
				return;
			case DataPackage.BOUND_OPERATION__IMPLEMENTATION:
				setImplementation((OperationBody)newValue);
				return;
			case DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION:
				setInstanceRepresentation((MappedTransferObjectType)newValue);
				return;
			case DataPackage.BOUND_OPERATION__ABSTRACT:
				setAbstract((Boolean)newValue);
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
			case DataPackage.BOUND_OPERATION__FAULTS:
				getFaults().clear();
				return;
			case DataPackage.BOUND_OPERATION__OUTPUT:
				setOutput((Parameter)null);
				return;
			case DataPackage.BOUND_OPERATION__INPUT:
				setInput((Parameter)null);
				return;
			case DataPackage.BOUND_OPERATION__IMPLEMENTATION:
				setImplementation((OperationBody)null);
				return;
			case DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION:
				setInstanceRepresentation((MappedTransferObjectType)null);
				return;
			case DataPackage.BOUND_OPERATION__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
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
			case DataPackage.BOUND_OPERATION__FAULTS:
				return !getFaults().isEmpty();
			case DataPackage.BOUND_OPERATION__OUTPUT:
				return getOutput() != null;
			case DataPackage.BOUND_OPERATION__INPUT:
				return getInput() != null;
			case DataPackage.BOUND_OPERATION__IMPLEMENTATION:
				return getImplementation() != null;
			case DataPackage.BOUND_OPERATION__INSTANCE_REPRESENTATION:
				return basicGetInstanceRepresentation() != null;
			case DataPackage.BOUND_OPERATION__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
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
				case DataPackage.BOUND_OPERATION__FAULTS: return ServicePackage.OPERATION_DECLARATION__FAULTS;
				case DataPackage.BOUND_OPERATION__OUTPUT: return ServicePackage.OPERATION_DECLARATION__OUTPUT;
				case DataPackage.BOUND_OPERATION__INPUT: return ServicePackage.OPERATION_DECLARATION__INPUT;
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
				case ServicePackage.OPERATION_DECLARATION__FAULTS: return DataPackage.BOUND_OPERATION__FAULTS;
				case ServicePackage.OPERATION_DECLARATION__OUTPUT: return DataPackage.BOUND_OPERATION__OUTPUT;
				case ServicePackage.OPERATION_DECLARATION__INPUT: return DataPackage.BOUND_OPERATION__INPUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BoundOperationImpl
