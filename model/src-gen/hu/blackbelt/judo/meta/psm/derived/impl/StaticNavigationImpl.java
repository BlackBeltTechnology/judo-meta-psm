/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StaticNavigationImpl extends ReferenceAccessorImpl implements StaticNavigation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticNavigationImpl()
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
		return DerivedPackage.Literals.STATIC_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.namespaceElementToString(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getNamespaceOfNamespaceElement(this).get();
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
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return DerivedPackage.STATIC_NAVIGATION___TO_STRING;
				case NamespacePackage.NAMESPACE_ELEMENT___GET_NAMESPACE: return DerivedPackage.STATIC_NAVIGATION___GET_NAMESPACE;
				default: return -1;
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
			case DerivedPackage.STATIC_NAVIGATION___TO_STRING:
				return toString();
			case DerivedPackage.STATIC_NAVIGATION___GET_NAMESPACE:
				return getNamespace();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaticNavigationImpl
