package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.judo.meta.psm.PsmUtils;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.BoundOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.OperationBody;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newNavigationPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		Assertions
				.assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderItem")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("ProductInfo")));
		Assertions.assertTrue(
				PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("CategoryInfo")));
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
		
		Assertions.assertTrue(PsmUtils.getInheritedOperationImplementationsByName(grandChild, "operation").size() == 0);
		Assertions.assertTrue(PsmUtils.getInheritedOperationImplementationsByName(grandChild, "ownOperation").size() == 0);
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
				
		EList<OperationBody> expected = new UniqueEList<>(Arrays.asList(implementation2));
		
		Assertions.assertEquals(expected,PsmUtils.getInheritedOperationImplementationsByName(grandChild, "operation"));
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
		
		EList<OperationBody> expected = new UniqueEList<>(Arrays.asList(implementation1,implementation2));
		
		Assertions.assertEquals(expected,PsmUtils.getInheritedOperationImplementationsByName(grandChild, "operation"));
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
		
		EList<OperationBody> expected = new UniqueEList<>(Arrays.asList(implementation1,implementation2,implementation3));
		
		Assertions.assertEquals(expected,PsmUtils.getInheritedOperationImplementationsByName(grandChild, "operation"));
	}
	
	@Test
	public void testGetAllRelations() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
        AssociationEnd relation1 = newAssociationEndBuilder().withName("r1").withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();
        AssociationEnd relation2 = newAssociationEndBuilder().withName("r2").withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();
        AssociationEnd relation3 = newAssociationEndBuilder().withName("r3").withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();
        AssociationEnd relation4= newAssociationEndBuilder().withName("r4").withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withRelations(relation1).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withRelations(relation2).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withRelations(relation3).build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4)).withRelations(relation4).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5))
				.build();

		psmModel.addContent(m);
		
		Set<Relation> expected = new HashSet<>(new UniqueEList<>(Arrays.asList(relation1,relation2,relation3,relation4)));
		Set<Relation> actual = new HashSet<>(PsmUtils.getAllRelations(entityType5));
		
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetAllAttributes() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
        NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();
        
        Attribute attribute1 = newAttributeBuilder().withName("a1").withDataType(integer).build();
        Attribute attribute2 = newAttributeBuilder().withName("a2").withDataType(integer).build();
        Attribute attribute3 = newAttributeBuilder().withName("a3").withDataType(integer).build();
        Attribute attribute4 = newAttributeBuilder().withName("a4").withDataType(integer).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAttributes(attribute1).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAttributes(attribute2).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withAttributes(attribute3).build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4)).withAttributes(attribute4).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5,integer))
				.build();

		psmModel.addContent(m);
		
		Set<Attribute> expected = new HashSet<>(new UniqueEList<>(Arrays.asList(attribute1,attribute2,attribute3,attribute4)));
		Set<Attribute> actual = new HashSet<>(PsmUtils.getAllAttributes(entityType5));
		
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetAllDataProperties() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
        NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();
        
        Attribute attribute1 = newAttributeBuilder().withName("a1").withDataType(integer).build();
        Attribute attribute2 = newAttributeBuilder().withName("a2").withDataType(integer).build();
        Attribute attribute3 = newAttributeBuilder().withName("a3").withDataType(integer).build();
        Attribute attribute4 = newAttributeBuilder().withName("a4").withDataType(integer).build();
        
        DataProperty property1 = newDataPropertyBuilder().withName("property1").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.a1").build()
        		).build();
        DataProperty property2 = newDataPropertyBuilder().withName("property2").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.a2").build()
        		).build();
        DataProperty property3 = newDataPropertyBuilder().withName("property3").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.a3").build()
        		).build();
        DataProperty property4 = newDataPropertyBuilder().withName("property4").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.a4").build()
        		).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withAttributes(attribute1)
				.withDataProperties(property1)
				.build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withAttributes(attribute2)
				.withDataProperties(property2)
				.build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withAttributes(attribute3)
				.withDataProperties(property3)
				.build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4))
				.withDataProperties(property4)
				.withAttributes(attribute4)
				.build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5,integer))
				.build();

		psmModel.addContent(m);
		
		Set<DataProperty> expected = new HashSet<>(new UniqueEList<>(Arrays.asList(property1,property2,property3,property4)));
		Set<DataProperty> actual = new HashSet<>(PsmUtils.getAllDataProperties(entityType5));
		
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetAllNavigationProperties() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
        AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e3 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e4 = newAssociationEndBuilder().withName("e4").withCardinality(newCardinalityBuilder().build()).build();

        NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation1").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e1").build()
        ).build();
        NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("navigation2").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e2").build()
        ).build();
        NavigationProperty navigation3 = newNavigationPropertyBuilder().withName("navigation3").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e3").build()
        ).build();
        NavigationProperty navigation4 = newNavigationPropertyBuilder().withName("navigation4").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e4").build()
        ).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withRelations(e1)
				.withNavigationProperties(navigation1)
				.build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withRelations(e2)
				.withNavigationProperties(navigation2)
				.build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withRelations(e3)
				.withNavigationProperties(navigation3)
				.build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4))
				.withRelations(e4)
				.withNavigationProperties(navigation4)
				.build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5))
				.build();

		psmModel.addContent(m);
		
		Set<NavigationProperty> expected = new HashSet<>(new UniqueEList<>(Arrays.asList(navigation1,navigation2,navigation3,navigation4)));
		Set<NavigationProperty> actual = new HashSet<>(PsmUtils.getAllNavigationProperties(entityType5));
		
		Assertions.assertEquals(expected,actual);
	}
	
}