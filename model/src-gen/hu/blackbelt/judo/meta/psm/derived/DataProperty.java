/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getDataProperty()
 * @model
 * @generated
 */
public interface DataProperty extends PrimitiveAccessor
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EntityType getEntityType();

} // DataProperty
