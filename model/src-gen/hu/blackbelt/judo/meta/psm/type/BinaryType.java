/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.BinaryType#getMimeTypes <em>Mime Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.BinaryType#getMaxFileSize <em>Max File Size</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getBinaryType()
 * @model
 * @generated
 */
public interface BinaryType extends FlatPrimitiveType
{
	/**
	 * Returns the value of the '<em><b>Mime Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Types</em>' attribute list.
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getBinaryType_MimeTypes()
	 * @model
	 * @generated
	 */
	EList<String> getMimeTypes();

	/**
	 * Returns the value of the '<em><b>Max File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max File Size</em>' attribute.
	 * @see #setMaxFileSize(long)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getBinaryType_MaxFileSize()
	 * @model
	 * @generated
	 */
	long getMaxFileSize();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.BinaryType#getMaxFileSize <em>Max File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max File Size</em>' attribute.
	 * @see #getMaxFileSize()
	 * @generated
	 */
	void setMaxFileSize(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

} // BinaryType
