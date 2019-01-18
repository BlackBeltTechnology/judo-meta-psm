/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant.impl;

import hu.blackbelt.judo.meta.psm.expression.constant.Constant;
import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConstantImpl extends MinimalEObjectImpl.Container implements Constant {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConstantPackage.Literals.CONSTANT;
    }

} //ConstantImpl
