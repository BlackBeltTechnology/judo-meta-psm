package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.judo.meta.psm.PsmUtils;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.BoundOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.OperationBody;
import hu.blackbelt.judo.meta.psm.data.*;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PsmUtilsTest extends NorthwindTest {

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	@Test
	public void testIsInstantiableMappedTransferObjectType() {
		Assertions
				.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderInfo")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderItemProduct")));
		Assertions
				.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderItem")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("ProductInfo")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("CategoryInfo")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("ProductLink")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("CategoryLink")));
		Assertions
				.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderLink")));
	}

	@Test
	public void testMappedTransferObjectOfAbstractEntity() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType = newEntityTypeBuilder().withName("entityType").withAbstract_(true).build();
		MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject")
				.withEntityType(entityType).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, transferObject)).build();

		psmModel.addContent(m);

		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(transferObject));
	}

	@Test
	public void testMappedTransferObjectOwnBoundOperation() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType = newEntityTypeBuilder().withName("entityType").withAbstract_(false).build();
		BoundOperation operation = newBoundOperationBuilder().withName("operation").build();
		MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject")
				.withEntityType(entityType).withOperations(operation).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType,transferObject))
				.build();

		psmModel.addContent(m);
		
		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(transferObject));
	}
	
	@Test
	public void testMappedTransferObjectInheritedBoundOperation() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(true).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withAbstract_(false).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation1").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation2").build();
		BoundOperation operation3 = newBoundOperationBuilder().withName("operation3").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation4 = newBoundOperationBuilder().withName("operation4").withImplementation(newOperationBodyBuilder().build()).build();
		
		MappedTransferObjectType parentOfParent = newMappedTransferObjectTypeBuilder().withName("parentOfParent")
				.withEntityType(entityType1).withOperations(operation1).build();
		MappedTransferObjectType parent1 = newMappedTransferObjectTypeBuilder().withName("parent1").withSuperTransferObjectTypes(parentOfParent)
				.withEntityType(entityType2).withOperations(operation2).build();
		MappedTransferObjectType parent2 = newMappedTransferObjectTypeBuilder().withName("parent2").withSuperTransferObjectTypes(parentOfParent)
				.withEntityType(entityType2).withOperations(operation1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withSuperTransferObjectTypes(parent1)
				.withEntityType(entityType2).withOperations(ImmutableList.of(operation3,operation4)).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2")
				.withSuperTransferObjectTypes(ImmutableList.of(parent1,parent2))
				.withEntityType(entityType2).withOperations(ImmutableList.of(operation3,operation4)).build();
		

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parentOfParent,parent1,child1))
				.build();

		psmModel.addContent(m);
		
		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(parentOfParent));
		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(parent1));
		Assertions.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(parent2));
		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(child1));
		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(child2));	
	}
	
	@Test
	public void testMappedTransferObjectBoundOperationsWithSameName() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withAbstract_(false).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation3 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		
		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).withOperations(operation1).build();
		MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType1).withOperations(operation2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withSuperTransferObjectTypes(child)
				.withEntityType(entityType2).withOperations(operation3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parent,child,grandChild))
				.build();

		psmModel.addContent(m);
		
		Assertions.assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(parent));
		Assertions.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(child));
		Assertions.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(grandChild));	
	}
	
	@Test
	public void testgetAllOperationNames() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).withAbstract_(false).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation ownOperation = newBoundOperationBuilder().withName("ownOperation").build();
		
		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).withOperations(operation1).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).withOperations(operation2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withSuperTransferObjectTypes(ImmutableList.of(child1,child2))
				.withOperations(ownOperation)
				.withEntityType(entityType3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parent,child1,child2,grandChild))
				.build();

		psmModel.addContent(m);
		
		EList<String> expected = new UniqueEList<>();
		expected.add("ownOperation");
		expected.add("operation");
		
		Assertions.assertEquals(expected,PsmUtils.getAllOperationNames(grandChild));
	}
	
	@Test
	public void testGetOperationImplementationZeroInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).withAbstract_(false).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation ownOperation = newBoundOperationBuilder().withName("ownOperation").build();
		
		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).withOperations(operation1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).withOperations(operation2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withSuperTransferObjectTypes(ImmutableList.of(child1,child2))
				.withOperations(ownOperation)
				.withEntityType(entityType3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parent,child1,child2,grandChild))
				.build();

		psmModel.addContent(m);
		
		Assertions.assertTrue(PsmUtils.getOperationImplementation(grandChild, "operation").size() == 0);
		Assertions.assertTrue(PsmUtils.getOperationImplementation(grandChild, "ownOperation").size() == 0);
	}
	
	@Test
	public void testGetOperationImplementationOneInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).withAbstract_(false).build();

		OperationBody implementation1 = newOperationBodyBuilder().build();
		OperationBody implementation2 = newOperationBodyBuilder().build();
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withImplementation(implementation1).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(implementation2).build();
		
		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).withOperations(operation1).build();
		MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType1).withOperations(operation2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withSuperTransferObjectTypes(child)
				.withEntityType(entityType3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parent,child,grandChild))
				.build();

		psmModel.addContent(m);
		
		EList<OperationBody> expected = new UniqueEList<>();
		expected.add(implementation2);
		
		Assertions.assertEquals(expected,PsmUtils.getOperationImplementation(grandChild, "operation"));
	}
	
	@Test
	public void testGetOperationImplementationTwoInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).withAbstract_(false).build();

		OperationBody implementation1 = newOperationBodyBuilder().build();
		OperationBody implementation2 = newOperationBodyBuilder().build();
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withImplementation(implementation1).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(implementation2).build();
		
		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).withOperations(operation1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).withOperations(operation2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withSuperTransferObjectTypes(ImmutableList.of(child1,child2))
				.withEntityType(entityType3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parent,child1,child2,grandChild))
				.build();

		psmModel.addContent(m);
		
		EList<OperationBody> expected = new UniqueEList<>();
		expected.add(implementation1);
		expected.add(implementation2);
		
		Assertions.assertEquals(expected,PsmUtils.getOperationImplementation(grandChild, "operation"));
	}
	
	@Test
	public void testGetOperationImplementationThreeInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).withAbstract_(false).build();

		OperationBody implementation1 = newOperationBodyBuilder().build();
		OperationBody implementation2 = newOperationBodyBuilder().build();
		OperationBody implementation3 = newOperationBodyBuilder().build();
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withImplementation(implementation1).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(implementation2).build();
		BoundOperation operation3 = newBoundOperationBuilder().withName("operation").withImplementation(implementation3).build();
		
		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).withOperations(operation1).build();
		
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).withOperations(operation2).build();
		MappedTransferObjectType child3 = newMappedTransferObjectTypeBuilder().withName("child3").withSuperTransferObjectTypes(parent)
				.withEntityType(entityType2).withOperations(operation3).build();
		
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withSuperTransferObjectTypes(ImmutableList.of(child1,child2,child3))
				.withEntityType(entityType3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,parent,child1,child2,child3,grandChild))
				.build();

		psmModel.addContent(m);
		
		EList<OperationBody> expected = new UniqueEList<>();
		expected.add(implementation1);
		expected.add(implementation2);
		expected.add(implementation3);
		
		Assertions.assertEquals(expected,PsmUtils.getOperationImplementation(grandChild, "operation"));
	}
	
	
}
