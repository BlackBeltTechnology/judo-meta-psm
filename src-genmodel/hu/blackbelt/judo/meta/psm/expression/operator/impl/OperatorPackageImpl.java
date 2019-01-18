/**
 */
package hu.blackbelt.judo.meta.psm.expression.operator.impl;

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

import hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage;

import hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage;

import hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator;
import hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator;
import hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator;
import hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator;
import hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator;
import hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator;
import hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator;
import hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator;
import hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector;
import hu.blackbelt.judo.meta.psm.expression.operator.OperatorFactory;
import hu.blackbelt.judo.meta.psm.expression.operator.OperatorPackage;
import hu.blackbelt.judo.meta.psm.expression.operator.StringComparator;

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

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorPackageImpl extends EPackageImpl implements OperatorPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum stringComparatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum logicalOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum objectSelectorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum integerOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum decimalOperatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum integerComparatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum decimalComparatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum integerAggregatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum decimalAggregatorEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum objectComparatorEEnum = null;

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
     * @see hu.blackbelt.judo.meta.psm.expression.operator.OperatorPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private OperatorPackageImpl() {
        super(eNS_URI, OperatorFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link OperatorPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static OperatorPackage init() {
        if (isInited) return (OperatorPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI);

        // Obtain or create and register package
        OperatorPackageImpl theOperatorPackage = (OperatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperatorPackageImpl());

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
        NumericPackageImpl theNumericPackage = (NumericPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NumericPackage.eNS_URI) instanceof NumericPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NumericPackage.eNS_URI) : NumericPackage.eINSTANCE);
        LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI) instanceof LogicalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI) : LogicalPackage.eINSTANCE);
        StringPackageImpl theStringPackage = (StringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI) instanceof StringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI) : StringPackage.eINSTANCE);
        EnumerationPackageImpl theEnumerationPackage = (EnumerationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) instanceof EnumerationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) : EnumerationPackage.eINSTANCE);
        ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
        CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
        CustomPackageImpl theCustomPackage = (CustomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) instanceof CustomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) : CustomPackage.eINSTANCE);

        // Create package meta-data objects
        theOperatorPackage.createPackageContents();
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
        theNumericPackage.createPackageContents();
        theLogicalPackage.createPackageContents();
        theStringPackage.createPackageContents();
        theEnumerationPackage.createPackageContents();
        theObjectPackage.createPackageContents();
        theCollectionPackage.createPackageContents();
        theCustomPackage.createPackageContents();

        // Initialize created meta-data
        theOperatorPackage.initializePackageContents();
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
        theNumericPackage.initializePackageContents();
        theLogicalPackage.initializePackageContents();
        theStringPackage.initializePackageContents();
        theEnumerationPackage.initializePackageContents();
        theObjectPackage.initializePackageContents();
        theCollectionPackage.initializePackageContents();
        theCustomPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theOperatorPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(OperatorPackage.eNS_URI, theOperatorPackage);
        return theOperatorPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getStringComparator() {
        return stringComparatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLogicalOperator() {
        return logicalOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getObjectSelector() {
        return objectSelectorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIntegerOperator() {
        return integerOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDecimalOperator() {
        return decimalOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIntegerComparator() {
        return integerComparatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDecimalComparator() {
        return decimalComparatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIntegerAggregator() {
        return integerAggregatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDecimalAggregator() {
        return decimalAggregatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getObjectComparator() {
        return objectComparatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatorFactory getOperatorFactory() {
        return (OperatorFactory)getEFactoryInstance();
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

        // Create enums
        stringComparatorEEnum = createEEnum(STRING_COMPARATOR);
        logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
        objectSelectorEEnum = createEEnum(OBJECT_SELECTOR);
        integerOperatorEEnum = createEEnum(INTEGER_OPERATOR);
        decimalOperatorEEnum = createEEnum(DECIMAL_OPERATOR);
        integerComparatorEEnum = createEEnum(INTEGER_COMPARATOR);
        decimalComparatorEEnum = createEEnum(DECIMAL_COMPARATOR);
        integerAggregatorEEnum = createEEnum(INTEGER_AGGREGATOR);
        decimalAggregatorEEnum = createEEnum(DECIMAL_AGGREGATOR);
        objectComparatorEEnum = createEEnum(OBJECT_COMPARATOR);
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

        // Initialize enums and add enum literals
        initEEnum(stringComparatorEEnum, StringComparator.class, "StringComparator");
        addEEnumLiteral(stringComparatorEEnum, StringComparator.LESS_THAN);
        addEEnumLiteral(stringComparatorEEnum, StringComparator.GREATER_THAN);
        addEEnumLiteral(stringComparatorEEnum, StringComparator.LESS_OR_EQUAL);
        addEEnumLiteral(stringComparatorEEnum, StringComparator.GREATER_OR_EQUAL);
        addEEnumLiteral(stringComparatorEEnum, StringComparator.EQUAL);
        addEEnumLiteral(stringComparatorEEnum, StringComparator.NOT_EQUAL);
        addEEnumLiteral(stringComparatorEEnum, StringComparator.MATCHES);

        initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
        addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
        addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
        addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);
        addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.IMPLIES);

        initEEnum(objectSelectorEEnum, ObjectSelector.class, "ObjectSelector");
        addEEnumLiteral(objectSelectorEEnum, ObjectSelector.HEAD);
        addEEnumLiteral(objectSelectorEEnum, ObjectSelector.TAIL);

        initEEnum(integerOperatorEEnum, IntegerOperator.class, "IntegerOperator");
        addEEnumLiteral(integerOperatorEEnum, IntegerOperator.ADD);
        addEEnumLiteral(integerOperatorEEnum, IntegerOperator.SUBSTRACT);
        addEEnumLiteral(integerOperatorEEnum, IntegerOperator.MULTIPLY);
        addEEnumLiteral(integerOperatorEEnum, IntegerOperator.MODULO);
        addEEnumLiteral(integerOperatorEEnum, IntegerOperator.DIVIDE);

        initEEnum(decimalOperatorEEnum, DecimalOperator.class, "DecimalOperator");
        addEEnumLiteral(decimalOperatorEEnum, DecimalOperator.ADD);
        addEEnumLiteral(decimalOperatorEEnum, DecimalOperator.SUBSTRACT);
        addEEnumLiteral(decimalOperatorEEnum, DecimalOperator.MULTIPLY);
        addEEnumLiteral(decimalOperatorEEnum, DecimalOperator.DIVIDE);

        initEEnum(integerComparatorEEnum, IntegerComparator.class, "IntegerComparator");
        addEEnumLiteral(integerComparatorEEnum, IntegerComparator.LESS_THAN);
        addEEnumLiteral(integerComparatorEEnum, IntegerComparator.GREATER_THAN);
        addEEnumLiteral(integerComparatorEEnum, IntegerComparator.LESS_OR_EQUAL);
        addEEnumLiteral(integerComparatorEEnum, IntegerComparator.GREATER_OR_EQUAL);
        addEEnumLiteral(integerComparatorEEnum, IntegerComparator.EQUAL);
        addEEnumLiteral(integerComparatorEEnum, IntegerComparator.NOT_EQUAL);

        initEEnum(decimalComparatorEEnum, DecimalComparator.class, "DecimalComparator");
        addEEnumLiteral(decimalComparatorEEnum, DecimalComparator.LESS_THAN);
        addEEnumLiteral(decimalComparatorEEnum, DecimalComparator.GREATER_THAN);

        initEEnum(integerAggregatorEEnum, IntegerAggregator.class, "IntegerAggregator");
        addEEnumLiteral(integerAggregatorEEnum, IntegerAggregator.MIN);
        addEEnumLiteral(integerAggregatorEEnum, IntegerAggregator.MAX);
        addEEnumLiteral(integerAggregatorEEnum, IntegerAggregator.SUM);

        initEEnum(decimalAggregatorEEnum, DecimalAggregator.class, "DecimalAggregator");
        addEEnumLiteral(decimalAggregatorEEnum, DecimalAggregator.MIN);
        addEEnumLiteral(decimalAggregatorEEnum, DecimalAggregator.MAX);
        addEEnumLiteral(decimalAggregatorEEnum, DecimalAggregator.AVG);
        addEEnumLiteral(decimalAggregatorEEnum, DecimalAggregator.SUM);

        initEEnum(objectComparatorEEnum, ObjectComparator.class, "ObjectComparator");
        addEEnumLiteral(objectComparatorEEnum, ObjectComparator.EQUAL);
        addEEnumLiteral(objectComparatorEEnum, ObjectComparator.NOT_EQUAL);
    }

} //OperatorPackageImpl
