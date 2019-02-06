/**
 */
package hu.blackbelt.judo.meta.psm.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.NumericType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.NumericType#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getNumericType()
 * @model
 * @generated
 */
public interface NumericType extends FlatPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getNumericType_Precision()
	 * @model required="true"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.NumericType#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getNumericType_Scale()
	 * @model required="true"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.NumericType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

} // NumericType
