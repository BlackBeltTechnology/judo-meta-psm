/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage;

import hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl;

import hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage;

import hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;

import hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;

import hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;

import hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.custom.CustomPackage;

import hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage;

import hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage;

import hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.numeric.CountExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAttribute;
import hu.blackbelt.judo.meta.psm.expression.numeric.DecimalOppositeExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.DecimalSwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.DecimalVariableReference;
import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAttribute;
import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerSwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerVariableReference;
import hu.blackbelt.judo.meta.psm.expression.numeric.NumericFactory;
import hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage;
import hu.blackbelt.judo.meta.psm.expression.numeric.RoundExpression;

import hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage;

import hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.operator.OperatorPackage;

import hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.string.StringPackage;

import hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl;

import hu.blackbelt.judo.meta.psm.script.ScriptPackage;

import hu.blackbelt.judo.meta.psm.script.impl.ScriptPackageImpl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl;

import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericPackageImpl extends EPackageImpl implements NumericPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass countExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerAritmeticExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass decimalAritmeticExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerOppositeExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass decimalOppositeExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass decimalAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerAggregatedExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerVariableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass decimalVariableReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass decimalAggregatedExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass roundExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass integerSwitchExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass decimalSwitchExpressionEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private NumericPackageImpl() {
        super(eNS_URI, NumericFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link NumericPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static NumericPackage init() {
        if (isInited) return (NumericPackage)EPackage.Registry.INSTANCE.getEPackage(NumericPackage.eNS_URI);

        // Obtain or create and register package
        NumericPackageImpl theNumericPackage = (NumericPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NumericPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NumericPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
        ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
        DerivedPackageImpl theDerivedPackage = (DerivedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI) instanceof DerivedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI) : DerivedPackage.eINSTANCE);
        ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
        AccesspointPackageImpl theAccesspointPackage = (AccesspointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI) instanceof AccesspointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI) : AccesspointPackage.eINSTANCE);
        ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
        AuthenticationPackageImpl theAuthenticationPackage = (AuthenticationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI) instanceof AuthenticationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI) : AuthenticationPackage.eINSTANCE);
        AuthorizationPackageImpl theAuthorizationPackage = (AuthorizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationPackage.eNS_URI) instanceof AuthorizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationPackage.eNS_URI) : AuthorizationPackage.eINSTANCE);
        ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
        ConstantPackageImpl theConstantPackage = (ConstantPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstantPackage.eNS_URI) instanceof ConstantPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstantPackage.eNS_URI) : ConstantPackage.eINSTANCE);
        VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
        OperatorPackageImpl theOperatorPackage = (OperatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI) instanceof OperatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI) : OperatorPackage.eINSTANCE);
        LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI) instanceof LogicalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI) : LogicalPackage.eINSTANCE);
        StringPackageImpl theStringPackage = (StringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI) instanceof StringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI) : StringPackage.eINSTANCE);
        EnumerationPackageImpl theEnumerationPackage = (EnumerationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) instanceof EnumerationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) : EnumerationPackage.eINSTANCE);
        ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
        CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
        CustomPackageImpl theCustomPackage = (CustomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) instanceof CustomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) : CustomPackage.eINSTANCE);

        // Create package meta-data objects
        theNumericPackage.createPackageContents();
        theNamespacePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theDataPackage.createPackageContents();
        theConstraintPackage.createPackageContents();
        theScriptPackage.createPackageContents();
        theDerivedPackage.createPackageContents();
        theServicePackage.createPackageContents();
        theAccesspointPackage.createPackageContents();
        theViewPackage.createPackageContents();
        theAuthenticationPackage.createPackageContents();
        theAuthorizationPackage.createPackageContents();
        theExpressionPackage.createPackageContents();
        theConstantPackage.createPackageContents();
        theVariablePackage.createPackageContents();
        theOperatorPackage.createPackageContents();
        theLogicalPackage.createPackageContents();
        theStringPackage.createPackageContents();
        theEnumerationPackage.createPackageContents();
        theObjectPackage.createPackageContents();
        theCollectionPackage.createPackageContents();
        theCustomPackage.createPackageContents();

        // Initialize created meta-data
        theNumericPackage.initializePackageContents();
        theNamespacePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theConstraintPackage.initializePackageContents();
        theScriptPackage.initializePackageContents();
        theDerivedPackage.initializePackageContents();
        theServicePackage.initializePackageContents();
        theAccesspointPackage.initializePackageContents();
        theViewPackage.initializePackageContents();
        theAuthenticationPackage.initializePackageContents();
        theAuthorizationPackage.initializePackageContents();
        theExpressionPackage.initializePackageContents();
        theConstantPackage.initializePackageContents();
        theVariablePackage.initializePackageContents();
        theOperatorPackage.initializePackageContents();
        theLogicalPackage.initializePackageContents();
        theStringPackage.initializePackageContents();
        theEnumerationPackage.initializePackageContents();
        theObjectPackage.initializePackageContents();
        theCollectionPackage.initializePackageContents();
        theCustomPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theNumericPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(NumericPackage.eNS_URI, theNumericPackage);
        return theNumericPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCountExpression() {
        return countExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerAritmeticExpression() {
        return integerAritmeticExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIntegerAritmeticExpression_Left() {
        return (EReference)integerAritmeticExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIntegerAritmeticExpression_Right() {
        return (EReference)integerAritmeticExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntegerAritmeticExpression_Operator() {
        return (EAttribute)integerAritmeticExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecimalAritmeticExpression() {
        return decimalAritmeticExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDecimalAritmeticExpression_Left() {
        return (EReference)decimalAritmeticExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDecimalAritmeticExpression_Right() {
        return (EReference)decimalAritmeticExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDecimalAritmeticExpression_Operator() {
        return (EAttribute)decimalAritmeticExpressionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerOppositeExpression() {
        return integerOppositeExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIntegerOppositeExpression_Expression() {
        return (EReference)integerOppositeExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecimalOppositeExpression() {
        return decimalOppositeExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDecimalOppositeExpression_Expression() {
        return (EReference)decimalOppositeExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerAttribute() {
        return integerAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecimalAttribute() {
        return decimalAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerAggregatedExpression() {
        return integerAggregatedExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntegerAggregatedExpression_Operator() {
        return (EAttribute)integerAggregatedExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIntegerAggregatedExpression_Expression() {
        return (EReference)integerAggregatedExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerVariableReference() {
        return integerVariableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIntegerVariableReference_Variable() {
        return (EReference)integerVariableReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecimalVariableReference() {
        return decimalVariableReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDecimalVariableReference_Variable() {
        return (EReference)decimalVariableReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecimalAggregatedExpression() {
        return decimalAggregatedExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDecimalAggregatedExpression_Operator() {
        return (EAttribute)decimalAggregatedExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDecimalAggregatedExpression_Expression() {
        return (EReference)decimalAggregatedExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRoundExpression() {
        return roundExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRoundExpression_Expression() {
        return (EReference)roundExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntegerSwitchExpression() {
        return integerSwitchExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDecimalSwitchExpression() {
        return decimalSwitchExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericFactory getNumericFactory() {
        return (NumericFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        countExpressionEClass = createEClass(COUNT_EXPRESSION);

        integerAritmeticExpressionEClass = createEClass(INTEGER_ARITMETIC_EXPRESSION);
        createEReference(integerAritmeticExpressionEClass, INTEGER_ARITMETIC_EXPRESSION__LEFT);
        createEReference(integerAritmeticExpressionEClass, INTEGER_ARITMETIC_EXPRESSION__RIGHT);
        createEAttribute(integerAritmeticExpressionEClass, INTEGER_ARITMETIC_EXPRESSION__OPERATOR);

        decimalAritmeticExpressionEClass = createEClass(DECIMAL_ARITMETIC_EXPRESSION);
        createEReference(decimalAritmeticExpressionEClass, DECIMAL_ARITMETIC_EXPRESSION__LEFT);
        createEReference(decimalAritmeticExpressionEClass, DECIMAL_ARITMETIC_EXPRESSION__RIGHT);
        createEAttribute(decimalAritmeticExpressionEClass, DECIMAL_ARITMETIC_EXPRESSION__OPERATOR);

        integerOppositeExpressionEClass = createEClass(INTEGER_OPPOSITE_EXPRESSION);
        createEReference(integerOppositeExpressionEClass, INTEGER_OPPOSITE_EXPRESSION__EXPRESSION);

        decimalOppositeExpressionEClass = createEClass(DECIMAL_OPPOSITE_EXPRESSION);
        createEReference(decimalOppositeExpressionEClass, DECIMAL_OPPOSITE_EXPRESSION__EXPRESSION);

        integerAttributeEClass = createEClass(INTEGER_ATTRIBUTE);

        decimalAttributeEClass = createEClass(DECIMAL_ATTRIBUTE);

        integerAggregatedExpressionEClass = createEClass(INTEGER_AGGREGATED_EXPRESSION);
        createEAttribute(integerAggregatedExpressionEClass, INTEGER_AGGREGATED_EXPRESSION__OPERATOR);
        createEReference(integerAggregatedExpressionEClass, INTEGER_AGGREGATED_EXPRESSION__EXPRESSION);

        integerVariableReferenceEClass = createEClass(INTEGER_VARIABLE_REFERENCE);
        createEReference(integerVariableReferenceEClass, INTEGER_VARIABLE_REFERENCE__VARIABLE);

        decimalVariableReferenceEClass = createEClass(DECIMAL_VARIABLE_REFERENCE);
        createEReference(decimalVariableReferenceEClass, DECIMAL_VARIABLE_REFERENCE__VARIABLE);

        decimalAggregatedExpressionEClass = createEClass(DECIMAL_AGGREGATED_EXPRESSION);
        createEAttribute(decimalAggregatedExpressionEClass, DECIMAL_AGGREGATED_EXPRESSION__OPERATOR);
        createEReference(decimalAggregatedExpressionEClass, DECIMAL_AGGREGATED_EXPRESSION__EXPRESSION);

        roundExpressionEClass = createEClass(ROUND_EXPRESSION);
        createEReference(roundExpressionEClass, ROUND_EXPRESSION__EXPRESSION);

        integerSwitchExpressionEClass = createEClass(INTEGER_SWITCH_EXPRESSION);

        decimalSwitchExpressionEClass = createEClass(DECIMAL_SWITCH_EXPRESSION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
        OperatorPackage theOperatorPackage = (OperatorPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI);
        VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        countExpressionEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        countExpressionEClass.getESuperTypes().add(theExpressionPackage.getAggregatedExpression());
        integerAritmeticExpressionEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        decimalAritmeticExpressionEClass.getESuperTypes().add(theExpressionPackage.getDecimalExpression());
        integerOppositeExpressionEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        decimalOppositeExpressionEClass.getESuperTypes().add(theExpressionPackage.getDecimalExpression());
        integerAttributeEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        integerAttributeEClass.getESuperTypes().add(theExpressionPackage.getAttributeSelector());
        decimalAttributeEClass.getESuperTypes().add(theExpressionPackage.getDecimalExpression());
        decimalAttributeEClass.getESuperTypes().add(theExpressionPackage.getAttributeSelector());
        integerAggregatedExpressionEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        integerAggregatedExpressionEClass.getESuperTypes().add(theExpressionPackage.getAggregatedExpression());
        integerVariableReferenceEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        integerVariableReferenceEClass.getESuperTypes().add(theExpressionPackage.getVariableReference());
        decimalVariableReferenceEClass.getESuperTypes().add(theExpressionPackage.getDecimalExpression());
        decimalVariableReferenceEClass.getESuperTypes().add(theExpressionPackage.getVariableReference());
        decimalAggregatedExpressionEClass.getESuperTypes().add(theExpressionPackage.getDecimalExpression());
        decimalAggregatedExpressionEClass.getESuperTypes().add(theExpressionPackage.getAggregatedExpression());
        roundExpressionEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        integerSwitchExpressionEClass.getESuperTypes().add(theExpressionPackage.getSwitchExpression());
        integerSwitchExpressionEClass.getESuperTypes().add(theExpressionPackage.getIntegerExpression());
        decimalSwitchExpressionEClass.getESuperTypes().add(theExpressionPackage.getSwitchExpression());
        decimalSwitchExpressionEClass.getESuperTypes().add(theExpressionPackage.getDecimalExpression());

        // Initialize classes, features, and operations; add parameters
        initEClass(countExpressionEClass, CountExpression.class, "CountExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(integerAritmeticExpressionEClass, IntegerAritmeticExpression.class, "IntegerAritmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIntegerAritmeticExpression_Left(), theExpressionPackage.getIntegerExpression(), null, "left", null, 1, 1, IntegerAritmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIntegerAritmeticExpression_Right(), theExpressionPackage.getIntegerExpression(), null, "right", null, 1, 1, IntegerAritmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIntegerAritmeticExpression_Operator(), theOperatorPackage.getIntegerOperator(), "operator", null, 1, 1, IntegerAritmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(decimalAritmeticExpressionEClass, DecimalAritmeticExpression.class, "DecimalAritmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDecimalAritmeticExpression_Left(), theExpressionPackage.getNumericExpression(), null, "left", null, 0, 1, DecimalAritmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDecimalAritmeticExpression_Right(), theExpressionPackage.getNumericExpression(), null, "right", null, 0, 1, DecimalAritmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDecimalAritmeticExpression_Operator(), theOperatorPackage.getDecimalOperator(), "operator", null, 1, 1, DecimalAritmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(integerOppositeExpressionEClass, IntegerOppositeExpression.class, "IntegerOppositeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIntegerOppositeExpression_Expression(), theExpressionPackage.getIntegerExpression(), null, "expression", null, 1, 1, IntegerOppositeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(decimalOppositeExpressionEClass, DecimalOppositeExpression.class, "DecimalOppositeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDecimalOppositeExpression_Expression(), theExpressionPackage.getDecimalExpression(), null, "expression", null, 1, 1, DecimalOppositeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(integerAttributeEClass, IntegerAttribute.class, "IntegerAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(decimalAttributeEClass, DecimalAttribute.class, "DecimalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(integerAggregatedExpressionEClass, IntegerAggregatedExpression.class, "IntegerAggregatedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntegerAggregatedExpression_Operator(), theOperatorPackage.getIntegerAggregator(), "operator", null, 1, 1, IntegerAggregatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getIntegerAggregatedExpression_Expression(), theExpressionPackage.getIntegerExpression(), null, "expression", null, 1, 1, IntegerAggregatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(integerVariableReferenceEClass, IntegerVariableReference.class, "IntegerVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIntegerVariableReference_Variable(), theVariablePackage.getIntegerVariable(), null, "variable", null, 1, 1, IntegerVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(decimalVariableReferenceEClass, DecimalVariableReference.class, "DecimalVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDecimalVariableReference_Variable(), theVariablePackage.getDecimalVariable(), null, "variable", null, 1, 1, DecimalVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(decimalAggregatedExpressionEClass, DecimalAggregatedExpression.class, "DecimalAggregatedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDecimalAggregatedExpression_Operator(), theOperatorPackage.getDecimalAggregator(), "operator", null, 1, 1, DecimalAggregatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDecimalAggregatedExpression_Expression(), theExpressionPackage.getNumericExpression(), null, "expression", null, 1, 1, DecimalAggregatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(roundExpressionEClass, RoundExpression.class, "RoundExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRoundExpression_Expression(), theExpressionPackage.getDecimalExpression(), null, "expression", null, 1, 1, RoundExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(integerSwitchExpressionEClass, IntegerSwitchExpression.class, "IntegerSwitchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(decimalSwitchExpressionEClass, DecimalSwitchExpression.class, "DecimalSwitchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} //NumericPackageImpl
