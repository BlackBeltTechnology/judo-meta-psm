package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.measure.*;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.*;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

class PsmValidationTest {
	
    Logger logger = LoggerFactory.getLogger(PsmValidationTest.class);
    
    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;
    private Log log = new Slf4jLog();
    
    @BeforeEach
    void setUp() {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .name("test")
                .build();
    }

    private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        try {
            PsmEpsilonValidator.validatePsm(log,
                    psmModel, 
                    new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."),
                    expectedErrors,
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
    void testModelNameIsUnique() throws Exception {
        log.info("Testing constraint: ModelNameIsUnique");

        Model m1 = newModelBuilder().withName("A").build();
        Model m2 = newModelBuilder().withName("A").build();

        psmModel.addContent(m1);
        psmModel.addContent(m2);

        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testNamespaceHasUniqueElementNames() throws Exception {
        log.info("Testing constraint: NamespaceHasUniqueElementNames");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newCustomTypeBuilder().withName("string").build(),
                        newStringTypeBuilder().withName("String").withMaxLength(255).build(),
                        newEntityTypeBuilder().withName("e").build(),
                        newUnmappedTransferObjectTypeBuilder().withName("E").build()
                ))
                .withPackages(ImmutableList.of(
                        newPackageBuilder().withName("p").build(),
                        newPackageBuilder().withName("P").build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("NamespaceHasUniqueElementNames|Names Set {P, E, String} are not unique in namespace M in a case-insensitive manner"), Collections.emptyList());
    }

    @Test
    void testEnumerationMemberNameIs() throws Exception {
        log.info("Testing constraint: EnumerationMemberNameIsUnique");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newEnumerationTypeBuilder()
                        .withName("E")
                        .withMembers(ImmutableList.of(newEnumerationMemberBuilder()
                                        .withName("A")
                                        .withOrdinal(0)
                                        .build(),
                                newEnumerationMemberBuilder()
                                        .withName("A")
                                        .withOrdinal(1)
                                        .build()
                        ))
                        .build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("EnumerationMemberNameIsUnique|Enum member names are not unique: E"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationMemberValueIsUnique() throws Exception {
        log.info("Testing constraint: EnumerationMemberValueIsUnique");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newEnumerationTypeBuilder()
                        .withName("E")
                        .withMembers(ImmutableList.of(newEnumerationMemberBuilder()
                                        .withName("A")
                                        .withOrdinal(0)
                                        .build(),
                                newEnumerationMemberBuilder()
                                        .withName("B")
                                        .withOrdinal(0)
                                        .build()
                        ))
                        .build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("EnumerationMemberValueIsUnique|Enum member numbers are not unique: E"),
                Collections.emptyList());
    }

    @Test
    void testScaleIsLowerThanPrecision() throws Exception {
        log.info("Testing constraint: ScaleIsLowerThanPrecision");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newNumericTypeBuilder()
                        .withName("InvalidScale")
                        .withPrecision(5)
                        .withScale(10)
                        .build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("ScaleIsLowerThanPrecision|Scale (10) must be less than precision (5)"),
                Collections.emptyList());
    }

    @Test
    void testValidScale() throws Exception {
        log.info("Testing constraint: ValidScale");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newNumericTypeBuilder()
                        .withName("InvalidScale")
                        .withPrecision(5)
                        .withScale(-2)
                        .build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("ValidScale|Scale (-2) must be at least 0"),
                Collections.emptyList());
    }

    @Test
    void testValidMaxLength() throws Exception {
        log.info("Testing constraint: ValidMaxLength");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newStringTypeBuilder()
                        .withName("String")
                        .withMaxLength(-3)
                        .build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("ValidMaxLength|MaxLength must be greater than 0: String"),
                Collections.emptyList());


    }

    @Test
    void testValidPartnerRelations() throws Exception {
        log.info("Testing constraint: ValidPartnerRelations");

        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e2 = newEndpointBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e3 = newEndpointBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

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

        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e2 = newEndpointBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e3 = newEndpointBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

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
        runEpsilon(ImmutableList.of("ValidPartnerType|Invalid partner type: M::E2.e1 for M::E1.e3", "ValidPartnerType|Invalid partner type: M::E1.e3 for M::E2.e1"),
                Collections.emptyList());
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
        runEpsilon(ImmutableList.of("InheritanceIsNotRecursive|Entity type E1 is recursive", "InheritanceIsNotRecursive|Entity type E2 is recursive", "InheritanceIsNotRecursive|Entity type E3 is recursive"),
                Collections.emptyList());
    }

    @Test
    void testPartnerIsNotSelf() throws Exception {
        log.info("Testing constraint: PartnerIsNotSelf");

        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e1).build();

        e1.setTarget(E1);
        e1.setPartner(e1);

        Model m = newModelBuilder().withName("M").withElements(E1).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("PartnerIsNotSelf|Self partner relation found: M::E1.e1"),
                Collections.emptyList());
    }

    @Test
    void testAttributeNameIsUnique() throws Exception {
        log.info("Testing constraint: AttributeNameIsUnique");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255)
                .build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(18)
                .build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        string,
                        integer,
                        newEntityTypeBuilder()
                                .withName("E")
                                .withAttributes(ImmutableList.of(
                                        newAttributeBuilder().withName("a").withDataType(string).build(),
                                        newAttributeBuilder().withName("a").withDataType(integer).build()
                                )).build()
                )).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("AttributeNameIsUnique|Multiple attributes are added to entity E with the same name"),
                Collections.emptyList());
    }

    @Test
    void testRelationNameIsUnique() throws Exception {
        log.info("Testing constraint: RelationNameIsUnique");

        Endpoint endpoint = newEndpointBuilder()
                .withName("e")
                .withCardinality(newCardinalityBuilder().build())
                .build();
        Containment containment = newContainmentBuilder()
                .withName("e")
                .withCardinality(newCardinalityBuilder().build())
                .build();

        EntityType E = newEntityTypeBuilder()
                .withName("E")
                .withRelations(ImmutableList.of(endpoint, containment))
                .build();

        endpoint.setTarget(E);
        containment.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("RelationNameIsUnique|Multiple relations are added to entity E with the same name"),
                Collections.emptyList());
    }

    @Test
    void testNoAttributeAndRelationAreWithTheSameName() throws Exception {
        log.info("Testing constraint: NoAttributeAndRelationAreWithTheSameName");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        Endpoint x = newEndpointBuilder()
                .withName("x")
                .withCardinality(newCardinalityBuilder().build()).build();

        EntityType E = newEntityTypeBuilder().withName("E")
                .withAttributes(newAttributeBuilder().withName("x").withDataType(string).build())
                .withRelations(x)
                .build();

        x.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(string, E)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NoAttributeAndRelationAreWithTheSameName|Entity E has attributes and relations with the same name"),
                Collections.emptyList());
    }

    @Test
    void testOppositePartnerIsDefined() throws Exception {
        log.info("Testing constraint: OppositePartnerIsDefined");

        Endpoint e = newEndpointBuilder().withName("e").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint f = newEndpointBuilder().withName("f").withCardinality(newCardinalityBuilder().build()).build();

        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e).build();
        EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(f).build();

        e.setTarget(E2);
        f.setTarget(E1);
        f.setPartner(e);

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(E1, E2)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("OppositePartnerIsDefined|Missing opposite partner relation for M::E2.f"),
                Collections.emptyList());
    }

    @Test
    void testMaxLengthIsNotTooLarge() throws Exception {
        log.info("Testing constraint: MaxLengthIsNotTooLarge");

        Model m = newModelBuilder().withName("M")
                .withElements(
                        newStringTypeBuilder().withName("String").withMaxLength(4001).build()
                ).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("MaxLengthIsNotTooLarge|MaxLength must be less than/equals to 4000: String"),
                Collections.emptyList());
    }

    @Test
    void testStandaloneModelLoadedOnly() throws Exception {
        log.info("Testing constraint: StandaloneModelLoadedOnly");

        Model a = newModelBuilder().withName("A").build();
        Model b = newModelBuilder().withName("B").build();

        psmModel.addContent(a);
        psmModel.addContent(b);
        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testPackageHasNamespace() throws Exception {
        log.info("Testing constraint: PackageHasNamespace");

        Package pkg = newPackageBuilder().withName("pkg").build();
        Model m = newModelBuilder().withName("M").build();

        psmModel.addContent(m);
        psmModel.addContent(pkg);

        runEpsilon(ImmutableList.of("PackageHasNamespace|Package pkg must have exactly 1 namespace"),
                Collections.emptyList());
    }

    @Test
    void testNamespaceElementBelongsToOneNamespace() throws Exception {
        log.info("Testing constraint: NamespaceElementBelongsToOneNamespace");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        StringType orphanString = newStringTypeBuilder().withName("orphanString").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M").build();

        psmModel.addContent(m);
        psmModel.addContent(string);
        psmModel.addContent(orphanString);

        runEpsilon(ImmutableList.of("NamespaceElementBelongsToOneNamespace|Element String must belong to exactly 1 namespace","NamespaceElementBelongsToOneNamespace|Element orphanString must belong to exactly 1 namespace"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationMemberHasEnumerationType() throws Exception {
        log.info("Testing constraint: EnumerationMemberHasEnumerationType");

        Model m = newModelBuilder().withName("M")
                .withElements(newEnumerationTypeBuilder().withName("E")
                        .withMembers(ImmutableList.of(
                                newEnumerationMemberBuilder().withName("m2").withOrdinal(2).build(),
                                newEnumerationMemberBuilder().withName("m3").build()
                        )).build()
                )
                .build();

        EnumerationMember enumMemb = newEnumerationMemberBuilder().withName("m1").withOrdinal(1).build();
        psmModel.addContent(m);
        psmModel.addContent(enumMemb);
        runEpsilon(ImmutableList.of("EnumerationMemberHasEnumerationType|Enumeration member m1 must have exactly 1 enumeration"),
                Collections.emptyList());
    }

    @Test
    void testRelationCountConstraintHasUniqueName() throws Exception {
        log.info("Testing constraint: RelationCountConstraintHasUniqueName");

        Endpoint e = newEndpointBuilder().withName("e").withCardinality(newCardinalityBuilder().build()).build();
        Containment f = newContainmentBuilder().withName("f").withCardinality(newCardinalityBuilder().build()).build();

        RelationCountConstraint c1_1 = newRelationCountConstraintBuilder().withName("c1").withRelations(ImmutableList.of(f, e)).withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();
        RelationCountConstraint c1_2 = newRelationCountConstraintBuilder().withName("c1").withRelations(ImmutableList.of(e, f)).withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build()).build();

        EntityType E = newEntityTypeBuilder().withName("E").withRelations(ImmutableList.of(e, f)).withRelationCountConstraints(ImmutableList.of(c1_1, c1_2)).build();

        f.setTarget(E);
        e.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("RelationCountConstraintHasUniqueName|Relation count constraints are not unique: E", "RelationCountConstraintsAreNotSupportedYet|Relation count constraints are not supported yet"),
                Collections.emptyList());
    }

    @Test
    void testRelationBelongsToEntity() throws Exception {
        log.info("Testing constraint: RelationBelongsToEntity");

        Endpoint orphanEndpoint = newEndpointBuilder().withName("orphanEndpoint").withCardinality(newCardinalityBuilder().withUpper(1).withLower(1).build()).build();
        EntityType entity1 = newEntityTypeBuilder().withName("entity1").build();
        orphanEndpoint.setTarget(entity1);

        Model m = newModelBuilder().withName("M").withElements(entity1).build();

        psmModel.addContent(orphanEndpoint);
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("RelationBelongsToEntity|Orphan relation: orphanEndpoint"),
                Collections.emptyList());
    }

    @Test
    void testAttributeBelongsToEntity() throws Exception {
        log.info("Testing constraint: AttributeBelongsToEntity");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build(),
                        string
                )).build();

        Attribute b = newAttributeBuilder().withName("b").withDataType(string).build();

        psmModel.addContent(m);
        psmModel.addContent(b);

        runEpsilon(ImmutableList.of("AttributeBelongsToEntity|Orphan attribute: b"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationContainsAtLeastTwoMembers() throws Exception {
        log.info("Testing constraint: EnumerationContainsAtLeastTwoMembers");

        Model m = newModelBuilder().withName("M").withElements(
                newEnumerationTypeBuilder().withName("E").withMembers(
                        newEnumerationMemberBuilder().withName("m").build()
                ).build()
        ).build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("EnumerationContainsAtLeastTwoMembers|Enum E has no or only a single member"));
    }

    @Test
    void testDataPropertyNameIsUnique() throws Exception {
        log.info("Testing constraint: DataPropertyNameIsUnique");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        DataProperty p1 = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();
        DataProperty p2 = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("upper(self.a)").build()).build();

        EntityType E = newEntityTypeBuilder().withName("E")
                .withAttributes(newAttributeBuilder().withName("a").withDataType(string).build())
                .withDataProperties(ImmutableList.of(p1, p2))
                .build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E, string)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("DataPropertyNameIsUnique|Multiple data properties are added to entity E with the same name"),
                Collections.emptyList());
    }

    @Test
    void testNavigationPropertyNameIsUnique() throws Exception {
        log.info("Testing constraint: NavigationPropertyNameIsUnique");

        Containment r1 = newContainmentBuilder().withName("r1").withCascadeDelete(true).withCardinality(newCardinalityBuilder().build()).build();
        NavigationProperty n1 = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()
        ).build();
        NavigationProperty n2 = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.r1.r1.r1").build()
        ).build();


        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).withNavigationProperties(ImmutableList.of(n1, n2)).build();

        r1.setTarget(E);
        n1.setTarget(E);
        n2.setTarget(E);


        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NavigationPropertyNameIsUnique|Multiple navigation properties are added to entity E with the same name"),
                Collections.emptyList());
    }

    @Test
    void testDataPropertyBelongsToEntity() throws Exception {
        log.info("Testing constraint: DataPropertyBelongsToEntity");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        EntityType E = newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build();
        DataProperty p = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E, string)).build();

        psmModel.addContent(m);
        psmModel.addContent(p);
        runEpsilon(ImmutableList.of("DataPropertyBelongsToEntity|Orphan data property: p"),
                Collections.emptyList());
    }

    @Test
    void testNavigationPropertyBelongsToEntity() throws Exception {
        log.info("Testing constraint: NavigationPropertyBelongsToEntity");

        Containment r1 = newContainmentBuilder().withName("r1").withCascadeDelete(true).withCardinality(newCardinalityBuilder().build()).build();
        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).build();
        r1.setTarget(E);
        Model m = newModelBuilder().withName("M").withElements(E).build();

        NavigationProperty n = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()).build();
        n.setTarget(E);

        psmModel.addContent(m);
        psmModel.addContent(n);

        runEpsilon(ImmutableList.of("NavigationPropertyBelongsToEntity|Orphan navigation property: n"),
                Collections.emptyList());
    }

    @Test
    void testDataPropertyGetterTypeIsValid() throws Exception {
        log.info("Testing constraint: DataPropertyGetterTypeIsValid");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        BooleanType bool = newBooleanTypeBuilder().withName("Boolean").build();
        DateType date = newDateTypeBuilder().withName("Date").build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
        NumericType decimal = newNumericTypeBuilder().withName("Decimal").withPrecision(16).withScale(2).build();
        CustomType email = newCustomTypeBuilder().withName("Email").build();
        EnumerationType country = newEnumerationTypeBuilder().withName("Country").withMembers(ImmutableList.of(
                newEnumerationMemberBuilder().withName("north").build(),
                newEnumerationMemberBuilder().withName("east").withOrdinal(1).build(),
                newEnumerationMemberBuilder().withName("south").withOrdinal(2).build(),
                newEnumerationMemberBuilder().withName("west").withOrdinal(3).build()
        )).build();
        EnumerationType direction = newEnumerationTypeBuilder().withName("Direction").withMembers(ImmutableList.of(
                newEnumerationMemberBuilder().withName("HU").build(),
                newEnumerationMemberBuilder().withName("RO").withOrdinal(1).build(),
                newEnumerationMemberBuilder().withName("SK").withOrdinal(2).build()
        )).build();

        TimestampType timestamp = newTimestampTypeBuilder().withName("Timestamp").build();
        CustomType location = newCustomTypeBuilder().withName("Location").build();
        EntityType F = newEntityTypeBuilder().withName("F").withAttributes(ImmutableList.of(
                newAttributeBuilder().withName("beginTimestamp").withDataType(timestamp).build(),
                newAttributeBuilder().withName("endTimestamp").withDataType(timestamp).build(),
                newAttributeBuilder().withName("location").withDataType(location).build()
        )).build();

        Containment f = newContainmentBuilder().withName("f").withTarget(F).withCardinality(newCardinalityBuilder().withLower(1).build()).build();

        EntityType e = newEntityTypeBuilder().withName("E").withAttributes(ImmutableList.of(
                newAttributeBuilder().withName("name").withDataType(string).build(),
                newAttributeBuilder().withName("external").withDataType(bool).build(),
                newAttributeBuilder().withName("birthDate").withDataType(date).build(),
                newAttributeBuilder().withName("roomNumber").withDataType(integer).build(),
                newAttributeBuilder().withName("email").withDataType(email).build(),
                newAttributeBuilder().withName("radius").withDataType(decimal).build(),
                newAttributeBuilder().withName("country").withDataType(country).build()
        )).withRelations(f)
                .withDataProperties(ImmutableList.of(
                        newDataPropertyBuilder().withName("lowerName").withDataType(bool).withGetterExpression(newDataExpressionTypeBuilder().withExpression("lower(self.name)").build()).withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.name").build()).build(),
                        newDataPropertyBuilder().withName("neighbourRoom").withDataType(decimal).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.roomNumber + 1").build()).withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.roomNumber").build()).build(),
                        newDataPropertyBuilder().withName("area").withDataType(integer).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.roomNumber").build()).withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.radius").build()).build(),
                        newDataPropertyBuilder().withName("internal").withDataType(decimal).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.radius * self.radius * 3.1415").build()).withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.external").build()).build(),
                        newDataPropertyBuilder().withName("direction").withDataType(decimal).withGetterExpression(newDataExpressionTypeBuilder().withExpression("SWITCH CASE WHEN self.country == 'RO' THEN 'east' CASE WHEN self.country == 'SK' THEN 'north' END").build()).build(),
                        newDataPropertyBuilder().withName("begin").withDataType(string).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.f.beginTimestamp").build()).withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.f.beginTimestamp").build()).build(),
                        newDataPropertyBuilder().withName("place").withDataType(email).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.f.location").build()).withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.f.location").build()).build()
                )).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(
                e,
                string,
                bool,
                date,
                integer,
                decimal,
                email,
                country,
                direction,
                F,
                timestamp,
                location
        )).build();


        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                Collections.emptyList());
    }

    @Test
    void testUnitNameIsUnique() throws Exception {
        log.info("Testing critique: unitNameIsUnique");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0).withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0).withRateDivisor(100.0).build();
        final Unit metre = newUnitBuilder().withName("metre").withSymbol("m").withRateDividend(1.0).withRateDivisor(1.0).build();
        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0).withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l").withUnits(ImmutableList.of(millimetre, centimetre, metre)).build();
        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(second, minute, hour)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(length, time)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("UnitNameIsUnique|Unit name/symbol is not unique: metre/m",
                        "UnitNameIsUnique|Unit name/symbol is not unique: minute/m"));
    }

    @Test
    void testUnitRates() throws Exception {
        log.info("Testing constraints: *RateIsValid");

        final DurationUnit millisecond = newDurationUnitBuilder().withName("millisecond").withSymbol("ms").withRateDividend(1.0).withRateDivisor(1000.0).withUnitType(DurationType.MILLISECOND).build();
        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0).withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();
        final DurationUnit day = newDurationUnitBuilder().withName("day").withSymbol("d").withRateDividend(86400.0).withRateDivisor(1.0).withUnitType(DurationType.DAY).build();
        final DurationUnit week = newDurationUnitBuilder().withName("week").withSymbol("w").withRateDividend(604800.0).withRateDivisor(1.0).withUnitType(DurationType.WEEK).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0).withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(millisecond, second, minute, hour, day, week)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("MonthBasedTime").withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(time, monthBasedTime)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of());

        // TODO - add negative tests
    }

    @Test
    void testBaseUnitShouldBeDefined() throws Exception {
        log.info("Testing critique: BaseUnitShouldBeDefined");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0).withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0).withRateDivisor(100.0).build();
        final Unit kilometre = newUnitBuilder().withName("kilometre").withSymbol("km").withRateDividend(1000.0).withRateDivisor(1.0).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l").withUnits(ImmutableList.of(millimetre, centimetre, kilometre)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(length)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("BaseUnitShouldBeDefined|No base unit is defined for measure: Length"));
    }

    @Test
    void testMeasureNameIsUnique() throws Exception {
        log.info("Testing critique: MeasureNameIsUnique");

        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0).withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(second, minute)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("Time").withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(ImmutableList.of(
                newPackageBuilder().withName("siMeasures").withElements(ImmutableList.of(time)).build(),
                newPackageBuilder().withName("otherMeasures").withElements(ImmutableList.of(monthBasedTime)).build()
        )).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("MeasureNameIsUnique|Measure name is not unique: Time"));
    }

    @Test
    void testMeasureSymbolIsUnique() throws Exception {
        log.info("Testing constraint: MeasureSymbolIsUnique");

        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0).withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(second, minute)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("MonthBasedTime").withSymbol("t").withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(time, monthBasedTime)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("MeasureSymbolIsUnique|Measure symbol is not unique: t (measure: Time)",
                "MeasureSymbolIsUnique|Measure symbol is not unique: t (measure: MonthBasedTime)"),
                Collections.emptyList());
    }

    @Test
    void testNoCircularReferencesOfDerivedMeasures() throws Exception {
        log.info("Testing constraint: NoCircularReferencesOfDerivedMeasures");

        final Unit u1 = newUnitBuilder().withName("u1").withRateDividend(1.0).withRateDivisor(1.0).build();
        final Unit u2 = newUnitBuilder().withName("u2").withRateDividend(1.0).withRateDivisor(1.0).build();
        final MeasureDefinitionTerm t1 = newMeasureDefinitionTermBuilder().withUnit(u2).withExponent(1).build();
        final MeasureDefinitionTerm t2 = newMeasureDefinitionTermBuilder().withUnit(u1).withExponent(1).build();
        final DerivedMeasure m1 = newDerivedMeasureBuilder().withName("m1").withUnits(u1).withTerms(t1).build();
        final DerivedMeasure m2 = newDerivedMeasureBuilder().withName("m2").withUnits(u2).withTerms(t2).build();

        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(m1, m2)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NoCircularReferencesOfDerivedMeasures|Derived measure definition m1 is recursive",
                "NoCircularReferencesOfDerivedMeasures|Derived measure definition m2 is recursive"),
                Collections.emptyList());
    }

    @Test
    void testValidModelWithMeasures() throws Exception {
        log.info("Positive test with measures");

        Unit quintal = newUnitBuilder().withName("quintal").withRateDividend(100.0).withSymbol("q").build();
        Unit kilogram = newUnitBuilder().withName("kilogram").withSymbol("kg").build();
        Measure mass = newMeasureBuilder().withName("Mass").withSymbol("m").withUnits(ImmutableList.of(kilogram, quintal)).build();
        Model template = newModelBuilder().withPackages(newPackageBuilder().withName("sandbox").withElements(mass).build()).withName("Template").build();

        MeasuredType massStoredInKg = newMeasuredTypeBuilder().withName("MassStoredInKg").withPrecision(15).withScale(4).withStoreUnit(kilogram).build();
        MeasuredType massStoredInQ = newMeasuredTypeBuilder().withName("MassStoredInQ").withPrecision(15).withScale(4).withStoreUnit(quintal).build();

        EntityType person = newEntityTypeBuilder().withName("Person").withAttributes(newAttributeBuilder().withName("weight").withDataType(massStoredInKg).build()).build();
        EntityType car = newEntityTypeBuilder().withName("Car")
                .withAttributes(
                        newAttributeBuilder().withName("weight").withDataType(massStoredInQ).build()
                ).withRelations(ImmutableList.of(
                        newEndpointBuilder().withName("passangers").withTarget(person).withCardinality(
                                newCardinalityBuilder().withUpper(4).withLower(0).build()
                        ).build(),
                        newEndpointBuilder().withName("driver").withTarget(person).withCardinality(
                                newCardinalityBuilder().withLower(1).withUpper(1).build()
                        ).build())
                ).withDataProperties(
                        newDataPropertyBuilder().withName("totalWeight").withDataType(massStoredInKg).withGetterExpression(
                                newDataExpressionTypeBuilder().withExpression("self.weight + self.passangers->sum(p | p.weight)").build()).build()
                ).build();


        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(
                person,
                massStoredInKg,
                massStoredInQ,
                car
        )).build();

        psmModel.addContent(m);
        psmModel.addContent(template);
        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testValidModel() throws Exception {
        log.info("Positive test");

        EntityType A0 = newEntityTypeBuilder().withName("A0").build();
        EntityType A1 = newEntityTypeBuilder().withName("A1").withAbstract_(true).build();

        Endpoint b = newEndpointBuilder().withName("b").withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build();
        Endpoint c = newEndpointBuilder().withName("c").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();
        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        EntityType A = newEntityTypeBuilder().withName("A").withAttributes(
                newAttributeBuilder().withName("x").withDataType(string).withRequired(true).withIdentifier(true).build()
        ).withRelations(
                ImmutableList.of(b, c)
        ).withSuperEntityTypes(ImmutableList.of(A0, A1)).build();

        StringType text = newStringTypeBuilder().withName("Text").withMaxLength(255).build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
        Endpoint a = newEndpointBuilder().withName("a").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();

        EntityType C = newEntityTypeBuilder().withName("C").withRelations(newEndpointBuilder().withName("a").withTarget(A).withCardinality(newCardinalityBuilder().withUpper(-1).build()).build()).build();

        EntityType B = newEntityTypeBuilder().withName("B").withRelations(a).build();

        EntityType S2 = newEntityTypeBuilder().withName("S2").withRelations(
                newEndpointBuilder().withName("b").withTarget(B).withCardinality(newCardinalityBuilder().build()).build()
        ).build();

        EntityType S1 = newEntityTypeBuilder().withName("S1").withRelations(ImmutableList.of(
                newEndpointBuilder().withName("a").withTarget(A).withCardinality(newCardinalityBuilder().build()).build(),
                newEndpointBuilder().withName("s2").withTarget(S2).withCardinality(newCardinalityBuilder().build()).build()
        )).build();

        a.setTarget(A);
        a.setPartner(b);
        b.setTarget(B);
        b.setPartner(a);
        c.setTarget(C);

        Model test = newModelBuilder().withPackages(newPackageBuilder().withName("sandbox").withElements(ImmutableList.of(
                A0,
                A1,
                A,
                B,
                C,
                S1,
                S2
        )).build()).withElements(ImmutableList.of(
                string,
                text,
                integer
        )).withName("TEST").build();

        psmModel.addContent(test);
        runEpsilon(null, null);
    }

    @Test
    void testNamespaceElementNameNotEmpty() throws Exception {
        log.info("Testing constraint: ElementNameContainsAtLeastOneCharacter");
        StringType stringType = newStringTypeBuilder().withName("").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameContainsAtLeastOneCharacter|NamespaceElement name must contain at least one character. Zero length name found in M::"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameContainsValidCharacters() throws Exception {
        log.info("Testing constraint: ElementNameContainsValidCharacters");
        StringType stringType = newStringTypeBuilder().withName("string$string").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameContainsValidCharacters|NamespaceElement's name can only contain english letters (A-Z, a-z), digits (0-9) and underscore characters (_): string$string"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameContainsNoSubsequentUnderscores() throws Exception {
        log.info("Testing constraint: ElementNameCannotContainSubsequentUnderscores");
        StringType stringType = newStringTypeBuilder().withName("__string").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameCannotContainSubsequentUnderscores|NamespaceElement's name cannot contain two subsequent underscore characters: __string"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameFirstCharacterCannotBeDigit() throws Exception {
        log.info("Testing constraint: ElementNameFirstCharacterCannotBeDigit");
        StringType stringType = newStringTypeBuilder().withName("0string").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameFirstCharacterCannotBeDigit|NamespaceElement's name must start with an english letter or an underscore: 0string"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameLastCharacterCannotBeUnderscore() throws Exception {
        log.info("Testing constraint: ElementNameLastCharacterCannotBeUnderscore");
        StringType stringType = newStringTypeBuilder().withName("string_").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameLastCharacterCannotBeUnderscore|NamespaceElement's name must end with an english letter or a digit: string_"), Collections.emptyList());
    }

    @Test
    void testCascadeDeleteOnlyAllowedIfUpperCardinalityIsOne() throws Exception {
        log.info("Testing constraint: CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne");
        Endpoint endpoint = newEndpointBuilder().withName("endpoint")
                .withCardinality(
                        newCardinalityBuilder().withLower(0).withUpper(2).build()
                ).withCascadeDelete(true)
                .build();
        EntityType entity = newEntityTypeBuilder().withName("entity").withRelations(ImmutableList.of(endpoint)).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        entity
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne|Cascade delete behavior only allowed on endpoints if their upper cardinality is 1: endpoint"), Collections.emptyList());
    }

    @Test
    void testAtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound() throws Exception {
        log.info("Testing critique: AtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound");

        Endpoint endpoint1 = newEndpointBuilder().withName("endpoint1").withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();
        Endpoint endpoint2 = newEndpointBuilder().withName("endpoint2").withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();

        EntityType entity1 = newEntityTypeBuilder().withName("entity1").withRelations(ImmutableList.of(endpoint1)).build();
        EntityType entity2 = newEntityTypeBuilder().withName("entity2").withRelations(ImmutableList.of(endpoint2)).build();

        endpoint1.setPartner(endpoint2);
        endpoint1.setTarget(entity2);
        endpoint2.setPartner(endpoint1);
        endpoint2.setTarget(entity1);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entity1, entity2)).build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound|At least one reference of a bidirectional association should have lower bound with zero: M::entity1.endpoint1 or M::entity2.endpoint2",
                        "AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound|At least one reference of a bidirectional association should have lower bound with zero: M::entity2.endpoint2 or M::entity1.endpoint1"
                ));
    }

    @Test
    void testValidRegex() throws Exception {
        log.info("Testing constraint: ValidRegex");

        StringType stringType = newStringTypeBuilder().withName("regexpyStringy").withMaxLength(100).withRegExp("árvíztűrőtükörfúrógép").build();
        StringType invalidStringType = newStringTypeBuilder().withName("invalidRegexpyStringy").withMaxLength(100).withRegExp("[árvíztűrőtükörfúrógép").build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(stringType, invalidStringType)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ValidRegex|Invalid regular expression of invalidRegexpyStringy"), Collections.emptyList());
    }
}