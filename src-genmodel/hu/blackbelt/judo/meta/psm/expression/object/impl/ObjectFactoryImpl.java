/**
 */
package hu.blackbelt.judo.meta.psm.expression.object.impl;

import hu.blackbelt.judo.meta.psm.expression.object.*;

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
public class ObjectFactoryImpl extends EFactoryImpl implements ObjectFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ObjectFactory init() {
        try {
            ObjectFactory theObjectFactory = (ObjectFactory)EPackage.Registry.INSTANCE.getEFactory(ObjectPackage.eNS_URI);
            if (theObjectFactory != null) {
                return theObjectFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ObjectFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectFactoryImpl() {
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
            case ObjectPackage.OBJECT_NAVIGATION_EXPRESSION: return createObjectNavigationExpression();
            case ObjectPackage.OBJECT_SELECTOR_EXPRESSION: return createObjectSelectorExpression();
            case ObjectPackage.OBJECT_FILTER_EXPRESSION: return createObjectFilterExpression();
            case ObjectPackage.OBJECT_VARIABLE_REFERENCE: return createObjectVariableReference();
            case ObjectPackage.CAST_OBJECT: return createCastObject();
            case ObjectPackage.OBJECT_SWITCH_EXPRESSION: return createObjectSwitchExpression();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectNavigationExpression createObjectNavigationExpression() {
        ObjectNavigationExpressionImpl objectNavigationExpression = new ObjectNavigationExpressionImpl();
        return objectNavigationExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectSelectorExpression createObjectSelectorExpression() {
        ObjectSelectorExpressionImpl objectSelectorExpression = new ObjectSelectorExpressionImpl();
        return objectSelectorExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectFilterExpression createObjectFilterExpression() {
        ObjectFilterExpressionImpl objectFilterExpression = new ObjectFilterExpressionImpl();
        return objectFilterExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectVariableReference createObjectVariableReference() {
        ObjectVariableReferenceImpl objectVariableReference = new ObjectVariableReferenceImpl();
        return objectVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CastObject createCastObject() {
        CastObjectImpl castObject = new CastObjectImpl();
        return castObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectSwitchExpression createObjectSwitchExpression() {
        ObjectSwitchExpressionImpl objectSwitchExpression = new ObjectSwitchExpressionImpl();
        return objectSwitchExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectPackage getObjectPackage() {
        return (ObjectPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ObjectPackage getPackage() {
        return ObjectPackage.eINSTANCE;
    }

} //ObjectFactoryImpl
