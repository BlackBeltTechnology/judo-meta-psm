/**
 */
package hu.blackbelt.judo.meta.psm.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.XMLType#getXmlNamespace <em>Xml Namespace</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.XMLType#getXmlElement <em>Xml Element</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getXMLType()
 * @model
 * @generated
 */
public interface XMLType extends FlatPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Xml Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Namespace</em>' attribute.
	 * @see #setXmlNamespace(String)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getXMLType_XmlNamespace()
	 * @model dataType="hu.blackbelt.judo.meta.psm.type.XmlNamespace" required="true"
	 * @generated
	 */
	String getXmlNamespace();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.XMLType#getXmlNamespace <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Namespace</em>' attribute.
	 * @see #getXmlNamespace()
	 * @generated
	 */
	void setXmlNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Xml Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Element</em>' attribute.
	 * @see #setXmlElement(String)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getXMLType_XmlElement()
	 * @model dataType="hu.blackbelt.judo.meta.psm.type.XmlElement" required="true"
	 * @generated
	 */
	String getXmlElement();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.XMLType#getXmlElement <em>Xml Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Element</em>' attribute.
	 * @see #getXmlElement()
	 * @generated
	 */
	void setXmlElement(String value);

} // XMLType
