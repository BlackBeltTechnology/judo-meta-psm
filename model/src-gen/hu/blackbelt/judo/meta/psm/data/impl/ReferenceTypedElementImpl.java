/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceTypedElementImpl extends NamedElementImpl implements ReferenceTypedElement
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypedElementImpl()
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
		return DataPackage.Literals.REFERENCE_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getTarget()
	{
		return (EntityType)eDynamicGet(DataPackage.REFERENCE_TYPED_ELEMENT__TARGET, DataPackage.Literals.REFERENCE_TYPED_ELEMENT__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetTarget()
	{
		return (EntityType)eDynamicGet(DataPackage.REFERENCE_TYPED_ELEMENT__TARGET, DataPackage.Literals.REFERENCE_TYPED_ELEMENT__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EntityType newTarget)
	{
		eDynamicSet(DataPackage.REFERENCE_TYPED_ELEMENT__TARGET, DataPackage.Literals.REFERENCE_TYPED_ELEMENT__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getCardinality()
	{
		return (Cardinality)eDynamicGet(DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY, DataPackage.Literals.REFERENCE_TYPED_ELEMENT__CARDINALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newCardinality, DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY, msgs);
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
		eDynamicSet(DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY, DataPackage.Literals.REFERENCE_TYPED_ELEMENT__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollection()
	{
		if (getCardinality() == null) {
		    return false;
		} else {
		    return getCardinality().getUpper() == -1 || getCardinality().getUpper() > 1;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired()
	{
		return getCardinality() != null && getCardinality().getLower() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntityType()
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
			case DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY:
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
			case DataPackage.REFERENCE_TYPED_ELEMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY:
				return getCardinality();
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
			case DataPackage.REFERENCE_TYPED_ELEMENT__TARGET:
				setTarget((EntityType)newValue);
				return;
			case DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case DataPackage.REFERENCE_TYPED_ELEMENT__TARGET:
				setTarget((EntityType)null);
				return;
			case DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY:
				setCardinality((Cardinality)null);
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
			case DataPackage.REFERENCE_TYPED_ELEMENT__TARGET:
				return basicGetTarget() != null;
			case DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY:
				return getCardinality() != null;
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
			case DataPackage.REFERENCE_TYPED_ELEMENT___IS_COLLECTION:
				return isCollection();
			case DataPackage.REFERENCE_TYPED_ELEMENT___IS_REQUIRED:
				return isRequired();
			case DataPackage.REFERENCE_TYPED_ELEMENT___GET_ENTITY_TYPE:
				return getEntityType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReferenceTypedElementImpl
