/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric.impl;

import hu.blackbelt.judo.meta.psm.expression.impl.AttributeSelectorImpl;

import hu.blackbelt.judo.meta.psm.expression.numeric.NumericAttribute;
import hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumericAttributeImpl extends AttributeSelectorImpl implements NumericAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NumericPackage.Literals.NUMERIC_ATTRIBUTE;
	}

} //NumericAttributeImpl
