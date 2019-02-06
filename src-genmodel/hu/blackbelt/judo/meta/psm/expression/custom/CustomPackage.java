/**
 */
package hu.blackbelt.judo.meta.psm.expression.custom;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomFactory
 * @model kind="package"
 * @generated
 */
public interface CustomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "custom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/custom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cust";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl#getCustomAttribute()
	 * @generated
	 */
	int CUSTOM_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.CUSTOM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.CUSTOM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.CUSTOM_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.CUSTOM_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomSwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl#getCustomSwitchExpression()
	 * @generated
	 */
	int CUSTOM_SWITCH_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.custom.CustomAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomAttribute
	 * @generated
	 */
	EClass getCustomAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.custom.CustomSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomSwitchExpression
	 * @generated
	 */
	EClass getCustomSwitchExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomFactory getCustomFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl#getCustomAttribute()
		 * @generated
		 */
		EClass CUSTOM_ATTRIBUTE = eINSTANCE.getCustomAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomSwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl#getCustomSwitchExpression()
		 * @generated
		 */
		EClass CUSTOM_SWITCH_EXPRESSION = eINSTANCE.getCustomSwitchExpression();

	}

} //CustomPackage
