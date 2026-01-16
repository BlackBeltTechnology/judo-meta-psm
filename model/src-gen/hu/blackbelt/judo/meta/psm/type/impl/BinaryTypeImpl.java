/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.BinaryType;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.BinaryTypeImpl#getMimeTypes <em>Mime Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.BinaryTypeImpl#getMaxFileSize <em>Max File Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryTypeImpl extends FlatPrimitiveTypeImpl implements BinaryType
{
	/**
	 * The default value of the '{@link #getMaxFileSize() <em>Max File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_FILE_SIZE_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryTypeImpl()
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
		return TypePackage.Literals.BINARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getMimeTypes()
	{
		return (EList<String>)eDynamicGet(TypePackage.BINARY_TYPE__MIME_TYPES, TypePackage.Literals.BINARY_TYPE__MIME_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxFileSize()
	{
		return (Long)eDynamicGet(TypePackage.BINARY_TYPE__MAX_FILE_SIZE, TypePackage.Literals.BINARY_TYPE__MAX_FILE_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxFileSize(long newMaxFileSize)
	{
		eDynamicSet(TypePackage.BINARY_TYPE__MAX_FILE_SIZE, TypePackage.Literals.BINARY_TYPE__MAX_FILE_SIZE, newMaxFileSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return super.toString();
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
			case TypePackage.BINARY_TYPE__MIME_TYPES:
				return getMimeTypes();
			case TypePackage.BINARY_TYPE__MAX_FILE_SIZE:
				return getMaxFileSize();
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
			case TypePackage.BINARY_TYPE__MIME_TYPES:
				getMimeTypes().clear();
				getMimeTypes().addAll((Collection<? extends String>)newValue);
				return;
			case TypePackage.BINARY_TYPE__MAX_FILE_SIZE:
				setMaxFileSize((Long)newValue);
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
			case TypePackage.BINARY_TYPE__MIME_TYPES:
				getMimeTypes().clear();
				return;
			case TypePackage.BINARY_TYPE__MAX_FILE_SIZE:
				setMaxFileSize(MAX_FILE_SIZE_EDEFAULT);
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
			case TypePackage.BINARY_TYPE__MIME_TYPES:
				return !getMimeTypes().isEmpty();
			case TypePackage.BINARY_TYPE__MAX_FILE_SIZE:
				return getMaxFileSize() != MAX_FILE_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == NamespaceElement.class)
		{
			switch (baseOperationID)
			{
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return TypePackage.BINARY_TYPE___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case TypePackage.BINARY_TYPE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BinaryTypeImpl
