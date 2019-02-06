/**
 */
package hu.blackbelt.judo.meta.psm.expression.enumeration.impl;

import hu.blackbelt.judo.meta.psm.expression.TypeName;

import hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage;
import hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression;

import hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationSwitchExpressionImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationSwitchExpressionImpl extends SwitchExpressionImpl implements EnumerationSwitchExpression {
	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected TypeName elementName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationSwitchExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnumerationPackage.Literals.ENUMERATION_SWITCH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName getElementName() {
		if (elementName != null && elementName.eIsProxy()) {
			InternalEObject oldElementName = (InternalEObject)elementName;
			elementName = (TypeName)eResolveProxy(oldElementName);
			if (elementName != oldElementName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME, oldElementName, elementName));
			}
		}
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName basicGetElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(TypeName newElementName) {
		TypeName oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME:
				if (resolve) return getElementName();
				return basicGetElementName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME:
				setElementName((TypeName)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME:
				setElementName((TypeName)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME:
				return elementName != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationSwitchExpressionImpl
