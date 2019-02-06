/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Cardinality#getLower <em>Lower</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Cardinality#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getCardinality_Lower()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.Cardinality#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getCardinality_Upper()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.Cardinality#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

} // Cardinality
