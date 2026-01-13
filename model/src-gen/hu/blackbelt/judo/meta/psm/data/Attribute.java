/**
 */
package hu.blackbelt.judo.meta.psm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Attribute#isIdentifier <em>Identifier</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Attribute#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends PrimitiveTypedElement, EntityMember
{
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute_Identifier()
	 * @model required="true"
	 * @generated
	 */
	boolean isIdentifier();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #isIdentifier()
	 * @generated
	 */
	void setIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Unmapped Default Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmapped Default Only</em>' attribute.
	 * @see #setUnmappedDefaultOnly(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAttribute_UnmappedDefaultOnly()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnmappedDefaultOnly();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmapped Default Only</em>' attribute.
	 * @see #isUnmappedDefaultOnly()
	 * @generated
	 */
	void setUnmappedDefaultOnly(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EntityType getEntityType();

} // Attribute
