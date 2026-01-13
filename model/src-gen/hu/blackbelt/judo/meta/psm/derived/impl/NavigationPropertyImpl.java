/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NavigationPropertyImpl extends ReferenceAccessorImpl implements NavigationProperty
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationPropertyImpl()
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
		return DerivedPackage.Literals.NAVIGATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getEntityType()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getEntityTypeOfNavigationProperty(this).get();
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
			case DerivedPackage.NAVIGATION_PROPERTY___GET_ENTITY_TYPE:
				return getEntityType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NavigationPropertyImpl
