/**
 */
package hu.blackbelt.judo.meta.psm.behavior;

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
 * @see hu.blackbelt.judo.meta.psm.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "behavior";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/behavior";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BehaviorPackage eINSTANCE = hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.behavior.impl.CascadeReferencesImpl <em>Cascade References</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.behavior.impl.CascadeReferencesImpl
     * @see hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl#getCascadeReferences()
     * @generated
     */
    int CASCADE_REFERENCES = 0;

    /**
     * The feature id for the '<em><b>References</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASCADE_REFERENCES__REFERENCES = 0;

    /**
     * The number of structural features of the '<em>Cascade References</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASCADE_REFERENCES_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Cascade References</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASCADE_REFERENCES_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.behavior.CascadeReferences <em>Cascade References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cascade References</em>'.
     * @see hu.blackbelt.judo.meta.psm.behavior.CascadeReferences
     * @generated
     */
    EClass getCascadeReferences();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.behavior.CascadeReferences#getReferences <em>References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>References</em>'.
     * @see hu.blackbelt.judo.meta.psm.behavior.CascadeReferences#getReferences()
     * @see #getCascadeReferences()
     * @generated
     */
    EReference getCascadeReferences_References();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BehaviorFactory getBehaviorFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.behavior.impl.CascadeReferencesImpl <em>Cascade References</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.behavior.impl.CascadeReferencesImpl
         * @see hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl#getCascadeReferences()
         * @generated
         */
        EClass CASCADE_REFERENCES = eINSTANCE.getCascadeReferences();

        /**
         * The meta object literal for the '<em><b>References</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CASCADE_REFERENCES__REFERENCES = eINSTANCE.getCascadeReferences_References();

    }

} //BehaviorPackage
