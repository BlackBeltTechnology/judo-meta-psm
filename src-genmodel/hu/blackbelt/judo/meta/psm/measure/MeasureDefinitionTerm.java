/**
 */
package hu.blackbelt.judo.meta.psm.measure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getExponent <em>Exponent</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasureDefinitionTerm()
 * @model
 * @generated
 */
public interface MeasureDefinitionTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(int)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasureDefinitionTerm_Exponent()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getExponent();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasureDefinitionTerm_Unit()
	 * @model required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // MeasureDefinitionTerm
