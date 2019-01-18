/**
 */
package hu.blackbelt.judo.meta.psm.expression.string.impl;

import hu.blackbelt.judo.meta.psm.expression.string.*;

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
public class StringFactoryImpl extends EFactoryImpl implements StringFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StringFactory init() {
        try {
            StringFactory theStringFactory = (StringFactory)EPackage.Registry.INSTANCE.getEFactory(StringPackage.eNS_URI);
            if (theStringFactory != null) {
                return theStringFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StringFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringFactoryImpl() {
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
            case StringPackage.STRING_ATTRIBUTE: return createStringAttribute();
            case StringPackage.STRING_VARIABLE_REFERENCE: return createStringVariableReference();
            case StringPackage.CONCATENATE: return createConcatenate();
            case StringPackage.LOWER_CASE: return createLowerCase();
            case StringPackage.UPPER_CASE: return createUpperCase();
            case StringPackage.LENGTH: return createLength();
            case StringPackage.SUB_STRING: return createSubString();
            case StringPackage.POSITION: return createPosition();
            case StringPackage.REPLACE: return createReplace();
            case StringPackage.TRIM: return createTrim();
            case StringPackage.STRING_SWITCH_EXPRESSION: return createStringSwitchExpression();
            case StringPackage.CONCATENATE_COLLECTION: return createConcatenateCollection();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringAttribute createStringAttribute() {
        StringAttributeImpl stringAttribute = new StringAttributeImpl();
        return stringAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringVariableReference createStringVariableReference() {
        StringVariableReferenceImpl stringVariableReference = new StringVariableReferenceImpl();
        return stringVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Concatenate createConcatenate() {
        ConcatenateImpl concatenate = new ConcatenateImpl();
        return concatenate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LowerCase createLowerCase() {
        LowerCaseImpl lowerCase = new LowerCaseImpl();
        return lowerCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UpperCase createUpperCase() {
        UpperCaseImpl upperCase = new UpperCaseImpl();
        return upperCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Length createLength() {
        LengthImpl length = new LengthImpl();
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubString createSubString() {
        SubStringImpl subString = new SubStringImpl();
        return subString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Position createPosition() {
        PositionImpl position = new PositionImpl();
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Replace createReplace() {
        ReplaceImpl replace = new ReplaceImpl();
        return replace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Trim createTrim() {
        TrimImpl trim = new TrimImpl();
        return trim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringSwitchExpression createStringSwitchExpression() {
        StringSwitchExpressionImpl stringSwitchExpression = new StringSwitchExpressionImpl();
        return stringSwitchExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcatenateCollection createConcatenateCollection() {
        ConcatenateCollectionImpl concatenateCollection = new ConcatenateCollectionImpl();
        return concatenateCollection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringPackage getStringPackage() {
        return (StringPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StringPackage getPackage() {
        return StringPackage.eINSTANCE;
    }

} //StringFactoryImpl
