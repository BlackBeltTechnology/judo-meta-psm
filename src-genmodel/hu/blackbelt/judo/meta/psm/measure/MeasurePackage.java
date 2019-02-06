/**
 */
package hu.blackbelt.judo.meta.psm.measure;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.blackbelt.judo.meta.psm.measure.MeasureFactory
 * @model kind="package"
 * @generated
 */
public interface MeasurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "measure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/measure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "measure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurePackage eINSTANCE = hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = NamespacePackage.NAMESPACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__UNITS = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SYMBOL = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_NAME = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = NamespacePackage.NAMESPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasuredTypeImpl <em>Measured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasuredTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getMeasuredType()
	 * @generated
	 */
	int MEASURED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__NAME = TypePackage.NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__TYPE_NAME = TypePackage.NUMERIC_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__PRECISION = TypePackage.NUMERIC_TYPE__PRECISION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__SCALE = TypePackage.NUMERIC_TYPE__SCALE;

	/**
	 * The feature id for the '<em><b>Store Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE__STORE_UNIT = TypePackage.NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE_FEATURE_COUNT = TypePackage.NUMERIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_TYPE_OPERATION_COUNT = TypePackage.NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rate Dividend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__RATE_DIVIDEND = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__RATE_DIVISOR = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SYMBOL = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureDefinitionTermImpl <em>Definition Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasureDefinitionTermImpl
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getMeasureDefinitionTerm()
	 * @generated
	 */
	int MEASURE_DEFINITION_TERM = 3;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_DEFINITION_TERM__EXPONENT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_DEFINITION_TERM__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Definition Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_DEFINITION_TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Definition Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_DEFINITION_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.DurationUnitImpl <em>Duration Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.DurationUnitImpl
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getDurationUnit()
	 * @generated
	 */
	int DURATION_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Rate Dividend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT__RATE_DIVIDEND = UNIT__RATE_DIVIDEND;

	/**
	 * The feature id for the '<em><b>Rate Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT__RATE_DIVISOR = UNIT__RATE_DIVISOR;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT__SYMBOL = UNIT__SYMBOL;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT__UNIT_TYPE = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Duration Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.DerivedMeasureImpl <em>Derived Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.DerivedMeasureImpl
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getDerivedMeasure()
	 * @generated
	 */
	int DERIVED_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE__UNITS = MEASURE__UNITS;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE__SYMBOL = MEASURE__SYMBOL;

	/**
	 * The feature id for the '<em><b>Measure Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE__MEASURE_NAME = MEASURE__MEASURE_NAME;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE__TERMS = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.measure.DurationType <em>Duration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
	 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getDurationType()
	 * @generated
	 */
	int DURATION_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.measure.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.measure.Measure#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Measure#getUnits()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Units();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.measure.Measure#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Measure#getSymbol()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Symbol();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.measure.Measure#getMeasureName <em>Measure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Measure#getMeasureName()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_MeasureName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.measure.MeasuredType <em>Measured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasuredType
	 * @generated
	 */
	EClass getMeasuredType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.measure.MeasuredType#getStoreUnit <em>Store Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store Unit</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasuredType#getStoreUnit()
	 * @see #getMeasuredType()
	 * @generated
	 */
	EReference getMeasuredType_StoreUnit();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.measure.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.measure.Unit#getRateDividend <em>Rate Dividend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Dividend</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Unit#getRateDividend()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_RateDividend();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.measure.Unit#getRateDivisor <em>Rate Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Divisor</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Unit#getRateDivisor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_RateDivisor();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.measure.Unit#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.Unit#getSymbol()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Symbol();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm <em>Definition Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Term</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm
	 * @generated
	 */
	EClass getMeasureDefinitionTerm();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getExponent()
	 * @see #getMeasureDefinitionTerm()
	 * @generated
	 */
	EAttribute getMeasureDefinitionTerm_Exponent();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getUnit()
	 * @see #getMeasureDefinitionTerm()
	 * @generated
	 */
	EReference getMeasureDefinitionTerm_Unit();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.measure.DurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Unit</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationUnit
	 * @generated
	 */
	EClass getDurationUnit();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.measure.DurationUnit#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationUnit#getUnitType()
	 * @see #getDurationUnit()
	 * @generated
	 */
	EAttribute getDurationUnit_UnitType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.measure.DerivedMeasure <em>Derived Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Measure</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.DerivedMeasure
	 * @generated
	 */
	EClass getDerivedMeasure();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.measure.DerivedMeasure#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.DerivedMeasure#getTerms()
	 * @see #getDerivedMeasure()
	 * @generated
	 */
	EReference getDerivedMeasure_Terms();

	/**
	 * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.measure.DurationType <em>Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
	 * @generated
	 */
	EEnum getDurationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasureFactory getMeasureFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__UNITS = eINSTANCE.getMeasure_Units();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__SYMBOL = eINSTANCE.getMeasure_Symbol();

		/**
		 * The meta object literal for the '<em><b>Measure Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__MEASURE_NAME = eINSTANCE.getMeasure_MeasureName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasuredTypeImpl <em>Measured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasuredTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getMeasuredType()
		 * @generated
		 */
		EClass MEASURED_TYPE = eINSTANCE.getMeasuredType();

		/**
		 * The meta object literal for the '<em><b>Store Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_TYPE__STORE_UNIT = eINSTANCE.getMeasuredType_StoreUnit();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.UnitImpl
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Rate Dividend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__RATE_DIVIDEND = eINSTANCE.getUnit_RateDividend();

		/**
		 * The meta object literal for the '<em><b>Rate Divisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__RATE_DIVISOR = eINSTANCE.getUnit_RateDivisor();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__SYMBOL = eINSTANCE.getUnit_Symbol();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureDefinitionTermImpl <em>Definition Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasureDefinitionTermImpl
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getMeasureDefinitionTerm()
		 * @generated
		 */
		EClass MEASURE_DEFINITION_TERM = eINSTANCE.getMeasureDefinitionTerm();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_DEFINITION_TERM__EXPONENT = eINSTANCE.getMeasureDefinitionTerm_Exponent();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_DEFINITION_TERM__UNIT = eINSTANCE.getMeasureDefinitionTerm_Unit();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.DurationUnitImpl <em>Duration Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.DurationUnitImpl
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getDurationUnit()
		 * @generated
		 */
		EClass DURATION_UNIT = eINSTANCE.getDurationUnit();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_UNIT__UNIT_TYPE = eINSTANCE.getDurationUnit_UnitType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.impl.DerivedMeasureImpl <em>Derived Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.DerivedMeasureImpl
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getDerivedMeasure()
		 * @generated
		 */
		EClass DERIVED_MEASURE = eINSTANCE.getDerivedMeasure();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_MEASURE__TERMS = eINSTANCE.getDerivedMeasure_Terms();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.measure.DurationType <em>Duration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.measure.DurationType
		 * @see hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl#getDurationType()
		 * @generated
		 */
		EEnum DURATION_TYPE = eINSTANCE.getDurationType();

	}

} //MeasurePackage
