/**
 */
package hu.blackbelt.judo.meta.psm.measure;

import hu.blackbelt.judo.meta.psm.expression.MeasureName;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.Measure#getUnits <em>Units</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.Measure#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.Measure#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends NamespaceElement {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.measure.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasure_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasure_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.Measure#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Measure Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Name</em>' reference.
	 * @see #setMeasureName(MeasureName)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasure_MeasureName()
	 * @model
	 * @generated
	 */
	MeasureName getMeasureName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.Measure#getMeasureName <em>Measure Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Name</em>' reference.
	 * @see #getMeasureName()
	 * @generated
	 */
	void setMeasureName(MeasureName value);

} // Measure
