/**
 */
package hu.blackbelt.judo.meta.psm.namespace.impl;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceFactory;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

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
public class NamespaceFactoryImpl extends EFactoryImpl implements NamespaceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static NamespaceFactory init() {
        try {
            NamespaceFactory theNamespaceFactory = (NamespaceFactory)EPackage.Registry.INSTANCE.getEFactory(NamespacePackage.eNS_URI);
            if (theNamespaceFactory != null) {
                return theNamespaceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new NamespaceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespaceFactoryImpl() {
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
            case NamespacePackage.MODEL: return createModel();
            case NamespacePackage.PACKAGE: return createPackage();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public hu.blackbelt.judo.meta.psm.namespace.Package createPackage() {
        PackageImpl package_ = new PackageImpl();
        return package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespacePackage getNamespacePackage() {
        return (NamespacePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static NamespacePackage getPackage() {
        return NamespacePackage.eINSTANCE;
    }

} //NamespaceFactoryImpl
