package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newNavigationPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

class PsmValidationDataTest {

	Logger logger = LoggerFactory.getLogger(PsmValidationDataTest.class);

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	private PsmModel psmModel;
	private Log log = new Slf4jLog();

	@BeforeEach
	void setUp() {
		psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test").build();
	}

	private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
		try {
			PsmEpsilonValidator.validatePsm(log, psmModel,
					new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."), expectedErrors,
					expectedWarnings);
		} catch (EvlScriptExecutionException ex) {
			logger.error("EVL failed", ex);
			logger.error("\u001B[31m - expected errors: {}\u001B[0m", expectedErrors);
			logger.error("\u001B[31m - unexpected errors: {}\u001B[0m", ex.getUnexpectedErrors());
			logger.error("\u001B[31m - errors not found: {}\u001B[0m", ex.getErrorsNotFound());
			logger.error("\u001B[33m - expected warnings: {}\u001B[0m", expectedWarnings);
			logger.error("\u001B[33m - unexpected warnings: {}\u001B[0m", ex.getUnexpectedWarnings());
			logger.error("\u001B[33m - warnings not found: {}\u001B[0m", ex.getWarningsNotFound());
			throw ex;
		}
	}

	@Test
	void testUpperIsAtLeastOneAssociationEnd() throws Exception {
		log.info("Testing constraint: UpperIsAtLeastOne");

		AssociationEnd endpoint1 = newAssociationEndBuilder().withName("endpoint1")
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(0).build()).build();

		AssociationEnd endpoint2 = newAssociationEndBuilder().withName("endpoint2")
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-2).build()).build();

		EntityType entity = newEntityTypeBuilder().withName("entity")
				.withRelations(ImmutableList.of(endpoint1, endpoint2)).build();
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity)).build();
		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("CardinalityUpperIsAtLeastOne|Invalid upper attribute of reference typed element: endpoint1",
				"CardinalityUpperIsAtLeastOne|Invalid upper attribute of reference typed element: endpoint2",
				"LowerMustBeLessOrEqualToUpper|Lower (0) must be less or equal to upper (-2) of reference typed element: endpoint2"),
				Collections.emptyList());
	}

	@Test
	void testCardinalityLowerIsGreaterThanOrEqualToZeroContainment() throws Exception {
		log.info("Testing constraint: CardinalityLowerIsGreaterThanOrEqualToZero");

		Containment containment = newContainmentBuilder().withName("containment")
				.withCardinality(newCardinalityBuilder().withLower(-4).withUpper(1).build()).build();

		EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(containment).build();
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity)).build();
		psmModel.addContent(m);
		runEpsilon(ImmutableList.of(
				"CardinalityLowerIsGreaterThanOrEqualToZero|Lower attribute of reference typed element: containment must be greater than or equal to zero"),
				Collections.emptyList());
	}

	@Test
	void testLowerMustBeLessOrEqualToUpper() throws Exception {
		log.info("Testing constraint: UpperIsAtLeastOne");

		AssociationEnd endpoint = newAssociationEndBuilder().withName("endpoint")
				.withCardinality(newCardinalityBuilder().withLower(3).withUpper(1).build()).build();

		EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(ImmutableList.of(endpoint)).build();
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity)).build();
		psmModel.addContent(m);
		runEpsilon(ImmutableList.of(
				"LowerMustBeLessOrEqualToUpper|Lower (3) must be less or equal to upper (1) of reference typed element: endpoint"),
				Collections.emptyList());
	}

	@Test
	void testCascadeDeleteOnlyAllowedIfUpperCardinalityIsOne() throws Exception {
		log.info("Testing constraint: CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne");
		AssociationEnd endpoint = newAssociationEndBuilder().withName("endpoint")
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(2).build())
				.withReverseCascadeDelete(true).build();
		EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(ImmutableList.of(endpoint)).build();
		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity)).build();
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
				ImmutableList.of("EntityTypeNamesAreUnique|Entity type name is not unique: entity",
						"EntityTypeNamesAreUnique|Entity type name is not unique: Entity"));
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

		Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(string).build();
		Attribute negtest_member1 = newAttributeBuilder().withName("negtest_member").withDataType(string).build();

		Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(string).build();
		Attribute negtest_member2 = newAttributeBuilder().withName("negtest_Member").withDataType(string).build();

		Attribute attribute3 = newAttributeBuilder().withName("attribute3").withDataType(string).build();
		AssociationEnd negtest_member3 = newAssociationEndBuilder().withName("negtest_member")
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
				.withElements(ImmutableList.of(entityType, superEntityType, superSuperEntityType, string)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("InheritedAndOwnAttributeNameIsUniqueInEntityType|"
				+ "Attribute: negtest_member has the same name as inherited content(s) of entity type: entityType",
				"InheritedAndOwnAttributeNameIsUniqueInEntityType|"
						+ "Attribute: negtest_Member has the same name as inherited content(s) of entity type: superEntityType",
				"InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritedAndOwnRelationNameIsUniqueInEntityType() throws Exception {
		log.info("Testing constraint: InheritedAndOwnRelationNameIsUniqueInEntityType");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute2").withDataType(string).build();
		AssociationEnd relation1 = newAssociationEndBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		Attribute attribute2 = newAttributeBuilder().withName("MEMBER").withDataType(string).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		Attribute attribute3 = newAttributeBuilder().withName("attribute3").withDataType(string).build();
		AssociationEnd relation3 = newAssociationEndBuilder().withName("Member")
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
				.withElements(ImmutableList.of(entityType, superEntityType, superSuperEntityType, string)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of(
				"InheritedAndOwnRelationNameIsUniqueInEntityType|"
						+ "Relation: member has the same name as inherited content(s) of entity type: entityType",
				"InheritedAndOwnAttributeNameIsUniqueInEntityType|"
						+ "Attribute: MEMBER has the same name as inherited content(s) of entity type: superEntityType",
				"InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
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
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
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
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueRelationNamesLowerCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		AssociationEnd relation1 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(relation1))
				.build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(relation2))
				.build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2)).build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueRelationNamesMixedCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		AssociationEnd relation1 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("Relation")
				.withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(relation1))
				.build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(relation2))
				.build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2)).build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
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
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
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
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueNavigationPropertyNamesLowerCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(e1))
				.withNavigationProperties(ImmutableList.of(navigation1)).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(e2))
				.withNavigationProperties(ImmutableList.of(navigation2)).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingUniqueNavigationPropertyNamesMixedCase() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("Navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withRelations(ImmutableList.of(e1))
				.withNavigationProperties(ImmutableList.of(navigation1)).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withRelations(ImmutableList.of(e2))
				.withNavigationProperties(ImmutableList.of(navigation2)).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedAttributesAndRelations() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

		Attribute attribute1 = newAttributeBuilder().withName("member").withDataType(string).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(string).build();
		AssociationEnd relation1 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().build()).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withRelations(relation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withRelations(relation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, string))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
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
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedAttributesAndNavigationProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("member").withDataType(integer).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withRelations(e1).withNavigationProperties(navigation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withRelations(e2).withNavigationProperties(navigation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedRelationsAndDataProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		AssociationEnd relation1 = newAssociationEndBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).build();
		AssociationEnd relation2 = newAssociationEndBuilder().withName("relation")
				.withCardinality(newCardinalityBuilder().build()).build();

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

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedRelationsAndNavigationProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		AssociationEnd e1 = newAssociationEndBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build()).build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.member").build())
				.build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build()).build();

		Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(integer).build();
		Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(integer).build();

		EntityType parent1 = newEntityTypeBuilder().withName("parent1").withAttributes(ImmutableList.of(attribute1))
				.withRelations(e1).withNavigationProperties(navigation1).build();
		EntityType parent2 = newEntityTypeBuilder().withName("parent2").withAttributes(ImmutableList.of(attribute2))
				.withRelations(e2).withNavigationProperties(navigation2).build();
		EntityType entityType = newEntityTypeBuilder().withName("entityType")
				.withSuperEntityTypes(ImmutableList.of(parent1, parent2)).build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}

	@Test
	void testInheritingNamedElementsOfTheSameNameIsNotAllowedDataPropertiesAndNavigationProperties() throws Exception {
		log.info("Testing constraint: InheritingNamedElementsOfTheSameNameIsNotAllowed");

		NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();

		AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build())
				.build();
		AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
				.build();

		NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation")
				.withCardinality(newCardinalityBuilder().build())
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build()).build();
		NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("member")
				.withCardinality(newCardinalityBuilder().build())
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

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, parent1, parent2, integer))
				.build();

		psmModel.addContent(m);
		runEpsilon(
				ImmutableList.of("InheritingNamedElementsOfTheSameNameIsNotAllowed|"
						+ "Entity type: entityType has inherited named elements of the same name."),
				Collections.emptyList());
	}
}
