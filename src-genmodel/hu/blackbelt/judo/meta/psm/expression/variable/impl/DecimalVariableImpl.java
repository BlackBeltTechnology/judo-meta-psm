/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable.impl;

import hu.blackbelt.judo.meta.psm.expression.variable.DecimalVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DecimalVariableImpl extends VariableImpl implements DecimalVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DecimalVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.DECIMAL_VARIABLE;
    }

} //DecimalVariableImpl
