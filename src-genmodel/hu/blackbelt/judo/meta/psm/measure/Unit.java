/**
 */
package hu.blackbelt.judo.meta.psm.measure;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.Unit#getRateDividend <em>Rate Dividend</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.Unit#getRateDivisor <em>Rate Divisor</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.Unit#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rate Dividend</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Dividend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Dividend</em>' attribute.
	 * @see #setRateDividend(double)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getUnit_RateDividend()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getRateDividend();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.Unit#getRateDividend <em>Rate Dividend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Dividend</em>' attribute.
	 * @see #getRateDividend()
	 * @generated
	 */
	void setRateDividend(double value);

	/**
	 * Returns the value of the '<em><b>Rate Divisor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Divisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Divisor</em>' attribute.
	 * @see #setRateDivisor(double)
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getUnit_RateDivisor()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getRateDivisor();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.Unit#getRateDivisor <em>Rate Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Divisor</em>' attribute.
	 * @see #getRateDivisor()
	 * @generated
	 */
	void setRateDivisor(double value);

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
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getUnit_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.measure.Unit#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // Unit
