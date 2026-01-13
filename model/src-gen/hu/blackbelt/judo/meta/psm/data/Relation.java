/**
 */
package hu.blackbelt.judo.meta.psm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends ReferenceTypedElement, EntityMember
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EntityType getEntityType();

} // Relation
