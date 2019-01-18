/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Container#getComponents <em>Components</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Container#getLayout <em>Layout</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Container#getTitle <em>Title</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Container#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement {
    /**
     * Returns the value of the '<em><b>Components</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.Component}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getContainer_Components()
     * @model containment="true"
     * @generated
     */
    EList<Component> getComponents();

    /**
     * Returns the value of the '<em><b>Layout</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.view.LayoutType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Layout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Layout</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.LayoutType
     * @see #setLayout(LayoutType)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getContainer_Layout()
     * @model required="true"
     * @generated
     */
    LayoutType getLayout();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Container#getLayout <em>Layout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Layout</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.LayoutType
     * @see #getLayout()
     * @generated
     */
    void setLayout(LayoutType value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getContainer_Title()
     * @model
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Container#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Alignment</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.view.AlignmentType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alignment</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.AlignmentType
     * @see #setAlignment(AlignmentType)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getContainer_Alignment()
     * @model required="true"
     * @generated
     */
    AlignmentType getAlignment();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Container#getAlignment <em>Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alignment</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.AlignmentType
     * @see #getAlignment()
     * @generated
     */
    void setAlignment(AlignmentType value);

} // Container
