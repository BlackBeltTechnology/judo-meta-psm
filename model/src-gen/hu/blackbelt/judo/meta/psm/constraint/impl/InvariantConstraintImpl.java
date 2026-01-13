/**
 */
package hu.blackbelt.judo.meta.psm.constraint.impl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;
import hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint;

import hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvariantConstraintImpl extends NamedElementImpl implements InvariantConstraint
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantConstraintImpl()
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
		return ConstraintPackage.Literals.INVARIANT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpressionType getExpression()
	{
		return (LogicalExpressionType)eDynamicGet(ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, ConstraintPackage.Literals.INVARIANT_CONSTRAINT__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(LogicalExpressionType newExpression, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(LogicalExpressionType newExpression)
	{
		eDynamicSet(ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION, ConstraintPackage.Literals.INVARIANT_CONSTRAINT__EXPRESSION, newExpression);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				return getExpression();
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				setExpression((LogicalExpressionType)newValue);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				setExpression((LogicalExpressionType)null);
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
			case ConstraintPackage.INVARIANT_CONSTRAINT__EXPRESSION:
				return getExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //InvariantConstraintImpl
