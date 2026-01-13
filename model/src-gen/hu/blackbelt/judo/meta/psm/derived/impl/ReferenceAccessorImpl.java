/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor;
import hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType;
import hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl#getGetterExpression <em>Getter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl#getSetterExpression <em>Setter Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceAccessorImpl extends ReferenceTypedElementImpl implements ReferenceAccessor
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceAccessorImpl()
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
		return DerivedPackage.Literals.REFERENCE_ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceExpressionType getGetterExpression()
	{
		return (ReferenceExpressionType)eDynamicGet(DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, DerivedPackage.Literals.REFERENCE_ACCESSOR__GETTER_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetterExpression(ReferenceExpressionType newGetterExpression, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newGetterExpression, DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetterExpression(ReferenceExpressionType newGetterExpression)
	{
		eDynamicSet(DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, DerivedPackage.Literals.REFERENCE_ACCESSOR__GETTER_EXPRESSION, newGetterExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceSelectorType getSetterExpression()
	{
		return (ReferenceSelectorType)eDynamicGet(DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, DerivedPackage.Literals.REFERENCE_ACCESSOR__SETTER_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetterExpression(ReferenceSelectorType newSetterExpression, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newSetterExpression, DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetterExpression(ReferenceSelectorType newSetterExpression)
	{
		eDynamicSet(DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, DerivedPackage.Literals.REFERENCE_ACCESSOR__SETTER_EXPRESSION, newSetterExpression);
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
			case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
				return basicSetGetterExpression(null, msgs);
			case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
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
			case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
				return getGetterExpression();
			case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
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
			case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
				setGetterExpression((ReferenceExpressionType)newValue);
				return;
			case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
				setSetterExpression((ReferenceSelectorType)newValue);
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
			case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
				setGetterExpression((ReferenceExpressionType)null);
				return;
			case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
				setSetterExpression((ReferenceSelectorType)null);
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
			case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
				return getGetterExpression() != null;
			case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
				return getSetterExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceAccessorImpl
