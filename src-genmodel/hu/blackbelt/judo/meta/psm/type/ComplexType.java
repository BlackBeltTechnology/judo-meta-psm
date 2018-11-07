/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.ComplexType#getSuperComplexTypes <em>Super Complex Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.ComplexType#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.ComplexType#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends DataType {
    /**
     * Returns the value of the '<em><b>Super Complex Types</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.type.ComplexType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Complex Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Complex Types</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getComplexType_SuperComplexTypes()
     * @model
     * @generated
     */
    EList<ComplexType> getSuperComplexTypes();

    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.type.Element}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getComplexType_Elements()
     * @model containment="true"
     * @generated
     */
    EList<Element> getElements();

    /**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #setAbstract(boolean)
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getComplexType_Abstract()
     * @model required="true"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.ComplexType#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

} // ComplexType
