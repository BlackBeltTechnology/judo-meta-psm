/**
 */
package hu.blackbelt.judo.meta.psm.measure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.DerivedMeasure#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getDerivedMeasure()
 * @model
 * @generated
 */
public interface DerivedMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#getDerivedMeasure_Terms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MeasureDefinitionTerm> getTerms();

} // DerivedMeasure
