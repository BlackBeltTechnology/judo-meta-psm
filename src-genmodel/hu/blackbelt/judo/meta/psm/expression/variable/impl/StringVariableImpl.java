/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable.impl;

import hu.blackbelt.judo.meta.psm.expression.variable.StringVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StringVariableImpl extends VariableImpl implements StringVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.STRING_VARIABLE;
    }

} //StringVariableImpl
