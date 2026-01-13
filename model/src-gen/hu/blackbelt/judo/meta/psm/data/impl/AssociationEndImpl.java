/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Relation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl#isReverseCascadeDelete <em>Reverse Cascade Delete</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationEndImpl extends RelationImpl implements AssociationEnd
{
	/**
	 * The default value of the '{@link #isReverseCascadeDelete() <em>Reverse Cascade Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseCascadeDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_CASCADE_DELETE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnmappedDefaultOnly() <em>Unmapped Default Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmappedDefaultOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNMAPPED_DEFAULT_ONLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl()
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
		return DataPackage.Literals.ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationEnd getPartner()
	{
		return (AssociationEnd)eDynamicGet(DataPackage.ASSOCIATION_END__PARTNER, DataPackage.Literals.ASSOCIATION_END__PARTNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd basicGetPartner()
	{
		return (AssociationEnd)eDynamicGet(DataPackage.ASSOCIATION_END__PARTNER, DataPackage.Literals.ASSOCIATION_END__PARTNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartner(AssociationEnd newPartner)
	{
		eDynamicSet(DataPackage.ASSOCIATION_END__PARTNER, DataPackage.Literals.ASSOCIATION_END__PARTNER, newPartner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReverseCascadeDelete()
	{
		return (Boolean)eDynamicGet(DataPackage.ASSOCIATION_END__REVERSE_CASCADE_DELETE, DataPackage.Literals.ASSOCIATION_END__REVERSE_CASCADE_DELETE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReverseCascadeDelete(boolean newReverseCascadeDelete)
	{
		eDynamicSet(DataPackage.ASSOCIATION_END__REVERSE_CASCADE_DELETE, DataPackage.Literals.ASSOCIATION_END__REVERSE_CASCADE_DELETE, newReverseCascadeDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnmappedDefaultOnly()
	{
		return (Boolean)eDynamicGet(DataPackage.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY, DataPackage.Literals.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnmappedDefaultOnly(boolean newUnmappedDefaultOnly)
	{
		eDynamicSet(DataPackage.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY, DataPackage.Literals.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY, newUnmappedDefaultOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getOpposite()
	{
		return getTarget() != null ? getTarget().getRelations().stream().filter(r -> org.eclipse.emf.ecore.util.EcoreUtil.equals(r.getTarget(), this)).findAny().orElse(null) : null;
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
			case DataPackage.ASSOCIATION_END__PARTNER:
				if (resolve) return getPartner();
				return basicGetPartner();
			case DataPackage.ASSOCIATION_END__REVERSE_CASCADE_DELETE:
				return isReverseCascadeDelete();
			case DataPackage.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY:
				return isUnmappedDefaultOnly();
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
			case DataPackage.ASSOCIATION_END__PARTNER:
				setPartner((AssociationEnd)newValue);
				return;
			case DataPackage.ASSOCIATION_END__REVERSE_CASCADE_DELETE:
				setReverseCascadeDelete((Boolean)newValue);
				return;
			case DataPackage.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY:
				setUnmappedDefaultOnly((Boolean)newValue);
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
			case DataPackage.ASSOCIATION_END__PARTNER:
				setPartner((AssociationEnd)null);
				return;
			case DataPackage.ASSOCIATION_END__REVERSE_CASCADE_DELETE:
				setReverseCascadeDelete(REVERSE_CASCADE_DELETE_EDEFAULT);
				return;
			case DataPackage.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY:
				setUnmappedDefaultOnly(UNMAPPED_DEFAULT_ONLY_EDEFAULT);
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
			case DataPackage.ASSOCIATION_END__PARTNER:
				return basicGetPartner() != null;
			case DataPackage.ASSOCIATION_END__REVERSE_CASCADE_DELETE:
				return isReverseCascadeDelete() != REVERSE_CASCADE_DELETE_EDEFAULT;
			case DataPackage.ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY:
				return isUnmappedDefaultOnly() != UNMAPPED_DEFAULT_ONLY_EDEFAULT;
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
			case DataPackage.ASSOCIATION_END___GET_OPPOSITE:
				return getOpposite();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssociationEndImpl
