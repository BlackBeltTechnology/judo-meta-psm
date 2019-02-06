/**
 */
package hu.blackbelt.judo.meta.psm.expression.enumeration;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

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
 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationFactory
 * @model kind="package"
 * @generated
 */
public interface EnumerationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enumeration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/enumeration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl#getEnumerationAttribute()
	 * @generated
	 */
	int ENUMERATION_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.ENUMERATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.ENUMERATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.ENUMERATION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.ENUMERATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationSwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl#getEnumerationSwitchExpression()
	 * @generated
	 */
	int ENUMERATION_SWITCH_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationAttribute
	 * @generated
	 */
	EClass getEnumerationAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression
	 * @generated
	 */
	EClass getEnumerationSwitchExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationSwitchExpression#getElementName()
	 * @see #getEnumerationSwitchExpression()
	 * @generated
	 */
	EReference getEnumerationSwitchExpression_ElementName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationFactory getEnumerationFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl#getEnumerationAttribute()
		 * @generated
		 */
		EClass ENUMERATION_ATTRIBUTE = eINSTANCE.getEnumerationAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationSwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl#getEnumerationSwitchExpression()
		 * @generated
		 */
		EClass ENUMERATION_SWITCH_EXPRESSION = eINSTANCE.getEnumerationSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_SWITCH_EXPRESSION__ELEMENT_NAME = eINSTANCE.getEnumerationSwitchExpression_ElementName();

	}

} //EnumerationPackage
