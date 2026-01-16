/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.type.XMLType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl#getXmlNamespace <em>Xml Namespace</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl#getXmlElement <em>Xml Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLTypeImpl extends FlatPrimitiveTypeImpl implements XMLType
{
	/**
	 * The default value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getXmlElement() <em>Xml Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlElement()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_ELEMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeImpl()
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
		return TypePackage.Literals.XML_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlNamespace()
	{
		return (String)eDynamicGet(TypePackage.XML_TYPE__XML_NAMESPACE, TypePackage.Literals.XML_TYPE__XML_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlNamespace(String newXmlNamespace)
	{
		eDynamicSet(TypePackage.XML_TYPE__XML_NAMESPACE, TypePackage.Literals.XML_TYPE__XML_NAMESPACE, newXmlNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlElement()
	{
		return (String)eDynamicGet(TypePackage.XML_TYPE__XML_ELEMENT, TypePackage.Literals.XML_TYPE__XML_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlElement(String newXmlElement)
	{
		eDynamicSet(TypePackage.XML_TYPE__XML_ELEMENT, TypePackage.Literals.XML_TYPE__XML_ELEMENT, newXmlElement);
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
			case TypePackage.XML_TYPE__XML_NAMESPACE:
				return getXmlNamespace();
			case TypePackage.XML_TYPE__XML_ELEMENT:
				return getXmlElement();
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
			case TypePackage.XML_TYPE__XML_NAMESPACE:
				setXmlNamespace((String)newValue);
				return;
			case TypePackage.XML_TYPE__XML_ELEMENT:
				setXmlElement((String)newValue);
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
			case TypePackage.XML_TYPE__XML_NAMESPACE:
				setXmlNamespace(XML_NAMESPACE_EDEFAULT);
				return;
			case TypePackage.XML_TYPE__XML_ELEMENT:
				setXmlElement(XML_ELEMENT_EDEFAULT);
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
			case TypePackage.XML_TYPE__XML_NAMESPACE:
				return XML_NAMESPACE_EDEFAULT == null ? getXmlNamespace() != null : !XML_NAMESPACE_EDEFAULT.equals(getXmlNamespace());
			case TypePackage.XML_TYPE__XML_ELEMENT:
				return XML_ELEMENT_EDEFAULT == null ? getXmlElement() != null : !XML_ELEMENT_EDEFAULT.equals(getXmlElement());
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
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return TypePackage.XML_TYPE___TO_STRING;
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
			case TypePackage.XML_TYPE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //XMLTypeImpl
