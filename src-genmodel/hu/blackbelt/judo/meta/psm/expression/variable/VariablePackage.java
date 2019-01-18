/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.variable.VariableFactory
 * @model kind="package"
 * @generated
 */
public interface VariablePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "variable";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/expression/variable";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "var";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablePackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = 0;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.LogicalVariableImpl <em>Logical Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.LogicalVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getLogicalVariable()
     * @generated
     */
    int LOGICAL_VARIABLE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGICAL_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Logical Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGICAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Logical Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGICAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.StringVariableImpl <em>String Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.StringVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getStringVariable()
     * @generated
     */
    int STRING_VARIABLE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>String Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>String Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.EnumerationVariableImpl <em>Enumeration Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.EnumerationVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getEnumerationVariable()
     * @generated
     */
    int ENUMERATION_VARIABLE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The feature id for the '<em><b>Element Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_VARIABLE__ELEMENT_NAME = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Enumeration Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Enumeration Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.ObjectVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getObjectVariable()
     * @generated
     */
    int OBJECT_VARIABLE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Object Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Object Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.CollectionVariableImpl <em>Collection Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.CollectionVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getCollectionVariable()
     * @generated
     */
    int COLLECTION_VARIABLE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Collection Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Collection Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLLECTION_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.IntegerVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getIntegerVariable()
     * @generated
     */
    int INTEGER_VARIABLE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Integer Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Integer Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.DecimalVariableImpl <em>Decimal Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.DecimalVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getDecimalVariable()
     * @generated
     */
    int DECIMAL_VARIABLE = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Decimal Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Decimal Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECIMAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.CustomVariableImpl <em>Custom Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.CustomVariableImpl
     * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getCustomVariable()
     * @generated
     */
    int CUSTOM_VARIABLE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_VARIABLE__NAME = VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Custom Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Custom Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.variable.Variable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.Variable#getName()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Name();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.LogicalVariable <em>Logical Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logical Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.LogicalVariable
     * @generated
     */
    EClass getLogicalVariable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.StringVariable <em>String Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.StringVariable
     * @generated
     */
    EClass getStringVariable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable <em>Enumeration Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable
     * @generated
     */
    EClass getEnumerationVariable();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable#getElementName <em>Element Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Element Name</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable#getElementName()
     * @see #getEnumerationVariable()
     * @generated
     */
    EReference getEnumerationVariable_ElementName();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable <em>Object Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable
     * @generated
     */
    EClass getObjectVariable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.CollectionVariable <em>Collection Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Collection Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.CollectionVariable
     * @generated
     */
    EClass getCollectionVariable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.IntegerVariable <em>Integer Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.IntegerVariable
     * @generated
     */
    EClass getIntegerVariable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.DecimalVariable <em>Decimal Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Decimal Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.DecimalVariable
     * @generated
     */
    EClass getDecimalVariable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.variable.CustomVariable <em>Custom Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Variable</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.CustomVariable
     * @generated
     */
    EClass getCustomVariable();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VariableFactory getVariableFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getVariable()
         * @generated
         */
        EClass VARIABLE = eINSTANCE.getVariable();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.LogicalVariableImpl <em>Logical Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.LogicalVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getLogicalVariable()
         * @generated
         */
        EClass LOGICAL_VARIABLE = eINSTANCE.getLogicalVariable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.StringVariableImpl <em>String Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.StringVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getStringVariable()
         * @generated
         */
        EClass STRING_VARIABLE = eINSTANCE.getStringVariable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.EnumerationVariableImpl <em>Enumeration Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.EnumerationVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getEnumerationVariable()
         * @generated
         */
        EClass ENUMERATION_VARIABLE = eINSTANCE.getEnumerationVariable();

        /**
         * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION_VARIABLE__ELEMENT_NAME = eINSTANCE.getEnumerationVariable_ElementName();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.ObjectVariableImpl <em>Object Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.ObjectVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getObjectVariable()
         * @generated
         */
        EClass OBJECT_VARIABLE = eINSTANCE.getObjectVariable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.CollectionVariableImpl <em>Collection Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.CollectionVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getCollectionVariable()
         * @generated
         */
        EClass COLLECTION_VARIABLE = eINSTANCE.getCollectionVariable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.IntegerVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getIntegerVariable()
         * @generated
         */
        EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.DecimalVariableImpl <em>Decimal Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.DecimalVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getDecimalVariable()
         * @generated
         */
        EClass DECIMAL_VARIABLE = eINSTANCE.getDecimalVariable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.variable.impl.CustomVariableImpl <em>Custom Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.CustomVariableImpl
         * @see hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl#getCustomVariable()
         * @generated
         */
        EClass CUSTOM_VARIABLE = eINSTANCE.getCustomVariable();

    }

} //VariablePackage
