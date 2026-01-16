/**
 */
package hu.blackbelt.judo.meta.psm.namespace.impl;

import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl()
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
		return NamespacePackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamespaceElement> getElements()
	{
		return (EList<NamespaceElement>)eDynamicGet(NamespacePackage.NAMESPACE__ELEMENTS, NamespacePackage.Literals.NAMESPACE__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<hu.blackbelt.judo.meta.psm.namespace.Package> getPackages()
	{
		return (EList<hu.blackbelt.judo.meta.psm.namespace.Package>)eDynamicGet(NamespacePackage.NAMESPACE__PACKAGES, NamespacePackage.Literals.NAMESPACE__PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.namespaceToString(this);
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
			case NamespacePackage.NAMESPACE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case NamespacePackage.NAMESPACE__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
			case NamespacePackage.NAMESPACE__ELEMENTS:
				return getElements();
			case NamespacePackage.NAMESPACE__PACKAGES:
				return getPackages();
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
			case NamespacePackage.NAMESPACE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends NamespaceElement>)newValue);
				return;
			case NamespacePackage.NAMESPACE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Package>)newValue);
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
			case NamespacePackage.NAMESPACE__ELEMENTS:
				getElements().clear();
				return;
			case NamespacePackage.NAMESPACE__PACKAGES:
				getPackages().clear();
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
			case NamespacePackage.NAMESPACE__ELEMENTS:
				return !getElements().isEmpty();
			case NamespacePackage.NAMESPACE__PACKAGES:
				return !getPackages().isEmpty();
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
			case NamespacePackage.NAMESPACE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamespaceImpl
