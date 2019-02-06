/**
 */
package hu.blackbelt.judo.meta.psm.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.StringType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.StringType#getRegExp <em>Reg Exp</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends FlatPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getStringType_MaxLength()
	 * @model required="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.StringType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Reg Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Exp</em>' attribute.
	 * @see #setRegExp(String)
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getStringType_RegExp()
	 * @model dataType="hu.blackbelt.judo.meta.psm.type.RegExp"
	 * @generated
	 */
	String getRegExp();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.type.StringType#getRegExp <em>Reg Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Exp</em>' attribute.
	 * @see #getRegExp()
	 * @generated
	 */
	void setRegExp(String value);

} // StringType
