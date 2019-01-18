/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.derived.*;

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
public class DerivedFactoryImpl extends EFactoryImpl implements DerivedFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DerivedFactory init() {
        try {
            DerivedFactory theDerivedFactory = (DerivedFactory)EPackage.Registry.INSTANCE.getEFactory(DerivedPackage.eNS_URI);
            if (theDerivedFactory != null) {
                return theDerivedFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DerivedFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DerivedFactoryImpl() {
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
            case DerivedPackage.DATA_PROPERTY: return createDataProperty();
            case DerivedPackage.NAVIGATION_PROPERTY: return createNavigationProperty();
            case DerivedPackage.STATIC_NAVIGATION: return createStaticNavigation();
            case DerivedPackage.STATIC_DATA: return createStaticData();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataProperty createDataProperty() {
        DataPropertyImpl dataProperty = new DataPropertyImpl();
        return dataProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NavigationProperty createNavigationProperty() {
        NavigationPropertyImpl navigationProperty = new NavigationPropertyImpl();
        return navigationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticNavigation createStaticNavigation() {
        StaticNavigationImpl staticNavigation = new StaticNavigationImpl();
        return staticNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticData createStaticData() {
        StaticDataImpl staticData = new StaticDataImpl();
        return staticData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DerivedPackage getDerivedPackage() {
        return (DerivedPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DerivedPackage getPackage() {
        return DerivedPackage.eINSTANCE;
    }

} //DerivedFactoryImpl
