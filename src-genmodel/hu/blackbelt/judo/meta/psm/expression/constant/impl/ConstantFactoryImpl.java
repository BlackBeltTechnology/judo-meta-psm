/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant.impl;

import hu.blackbelt.judo.meta.psm.expression.constant.ConstantFactory;
import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;
import hu.blackbelt.judo.meta.psm.expression.constant.CustomData;
import hu.blackbelt.judo.meta.psm.expression.constant.Decimal;
import hu.blackbelt.judo.meta.psm.expression.constant.Instance;
import hu.blackbelt.judo.meta.psm.expression.constant.Literal;

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
public class ConstantFactoryImpl extends EFactoryImpl implements ConstantFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ConstantFactory init() {
        try {
            ConstantFactory theConstantFactory = (ConstantFactory)EPackage.Registry.INSTANCE.getEFactory(ConstantPackage.eNS_URI);
            if (theConstantFactory != null) {
                return theConstantFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ConstantFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantFactoryImpl() {
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
            case ConstantPackage.INTEGER: return createInteger();
            case ConstantPackage.DECIMAL: return createDecimal();
            case ConstantPackage.BOOLEAN: return createBoolean();
            case ConstantPackage.STRING: return createString();
            case ConstantPackage.LITERAL: return createLiteral();
            case ConstantPackage.INSTANCE: return createInstance();
            case ConstantPackage.CUSTOM_DATA: return createCustomData();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public hu.blackbelt.judo.meta.psm.expression.constant.Integer createInteger() {
        IntegerImpl integer = new IntegerImpl();
        return integer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Decimal createDecimal() {
        DecimalImpl decimal = new DecimalImpl();
        return decimal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public hu.blackbelt.judo.meta.psm.expression.constant.Boolean createBoolean() {
        BooleanImpl boolean_ = new BooleanImpl();
        return boolean_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public hu.blackbelt.judo.meta.psm.expression.constant.String createString() {
        StringImpl string = new StringImpl();
        return string;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Literal createLiteral() {
        LiteralImpl literal = new LiteralImpl();
        return literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Instance createInstance() {
        InstanceImpl instance = new InstanceImpl();
        return instance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomData createCustomData() {
        CustomDataImpl customData = new CustomDataImpl();
        return customData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantPackage getConstantPackage() {
        return (ConstantPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ConstantPackage getPackage() {
        return ConstantPackage.eINSTANCE;
    }

} //ConstantFactoryImpl
