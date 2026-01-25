/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl;

import hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType;
import hu.blackbelt.judo.meta.psm.derived.DataExpressionType;
import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl#getGetterExpression <em>Getter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl#getSetterExpression <em>Setter Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PrimitiveAccessorImpl extends PrimitiveTypedElementImpl implements PrimitiveAccessor
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveAccessorImpl()
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
		return DerivedPackage.Literals.PRIMITIVE_ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExpressionType getGetterExpression()
	{
		return (DataExpressionType)eDynamicGet(DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, DerivedPackage.Literals.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetterExpression(DataExpressionType newGetterExpression, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newGetterExpression, DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetterExpression(DataExpressionType newGetterExpression)
	{
		eDynamicSet(DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, DerivedPackage.Literals.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION, newGetterExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeSelectorType getSetterExpression()
	{
		return (AttributeSelectorType)eDynamicGet(DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, DerivedPackage.Literals.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetterExpression(AttributeSelectorType newSetterExpression, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newSetterExpression, DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetterExpression(AttributeSelectorType newSetterExpression)
	{
		eDynamicSet(DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, DerivedPackage.Literals.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION, newSetterExpression);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				return basicSetGetterExpression(null, msgs);
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				return basicSetSetterExpression(null, msgs);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				return getGetterExpression();
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				return getSetterExpression();
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				setGetterExpression((DataExpressionType)newValue);
				return;
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				setSetterExpression((AttributeSelectorType)newValue);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				setGetterExpression((DataExpressionType)null);
				return;
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				setSetterExpression((AttributeSelectorType)null);
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
			case DerivedPackage.PRIMITIVE_ACCESSOR__GETTER_EXPRESSION:
				return getGetterExpression() != null;
			case DerivedPackage.PRIMITIVE_ACCESSOR__SETTER_EXPRESSION:
				return getSetterExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveAccessorImpl
