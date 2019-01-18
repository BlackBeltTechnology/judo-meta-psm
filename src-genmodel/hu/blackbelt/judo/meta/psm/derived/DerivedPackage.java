/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

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
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedFactory
 * @model kind="package"
 * @generated
 */
public interface DerivedPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "derived";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/derived";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "derived";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DerivedPackage eINSTANCE = hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl <em>Primitive Accessor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getPrimitiveAccessor()
     * @generated
     */
    int PRIMITIVE_ACCESSOR = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_ACCESSOR__NAME = DataPackage.PRIMITIVE_TYPED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_ACCESSOR__DATA_TYPE = DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_ACCESSOR__GETTER_EXPRESSION = DataPackage.PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_ACCESSOR__SETTER_EXPRESSION = DataPackage.PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Primitive Accessor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_ACCESSOR_FEATURE_COUNT = DataPackage.PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Primitive Accessor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_ACCESSOR_OPERATION_COUNT = DataPackage.PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl <em>Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getDataProperty()
     * @generated
     */
    int DATA_PROPERTY = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY__NAME = PRIMITIVE_ACCESSOR__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY__DATA_TYPE = PRIMITIVE_ACCESSOR__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY__GETTER_EXPRESSION = PRIMITIVE_ACCESSOR__GETTER_EXPRESSION;

    /**
     * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY__SETTER_EXPRESSION = PRIMITIVE_ACCESSOR__SETTER_EXPRESSION;

    /**
     * The number of structural features of the '<em>Data Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY_FEATURE_COUNT = PRIMITIVE_ACCESSOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PROPERTY_OPERATION_COUNT = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl <em>Reference Accessor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceAccessor()
     * @generated
     */
    int REFERENCE_ACCESSOR = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR__NAME = DataPackage.REFERENCE_TYPED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR__TARGET = DataPackage.REFERENCE_TYPED_ELEMENT__TARGET;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR__CARDINALITY = DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY;

    /**
     * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR__GETTER_EXPRESSION = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR__SETTER_EXPRESSION = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Range Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR__RANGE_EXPRESSION = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Reference Accessor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR_FEATURE_COUNT = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Reference Accessor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_ACCESSOR_OPERATION_COUNT = DataPackage.REFERENCE_TYPED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl <em>Navigation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getNavigationProperty()
     * @generated
     */
    int NAVIGATION_PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY__NAME = REFERENCE_ACCESSOR__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY__TARGET = REFERENCE_ACCESSOR__TARGET;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY__CARDINALITY = REFERENCE_ACCESSOR__CARDINALITY;

    /**
     * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY__GETTER_EXPRESSION = REFERENCE_ACCESSOR__GETTER_EXPRESSION;

    /**
     * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY__SETTER_EXPRESSION = REFERENCE_ACCESSOR__SETTER_EXPRESSION;

    /**
     * The feature id for the '<em><b>Range Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY__RANGE_EXPRESSION = REFERENCE_ACCESSOR__RANGE_EXPRESSION;

    /**
     * The number of structural features of the '<em>Navigation Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY_FEATURE_COUNT = REFERENCE_ACCESSOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Navigation Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_PROPERTY_OPERATION_COUNT = REFERENCE_ACCESSOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl <em>Static Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticNavigation()
     * @generated
     */
    int STATIC_NAVIGATION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION__NAME = REFERENCE_ACCESSOR__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION__TARGET = REFERENCE_ACCESSOR__TARGET;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION__CARDINALITY = REFERENCE_ACCESSOR__CARDINALITY;

    /**
     * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION__GETTER_EXPRESSION = REFERENCE_ACCESSOR__GETTER_EXPRESSION;

    /**
     * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION__SETTER_EXPRESSION = REFERENCE_ACCESSOR__SETTER_EXPRESSION;

    /**
     * The feature id for the '<em><b>Range Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION__RANGE_EXPRESSION = REFERENCE_ACCESSOR__RANGE_EXPRESSION;

    /**
     * The number of structural features of the '<em>Static Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION_FEATURE_COUNT = REFERENCE_ACCESSOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Static Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_NAVIGATION_OPERATION_COUNT = REFERENCE_ACCESSOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl <em>Static Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl
     * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticData()
     * @generated
     */
    int STATIC_DATA = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__NAME = PRIMITIVE_ACCESSOR__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__DATA_TYPE = PRIMITIVE_ACCESSOR__DATA_TYPE;

    /**
     * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__GETTER_EXPRESSION = PRIMITIVE_ACCESSOR__GETTER_EXPRESSION;

    /**
     * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA__SETTER_EXPRESSION = PRIMITIVE_ACCESSOR__SETTER_EXPRESSION;

    /**
     * The number of structural features of the '<em>Static Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_FEATURE_COUNT = PRIMITIVE_ACCESSOR_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Static Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_OPERATION_COUNT = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.DataProperty <em>Data Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.DataProperty
     * @generated
     */
    EClass getDataProperty();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.NavigationProperty <em>Navigation Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Navigation Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.NavigationProperty
     * @generated
     */
    EClass getNavigationProperty();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.StaticNavigation <em>Static Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.StaticNavigation
     * @generated
     */
    EClass getStaticNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor <em>Primitive Accessor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Accessor</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor
     * @generated
     */
    EClass getPrimitiveAccessor();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression <em>Getter Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Getter Expression</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression()
     * @see #getPrimitiveAccessor()
     * @generated
     */
    EReference getPrimitiveAccessor_GetterExpression();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression <em>Setter Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Setter Expression</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression()
     * @see #getPrimitiveAccessor()
     * @generated
     */
    EReference getPrimitiveAccessor_SetterExpression();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.StaticData <em>Static Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Data</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.StaticData
     * @generated
     */
    EClass getStaticData();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor <em>Reference Accessor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Accessor</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor
     * @generated
     */
    EClass getReferenceAccessor();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression <em>Getter Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Getter Expression</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression()
     * @see #getReferenceAccessor()
     * @generated
     */
    EReference getReferenceAccessor_GetterExpression();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression <em>Setter Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Setter Expression</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression()
     * @see #getReferenceAccessor()
     * @generated
     */
    EReference getReferenceAccessor_SetterExpression();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getRangeExpression <em>Range Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Range Expression</em>'.
     * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getRangeExpression()
     * @see #getReferenceAccessor()
     * @generated
     */
    EReference getReferenceAccessor_RangeExpression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DerivedFactory getDerivedFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl <em>Data Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getDataProperty()
         * @generated
         */
        EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl <em>Navigation Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getNavigationProperty()
         * @generated
         */
        EClass NAVIGATION_PROPERTY = eINSTANCE.getNavigationProperty();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl <em>Static Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticNavigation()
         * @generated
         */
        EClass STATIC_NAVIGATION = eINSTANCE.getStaticNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl <em>Primitive Accessor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getPrimitiveAccessor()
         * @generated
         */
        EClass PRIMITIVE_ACCESSOR = eINSTANCE.getPrimitiveAccessor();

        /**
         * The meta object literal for the '<em><b>Getter Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_ACCESSOR__GETTER_EXPRESSION = eINSTANCE.getPrimitiveAccessor_GetterExpression();

        /**
         * The meta object literal for the '<em><b>Setter Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_ACCESSOR__SETTER_EXPRESSION = eINSTANCE.getPrimitiveAccessor_SetterExpression();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl <em>Static Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticData()
         * @generated
         */
        EClass STATIC_DATA = eINSTANCE.getStaticData();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl <em>Reference Accessor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl
         * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceAccessor()
         * @generated
         */
        EClass REFERENCE_ACCESSOR = eINSTANCE.getReferenceAccessor();

        /**
         * The meta object literal for the '<em><b>Getter Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_ACCESSOR__GETTER_EXPRESSION = eINSTANCE.getReferenceAccessor_GetterExpression();

        /**
         * The meta object literal for the '<em><b>Setter Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_ACCESSOR__SETTER_EXPRESSION = eINSTANCE.getReferenceAccessor_SetterExpression();

        /**
         * The meta object literal for the '<em><b>Range Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_ACCESSOR__RANGE_EXPRESSION = eINSTANCE.getReferenceAccessor_RangeExpression();

    }

} //DerivedPackage
