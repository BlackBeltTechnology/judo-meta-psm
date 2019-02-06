/**
 */
package hu.blackbelt.judo.meta.psm.expression.impl;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ReferenceSelectorImpl extends NavigationExpressionImpl implements ReferenceSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.REFERENCE_SELECTOR;
	}

} //ReferenceSelectorImpl
