/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical.impl;

import hu.blackbelt.judo.meta.psm.expression.logical.*;

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
public class LogicalFactoryImpl extends EFactoryImpl implements LogicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalFactory init() {
		try {
			LogicalFactory theLogicalFactory = (LogicalFactory)EPackage.Registry.INSTANCE.getEFactory(LogicalPackage.eNS_URI);
			if (theLogicalFactory != null) {
				return theLogicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFactoryImpl() {
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
			case LogicalPackage.STRING_COMPARISON: return createStringComparison();
			case LogicalPackage.ENUMERATION_COMPARISON: return createEnumerationComparison();
			case LogicalPackage.NEGATION_EXPRESSION: return createNegationExpression();
			case LogicalPackage.KLEENE_EXPRESSION: return createKleeneExpression();
			case LogicalPackage.INSTANCE_OF_EXPRESSION: return createInstanceOfExpression();
			case LogicalPackage.LOGICAL_ATTRIBUTE: return createLogicalAttribute();
			case LogicalPackage.UNDEFINED_ATTRIBUTE_COMPARISON: return createUndefinedAttributeComparison();
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON: return createUndefinedNavigationComparison();
			case LogicalPackage.CONTAINS_EXPRESSION: return createContainsExpression();
			case LogicalPackage.INTEGER_COMPARISON: return createIntegerComparison();
			case LogicalPackage.DECIMAL_COMPARISON: return createDecimalComparison();
			case LogicalPackage.OBJECT_COMPARISON: return createObjectComparison();
			case LogicalPackage.MEMBER_OF_EXPRESSION: return createMemberOfExpression();
			case LogicalPackage.TYPE_OF_EXPRESSION: return createTypeOfExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringComparison createStringComparison() {
		StringComparisonImpl stringComparison = new StringComparisonImpl();
		return stringComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationComparison createEnumerationComparison() {
		EnumerationComparisonImpl enumerationComparison = new EnumerationComparisonImpl();
		return enumerationComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegationExpression createNegationExpression() {
		NegationExpressionImpl negationExpression = new NegationExpressionImpl();
		return negationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KleeneExpression createKleeneExpression() {
		KleeneExpressionImpl kleeneExpression = new KleeneExpressionImpl();
		return kleeneExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceOfExpression createInstanceOfExpression() {
		InstanceOfExpressionImpl instanceOfExpression = new InstanceOfExpressionImpl();
		return instanceOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalAttribute createLogicalAttribute() {
		LogicalAttributeImpl logicalAttribute = new LogicalAttributeImpl();
		return logicalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndefinedAttributeComparison createUndefinedAttributeComparison() {
		UndefinedAttributeComparisonImpl undefinedAttributeComparison = new UndefinedAttributeComparisonImpl();
		return undefinedAttributeComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndefinedNavigationComparison createUndefinedNavigationComparison() {
		UndefinedNavigationComparisonImpl undefinedNavigationComparison = new UndefinedNavigationComparisonImpl();
		return undefinedNavigationComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainsExpression createContainsExpression() {
		ContainsExpressionImpl containsExpression = new ContainsExpressionImpl();
		return containsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparison createIntegerComparison() {
		IntegerComparisonImpl integerComparison = new IntegerComparisonImpl();
		return integerComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalComparison createDecimalComparison() {
		DecimalComparisonImpl decimalComparison = new DecimalComparisonImpl();
		return decimalComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComparison createObjectComparison() {
		ObjectComparisonImpl objectComparison = new ObjectComparisonImpl();
		return objectComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberOfExpression createMemberOfExpression() {
		MemberOfExpressionImpl memberOfExpression = new MemberOfExpressionImpl();
		return memberOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfExpression createTypeOfExpression() {
		TypeOfExpressionImpl typeOfExpression = new TypeOfExpressionImpl();
		return typeOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPackage getLogicalPackage() {
		return (LogicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicalPackage getPackage() {
		return LogicalPackage.eINSTANCE;
	}

} //LogicalFactoryImpl
