/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl#isWrapAsOptional <em>Wrap As Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends NamedElementImpl implements Parameter
{
	/**
	 * The default value of the '{@link #isWrapAsOptional() <em>Wrap As Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrapAsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRAP_AS_OPTIONAL_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl()
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
		return ServicePackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getCardinality()
	{
		return (Cardinality)eDynamicGet(ServicePackage.PARAMETER__CARDINALITY, ServicePackage.Literals.PARAMETER__CARDINALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newCardinality, ServicePackage.PARAMETER__CARDINALITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(Cardinality newCardinality)
	{
		eDynamicSet(ServicePackage.PARAMETER__CARDINALITY, ServicePackage.Literals.PARAMETER__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectType getType()
	{
		return (TransferObjectType)eDynamicGet(ServicePackage.PARAMETER__TYPE, ServicePackage.Literals.PARAMETER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetType()
	{
		return (TransferObjectType)eDynamicGet(ServicePackage.PARAMETER__TYPE, ServicePackage.Literals.PARAMETER__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TransferObjectType newType)
	{
		eDynamicSet(ServicePackage.PARAMETER__TYPE, ServicePackage.Literals.PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWrapAsOptional()
	{
		return (Boolean)eDynamicGet(ServicePackage.PARAMETER__WRAP_AS_OPTIONAL, ServicePackage.Literals.PARAMETER__WRAP_AS_OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrapAsOptional(boolean newWrapAsOptional)
	{
		eDynamicSet(ServicePackage.PARAMETER__WRAP_AS_OPTIONAL, ServicePackage.Literals.PARAMETER__WRAP_AS_OPTIONAL, newWrapAsOptional);
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
			case ServicePackage.PARAMETER__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case ServicePackage.PARAMETER__CARDINALITY:
				return getCardinality();
			case ServicePackage.PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ServicePackage.PARAMETER__WRAP_AS_OPTIONAL:
				return isWrapAsOptional();
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
			case ServicePackage.PARAMETER__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ServicePackage.PARAMETER__TYPE:
				setType((TransferObjectType)newValue);
				return;
			case ServicePackage.PARAMETER__WRAP_AS_OPTIONAL:
				setWrapAsOptional((Boolean)newValue);
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
			case ServicePackage.PARAMETER__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ServicePackage.PARAMETER__TYPE:
				setType((TransferObjectType)null);
				return;
			case ServicePackage.PARAMETER__WRAP_AS_OPTIONAL:
				setWrapAsOptional(WRAP_AS_OPTIONAL_EDEFAULT);
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
			case ServicePackage.PARAMETER__CARDINALITY:
				return getCardinality() != null;
			case ServicePackage.PARAMETER__TYPE:
				return basicGetType() != null;
			case ServicePackage.PARAMETER__WRAP_AS_OPTIONAL:
				return isWrapAsOptional() != WRAP_AS_OPTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
