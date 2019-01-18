/**
 */
package hu.blackbelt.judo.meta.psm.constraint;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

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
 * @see hu.blackbelt.judo.meta.psm.constraint.ConstraintFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "constraint";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/constraint";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "constraint";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConstraintPackage eINSTANCE = hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl <em>Invariant Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl
     * @see hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl#getInvariantConstraint()
     * @generated
     */
    int INVARIANT_CONSTRAINT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INVARIANT_CONSTRAINT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INVARIANT_CONSTRAINT__EXPRESSION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Constrained</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INVARIANT_CONSTRAINT__CONSTRAINED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Invariant Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INVARIANT_CONSTRAINT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Invariant Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INVARIANT_CONSTRAINT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint <em>Invariant Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Invariant Constraint</em>'.
     * @see hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint
     * @generated
     */
    EClass getInvariantConstraint();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getExpression()
     * @see #getInvariantConstraint()
     * @generated
     */
    EReference getInvariantConstraint_Expression();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getConstrained <em>Constrained</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Constrained</em>'.
     * @see hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getConstrained()
     * @see #getInvariantConstraint()
     * @generated
     */
    EReference getInvariantConstraint_Constrained();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ConstraintFactory getConstraintFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl <em>Invariant Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.constraint.impl.InvariantConstraintImpl
         * @see hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl#getInvariantConstraint()
         * @generated
         */
        EClass INVARIANT_CONSTRAINT = eINSTANCE.getInvariantConstraint();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INVARIANT_CONSTRAINT__EXPRESSION = eINSTANCE.getInvariantConstraint_Expression();

        /**
         * The meta object literal for the '<em><b>Constrained</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INVARIANT_CONSTRAINT__CONSTRAINED = eINSTANCE.getInvariantConstraint_Constrained();

    }

} //ConstraintPackage
