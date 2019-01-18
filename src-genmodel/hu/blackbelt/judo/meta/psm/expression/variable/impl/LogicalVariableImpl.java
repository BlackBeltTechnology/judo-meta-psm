/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable.impl;

import hu.blackbelt.judo.meta.psm.expression.variable.LogicalVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LogicalVariableImpl extends VariableImpl implements LogicalVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogicalVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.LOGICAL_VARIABLE;
    }

} //LogicalVariableImpl
