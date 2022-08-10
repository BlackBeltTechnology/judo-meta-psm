package hu.blackbelt.judo.meta.psm;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import com.google.common.collect.ImmutableList;
import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntitySequence;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.OperationBody;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static hu.blackbelt.judo.meta.psm.PsmUtils.setId;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static org.junit.jupiter.api.Assertions.*;

public class PsmUtilsTest extends NorthwindTest {

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	@Test
	public void testIsInstantiableMappedTransferObjectType() {
		assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderInfo")));
		assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("OrderItem")));
		assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("ProductInfo")));
		assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(getMappedTransferObjectType("CategoryInfo")));
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

		assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(transferObject));
	}

	@Test
	public void testMappedTransferObjectOwnBoundOperation() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		BoundOperation operation = newBoundOperationBuilder().withName("operation").withAbstract_(true).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType").withAbstract_(true).withOperations(operation).build();
		MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject")
				.withEntityType(entityType).withOperations(newBoundTransferOperationBuilder().withBinding(operation).withName("op").build()).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType,transferObject))
				.build();

		psmModel.addContent(m);

		assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(transferObject));
	}

	@Test
	public void testMappedTransferObjectBoundOperationsWithSameName() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withAbstract_(false).withSuperEntityTypes(entityType1).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType2").withAbstract_(false).withSuperEntityTypes(entityType2).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withAbstract_(true).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation3 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();

		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();
		MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child")
				.withEntityType(entityType2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withEntityType(entityType3).build();
		
		entityType1.getOperations().add(operation1);
		entityType2.getOperations().add(operation2);
		entityType3.getOperations().add(operation3);

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,parent,child,grandChild))
				.build();

		psmModel.addContent(m);

		assertFalse(PsmUtils.isInstantiableMappedTransferObjectType(parent));
		assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(child));
		assertTrue(PsmUtils.isInstantiableMappedTransferObjectType(grandChild));
	}

	@Test
	public void testgetAllOperationNames() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType2,entityType3)).withAbstract_(false).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").build();
		BoundOperation ownOperation = newBoundOperationBuilder().withName("ownOperation").build();

		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1")
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2")
				.withEntityType(entityType2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withEntityType(entityType3).build();
		
		entityType2.getOperations().add(operation1);
		entityType3.getOperations().add(operation2);
		entityType4.getOperations().add(ownOperation);

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,parent,child1,child2,grandChild))
				.build();

		psmModel.addContent(m);

		EList<String> expected = new UniqueEList<>();
		expected.add("ownOperation");
		expected.add("operation");

		Assertions.assertEquals(expected,PsmUtils.getAllOperationNames(entityType4));
	}

	@Test
	public void testGetOperationImplementationZeroInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType2,entityType3)).withAbstract_(false).build();

		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withAbstract_(true).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withAbstract_(true).build();
		BoundOperation ownOperation = newBoundOperationBuilder().withName("ownOperation").withAbstract_(true).build();

		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1")
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2")
				.withEntityType(entityType3).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withEntityType(entityType4).build();
		
		entityType1.getOperations().add(operation1);
		entityType3.getOperations().add(operation2);
		entityType4.getOperations().add(ownOperation);

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,parent,child1,child2,grandChild))
				.build();

		psmModel.addContent(m);

		assertTrue(PsmUtils.getInheritedOperationImplementationsByName(entityType4, "operation").size() == 0);
		assertTrue(PsmUtils.getInheritedOperationImplementationsByName(entityType4, "ownOperation").size() == 0);
	}

	@Test
	public void testGetOperationImplementationOneInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		OperationBody implementation1 = newOperationBodyBuilder().build();
		OperationBody implementation2 = newOperationBodyBuilder().build();
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withAbstract_(false).withImplementation(implementation1).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withAbstract_(false).withImplementation(implementation2).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(false)
				.withOperations(operation1).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withOperations(operation2).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).withAbstract_(false).build();

		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();
		MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child")
				.withEntityType(entityType2).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withEntityType(entityType3).build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,parent,child,grandChild))
				.build();

		psmModel.addContent(m);

		EList<OperationBody> expected = new UniqueEList<>(Arrays.asList(implementation2));

		Assertions.assertEquals(expected,PsmUtils.getInheritedOperationImplementationsByName(entityType3, "operation"));
	}

	@Test
	public void testGetOperationImplementationTwoInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		OperationBody implementation1 = newOperationBodyBuilder().build();
		OperationBody implementation2 = newOperationBodyBuilder().build();
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withImplementation(implementation1).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(implementation2).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withOperations(operation1).withAbstract_(false).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withOperations(operation2).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType2,entityType3)).withAbstract_(false).build();

		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();
		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1")
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2")
				.withEntityType(entityType3).build();
		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withEntityType(entityType3).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,parent,child1,child2,grandChild))
				.build();

		psmModel.addContent(m);

		Assertions.assertEquals(2,PsmUtils.getInheritedOperationImplementationsByName(entityType4, "operation").size());
		assertTrue(PsmUtils.getInheritedOperationImplementationsByName(entityType4, "operation").contains(implementation1));
		assertTrue(PsmUtils.getInheritedOperationImplementationsByName(entityType4, "operation").contains(implementation2));
	}

	@Test
	public void testGetOperationImplementationThreeInherited() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();

		OperationBody implementation1 = newOperationBodyBuilder().build();
		OperationBody implementation2 = newOperationBodyBuilder().build();
		OperationBody implementation3 = newOperationBodyBuilder().build();
		
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation").withImplementation(implementation1).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation").withImplementation(implementation2).build();
		BoundOperation operation3 = newBoundOperationBuilder().withName("operation").withImplementation(implementation3).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withAbstract_(false).withOperations(operation1).build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2")
				.withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType3 = newEntityTypeBuilder().withOperations(operation2).withName("entityType3")
				.withSuperEntityTypes(entityType1).withAbstract_(false).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withSuperEntityTypes(entityType1).withOperations(operation3).withAbstract_(false).build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5")
				.withSuperEntityTypes(ImmutableList.of(entityType2,entityType3,entityType4)).withAbstract_(false).build();

		MappedTransferObjectType parent = newMappedTransferObjectTypeBuilder().withName("parent")
				.withEntityType(entityType1).build();

		MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1")
				.withEntityType(entityType2).build();
		MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2")
				.withEntityType(entityType3).build();
		MappedTransferObjectType child3 = newMappedTransferObjectTypeBuilder().withName("child3")
				.withEntityType(entityType4).build();

		MappedTransferObjectType grandChild = newMappedTransferObjectTypeBuilder().withName("grandChild")
				.withEntityType(entityType5).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5,parent,child1,child2,child3,grandChild))
				.build();

		psmModel.addContent(m);

		EList<OperationBody> expected = new UniqueEList<>(Arrays.asList(implementation1,implementation2,implementation3));

		Assertions.assertEquals(expected,PsmUtils.getInheritedOperationImplementationsByName(entityType5, "operation"));
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
	
	@Test
	public void testGetAllSequences() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
        EntitySequence s1 = newEntitySequenceBuilder().withName("s1").build();
        EntitySequence s2 = newEntitySequenceBuilder().withName("s2").build();
        EntitySequence s3 = newEntitySequenceBuilder().withName("s3").build();
        EntitySequence s4 = newEntitySequenceBuilder().withName("s4").build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withSequences(s1)
				.build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withSequences(s2)
				.build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withSequences(s3)
				.build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4))
				.withSequences(s4)
				.build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5))
				.build();

		psmModel.addContent(m);
		
		Set<EntitySequence> expected = new HashSet<>(new UniqueEList<>(Arrays.asList(s1,s2,s3,s4)));
		Set<EntitySequence> actual = new HashSet<>(PsmUtils.getAllSequences(entityType5));
		
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetAllBoundOperations() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
		BoundOperation operation1 = newBoundOperationBuilder().withName("operation1").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation2 = newBoundOperationBuilder().withName("operation2").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation3 = newBoundOperationBuilder().withName("operation3").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation4 = newBoundOperationBuilder().withName("operation4").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation operation5 = newBoundOperationBuilder().withName("operation5").withImplementation(newOperationBodyBuilder().build()).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withOperations(operation1)
				.build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withOperations(operation2)
				.build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withOperations(ImmutableList.of(operation3,operation4))
				.build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4))
				.withOperations(operation5)
				.build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5))
				.build();

		psmModel.addContent(m);
		
		Set<BoundOperation> expected = new HashSet<>(new UniqueEList<>(Arrays.asList(operation1,operation2,operation3,operation4,operation5)));
		Set<BoundOperation> actual = new HashSet<>(PsmUtils.getAllBoundOperations(entityType5));
		
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	public void testGetInheritedOperationsByName() {
		final PsmModel psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test")
				.build();
		
		BoundOperation binding1 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation binding2 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation binding3 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation binding4 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withOperations(binding1)
				.build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withOperations(binding2)
				.build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2)
				.withOperations(binding3)
				.build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withOperations(ImmutableList.of(binding4))
				.build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4))
				.build();
		
		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType1,entityType2,entityType3,entityType4,entityType5))
				.build();

		psmModel.addContent(m);
		
		EList<BoundOperation> expected1 = PsmUtils.getInheritedBoundOperationsByName(entityType5, "operation");
		Assertions.assertEquals(2,expected1.size());
		assertTrue(expected1.contains(binding4));
		assertTrue(expected1.contains(binding3));

	}

	@Test
	public void testValidateUniqueXmiids() {
		final PsmModel psmModel = PsmModel.buildPsmModel()
				.uri(URI.createURI(createdSourceModelName))
				.name("test")
				.build();

		final Model m = newModelBuilder().withName("M").build();
		psmModel.addContent(m);

		final PsmUtils psmUtils = new PsmUtils();

		final EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
		final EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
		m.getElements().addAll(Arrays.asList(entityType1, entityType2));

		// #1 - unknown ResourceSet
		assertThrows(IllegalStateException.class, psmUtils::validateUniqueXmiids);

		psmUtils.setResourceSet(psmModel.getResourceSet());

		// #2 - unique xmiid
		setId(entityType1, "EntityType1Xmiid");
		setId(entityType2, "EntityType2Xmiid");

		psmUtils.validateUniqueXmiids();

		// #3 - non-unique xmiid
		setId(entityType2, "EntityType1Xmiid");

		assertThrows(IllegalStateException.class, psmUtils::validateUniqueXmiids);
	}

}
