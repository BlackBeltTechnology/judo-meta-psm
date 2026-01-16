/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Sequence#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Sequence#getIncrement <em>Increment</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Sequence#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Sequence#isCyclic <em>Cyclic</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getSequence()
 * @model abstract="true"
 * @generated
 */
public interface Sequence extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(long)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getSequence_InitialValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getInitialValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Sequence#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(long value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(long)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getSequence_Increment()
	 * @model default="1" required="true"
	 * @generated
	 */
	long getIncrement();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Sequence#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(long value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #setMaximumValue(long)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getSequence_MaximumValue()
	 * @model
	 * @generated
	 */
	long getMaximumValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Sequence#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(long value);

	/**
	 * Returns the value of the '<em><b>Cyclic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cyclic</em>' attribute.
	 * @see #setCyclic(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getSequence_Cyclic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCyclic();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Sequence#isCyclic <em>Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cyclic</em>' attribute.
	 * @see #isCyclic()
	 * @generated
	 */
	void setCyclic(boolean value);

} // Sequence
