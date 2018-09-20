/**
 */
package hu.blackbelt.judo.meta.psm.behavior.impl;

import hu.blackbelt.judo.meta.psm.behavior.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BehaviorFactory init() {
        try {
            BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorPackage.eNS_URI);
            if (theBehaviorFactory != null) {
                return theBehaviorFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BehaviorFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case BehaviorPackage.CASCADE_REFERENCES: return createCascadeReferences();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CascadeReferences createCascadeReferences() {
        CascadeReferencesImpl cascadeReferences = new CascadeReferencesImpl();
        return cascadeReferences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorPackage getBehaviorPackage() {
        return (BehaviorPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static BehaviorPackage getPackage() {
        return BehaviorPackage.eINSTANCE;
    }

} //BehaviorFactoryImpl
