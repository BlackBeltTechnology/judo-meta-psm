/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

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
 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalFactory
 * @model kind="package"
 * @generated
 */
public interface TemporalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "temporal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/temporal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "t";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemporalPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getDateAttribute()
	 * @generated
	 */
	int DATE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.DATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.DATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.DATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.DATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAttributeImpl <em>Timestamp Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampAttribute()
	 * @generated
	 */
	int TIMESTAMP_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timestamp Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timestamp Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.TIMESTAMP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateSwitchExpressionImpl <em>Date Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getDateSwitchExpression()
	 * @generated
	 */
	int DATE_SWITCH_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Date Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampSwitchExpressionImpl <em>Timestamp Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampSwitchExpression()
	 * @generated
	 */
	int TIMESTAMP_SWITCH_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Timestamp Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timestamp Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl <em>Timestamp Addition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampAdditionExpression()
	 * @generated
	 */
	int TIMESTAMP_ADDITION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ADDITION_EXPRESSION__DURATION = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ADDITION_EXPRESSION__OPERATOR = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timestamp Addition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ADDITION_EXPRESSION_FEATURE_COUNT = ExpressionPackage.TIMESTAMP_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Timestamp Addition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_ADDITION_EXPRESSION_OPERATION_COUNT = ExpressionPackage.TIMESTAMP_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampDifferenceExpressionImpl <em>Timestamp Difference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampDifferenceExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampDifferenceExpression()
	 * @generated
	 */
	int TIMESTAMP_DIFFERENCE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Start Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP = ExpressionPackage.NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP = ExpressionPackage.NUMERIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timestamp Difference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_DIFFERENCE_EXPRESSION_FEATURE_COUNT = ExpressionPackage.NUMERIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timestamp Difference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_DIFFERENCE_EXPRESSION_OPERATION_COUNT = ExpressionPackage.NUMERIC_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.DateAttribute <em>Date Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.DateAttribute
	 * @generated
	 */
	EClass getDateAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAttribute <em>Timestamp Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAttribute
	 * @generated
	 */
	EClass getTimestampAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.DateSwitchExpression <em>Date Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.DateSwitchExpression
	 * @generated
	 */
	EClass getDateSwitchExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampSwitchExpression <em>Timestamp Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampSwitchExpression
	 * @generated
	 */
	EClass getTimestampSwitchExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression <em>Timestamp Addition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Addition Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression
	 * @generated
	 */
	EClass getTimestampAdditionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timestamp</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getTimestamp()
	 * @see #getTimestampAdditionExpression()
	 * @generated
	 */
	EReference getTimestampAdditionExpression_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getDuration()
	 * @see #getTimestampAdditionExpression()
	 * @generated
	 */
	EReference getTimestampAdditionExpression_Duration();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getOperator()
	 * @see #getTimestampAdditionExpression()
	 * @generated
	 */
	EAttribute getTimestampAdditionExpression_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression <em>Timestamp Difference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Difference Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression
	 * @generated
	 */
	EClass getTimestampDifferenceExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getStartTimestamp <em>Start Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Timestamp</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getStartTimestamp()
	 * @see #getTimestampDifferenceExpression()
	 * @generated
	 */
	EReference getTimestampDifferenceExpression_StartTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getEndTimestamp <em>End Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Timestamp</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getEndTimestamp()
	 * @see #getTimestampDifferenceExpression()
	 * @generated
	 */
	EReference getTimestampDifferenceExpression_EndTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemporalFactory getTemporalFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getDateAttribute()
		 * @generated
		 */
		EClass DATE_ATTRIBUTE = eINSTANCE.getDateAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAttributeImpl <em>Timestamp Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampAttribute()
		 * @generated
		 */
		EClass TIMESTAMP_ATTRIBUTE = eINSTANCE.getTimestampAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateSwitchExpressionImpl <em>Date Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.DateSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getDateSwitchExpression()
		 * @generated
		 */
		EClass DATE_SWITCH_EXPRESSION = eINSTANCE.getDateSwitchExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampSwitchExpressionImpl <em>Timestamp Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampSwitchExpression()
		 * @generated
		 */
		EClass TIMESTAMP_SWITCH_EXPRESSION = eINSTANCE.getTimestampSwitchExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl <em>Timestamp Addition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampAdditionExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampAdditionExpression()
		 * @generated
		 */
		EClass TIMESTAMP_ADDITION_EXPRESSION = eINSTANCE.getTimestampAdditionExpression();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESTAMP_ADDITION_EXPRESSION__TIMESTAMP = eINSTANCE.getTimestampAdditionExpression_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESTAMP_ADDITION_EXPRESSION__DURATION = eINSTANCE.getTimestampAdditionExpression_Duration();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_ADDITION_EXPRESSION__OPERATOR = eINSTANCE.getTimestampAdditionExpression_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampDifferenceExpressionImpl <em>Timestamp Difference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TimestampDifferenceExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl#getTimestampDifferenceExpression()
		 * @generated
		 */
		EClass TIMESTAMP_DIFFERENCE_EXPRESSION = eINSTANCE.getTimestampDifferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Start Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESTAMP_DIFFERENCE_EXPRESSION__START_TIMESTAMP = eINSTANCE.getTimestampDifferenceExpression_StartTimestamp();

		/**
		 * The meta object literal for the '<em><b>End Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESTAMP_DIFFERENCE_EXPRESSION__END_TIMESTAMP = eINSTANCE.getTimestampDifferenceExpression_EndTimestamp();

	}

} //TemporalPackage
