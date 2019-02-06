/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal.impl;

import hu.blackbelt.judo.meta.psm.expression.temporal.*;

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
public class TemporalFactoryImpl extends EFactoryImpl implements TemporalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalFactory init() {
		try {
			TemporalFactory theTemporalFactory = (TemporalFactory)EPackage.Registry.INSTANCE.getEFactory(TemporalPackage.eNS_URI);
			if (theTemporalFactory != null) {
				return theTemporalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TemporalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalFactoryImpl() {
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
			case TemporalPackage.DATE_ATTRIBUTE: return createDateAttribute();
			case TemporalPackage.TIMESTAMP_ATTRIBUTE: return createTimestampAttribute();
			case TemporalPackage.DATE_SWITCH_EXPRESSION: return createDateSwitchExpression();
			case TemporalPackage.TIMESTAMP_SWITCH_EXPRESSION: return createTimestampSwitchExpression();
			case TemporalPackage.TIMESTAMP_ADDITION_EXPRESSION: return createTimestampAdditionExpression();
			case TemporalPackage.TIMESTAMP_DIFFERENCE_EXPRESSION: return createTimestampDifferenceExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAttribute createDateAttribute() {
		DateAttributeImpl dateAttribute = new DateAttributeImpl();
		return dateAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampAttribute createTimestampAttribute() {
		TimestampAttributeImpl timestampAttribute = new TimestampAttributeImpl();
		return timestampAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateSwitchExpression createDateSwitchExpression() {
		DateSwitchExpressionImpl dateSwitchExpression = new DateSwitchExpressionImpl();
		return dateSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampSwitchExpression createTimestampSwitchExpression() {
		TimestampSwitchExpressionImpl timestampSwitchExpression = new TimestampSwitchExpressionImpl();
		return timestampSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampAdditionExpression createTimestampAdditionExpression() {
		TimestampAdditionExpressionImpl timestampAdditionExpression = new TimestampAdditionExpressionImpl();
		return timestampAdditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampDifferenceExpression createTimestampDifferenceExpression() {
		TimestampDifferenceExpressionImpl timestampDifferenceExpression = new TimestampDifferenceExpressionImpl();
		return timestampDifferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPackage getTemporalPackage() {
		return (TemporalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TemporalPackage getPackage() {
		return TemporalPackage.eINSTANCE;
	}

} //TemporalFactoryImpl
