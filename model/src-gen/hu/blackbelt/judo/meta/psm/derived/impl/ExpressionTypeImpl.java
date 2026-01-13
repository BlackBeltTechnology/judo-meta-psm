/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.ExpressionDialect;
import hu.blackbelt.judo.meta.psm.derived.ExpressionType;

import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionTypeImpl extends MinimalEObjectImpl.Container implements ExpressionType
{
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected static final ExpressionDialect DIALECT_EDEFAULT = ExpressionDialect.JQL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionTypeImpl()
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
		return DerivedPackage.Literals.EXPRESSION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression()
	{
		return (String)eDynamicGet(DerivedPackage.EXPRESSION_TYPE__EXPRESSION, DerivedPackage.Literals.EXPRESSION_TYPE__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression)
	{
		eDynamicSet(DerivedPackage.EXPRESSION_TYPE__EXPRESSION, DerivedPackage.Literals.EXPRESSION_TYPE__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionDialect getDialect()
	{
		return (ExpressionDialect)eDynamicGet(DerivedPackage.EXPRESSION_TYPE__DIALECT, DerivedPackage.Literals.EXPRESSION_TYPE__DIALECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDialect(ExpressionDialect newDialect)
	{
		eDynamicSet(DerivedPackage.EXPRESSION_TYPE__DIALECT, DerivedPackage.Literals.EXPRESSION_TYPE__DIALECT, newDialect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectType getParameterType()
	{
		return (TransferObjectType)eDynamicGet(DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE, DerivedPackage.Literals.EXPRESSION_TYPE__PARAMETER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetParameterType()
	{
		return (TransferObjectType)eDynamicGet(DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE, DerivedPackage.Literals.EXPRESSION_TYPE__PARAMETER_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterType(TransferObjectType newParameterType)
	{
		eDynamicSet(DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE, DerivedPackage.Literals.EXPRESSION_TYPE__PARAMETER_TYPE, newParameterType);
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
			case DerivedPackage.EXPRESSION_TYPE__EXPRESSION:
				return getExpression();
			case DerivedPackage.EXPRESSION_TYPE__DIALECT:
				return getDialect();
			case DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
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
			case DerivedPackage.EXPRESSION_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case DerivedPackage.EXPRESSION_TYPE__DIALECT:
				setDialect((ExpressionDialect)newValue);
				return;
			case DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE:
				setParameterType((TransferObjectType)newValue);
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
			case DerivedPackage.EXPRESSION_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case DerivedPackage.EXPRESSION_TYPE__DIALECT:
				setDialect(DIALECT_EDEFAULT);
				return;
			case DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE:
				setParameterType((TransferObjectType)null);
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
			case DerivedPackage.EXPRESSION_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
			case DerivedPackage.EXPRESSION_TYPE__DIALECT:
				return getDialect() != DIALECT_EDEFAULT;
			case DerivedPackage.EXPRESSION_TYPE__PARAMETER_TYPE:
				return basicGetParameterType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionTypeImpl
