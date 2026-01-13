/**
 */
package hu.blackbelt.judo.meta.psm.namespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamedElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamedElement_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.namespace.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamedElement_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // NamedElement
