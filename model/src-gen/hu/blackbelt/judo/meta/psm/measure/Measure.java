/**
 */
package hu.blackbelt.judo.meta.psm.measure;

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
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends NamespaceElement
{
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.measure.Unit}.
	 * <!-- begin-user-doc -->
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

} // Measure
