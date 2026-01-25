/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint;

import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;

import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.judo.meta.psm.type.Type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getSuperEntityTypes <em>Super Entity Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getNavigationProperties <em>Navigation Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getSequences <em>Sequences</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getOperations <em>Operations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.EntityType#getDefaultRepresentation <em>Default Representation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends Type
{
	/**
	 * Returns the value of the '<em><b>Super Entity Types</b></em>' reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Entity Types</em>' reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_SuperEntityTypes()
	 * @model
	 * @generated
	 */
	EList<EntityType> getSuperEntityTypes();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_Abstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Data Properties</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.derived.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Properties</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_DataProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProperty> getDataProperties();

	/**
	 * Returns the value of the '<em><b>Navigation Properties</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.derived.NavigationProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Properties</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_NavigationProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationProperty> getNavigationProperties();

	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.EntitySequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_Sequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntitySequence> getSequences();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.BoundOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvariantConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Default Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Representation</em>' reference.
	 * @see #setDefaultRepresentation(MappedTransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getEntityType_DefaultRepresentation()
	 * @model
	 * @generated
	 */
	MappedTransferObjectType getDefaultRepresentation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getDefaultRepresentation <em>Default Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Representation</em>' reference.
	 * @see #getDefaultRepresentation()
	 * @generated
	 */
	void setDefaultRepresentation(MappedTransferObjectType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<EntityType> getAllSuperEntityTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	PrimitiveTypedElement getAttribute(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	ReferenceTypedElement getReference(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	Primitive getAttributeType(String name);

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
	boolean isContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Relation> getAllRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAllAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<DataProperty> getAllDataProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<NavigationProperty> getAllNavigationProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<EntitySequence> getAllSequences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 * @generated
	 */
	OperationBody getInheritedOperationImplementationByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	EList<OperationBody> getInheritedOperationImplementationsByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getInheritedOperationNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getAllOperationNames();

} // EntityType
