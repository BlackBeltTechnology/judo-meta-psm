/**
 */
package hu.blackbelt.judo.meta.psm.namespace.impl;

import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NamespaceElementImpl extends NamedElementImpl implements NamespaceElement
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceElementImpl()
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
		return NamespacePackage.Literals.NAMESPACE_ELEMENT;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING:
				return toString();
			case NamespacePackage.NAMESPACE_ELEMENT___GET_NAMESPACE:
				return getNamespace();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamespaceElementImpl
