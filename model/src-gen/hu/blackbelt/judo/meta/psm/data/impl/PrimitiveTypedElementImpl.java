/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.Primitive;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PrimitiveTypedElementImpl extends NamedElementImpl implements PrimitiveTypedElement
{
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypedElementImpl()
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
		return DataPackage.Literals.PRIMITIVE_TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Primitive getDataType()
	{
		return (Primitive)eDynamicGet(DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE, DataPackage.Literals.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive basicGetDataType()
	{
		return (Primitive)eDynamicGet(DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE, DataPackage.Literals.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(Primitive newDataType)
	{
		eDynamicSet(DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE, DataPackage.Literals.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired()
	{
		return (Boolean)eDynamicGet(DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED, DataPackage.Literals.PRIMITIVE_TYPED_ELEMENT__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired)
	{
		eDynamicSet(DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED, DataPackage.Literals.PRIMITIVE_TYPED_ELEMENT__REQUIRED, newRequired);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED:
				return isRequired();
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
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE:
				setDataType((Primitive)newValue);
				return;
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED:
				setRequired((Boolean)newValue);
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
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE:
				setDataType((Primitive)null);
				return;
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE:
				return basicGetDataType() != null;
			case DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
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
			case DataPackage.PRIMITIVE_TYPED_ELEMENT___GET_ENTITY_TYPE:
				return getEntityType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrimitiveTypedElementImpl
