/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

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
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectFactory
 * @model kind="package"
 * @generated
 */
public interface ObjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "object";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/object";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "o";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectNavigationExpressionImpl <em>Navigation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectNavigationExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectNavigationExpression()
	 * @generated
	 */
	int OBJECT_NAVIGATION_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_EXPRESSION__NAME = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_EXPRESSION__REFERENCE_NAME = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_EXPRESSION_FEATURE_COUNT = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_EXPRESSION_OPERATION_COUNT = ExpressionPackage.OBJECT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSelectorExpressionImpl <em>Selector Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSelectorExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectSelectorExpression()
	 * @generated
	 */
	int OBJECT_SELECTOR_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTOR_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTOR_EXPRESSION__OPERATOR = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selector Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTOR_EXPRESSION_FEATURE_COUNT = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selector Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SELECTOR_EXPRESSION_OPERATION_COUNT = ExpressionPackage.OBJECT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFilterExpressionImpl <em>Filter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFilterExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectFilterExpression()
	 * @generated
	 */
	int OBJECT_FILTER_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FILTER_EXPRESSION__CONDITION = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FILTER_EXPRESSION_FEATURE_COUNT = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FILTER_EXPRESSION_OPERATION_COUNT = ExpressionPackage.OBJECT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectVariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectVariableReferenceImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectVariableReference()
	 * @generated
	 */
	int OBJECT_VARIABLE_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_REFERENCE__VARIABLE = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_REFERENCE_FEATURE_COUNT = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VARIABLE_REFERENCE_OPERATION_COUNT = ExpressionPackage.OBJECT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl <em>Cast Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getCastObject()
	 * @generated
	 */
	int CAST_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_OBJECT__NAME = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_OBJECT__ELEMENT_NAME = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_OBJECT__OBJECT_EXPRESSION = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cast Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_OBJECT_FEATURE_COUNT = ExpressionPackage.OBJECT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cast Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_OBJECT_OPERATION_COUNT = ExpressionPackage.OBJECT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectSwitchExpression()
	 * @generated
	 */
	int OBJECT_SWITCH_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SWITCH_EXPRESSION__ELEMENT_NAME = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectNavigationExpression <em>Navigation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectNavigationExpression
	 * @generated
	 */
	EClass getObjectNavigationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectNavigationExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectNavigationExpression#getObjectExpression()
	 * @see #getObjectNavigationExpression()
	 * @generated
	 */
	EReference getObjectNavigationExpression_ObjectExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression <em>Selector Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression
	 * @generated
	 */
	EClass getObjectSelectorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getCollectionExpression()
	 * @see #getObjectSelectorExpression()
	 * @generated
	 */
	EReference getObjectSelectorExpression_CollectionExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getOperator()
	 * @see #getObjectSelectorExpression()
	 * @generated
	 */
	EAttribute getObjectSelectorExpression_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression
	 * @generated
	 */
	EClass getObjectFilterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getObjectExpression()
	 * @see #getObjectFilterExpression()
	 * @generated
	 */
	EReference getObjectFilterExpression_ObjectExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression#getCondition()
	 * @see #getObjectFilterExpression()
	 * @generated
	 */
	EReference getObjectFilterExpression_Condition();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectVariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectVariableReference
	 * @generated
	 */
	EClass getObjectVariableReference();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectVariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectVariableReference#getVariable()
	 * @see #getObjectVariableReference()
	 * @generated
	 */
	EReference getObjectVariableReference_Variable();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject <em>Cast Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Object</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.CastObject
	 * @generated
	 */
	EClass getCastObject();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.CastObject#getElementName()
	 * @see #getCastObject()
	 * @generated
	 */
	EReference getCastObject_ElementName();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.CastObject#getObjectExpression()
	 * @see #getCastObject()
	 * @generated
	 */
	EReference getCastObject_ObjectExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectSwitchExpression
	 * @generated
	 */
	EClass getObjectSwitchExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSwitchExpression#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectSwitchExpression#getElementName()
	 * @see #getObjectSwitchExpression()
	 * @generated
	 */
	EReference getObjectSwitchExpression_ElementName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ObjectFactory getObjectFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectNavigationExpressionImpl <em>Navigation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectNavigationExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectNavigationExpression()
		 * @generated
		 */
		EClass OBJECT_NAVIGATION_EXPRESSION = eINSTANCE.getObjectNavigationExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NAVIGATION_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getObjectNavigationExpression_ObjectExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSelectorExpressionImpl <em>Selector Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSelectorExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectSelectorExpression()
		 * @generated
		 */
		EClass OBJECT_SELECTOR_EXPRESSION = eINSTANCE.getObjectSelectorExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SELECTOR_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getObjectSelectorExpression_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_SELECTOR_EXPRESSION__OPERATOR = eINSTANCE.getObjectSelectorExpression_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFilterExpressionImpl <em>Filter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFilterExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectFilterExpression()
		 * @generated
		 */
		EClass OBJECT_FILTER_EXPRESSION = eINSTANCE.getObjectFilterExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getObjectFilterExpression_ObjectExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FILTER_EXPRESSION__CONDITION = eINSTANCE.getObjectFilterExpression_Condition();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectVariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectVariableReferenceImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectVariableReference()
		 * @generated
		 */
		EClass OBJECT_VARIABLE_REFERENCE = eINSTANCE.getObjectVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getObjectVariableReference_Variable();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl <em>Cast Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getCastObject()
		 * @generated
		 */
		EClass CAST_OBJECT = eINSTANCE.getCastObject();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_OBJECT__ELEMENT_NAME = eINSTANCE.getCastObject_ElementName();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_OBJECT__OBJECT_EXPRESSION = eINSTANCE.getCastObject_ObjectExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl#getObjectSwitchExpression()
		 * @generated
		 */
		EClass OBJECT_SWITCH_EXPRESSION = eINSTANCE.getObjectSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SWITCH_EXPRESSION__ELEMENT_NAME = eINSTANCE.getObjectSwitchExpression_ElementName();

	}

} //ObjectPackage
