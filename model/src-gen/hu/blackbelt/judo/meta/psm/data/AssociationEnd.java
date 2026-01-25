/**
 */
package hu.blackbelt.judo.meta.psm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#getPartner <em>Partner</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#isReverseCascadeDelete <em>Reverse Cascade Delete</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends Relation
{
	/**
	 * Returns the value of the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' reference.
	 * @see #setPartner(AssociationEnd)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAssociationEnd_Partner()
	 * @model
	 * @generated
	 */
	AssociationEnd getPartner();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#getPartner <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' reference.
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(AssociationEnd value);

	/**
	 * Returns the value of the '<em><b>Reverse Cascade Delete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Cascade Delete</em>' attribute.
	 * @see #setReverseCascadeDelete(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAssociationEnd_ReverseCascadeDelete()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReverseCascadeDelete();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#isReverseCascadeDelete <em>Reverse Cascade Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Cascade Delete</em>' attribute.
	 * @see #isReverseCascadeDelete()
	 * @generated
	 */
	void setReverseCascadeDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Unmapped Default Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmapped Default Only</em>' attribute.
	 * @see #setUnmappedDefaultOnly(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getAssociationEnd_UnmappedDefaultOnly()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUnmappedDefaultOnly();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}' attribute.
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
	 * @model kind="operation"
	 * @generated
	 */
	Relation getOpposite();

} // AssociationEnd
