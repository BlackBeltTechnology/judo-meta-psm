/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.measure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MeasureFactoryImpl extends EFactoryImpl implements MeasureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasureFactory init() {
		try {
			MeasureFactory theMeasureFactory = (MeasureFactory)EPackage.Registry.INSTANCE.getEFactory(MeasurePackage.eNS_URI);
			if (theMeasureFactory != null) {
				return theMeasureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeasureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureFactoryImpl() {
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
			case MeasurePackage.MEASURE: return createMeasure();
			case MeasurePackage.MEASURED_TYPE: return createMeasuredType();
			case MeasurePackage.UNIT: return createUnit();
			case MeasurePackage.MEASURE_DEFINITION_TERM: return createMeasureDefinitionTerm();
			case MeasurePackage.DURATION_UNIT: return createDurationUnit();
			case MeasurePackage.DERIVED_MEASURE: return createDerivedMeasure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MeasurePackage.DURATION_TYPE:
				return createDurationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MeasurePackage.DURATION_TYPE:
				return convertDurationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredType createMeasuredType() {
		MeasuredTypeImpl measuredType = new MeasuredTypeImpl();
		return measuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureDefinitionTerm createMeasureDefinitionTerm() {
		MeasureDefinitionTermImpl measureDefinitionTerm = new MeasureDefinitionTermImpl();
		return measureDefinitionTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnit createDurationUnit() {
		DurationUnitImpl durationUnit = new DurationUnitImpl();
		return durationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedMeasure createDerivedMeasure() {
		DerivedMeasureImpl derivedMeasure = new DerivedMeasureImpl();
		return derivedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationType createDurationType(String literal) {
		DurationType result = DurationType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + MeasurePackage.Literals.DURATION_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationType createDurationTypeFromString(EDataType eDataType, String initialValue) {
		return createDurationType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationType(DurationType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDurationType((DurationType)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurePackage getMeasurePackage() {
		return (MeasurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeasurePackage getPackage() {
		return MeasurePackage.eINSTANCE;
	}

} //MeasureFactoryImpl
