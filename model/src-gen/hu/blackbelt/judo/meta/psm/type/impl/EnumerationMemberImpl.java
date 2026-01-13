/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.EnumerationMember;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationMemberImpl#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationMemberImpl extends NamedElementImpl implements EnumerationMember
{
	/**
	 * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDINAL_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationMemberImpl()
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
		return TypePackage.Literals.ENUMERATION_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrdinal()
	{
		return (Integer)eDynamicGet(TypePackage.ENUMERATION_MEMBER__ORDINAL, TypePackage.Literals.ENUMERATION_MEMBER__ORDINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdinal(int newOrdinal)
	{
		eDynamicSet(TypePackage.ENUMERATION_MEMBER__ORDINAL, TypePackage.Literals.ENUMERATION_MEMBER__ORDINAL, newOrdinal);
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
			case TypePackage.ENUMERATION_MEMBER__ORDINAL:
				return getOrdinal();
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
			case TypePackage.ENUMERATION_MEMBER__ORDINAL:
				setOrdinal((Integer)newValue);
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
			case TypePackage.ENUMERATION_MEMBER__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
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
			case TypePackage.ENUMERATION_MEMBER__ORDINAL:
				return getOrdinal() != ORDINAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationMemberImpl
