package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.constraint.util.builder.ConstraintBuilders.newInvariantConstraintBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

@Slf4j
class PsmValidationDataTest {

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	private PsmModel psmModel;

	@BeforeEach
	void setUp() {
		psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test").build();
	}

	private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
		try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
			bufferedLog.debug("PSM diagnostics: " + psmModel.getDiagnosticsAsString());
        	Assertions.assertTrue(psmModel.isValid());
			PsmEpsilonValidator.validatePsm(bufferedLog, psmModel,
					new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."), expectedErrors,
					expectedWarnings);
		} catch (EvlScriptExecutionException ex) {
			log.error("EVL failed", ex);
			log.error("\u001B[31m - expected errors: {}\u001B[0m", expectedErrors);
			log.error("\u001B[31m - unexpected errors: {}\u001B[0m", ex.getUnexpectedErrors());
			log.error("\u001B[31m - errors not found: {}\u001B[0m", ex.getErrorsNotFound());
			log.error("\u001B[33m - expected warnings: {}\u001B[0m", expectedWarnings);
			log.error("\u001B[33m - unexpected warnings: {}\u001B[0m", ex.getUnexpectedWarnings());
			log.error("\u001B[33m - warnings not found: {}\u001B[0m", ex.getWarningsNotFound());
			throw ex;
		}
	}

	@Test
	void testCardinalityUpperIsAtLeastOneAssociationEnd() throws Exception {
		log.info("Testing constraint: CardinalityUpperIsAtLeastOne");

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd endpoint1 = newAssociationEndBuilder().withName("endpoint1").withTarget(target)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(0).build()).build();

		AssociationEnd endpoint2 = newAssociationEndBuilder().withName("endpoint2").withTarget(target)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-2).build()).build();

		EntityType entity = newEntityTypeBuilder().withName("entity")
				.withRelations(ImmutableList.of(endpoint1, endpoint2)).build();
		
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity,target)).build();
		
		psmModel.addContent(m);
		
		runEpsilon(ImmutableList.of("CardinalityUpperIsAtLeastOne|Invalid upper attribute of element: endpoint1",
				"CardinalityUpperIsAtLeastOne|Invalid upper attribute of element: endpoint2",
				"CardinalityLowerMustBeLessOrEqualToUpper|Lower (0) must be less or equal to upper (-2) of element: endpoint2"),
				Collections.emptyList());
	}

	@Test
	void testCardinalityLowerIsGreaterThanOrEqualToZeroContainment() throws Exception {
		log.info("Testing constraint: CardinalityLowerIsGreaterThanOrEqualToZero");

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		Containment containment = newContainmentBuilder().withName("containment")
				.withCardinality(newCardinalityBuilder().withLower(-4).withUpper(1).build())
				.withTarget(target).build();

		EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(containment).build();
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity,target)).build();
		psmModel.addContent(m);
		runEpsilon(ImmutableList.of(
				"CardinalityLowerIsGreaterThanOrEqualToZero|Lower attribute of element: containment must be greater than or equal to zero"),
				Collections.emptyList());
	}

	@Test
	void testCardinalityLowerMustBeLessOrEqualToUpper() throws Exception {
		log.info("Testing constraint: CardinalityLowerMustBeLessOrEqualToUpper");

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd endpoint = newAssociationEndBuilder().withName("endpoint")
				.withCardinality(newCardinalityBuilder().withLower(3).withUpper(1).build())
				.withTarget(target).build();

		EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(ImmutableList.of(endpoint)).build();
		
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity,target)).build();
		
		psmModel.addContent(m);
		
		runEpsilon(ImmutableList.of(
				"CardinalityLowerMustBeLessOrEqualToUpper|Lower (3) must be less or equal to upper (1) of element: endpoint"),
				Collections.emptyList());
	}

	@Test
	void testCascadeDeleteOnlyAllowedIfUpperCardinalityIsOne() throws Exception {
		log.info("Testing constraint: CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne");
		
		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd endpoint = newAssociationEndBuilder().withName("endpoint")
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(2).build())
				.withTarget(target)
				.withReverseCascadeDelete(true).build();
		
		EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(ImmutableList.of(endpoint)).build();
		
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity,target)).build();
		
		psmModel.addContent(m);
		
		runEpsilon(ImmutableList.of(
				"CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne|Cascade delete behavior only allowed on endpoints if their upper cardinality is 1: endpoint"),
				Collections.emptyList());
	}

	@Test
	void testPartnerIsNotSelf() throws Exception {
		log.info("Testing constraint: PartnerIsNotSelf");

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e1).build();

		e1.setTarget(E1);
		e1.setPartner(e1);

		Model m = newModelBuilder().withName("M").withElements(E1).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("PartnerIsNotSelf|Self partner relation found: M::E1.e1"), Collections.emptyList());
	}

	@Test
	void testOppositePartnerIsDefined() throws Exception {
		log.info("Testing constraint: OppositePartnerIsDefined");

		AssociationEnd e = newAssociationEndBuilder().withName("e").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd f = newAssociationEndBuilder().withName("f").withCardinality(newCardinalityBuilder().build())
				.build();

		EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e).build();
		EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(f).build();

		e.setTarget(E2);
		f.setTarget(E1);
		f.setPartner(e);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1, E2)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("OppositePartnerIsDefined|Missing opposite partner relation for M::E2.f"),
				Collections.emptyList());
	}

	@Test
	void testValidPartnerRelations() throws Exception {
		log.info("Testing constraint: ValidPartnerRelations");

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e3 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build())
				.build();

		EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(ImmutableList.of(e1, e2, e3)).build();

		e1.setTarget(E1);
		e1.setPartner(e2);
		e2.setTarget(E1);
		e2.setPartner(e3);
		e3.setTarget(E1);
		e3.setPartner(e2);

		Model m = newModelBuilder().withName("M").withElements(E1).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("ValidPartnerRelations|Opposite partner relation of M::E1.e2 must be M::E1.e1"),
				Collections.emptyList());
	}

	@Test
	void testValidPartnerType() throws Exception {
		log.info("Testing constraint: ValidPartnerType");

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e3 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build())
				.build();

		EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(ImmutableList.of(e2, e3)).build();
		EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(e1).build();
		EntityType E3 = newEntityTypeBuilder().withName("E3").build();

		e1.setTarget(E1);
		e1.setPartner(e3);
		e2.setTarget(E2);
		e3.setTarget(E3);
		e3.setPartner(e1);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1, E2, E3)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("ValidPartnerType|Invalid partner type: M::E2.e1 for M::E1.e3",
				"ValidPartnerType|Invalid partner type: M::E1.e3 for M::E2.e1"), Collections.emptyList());
	}

	@Test
	void testAtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound() throws Exception {
		log.info("Testing critique: AtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound");

		AssociationEnd endpoint1 = newAssociationEndBuilder().withName("endpoint1")
				.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();
		AssociationEnd endpoint2 = newAssociationEndBuilder().withName("endpoint2")
				.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();

		EntityType entity1 = newEntityTypeBuilder().withName("entity1").withRelations(ImmutableList.of(endpoint1))
				.build();
		EntityType entity2 = newEntityTypeBuilder().withName("entity2").withRelations(ImmutableList.of(endpoint2))
				.build();

		endpoint1.setPartner(endpoint2);
		endpoint1.setTarget(entity2);
		endpoint2.setPartner(endpoint1);
		endpoint2.setTarget(entity1);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity1, entity2)).build();

		psmModel.addContent(m);
		runEpsilon(Collections.emptyList(), ImmutableList.of(
				"AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound|At least one reference of a bidirectional association should have lower bound with zero: M::entity1.endpoint1 or M::entity2.endpoint2",
				"AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound|At least one reference of a bidirectional association should have lower bound with zero: M::entity2.endpoint2 or M::entity1.endpoint1"));
	}

	@Test
	void testEntityTypeNamesAreUnique() throws Exception {
		log.info("Testing critique: EntityTypeNamesAreUnique");

		EntityType entity1 = newEntityTypeBuilder().withName("entity").build();
		EntityType entity2 = newEntityTypeBuilder().withName("Entity").build();
		Package p1 = newPackageBuilder().withName("pkg1").withElements(entity1).build();
		Package p2 = newPackageBuilder().withName("pkg2").withElements(entity2).build();

		Model m = newModelBuilder().withName("M").withPackages(ImmutableList.of(p1, p2)).build();

		psmModel.addContent(m);
		runEpsilon(Collections.emptyList(),
				ImmutableList.of("EntityTypeNamesAreUnique|There are two or more entity types of the same name: entity",
						"EntityTypeNamesAreUnique|There are two or more entity types of the same name: Entity"));
	}

	@Test
	void testInheritanceIsNotRecursive() throws Exception {
		log.info("Testing constraint: InheritanceIsNotRecursive");

		EntityType E1 = newEntityTypeBuilder().withName("E1").build();
		EntityType E2 = newEntityTypeBuilder().withName("E2").build();
		EntityType E3 = newEntityTypeBuilder().withName("E3").build();

		E1.getSuperEntityTypes().add(E2);
		E2.getSuperEntityTypes().add(E1);
		E3.getSuperEntityTypes().add(E3);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1, E2, E3)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("InheritanceIsNotRecursive|Entity type E1 is recursive",
				"InheritanceIsNotRecursive|Entity type E2 is recursive",
				"InheritanceIsNotRecursive|Entity type E3 is recursive"), Collections.emptyList());
	}

	@Test
	void testInheritedAndOwnAttributeNameIsUniqueInEntityType() throws Exception {
		log.info("Testing constraint: InheritedAndOwnAttributeNameIsUniqueInEntityType");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(string).build();
		Attribute negtest_member1 = newAttributeBuilder().withName("negtest_member").withDataType(string).build();

		Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(string).build();
		Attribute negtest_member2 = newAttributeBuilder().withName("negtest_Member").withDataType(string).build();

		Attribute attribute3 = newAttributeBuilder().withName("attribute3").withDataType(string).build();
		
		AssociationEnd negtest_member3 = newAssociationEndBuilder().withName("negtest_member")
				.withTarget(target)
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		EntityType superSuperEntityType = newEntityTypeBuilder().withName("superSuperEntityType")
				.withAttributes(ImmutableList.of(attribute3)).withRelations(ImmutableList.of(negtest_member3)).build();
		EntityType superEntityType = newEntityTypeBuilder().withName("superEntityType")
				.withAttributes(ImmutableList.of(negtest_member2, attribute2))
				.withSuperEntityTypes(ImmutableList.of(superSuperEntityType)).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withAttributes(ImmutableList.of(attribute1, negtest_member1))
				.withSuperEntityTypes(ImmutableList.of(superEntityType)).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType, superEntityType, superSuperEntityType, string, target)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("InheritedAndOwnAttributeNameIsUniqueInEntityType|"
				+ "Attribute: negtest_member has the same name as inherited content(s) of entity type: entityType",
				"InheritedAndOwnAttributeNameIsUniqueInEntityType|"
						+ "Attribute: negtest_Member has the same name as inherited content(s) of entity type: superEntityType",
				"InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited relation(s) and inherited attribute(s) of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritedAndOwnRelationNameIsUniqueInEntityType() throws Exception {
		log.info("Testing constraint: InheritedAndOwnRelationNameIsUniqueInEntityType");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		Attribute attribute1 = newAttributeBuilder().withName("attribute2").withDataType(string).build();
		AssociationEnd relation1 = newAssociationEndBuilder().withName("member").withTarget(target)
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		Attribute attribute2 = newAttributeBuilder().withName("MEMBER").withDataType(string).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("relation").withTarget(target)
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		Attribute attribute3 = newAttributeBuilder().withName("attribute3").withDataType(string).build();
		AssociationEnd relation3 = newAssociationEndBuilder().withName("Member").withTarget(target)
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		EntityType superSuperEntityType = newEntityTypeBuilder().withName("superSuperEntityType")
				.withAttributes(ImmutableList.of(attribute3)).withRelations(ImmutableList.of(relation3)).build();
		EntityType superEntityType = newEntityTypeBuilder().withName("superEntityType")
				.withAttributes(ImmutableList.of(attribute2)).withRelations(ImmutableList.of(relation2))
				.withSuperEntityTypes(ImmutableList.of(superSuperEntityType)).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withAttributes(ImmutableList.of(attribute1)).withRelations(ImmutableList.of(relation1))
				.withSuperEntityTypes(ImmutableList.of(superEntityType)).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(entityType, superEntityType, superSuperEntityType, string, target)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of(
				"InheritedAndOwnRelationNameIsUniqueInEntityType|"
						+ "Relation: member has the same name as inherited content(s) of entity type: entityType",
				"InheritedAndOwnAttributeNameIsUniqueInEntityType|"
						+ "Attribute: MEMBER has the same name as inherited content(s) of entity type: superEntityType",
				"InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited relation(s) and inherited attribute(s) of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueAttributeNamesLowerCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute").withDataType(string).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(string).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, string))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueAttributeNames|"
						+ "Entity type: entityType has inherited attributes of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueAttributeNamesMixedCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute").withDataType(string).build();
		Attribute attribute2 = newAttributeBuilder().withName("Attribute").withDataType(string).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, string))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueAttributeNames|"
						+ "Entity type: entityType has inherited attributes of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueRelationNamesLowerCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd relation1 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build())
				.withTarget(target).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build())
				.withTarget(target).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(relation1))
				.build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(relation2))
				.build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, target)).build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueRelationNames|"
						+ "Entity type: entityType has inherited relations of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueRelationNamesMixedCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd relation1 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build())
				.withTarget(target).build();
		
		AssociationEnd relation2 = newAssociationEndBuilder().withName("Relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build())
				.withTarget(target).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(relation1))
				.build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(relation2))
				.build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, target)).build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueRelationNames|"
						+ "Entity type: entityType has inherited relations of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueDataPropertyNamesLowerCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		Attribute attribute1 = newAttributeBuilder().withName("member").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(integer).build();

		DataProperty property1 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute").build()).build();
		DataProperty property2 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withDataProperties(property1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withDataProperties(property2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueDataPropertyNames|"
						+ "Entity type: entityType has inherited data properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueDataPropertyNamesMixedCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		Attribute attribute1 = newAttributeBuilder().withName("member").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(integer).build();

		DataProperty property1 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute").build()).build();
		DataProperty property2 = newDataPropertyBuilder().withName("PROPERTY").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withDataProperties(property1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withDataProperties(property2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueDataPropertyNames|"
						+ "Entity type: entityType has inherited data properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueNavigationPropertyNamesLowerCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd e1 = newAssociationEndBuilder().withName("e1")
				.withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2")
				.withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build())
				.withTarget(target)
				.build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build())
				.withTarget(target)
				.build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(e1))
				.withNavigationProperties(ImmutableList.of(navigation1)).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(e2))
				.withNavigationProperties(ImmutableList.of(navigation2)).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueNavigationPropertyNames|"
						+ "Entity type: entityType has inherited navigation properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueNavigationPropertyNamesMixedCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.withTarget(target).build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.withTarget(target).build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("Navigation")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(e1))
				.withNavigationProperties(ImmutableList.of(navigation1)).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(e2))
				.withNavigationProperties(ImmutableList.of(navigation2)).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingUniqueNavigationPropertyNames|"
						+ "Entity type: entityType has inherited navigation properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedAttributesAndRelations() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		Attribute attribute1 = newAttributeBuilder().withName("member").withDataType(string).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(string).build();
		
		AssociationEnd relation1 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withRelations(relation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withRelations(relation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, string, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited relation(s) and inherited attribute(s) of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedAttributesAndDataProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		Attribute attribute1 = newAttributeBuilder().withName("member").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(integer).build();

		DataProperty property1 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute").build()).build();
		DataProperty property2 = newDataPropertyBuilder().withName("MEMBER").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withDataProperties(property1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withDataProperties(property2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingAttributesAndDataPropertiesOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited attribute(s) and inherited data properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedAttributesAndNavigationProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("member").withDataType(integer).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withRelations(e1).withNavigationProperties(navigation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withRelations(e2).withNavigationProperties(navigation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingAttributesAndNavigationPropertiesOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited attribute(s) and inherited navigation properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedRelationsAndDataProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd relation1 = newAssociationEndBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(integer).build();

		DataProperty property1 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute1").build()).build();
		DataProperty property2 = newDataPropertyBuilder().withName("MEMBER").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute2").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withDataProperties(property1).withRelations(relation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withDataProperties(property2).withRelations(relation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingRelationsAndDataPropertiesOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited relation(s) and inherited data properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedRelationsAndNavigationProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd e1 = newAssociationEndBuilder().withName("member").withTarget(target)
				.withCardinality(newCardinalityBuilder().build()).build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withTarget(target)
				.withCardinality(newCardinalityBuilder().build()).build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.member").build())
				.build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(integer).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withRelations(e1).withNavigationProperties(navigation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withRelations(e2).withNavigationProperties(navigation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingRelationsAndNavigationPropertiesOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited relation(s) and inherited navigation properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedDataPropertiesAndNavigationProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.withTarget(target).build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.withTarget(target).build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).withTarget(target)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		DataProperty property1 = newDataPropertyBuilder().withName("MEMBER").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute1").build()).build();
		DataProperty property2 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute2").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withDataProperties(property1).withRelations(e1)
				.withNavigationProperties(navigation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withDataProperties(property2).withRelations(e2)
				.withNavigationProperties(navigation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingDataPropertiesAndNavigationPropertiesOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited data properties and inherited navigation properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedEntitySequences() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		EntityType target = newEntityTypeBuilder().withName("target").build();
		
		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.withTarget(target)
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withTarget(target)
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("member1")
				.withTarget(target)
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		DataProperty property1 = newDataPropertyBuilder().withName("MEMBER2").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute1").build()).build();
		DataProperty property2 = newDataPropertyBuilder().withName("property").withDataType(integer)
				.withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.attribute2").build()).build();

		EntitySequence sequence1 = newEntitySequenceBuilder().withName("Member1").build();
		EntitySequence sequence2 = newEntitySequenceBuilder().withName("Member2").build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withDataProperties(property1).withRelations(e1)
				.withNavigationProperties(navigation1).withSequences(sequence1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withDataProperties(property2).withRelations(e2)
				.withNavigationProperties(navigation2).withSequences(sequence2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer, target))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingSequencesAndDataPropertiesOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited sequence(s) and inherited data properties of the same name.",
						"InheritingSequencesAndNavigationPropertiesOfTheSameNameIsNotAllowed|"
								+ "Entity type: entityType has inherited sequence(s) and inherited navigation properties of the same name."),
				Collections.emptyList());
	}

	@Test
	void testValidInitialValue() throws Exception {
		log.info("Testing constraint: ValidInitialValue");

		EntityType entityType = newEntityTypeBuilder().withName("entityType").build();

		EntitySequence sequence = newEntitySequenceBuilder().withName("sequence").withInitialValue(-5l).build();

		entityType.getSequences().add(sequence);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType)).build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of(
						"ValidInitialValue|Initial value of sequence: sequence must be greater than or equal to zero"),
				Collections.emptyList());
	}

	@Test
	void testValidIncrement() throws Exception {
		log.info("Testing constraint: ValidIncrement");

		EntityType entityType = newEntityTypeBuilder().withName("entityType").build();

		EntitySequence sequence = newEntitySequenceBuilder().withName("sequence").withIncrement(0l).build();

		entityType.getSequences().add(sequence);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("ValidIncrement|Increment of sequence: sequence must be greater than zero"),
				Collections.emptyList());
	}

	@Test
	void testValidMaximumValue() throws Exception {
		log.info("Testing constraint: ValidMaximumValue");

		EntityType entityType = newEntityTypeBuilder().withName("entityType").build();

		EntitySequence sequence = newEntitySequenceBuilder().withName("sequence").withInitialValue(2l).withIncrement(5l)
				.withMaximumValue(6l).build();

		entityType.getSequences().add(sequence);

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of(
				"ValidMaximumValue|Maximum value of sequence: sequence must be greater than or equal to the sum of initial value and increment"),
				Collections.emptyList());
	}
	
	@Test
	void testInheritedOperationsAreValid() throws Exception {
		log.info("Testing constraint: InheritedOperationsAreValid");
		
		UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
		
		BoundOperation op1 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		BoundOperation op2 = newBoundOperationBuilder().withName("operation").withImplementation(newOperationBodyBuilder().build()).build();
		
		BoundOperation op3 = newBoundOperationBuilder().withName("operation")
				.withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()).build())
				.withImplementation(newOperationBodyBuilder().build()).build();
		
		BoundOperation op4 = newBoundOperationBuilder().withName("operation")
				.withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()).build())
				.withImplementation(newOperationBodyBuilder().build()).build();
		
		EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
				.withOperations(op1)
				.build();
		EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1)
				.withOperations(op2)
				.build();
		EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2)
				.withOperations(op3)
				.build();
		EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
				.withOperations(ImmutableList.of(op4))
				.build();
		EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4))
				.build();
		
		MappedTransferObjectType mapped1 = newMappedTransferObjectTypeBuilder().withName("mapped1")
				.withEntityType(entityType1)
				.build();
		MappedTransferObjectType mapped2 = newMappedTransferObjectTypeBuilder().withName("mapped2")
				.withEntityType(entityType2)
				.build();
		MappedTransferObjectType mapped3 = newMappedTransferObjectTypeBuilder().withName("mapped3")
				.withEntityType(entityType3)
				.build();
		MappedTransferObjectType mapped4 = newMappedTransferObjectTypeBuilder().withName("mapped4")
				.withEntityType(entityType4)
				.build();
		MappedTransferObjectType mapped5 = newMappedTransferObjectTypeBuilder().withName("mapped5")
				.withEntityType(entityType5)
				.build();
		
		op1.setInstanceRepresentation(mapped1);
		op2.setInstanceRepresentation(mapped2);
		op3.setInstanceRepresentation(mapped3);
		op4.setInstanceRepresentation(mapped4);
	
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                entityType1,entityType2,entityType3,entityType4,entityType5,type,
                mapped1,mapped2,mapped3,mapped4,mapped5
            )).build();
		
		psmModel.addContent(model);
		
		runEpsilon(ImmutableList.of(
				"InheritedOperationsAreValid|Entity type: entityType5 is inheriting operations with the same name but different signature.",
				"NeedToOverrideMultipleOperationImplementations|Entity type: entityType5 has inherited operations without implementation, but their bases have more than one implementation.",
				"OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation in entityType3)"),
		Collections.emptyList());
	
	}
	
    @Test
    void testOverridingWithValidInput() throws Exception {
        log.info("Testing constraint: OverridingWithValidInput");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        BoundOperation operation1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation operation2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation operation3 = newBoundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden3 = newBoundOperationBuilder().withName("operation3")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation operation4 = newBoundOperationBuilder().withName("operation4")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden4 = newBoundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        EntityType entityType0 = newEntityTypeBuilder()
                .withOperations(ImmutableList.of(
                        operation1,operation2,operation3)).withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .build();
        operation1.setInstanceRepresentation(transferObjectType0);
        operation2.setInstanceRepresentation(transferObjectType0);
        operation3.setInstanceRepresentation(transferObjectType0);

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
        		.withOperations(overriden1).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType1);

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2")
        		.withOperations(ImmutableList.of(operation4,overriden2)).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .build();
        operation4.setInstanceRepresentation(transferObjectType2);
        overriden2.setInstanceRepresentation(transferObjectType2);

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3")
        		.withOperations(ImmutableList.of(overriden1,overriden4)).withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType3);
        overriden4.setInstanceRepresentation(transferObjectType3);

        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
        		.withOperations(ImmutableList.of(overriden1,overriden3)).withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType4);
        overriden3.setInstanceRepresentation(transferObjectType4);

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation2 in entityType2)",
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation4 in entityType3)",
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation3 in entityType4)",
            "InheritedOperationsAreValid|Entity type: entityType4 is inheriting operations with the same name but different signature."),
            Collections.emptyList());
    }
    
    @Test
    void testEntityTypeMustBeAbstractIfAnOperationIsAbstract() throws Exception {
    	log.info("Testing constraint: OverridingWithValidOutput");
    	
        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();

        BoundOperation operation = newBoundOperationBuilder().withName("operation").withAbstract_(true)
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
    	
        EntityType entityType = newEntityTypeBuilder().withName("entityType").withOperations(ImmutableList.of(
                operation)).withAbstract_(false).build();
        MappedTransferObjectType transferObjectType = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType)
                .build();
        operation.setInstanceRepresentation(transferObjectType);
    	
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                correctType,entityType,transferObjectType
            )).build();

		psmModel.addContent(model);
		
		runEpsilon( ImmutableList.of(
				"EntityTypeMustBeAbstractIfAnOperationIsAbstract|Entity type: entityType must be abstract if it has an abstract operation"),
			Collections.emptyList());
    }

    @Test
    void testOverridingWithValidOutput() throws Exception {
        log.info("Testing constraint: OverridingWithValidOutput");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        BoundOperation operation1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation operation2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation operation3 = newBoundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden3 = newBoundOperationBuilder().withName("operation3")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation operation4 = newBoundOperationBuilder().withName("operation4")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden4 = newBoundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").withOperations(ImmutableList.of(
                operation1,operation2,operation3)).build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .build();
        operation1.setInstanceRepresentation(transferObjectType0);
        operation2.setInstanceRepresentation(transferObjectType0);
        operation3.setInstanceRepresentation(transferObjectType0);
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withOperations(overriden1).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType1);

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withOperations(ImmutableList.of(operation4,overriden2))
        		.withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .build();
        operation4.setInstanceRepresentation(transferObjectType2);
        overriden2.setInstanceRepresentation(transferObjectType2);

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3")
        		.withOperations(ImmutableList.of(overriden1,overriden4)).withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType3);
        overriden4.setInstanceRepresentation(transferObjectType3);

        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
        		.withOperations(ImmutableList.of(overriden1,overriden3))
        		.withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType4);
        overriden3.setInstanceRepresentation(transferObjectType4);

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
    		"OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation2 in entityType2)",
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation4 in entityType3)",
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation3 in entityType4)",
            "InheritedOperationsAreValid|Entity type: entityType4 is inheriting operations with the same name but different signature."),
            Collections.emptyList());
    }

    @Test
    void testOverridingWithValidFaults() throws Exception {
        log.info("Testing constraint: OverridingWithValidFaults");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        BoundOperation operation1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .build();
        BoundOperation overriden1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .build();

        BoundOperation operation2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault3").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault4").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .build();
        
        BoundOperation overriden2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(wrongType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault3").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault4").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .build();

        BoundOperation operation3 = newBoundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build())
                .build();
        BoundOperation overriden3 = newBoundOperationBuilder().withName("operation3")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(wrongType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .build();

        BoundOperation operation4 = newBoundOperationBuilder().withName("operation4")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden4 = newBoundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(newParameterBuilder().withName("fault1").withType(correctType)
                		.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build())
                .build();
        
        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").withOperations(ImmutableList.of(
                operation1,operation2,operation3)).build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .build();
        operation1.setInstanceRepresentation(transferObjectType0);
        operation2.setInstanceRepresentation(transferObjectType0);
        operation3.setInstanceRepresentation(transferObjectType0);
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withOperations(overriden1).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType1);

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withOperations(ImmutableList.of(operation4,overriden2))
        		.withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .build();
        operation4.setInstanceRepresentation(transferObjectType2);
        overriden2.setInstanceRepresentation(transferObjectType2);

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3")
        		.withOperations(ImmutableList.of(overriden1,overriden4)).withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType3);
        overriden4.setInstanceRepresentation(transferObjectType3);

        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4")
        		.withOperations(ImmutableList.of(overriden1,overriden3))
        		.withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .build();
        overriden1.setInstanceRepresentation(transferObjectType4);
        overriden3.setInstanceRepresentation(transferObjectType4);

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
    		"OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation2 in entityType2)",
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation4 in entityType3)",
            "OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation operation3 in entityType4)",
            "InheritedOperationsAreValid|Entity type: entityType4 is inheriting operations with the same name but different signature."),
            Collections.emptyList());
    }

    @Test
    void testInheritedBoundOperationHasNoImplementation() throws Exception {
        log.info("Testing constraint: InheritedBoundOperationHasNoImplementation");

        EntityType entityType = newEntityTypeBuilder().withName("entityType").build();
        MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName("type").withEntityType(entityType).build();

        BoundOperation correctOperation1 = newBoundOperationBuilder().withName("correct")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withAbstract_(true)
                .build();
        BoundOperation correctOperation2 = newBoundOperationBuilder().withName("correct")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        BoundOperation correctOperation3 = newBoundOperationBuilder().withName("correct")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        BoundOperation withImplementation1 = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        BoundOperation withImplementation2 = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        BoundOperation withImplementation3 = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        BoundOperation opWithoutImpl = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withAbstract_(true)
                .build();

        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").withAbstract_(true)
        		.withOperations(ImmutableList.of(withImplementation1,correctOperation1)).build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .build();
        withImplementation1.setInstanceRepresentation(transferObjectType0);
        correctOperation1.setInstanceRepresentation(transferObjectType0);

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withAbstract_(true)
        		.withOperations(withImplementation2).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .build();
        withImplementation2.setInstanceRepresentation(transferObjectType1);
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withAbstract_(true)
        		.withOperations(correctOperation2).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .build();
        correctOperation2.setInstanceRepresentation(transferObjectType2);
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withAbstract_(true)
        		.withOperations(withImplementation3).withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .build();
        withImplementation3.setInstanceRepresentation(transferObjectType3);
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withAbstract_(true)
        		.withOperations(ImmutableList.of(opWithoutImpl,correctOperation3))
        		.withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .build();
        opWithoutImpl.setInstanceRepresentation(transferObjectType4);
        correctOperation3.setInstanceRepresentation(transferObjectType4);
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            type,entityType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "AbstractOperationIsValid|Bound operation cannot be abstract if it's overriding a non-abstract bound operation",
            "NeedToOverrideMultipleOperationImplementations|Entity type: entityType4 has inherited operations without implementation, but their bases have more than one implementation.",
			"ImplementationOfAbstractOperationIsStateful|Implementation of abstract operation: entityType2.correct must be stateful.",
			"ImplementationOfAbstractOperationIsStateful|Implementation of abstract operation: entityType4.correct must be stateful."),
            Collections.emptyList());
    }

    @Test
    void testNeedToOverrideMultipleOperationImplementations() throws Exception {
        log.info("Testing constraint: NeedToOverrideMultipleOperationImplementations");

        UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();

        BoundOperation correctOperation1 = newBoundOperationBuilder().withName("correctOperation")
        		.withAbstract_(true)
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation correctOperation2 = newBoundOperationBuilder().withName("correctOperation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        EntityType correctEntityType0 = newEntityTypeBuilder().withName("correctEntityType0")
        		.withAbstract_(true)
        		.withOperations(correctOperation1).build();
        MappedTransferObjectType correctTransferObjectType0 = newMappedTransferObjectTypeBuilder().withName("correctTransferObjectType0").withEntityType(correctEntityType0)
                .build();
        correctOperation1.setInstanceRepresentation(correctTransferObjectType0);
        
        EntityType correctEntityType1 = newEntityTypeBuilder().withName("correctEntityType1")
        		.withAbstract_(true)
        		.withOperations(correctOperation2)
        		.withSuperEntityTypes(correctEntityType0).build();
        MappedTransferObjectType correctTransferObjectType1 = newMappedTransferObjectTypeBuilder().withName("correctTransferObjectType1").withEntityType(correctEntityType1)
                .build();
        correctOperation2.setInstanceRepresentation(correctTransferObjectType1);
        
        EntityType correctEntityType2 = newEntityTypeBuilder().withName("correctEntityType2")
        		.withAbstract_(true)
        		.withSuperEntityTypes(correctEntityType1).build();
        MappedTransferObjectType correctTransferObjectType2 = newMappedTransferObjectTypeBuilder().withName("correctTransferObjectType2").withEntityType(correctEntityType2)
                .build();

        BoundOperation withImplementation1 = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        BoundOperation withImplementation2 = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        BoundOperation withImplementation3 = newBoundOperationBuilder().withName("operation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0")
        		.withOperations(withImplementation1).build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .build();
        withImplementation1.setInstanceRepresentation(transferObjectType0);
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1")
        		.withOperations(withImplementation2).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .build();
        withImplementation2.setInstanceRepresentation(transferObjectType1);
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2")
        		.withOperations(correctOperation2).withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .build();
        correctOperation2.setInstanceRepresentation(transferObjectType2);
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3")
        		.withOperations(withImplementation3)
        		.withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .build();
        withImplementation3.setInstanceRepresentation(transferObjectType3);
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withOperations(withImplementation3)
        		.withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .build();
        withImplementation3.setInstanceRepresentation(transferObjectType4);

        EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType5 = newMappedTransferObjectTypeBuilder().withName("transferObjectType5").withEntityType(entityType5)
                .build();

        EntityType entityType6 = newEntityTypeBuilder().withName("entityType6").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4,entityType5)).build();
        MappedTransferObjectType transferObjectType6 = newMappedTransferObjectTypeBuilder().withName("transferObjectType6").withEntityType(entityType6)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            type,
                            correctEntityType0,correctEntityType1,correctEntityType2,
                            correctTransferObjectType0,correctTransferObjectType1,correctTransferObjectType2,
                            entityType0,entityType1,entityType2,entityType3,entityType4,entityType5,entityType6,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4,transferObjectType5,transferObjectType6
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "NeedToOverrideMultipleOperationImplementations|Entity type: entityType6 has inherited operations without implementation, "
                    + "but their bases have more than one implementation."),
            Collections.emptyList());
    }
    
    @Test
    void testInheritedOperationAndTransferAttributeNamesAreUniqueLowerCase() throws Exception {
       log.info("Testing constraint: InheritedOperationAndAttributeNamesAreUnique,"
       		+ "InheritedOperationAndRelationNamesAreUnique,InheritedOperationAndSequenceNamesAreUnique,InheritedOperationAndNavigationPropertyNamesAreUnique,"
       		+ "InheritedOperationAndDataPropertyNamesAreUnique");

       StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();
       UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
       EntityType target = newEntityTypeBuilder().withName("target").build();

       Attribute attribute = newAttributeBuilder().withName("content").withDataType(string).build();
       
       AssociationEnd relation = newAssociationEndBuilder().withName("relation").withTarget(target).withCardinality(newCardinalityBuilder().build()).build();
       
       NavigationProperty navigation = newNavigationPropertyBuilder().withName("navigation").withCardinality(newCardinalityBuilder().build())
    		   .withTarget(target).withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("exp").build()).build();
       
       DataProperty property = newDataPropertyBuilder().withName("property")
    		   .withDataType(string)
    		   .withGetterExpression(newDataExpressionTypeBuilder().withExpression("exp").build()).build();

       EntitySequence sequence = newEntitySequenceBuilder().withName("sequence").build();
       
       EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
       MappedTransferObjectType mapping = newMappedTransferObjectTypeBuilder().withName("mapping").withEntityType(entityType1).build();

       EntityType entityType2 = newEntityTypeBuilder().withName("entityType2")
     		  .withAttributes(attribute)
     		  .withRelations(relation)
     		  .withNavigationProperties(navigation)
     		  .withDataProperties(property)
     		  .withSequences(sequence)
     		  .build();

       EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(ImmutableList.of(entityType1,entityType2)).build();
       
       BoundOperation operation1 = newBoundOperationBuilder().withName("content")
               .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withInstanceRepresentation(mapping)
               .build();
       BoundOperation operation2 = newBoundOperationBuilder().withName("relation")
               .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withInstanceRepresentation(mapping)
               .build();
       BoundOperation operation3 = newBoundOperationBuilder().withName("navigation")
               .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withInstanceRepresentation(mapping)
               .build();
       BoundOperation operation4 = newBoundOperationBuilder().withName("property")
               .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withInstanceRepresentation(mapping)
               .build();
       BoundOperation operation5 = newBoundOperationBuilder().withName("sequence")
               .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
               .withInstanceRepresentation(mapping)
               .build();

       entityType1.getOperations().addAll(ImmutableList.of(operation1,operation2,operation3,operation4,operation5));

       Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
               			string,type,entityType1,entityType2,entityType3,mapping,target))
     		  .build();

       psmModel.addContent(model);

       runEpsilon(ImmutableList.of(
           "InheritedOperationAndAttributeNamesAreUnique|Entity type: entityType3 has inherited operation(s) and inherited attribute(s) of the same name.",
           "InheritedOperationAndRelationNamesAreUnique|Entity type: entityType3 has inherited operation(s) and inherited relation(s) of the same name.",
           "InheritedOperationAndSequenceNamesAreUnique|Entity type: entityType3 has inherited operation(s) and inherited sequence(s) of the same name.",
           "InheritedOperationAndNavigationPropertyNamesAreUnique|Entity type: entityType3 has inherited operation(s) and inherited navigation properties of the same name.",
           "InheritedOperationAndDataPropertyNamesAreUnique|Entity type: entityType3 has inherited operation(s) and inherited data properties of the same name."),
           Collections.emptyList());
    }
    
	@Test
	void testAbstractEntityTypeSuperEntityTypesAreAbstract() throws Exception {
		log.info("Testing constraint: AbstractEntityTypeSuperEntityTypesAreAbstract");

		EntityType E1 = newEntityTypeBuilder().withName("E1").build();
		EntityType E2 = newEntityTypeBuilder().withName("E2").build();
		EntityType E3 = newEntityTypeBuilder().withName("E3").withAbstract_(true).build();

		E2.getSuperEntityTypes().add(E1);
		E3.getSuperEntityTypes().add(E2);

		EntityType E4 = newEntityTypeBuilder().withName("E4").build();
		EntityType E5 = newEntityTypeBuilder().withName("E5").withAbstract_(true).build();
		EntityType E6 = newEntityTypeBuilder().withName("E6").withAbstract_(true).build();

		E5.getSuperEntityTypes().add(E4);
		E6.getSuperEntityTypes().add(E5);
		
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1, E2, E3, E4, E5, E6)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("AbstractEntityTypeSuperEntityTypesAreAbstract|Abstract entity type: E3 cannot have non abstract super entity type(s).",
				"AbstractEntityTypeSuperEntityTypesAreAbstract|Abstract entity type: E5 cannot have non abstract super entity type(s)."
				), Collections.emptyList());
	}
	
	@Test
	void testInvariantConstraintValidation() throws Exception {
		log.info("Testing constraints: InheritedAndOwnInvariantConstraintNameIsUniqueInEntityType, ConstrainedEntityTypeMatchesContainer");
		
		StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();
		
		EntityType E1 = newEntityTypeBuilder().withName("E1").build();
		EntityType E2 = newEntityTypeBuilder().withName("E2").build();
		EntityType E3 = newEntityTypeBuilder().withName("E3").build();
		
		E2.getSuperEntityTypes().add(E1);
		E3.getSuperEntityTypes().add(E2);
		
		InvariantConstraint c1 = newInvariantConstraintBuilder().withName("c1").withExpression(newLogicalExpressionTypeBuilder().withExpression("true").build()).build();
		E3.getConstraints().add(c1);
		InvariantConstraint c2 = newInvariantConstraintBuilder().withName("c2").withExpression(newLogicalExpressionTypeBuilder().withExpression("true").build()).build();
		E3.getConstraints().add(c2);
		
		Attribute attr = newAttributeBuilder().withName("c1").withDataType(string).build();
		E1.getAttributes().add(attr);
		
		AssociationEnd relation = newAssociationEndBuilder().withName("c2").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).withTarget(E2).build();
		E2.getRelations().add(relation);
		
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1, E2, E3, string)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("InheritedAndOwnInvariantConstraintNameIsUniqueInEntityType|Invariant constraint: c1 has the same name as inherited content(s) of entity type: E3",
				"InheritedAndOwnInvariantConstraintNameIsUniqueInEntityType|Invariant constraint: c2 has the same name as inherited content(s) of entity type: E3"), Collections.emptyList());
	}
	
}
