package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.meta.psm.measure.*;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.BoundOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
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
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticDataBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.*;

class PsmValidationTest {

    Logger logger = LoggerFactory.getLogger(PsmValidationTest.class);

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;
    private Log log = new Slf4jLog();

    @BeforeEach
    void setUp () {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .name("test")
                .build();
    }

    private void runEpsilon (Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
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
    void testModelNameIsUnique () throws Exception {
        log.info("Testing constraint: ModelNameIsUnique");

        Model m1 = newModelBuilder().withName("A").build();
        Model m2 = newModelBuilder().withName("A").build();

        psmModel.addContent(m1);
        psmModel.addContent(m2);

        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testNamespaceHasUniqueElementNames () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

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

        runEpsilon(ImmutableList.of(
        		"NamedElementIsUniqueInItsContainer|Named element string is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element String is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element e is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element E is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element p is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element P is not unique in its container"),
        		ImmutableList.of(
				"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: String",
				"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: string"
        		));
    }

    @Test
    void testEnumerationMemberNameIs () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

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

        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element A is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element A is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationMemberValueIsUnique () throws Exception {
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
    void testScaleIsLowerThanPrecision () throws Exception {
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
    void testValidScale () throws Exception {
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
    void testValidMaxLength () throws Exception {
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
    void testValidPartnerRelations () throws Exception {
        log.info("Testing constraint: ValidPartnerRelations");

        AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e3 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

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
    void testValidPartnerType () throws Exception {
        log.info("Testing constraint: ValidPartnerType");

        AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e3 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

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
    void testInheritanceIsNotRecursive () throws Exception {
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
    void testPartnerIsNotSelf () throws Exception {
        log.info("Testing constraint: PartnerIsNotSelf");

        AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e1).build();

        e1.setTarget(E1);
        e1.setPartner(e1);

        Model m = newModelBuilder().withName("M").withElements(E1).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("PartnerIsNotSelf|Self partner relation found: M::E1.e1"),
                Collections.emptyList());
    }

    @Test
    void testAttributeNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

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
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element a is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element a is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testRelationNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        AssociationEnd endpoint = newAssociationEndBuilder()
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
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element e is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element e is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testNoAttributeAndRelationAreWithTheSameName () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        AssociationEnd x = newAssociationEndBuilder()
                .withName("x")
                .withCardinality(newCardinalityBuilder().build()).build();

        EntityType E = newEntityTypeBuilder().withName("E")
                .withAttributes(newAttributeBuilder().withName("x").withDataType(string).build())
                .withRelations(x)
                .build();

        x.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(string, E)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element x is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element x is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testOppositePartnerIsDefined () throws Exception {
        log.info("Testing constraint: OppositePartnerIsDefined");

        AssociationEnd e = newAssociationEndBuilder().withName("e").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd f = newAssociationEndBuilder().withName("f").withCardinality(newCardinalityBuilder().build()).build();

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
    void testMaxLengthIsNotTooLarge () throws Exception {
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
    void testStandaloneModelLoadedOnly () throws Exception {
        log.info("Testing constraint: StandaloneModelLoadedOnly");

        Model a = newModelBuilder().withName("A").build();
        Model b = newModelBuilder().withName("B").build();

        psmModel.addContent(a);
        psmModel.addContent(b);
        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testPackageHasNamespace () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        Package pkg = newPackageBuilder().withName("pkg").build();
        Model m = newModelBuilder().withName("M").build();

        psmModel.addContent(m);
        psmModel.addContent(pkg);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element pkg has no container"),
                Collections.emptyList());
    }

    @Test
    void testNamespaceElementBelongsToOneNamespace () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        StringType orphanString = newStringTypeBuilder().withName("orphanString").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M").build();

        psmModel.addContent(m);
        psmModel.addContent(string);
        psmModel.addContent(orphanString);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element String has no container", "NamedElementHasContainer|Named element orphanString has no container"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationMemberHasEnumerationType () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

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
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element m1 has no container"),
                Collections.emptyList());
    }

    @Test
    void testRelationBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        AssociationEnd orphanAssociationEnd = newAssociationEndBuilder().withName("orphanAssociationEnd").withCardinality(newCardinalityBuilder().withUpper(1).withLower(1).build()).build();
        EntityType entity1 = newEntityTypeBuilder().withName("entity1").build();
        orphanAssociationEnd.setTarget(entity1);

        Model m = newModelBuilder().withName("M").withElements(entity1).build();

        psmModel.addContent(orphanAssociationEnd);
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element orphanAssociationEnd has no container"),
                Collections.emptyList());
    }

    @Test
    void testAttributeBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build(),
                        string
                )).build();

        Attribute b = newAttributeBuilder().withName("b").withDataType(string).build();

        psmModel.addContent(m);
        psmModel.addContent(b);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element b has no container"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationContainsAtLeastTwoMembers () throws Exception {
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
    void testDataPropertyNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

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
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element p is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element p is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testNavigationPropertyNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        Containment r1 = newContainmentBuilder().withName("r1").withCardinality(newCardinalityBuilder().build()).build();
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
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element n is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element n is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testDataPropertyBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        EntityType E = newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build();
        DataProperty p = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E, string)).build();

        psmModel.addContent(m);
        psmModel.addContent(p);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element p has no container"),
                Collections.emptyList());
    }

    @Test
    void testNavigationPropertyBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        Containment r1 = newContainmentBuilder().withName("r1").withCardinality(newCardinalityBuilder().build()).build();
        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).build();
        r1.setTarget(E);
        Model m = newModelBuilder().withName("M").withElements(E).build();

        NavigationProperty n = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()).build();
        n.setTarget(E);

        psmModel.addContent(m);
        psmModel.addContent(n);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element n has no container"),
                Collections.emptyList());
    }

    @Test
    void testDataPropertyGetterTypeIsValid () throws Exception {
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
    void testUnitNameIsUnique () throws Exception {
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
    void testUnitRates () throws Exception {
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
    void testBaseUnitShouldBeDefined () throws Exception {
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
    void testMeasureNameIsUnique () throws Exception {
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
    void testMeasureSymbolIsUnique () throws Exception {
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
    void testNoCircularReferencesOfDerivedMeasures () throws Exception {
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
    void testValidModelWithMeasures () throws Exception {
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
                        newAssociationEndBuilder().withName("passengers").withTarget(person).withCardinality(
                                newCardinalityBuilder().withUpper(4).withLower(0).build()
                        ).build(),
                        newAssociationEndBuilder().withName("driver").withTarget(person).withCardinality(
                                newCardinalityBuilder().withLower(1).withUpper(1).build()
                        ).build())
                ).withDataProperties(
                        newDataPropertyBuilder().withName("totalWeight").withDataType(massStoredInKg).withGetterExpression(
                                newDataExpressionTypeBuilder().withExpression("self.weight + self.passengers->sum(p | p.weight)").build()).build()
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
    void testValidModel () throws Exception {
        log.info("Positive test");

        EntityType E10 = newEntityTypeBuilder().withName("E10").build(); //inherited BY E1
        EntityType E11 = newEntityTypeBuilder().withName("E11").withAbstract_(true).build(); //inherited BY E1

        AssociationEnd b = newAssociationEndBuilder().withName("ep2").withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build();
        AssociationEnd c = newAssociationEndBuilder().withName("ep3").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();
        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        //inheriting: E10, E11
        EntityType E1 = newEntityTypeBuilder().withName("E1").withAttributes(
                newAttributeBuilder().withName("a1").withDataType(string).withRequired(true).withIdentifier(true).build()
        ).withRelations(
                ImmutableList.of(b, c)
        ).withSuperEntityTypes(ImmutableList.of(E10, E11)).build();

        StringType text = newStringTypeBuilder().withName("Text").withMaxLength(255).build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
        AssociationEnd a = newAssociationEndBuilder().withName("ep1").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();

        EntityType E3 = newEntityTypeBuilder().withName("E3").withRelations(newAssociationEndBuilder().withName("ep4").withTarget(E1).withCardinality(newCardinalityBuilder().withUpper(-1).build()).build()).build();

        EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(a).build();

        EntityType S2 = newEntityTypeBuilder().withName("S2").withRelations(
                newAssociationEndBuilder().withName("endpoint").withTarget(E2).withCardinality(newCardinalityBuilder().build()).build()
        ).build();

        EntityType S1 = newEntityTypeBuilder().withName("S1").withRelations(ImmutableList.of(
                newAssociationEndBuilder().withName("ep5").withTarget(E1).withCardinality(newCardinalityBuilder().build()).build(),
                newAssociationEndBuilder().withName("s2").withTarget(S2).withCardinality(newCardinalityBuilder().build()).build()
        )).build();

        a.setTarget(E1);
        a.setPartner(b);
        b.setTarget(E2);
        b.setPartner(a);
        c.setTarget(E3);

        Model test = newModelBuilder().withPackages(newPackageBuilder().withName("sandbox").withElements(ImmutableList.of(
                E10,
                E11,
                E1,
                E2,
                E3,
                S1,
                S2
        )).build()).withElements(ImmutableList.of(
                string,
                text,
                integer
        )).withName("TEST").build();

        psmModel.addContent(test);
        runEpsilon(Collections.emptyList(), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameNotEmpty () throws Exception {
        log.info("Testing constraint: ElementNameContainsAtLeastOneCharacter");
        StringType stringType = newStringTypeBuilder().withName("").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameNotEmpty|NamespaceElement name must contain at least one character. Zero length name found in M::"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameContainsValidCharacters () throws Exception {
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
    void testNamespaceElementNameContainsNoSubsequentUnderscores () throws Exception {
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
    void testNamespaceElementNameFirstCharacterCannotBeDigit () throws Exception {
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
    void testNamespaceElementNameLastCharacterCannotBeUnderscore () throws Exception {
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
    void testCascadeDeleteOnlyAllowedIfUpperCardinalityIsOne () throws Exception {
        log.info("Testing constraint: CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne");
        AssociationEnd endpoint = newAssociationEndBuilder().withName("endpoint")
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
    void testAtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound () throws Exception {
        log.info("Testing critique: AtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound");

        AssociationEnd endpoint1 = newAssociationEndBuilder().withName("endpoint1").withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();
        AssociationEnd endpoint2 = newAssociationEndBuilder().withName("endpoint2").withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();

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
    void testValidRegex () throws Exception {
        log.info("Testing constraint: ValidRegex");

        StringType stringType = newStringTypeBuilder().withName("regexpyStringy").withMaxLength(100).withRegExp("árvíztűrőtükörfúrógép").build();
        StringType invalidStringType = newStringTypeBuilder().withName("invalidRegexpyStringy").withMaxLength(100).withRegExp("[árvíztűrőtükörfúrógép").build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(stringType, invalidStringType)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ValidRegex|Invalid regular expression of invalidRegexpyStringy"), Collections.emptyList());
    }

    @Test
    void testInheritedAndNonInheritedNamesAreUnique () throws Exception {
        log.info("Testing constraint: InheritedAndNonInheritedNamesAreUnique");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(string).build();
        Attribute negtest_member1 = newAttributeBuilder().withName("negtest_member").withDataType(string).build();

        Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(string).build();
        Attribute negtest_member2 = newAttributeBuilder().withName("negtest_Member").withDataType(string).build();

        Attribute attribute3 = newAttributeBuilder().withName("attribute3").withDataType(string).build();
        AssociationEnd negtest_member3 = newAssociationEndBuilder().withName("negtest_member").withCardinality(newCardinalityBuilder().withUpper(1).withLower(0).build()).build();

        EntityType superSuperEntityType = newEntityTypeBuilder().withName("superEntityType")
                .withAttributes(
                        ImmutableList.of(attribute3)
                ).withRelations(
                        ImmutableList.of(negtest_member3)
                ).build();
        EntityType superEntityType = newEntityTypeBuilder().withName("superEntityType")
                .withAttributes(
                        ImmutableList.of(negtest_member2, attribute2)
                ).withSuperEntityTypes(
                        ImmutableList.of(superSuperEntityType)
                ).build();
        EntityType entityType = newEntityTypeBuilder().withName("entityType")
                .withAttributes(
                        ImmutableList.of(attribute1, negtest_member1)
                ).withSuperEntityTypes(
                        ImmutableList.of(superEntityType)
                ).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(entityType, superEntityType)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("InheritedAndNonInheritedNamesAreUnique|Entity entityType has inherited or non inherited members with the same name, member overriding is not allowed: Sequence {negtest_Member, negtest_member, negtest_member}","InheritedAndNonInheritedNamesAreUnique|Entity superEntityType has inherited or non inherited members with the same name, member overriding is not allowed: Sequence {negtest_member}"), Collections.emptyList());
    }
    
    @Test
    void testNamedElementHasContainer() throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");
        
        Model m = newModelBuilder().withName("M").build();
        Package p = newPackageBuilder().withName("p").build();

        psmModel.addContent(m);
        psmModel.addContent(p);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element p has no container"), Collections.emptyList());
    }
    
    @Test
    void testNamedElementIsUniqueInItsContainer() throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");
        
        Model m = newModelBuilder().withName("M")
        		.withPackages(ImmutableList.of(
        				newPackageBuilder().withName("p").build(),
        				newPackageBuilder().withName("P").build()))
        		.build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element P is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element p is not unique in its container"), Collections.emptyList());
    }
    
    @Test
    void testTransferObjectRelationIsEmbedded() throws Exception {
        log.info("Testing constraint: TransferObjectRelationIsEmbedded");
        
        TransferObjectRelation r = newTransferObjectRelationBuilder().withName("R").build();
        UnmappedTransferObjectType o = newUnmappedTransferObjectTypeBuilder().withName("O").withRelations(r).build();
        r.setTarget(o);
        
        Model m = newModelBuilder().withName("M").withElements(o).build();

        psmModel.addContent(m);
        
        runEpsilon(ImmutableList.of("TransferObjectRelationIsEmbedded|Transfer object relation R is referencing to unembedded unmapped transfer object type: O"),
        		Collections.emptyList());
    }
    
    @Test
    void testUnmappedTransferObjectTypeHasNoRelationBinding() throws Exception {
        log.info("Testing constraint: UnmappedTransferObjectTypeHasNoRelationBinding");
        
        StaticNavigation n = newStaticNavigationBuilder().withName("N").withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation r = newTransferObjectRelationBuilder().withName("R").withBinding(n).withCardinality(newCardinalityBuilder().build()).build();
        
        UnmappedTransferObjectType t = newUnmappedTransferObjectTypeBuilder().withName("T").withRelations(r).build();

        Model m = newModelBuilder().withName("M").withElements(t).build();
        
        psmModel.addContent(m);
        
        runEpsilon(ImmutableList.of(
        		"UnmappedTransferObjectTypeHasNoRelationBinding|Transfer object relation R of unmapped transfer object T must not have binding."),
        		Collections.emptyList());
    }
    
    @Test
    void testUnmappedTransferObjectTypeHasNoAttributeBinding() throws Exception {
        log.info("Testing constraint: UnmappedTransferObjectTypeHasNoAttributeBinding");
        
        StringType string = newStringTypeBuilder().withName("Str").withMaxLength(255).build();
        StaticData d = newStaticDataBuilder().withName("D").withDataType(string).withGetterExpression(
        		newDataExpressionTypeBuilder().withExpression("exp").build()).build();

        TransferAttribute a = newTransferAttributeBuilder().withName("A").withDataType(string).withBinding(d).build();
        UnmappedTransferObjectType t = newUnmappedTransferObjectTypeBuilder().withName("T").withAttributes(a).build();
        
        Model m = newModelBuilder().withName("M").withElements(t).build();

        psmModel.addContent(m);
        
        runEpsilon(ImmutableList.of(
        		"UnmappedTransferObjectTypeHasNoAttributeBinding|Transfer object attribute A of unmapped transfer object T must not have binding."),
        		Collections.emptyList());
    }
    
    @Test
    void testTimeStampBaseUnitIsValid() throws Exception {
        log.info("Testing constraint: TimeStampBaseUnitIsValid");
        
        TimestampType weekTimestamp = newTimestampTypeBuilder().withName("weekTimestamp").withBaseUnit(DurationType.WEEK).build();
        TimestampType monthTimestamp = newTimestampTypeBuilder().withName("monthTimestamp").withBaseUnit(DurationType.MONTH).build();
        TimestampType yearTimestamp = newTimestampTypeBuilder().withName("yearTimestamp").withBaseUnit(DurationType.YEAR).build();
                
        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(weekTimestamp,monthTimestamp,yearTimestamp)).build();

        psmModel.addContent(m);
        
        runEpsilon(ImmutableList.of(
        		"TimeStampBaseUnitIsValid|Base unit of timestamp type: weekTimestamp is invalid.",
        		"TimeStampBaseUnitIsValid|Base unit of timestamp type: monthTimestamp is invalid.",
        		"TimeStampBaseUnitIsValid|Base unit of timestamp type: yearTimestamp is invalid."),
        		Collections.emptyList());
    }
    
    @Test
    void testTransferAttributeBindingIsValid() throws Exception {
        log.info("Testing constraint: TransferAttributeBindingIsValid");
        
        NumericType integer = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();
        
        Attribute attribute0 = newAttributeBuilder().withName("attribute0").withDataType(integer).build();
        Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(integer).build();
        Attribute attribute2 = newAttributeBuilder().withName("attribute2").withDataType(integer).build();
        
        DataProperty property0 = newDataPropertyBuilder().withName("property0").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute0").build()
        )
        .build();
        DataProperty property1 = newDataPropertyBuilder().withName("property1").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute1").build()
        )
        .build();
        DataProperty property2 = newDataPropertyBuilder().withName("property2").withDataType(integer).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute2").build()
        )
        .build();
        StaticData staticData = newStaticDataBuilder().withName("staticData").withDataType(integer)
        		.withGetterExpression(newDataExpressionTypeBuilder().withExpression("10").build()
        )
        .build();
        
        EntityType parent = newEntityTypeBuilder().withName("parent")
        					.withAttributes(attribute0)
        					.withDataProperties(property0)
        					.build();
        EntityType child = newEntityTypeBuilder().withName("child")
        					.withSuperEntityTypes(parent)
        					.withAttributes(attribute1)
        					.withDataProperties(property1)
        					.build();
        EntityType friend = newEntityTypeBuilder().withName("friend")
        					.withAttributes(attribute2)
        					.withDataProperties(property2)
        					.build();

        TransferAttribute transferAttribute0 = newTransferAttributeBuilder().withName("TransferAttribute0").withDataType(integer)
        		.withBinding(attribute0).build();
        TransferAttribute transferAttribute1 = newTransferAttributeBuilder().withName("TransferAttribute1")
        		.withDataType(integer).withBinding(attribute1).build();
        TransferAttribute transferAttribute2 = newTransferAttributeBuilder().withName("TransferAttribute2")
        		.withDataType(integer).withBinding(attribute2).build();
        TransferAttribute transferAttribute3 = newTransferAttributeBuilder().withName("TransferAttribute3")
        		.withDataType(integer).withBinding(property0).build();
        TransferAttribute transferAttribute4 = newTransferAttributeBuilder().withName("TransferAttribute4")
        		.withDataType(integer).withBinding(property1).build();
        TransferAttribute transferAttribute5 = newTransferAttributeBuilder().withName("TransferAttribute5")
        		.withDataType(integer).withBinding(property2).build();
        TransferAttribute transferAttribute6 = newTransferAttributeBuilder().withName("TransferAttribute6")
        		.withDataType(integer).withBinding(staticData).build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
							.withName("TransferObject").withAttributes(ImmutableList.of(
									transferAttribute0,
									transferAttribute1,
									transferAttribute2,
									transferAttribute3,
									transferAttribute4,
									transferAttribute5,
									transferAttribute6
									))
							.withEntityType(child)
							.build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
        			integer,
        			parent,
        			child,
        			friend,
        			transferObject,
        			staticData
        		))
        		.build();

        psmModel.addContent(model);
        
        runEpsilon(ImmutableList.of(
        		"TransferAttributeBindingIsValid|Binding of transfer attribute TransferAttribute2 of mapped transfer object TransferObject "
        		+ "must either match the entity type of the mapped tranfer object or be StaticData.",
        		"TransferAttributeBindingIsValid|Binding of transfer attribute TransferAttribute5 of mapped transfer object TransferObject "
        		+ "must either match the entity type of the mapped tranfer object or be StaticData."),
        		Collections.emptyList());
    }
    
    @Test
    void testTransferObjectRelationBindingIsValid() throws Exception {
        log.info("Testing constraint: TransferObjectRelationBindingIsValid");
        
        AssociationEnd e0 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e1 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();
        
        NavigationProperty n0 = newNavigationPropertyBuilder().withName("n0").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e0").build()
        )
        .build();
        NavigationProperty n1 = newNavigationPropertyBuilder().withName("n1").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e1").build()
        )
        .build();
        NavigationProperty n2 = newNavigationPropertyBuilder().withName("n2").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e2").build()
        )
        .build();
        
        StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav")
        		.withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(
                        newReferenceExpressionTypeBuilder().withExpression("child").build()
        		)
        		.build();
        
        EntityType parent = newEntityTypeBuilder().withName("parent")
				.withRelations(e0)
				.withNavigationProperties(n0)
				.build();
        EntityType child = newEntityTypeBuilder().withName("child")
				.withSuperEntityTypes(parent)
				.withRelations(e1)
				.withNavigationProperties(n1)
				.build();
        EntityType friend = newEntityTypeBuilder().withName("friend")
        		.withRelations(e2)
        		.withNavigationProperties(n2)
				.build();

        e0.setTarget(friend);
        e1.setTarget(friend);
        e1.setPartner(e2);
        e2.setTarget(child);
        e2.setPartner(e1);
        
        TransferObjectRelation transferRelation0 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation0").withCardinality(newCardinalityBuilder().build()).withBinding(e0).build();
        TransferObjectRelation transferRelation1 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation1").withBinding(e1).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation2 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation2").withCardinality(newCardinalityBuilder().build()).withBinding(e2).build();
        TransferObjectRelation transferRelation3 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation3").withCardinality(newCardinalityBuilder().build()).withBinding(n0).build();
        TransferObjectRelation transferRelation4 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation4").withCardinality(newCardinalityBuilder().build()).withBinding(n1).build();
        TransferObjectRelation transferRelation5 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation5").withCardinality(newCardinalityBuilder().build()).withBinding(n2).build();
        TransferObjectRelation transferRelation6 = newTransferObjectRelationBuilder()
        		.withName("TransferRelation6").withCardinality(newCardinalityBuilder().build()).withBinding(staticNav).build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
							.withName("TransferObject").withRelations(ImmutableList.of(
									transferRelation0,
									transferRelation1,
									transferRelation2,
									transferRelation3,
									transferRelation4,
									transferRelation5,
									transferRelation6
									))
							.withEntityType(child)
							.build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
        			parent,
        			child,
        			friend,
        			transferObject,
        			staticNav
        		))
        		.build();

        psmModel.addContent(model);
        
        runEpsilon(ImmutableList.of(
        		"TransferObjectRelationBindingIsValid|Binding of transfer object relation TransferRelation2 of mapped transfer object TransferObject "
        		+ "must either match the entity type of the mapped tranfer object or be StaticNavigation.",
        		"TransferObjectRelationBindingIsValid|Binding of transfer object relation TransferRelation5 of mapped transfer object TransferObject "
                + "must either match the entity type of the mapped tranfer object or be StaticNavigation."),
        		Collections.emptyList());
    }
    
    @Test
    void testPrimitiveTypeNamesAreUnique() throws Exception {
        log.info("Testing critique: PrimitiveTypeNamesAreUnique");

        NumericType type1 = newNumericTypeBuilder().withName("integer").withPrecision(18).build();
        NumericType type2 = newNumericTypeBuilder().withName("INTEGER").withPrecision(18).build();
        CustomType type3 = newCustomTypeBuilder().withName("type").build();
        StringType type4 = newStringTypeBuilder().withName("Type").withMaxLength(255).build();
        PasswordType type5 = newPasswordTypeBuilder().withName("pw").build();
        BooleanType type6 = newBooleanTypeBuilder().withName("PW").build();
        DateType type7 = newDateTypeBuilder().withName("time").build();
        TimestampType type8 = newTimestampTypeBuilder().withName("Time").build();

        Package p1 = newPackageBuilder().withName("pkg1").withElements(ImmutableList.of(type1,type3,type5,type7)).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(ImmutableList.of(type2,type4,type6,type8)).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: integer",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: INTEGER",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: type",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: Type",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: pw",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: PW",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: time",
                        "PrimitiveTypeNamesAreUnique|Primitive type name is not unique: Time"
                ));
    }
    
    @Test
    void testEntityTypeNamesAreUnique() throws Exception {
        log.info("Testing critique: EntityTypeNamesAreUnique");

        EntityType entity1 = newEntityTypeBuilder().withName("entity").build();
        EntityType entity2 = newEntityTypeBuilder().withName("Entity").build();
        Package p1 = newPackageBuilder().withName("pkg1").withElements(entity1).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(entity2).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "EntityTypeNamesAreUnique|Entity type name is not unique: entity",
                        "EntityTypeNamesAreUnique|Entity type name is not unique: Entity"
                ));
    }
    
    @Test
    void testTransferObjectTypeNamesAreUnique() throws Exception {
        log.info("Testing critique: TransferObjectTypeNamesAreUnique");

        MappedTransferObjectType transferObject1 = newMappedTransferObjectTypeBuilder().withName("TransferObject").build();
        UnmappedTransferObjectType transferObject2 = newUnmappedTransferObjectTypeBuilder().withName("transferObject").build();
        Package p1 = newPackageBuilder().withName("pkg1").withElements(transferObject1).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(transferObject2).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "TransferObjectTypeNamesAreUnique|Transfer object type name is not unique: TransferObject",
                        "TransferObjectTypeNamesAreUnique|Transfer object type name is not unique: transferObject"
                ));
    }
    
    @Test
    void testStaticNavigationNamesAreUnique() throws Exception {
        log.info("Testing critique: StaticNavigationNamesAreUnique");

        StaticNavigation staticNavigation1 = newStaticNavigationBuilder().withName("staticNavigation")
        		.withTarget(newEntityTypeBuilder().withName("entity"))
        		.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1))
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("entity").build())
        		.build();
        StaticNavigation staticNavigation2 = newStaticNavigationBuilder().withName("staticnavigation")
        		.withTarget(newEntityTypeBuilder().withName("entity"))
        		.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1))
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("entity").build())
        		.build();

        Package p1 = newPackageBuilder().withName("pkg1").withElements(staticNavigation1).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(staticNavigation2).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "StaticNavigationNamesAreUnique|Static navigation name is not unique: staticNavigation",
                        "StaticNavigationNamesAreUnique|Static navigation name is not unique: staticnavigation"
                ));
    }
    
    @Test
    void testStaticDataNamesAreUnique() throws Exception {
        log.info("Testing critique: StaticDataNamesAreUnique");

        StaticData staticData1 = newStaticDataBuilder().withName("staticData")
        		.withDataType(newCustomTypeBuilder().withName("custom").build())
        		.withGetterExpression(newDataExpressionTypeBuilder().withExpression("5").build())
        		.build();
        StaticData staticData2 = newStaticDataBuilder().withName("StaticData")
        		.withDataType(newCustomTypeBuilder().withName("custom").build())
        		.withGetterExpression(newDataExpressionTypeBuilder().withExpression("5").build())
        		.build();

        Package p1 = newPackageBuilder().withName("pkg1").withElements(staticData1).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(staticData2).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "StaticDataNamesAreUnique|Static data name is not unique: staticData",
                        "StaticDataNamesAreUnique|Static data name is not unique: StaticData"
                ));
    }
    
    @Test
    void testUnboundOperationNamesAreUnique() throws Exception {
        log.info("Testing critique: UnboundOperationNamesAreUnique");

        UnboundOperation unboundOp1 = newUnboundOperationBuilder().withName("unboundoperation")
        		.withImplementation(newOperationBodyBuilder().withBody("body").build())
        		.build();
        UnboundOperation unboundOp2 = newUnboundOperationBuilder().withName("UNBOUNDOPERATION")
        		.withImplementation(newOperationBodyBuilder().withBody("body").build())
        		.build();
        
        Package p1 = newPackageBuilder().withName("pkg1").withElements(unboundOp1).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(unboundOp2).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "UnboundOperationNamesAreUnique|Unbound operation name is not unique: unboundoperation",
                        "UnboundOperationNamesAreUnique|Unbound operation name is not unique: UNBOUNDOPERATION"
                ));
    }

    @Test
    void testAccessPointNamesAreUnique() throws Exception {
        log.info("Testing critique: AccessPointNamesAreUnique");

        AccessPoint accessPoint1 = newAccessPointBuilder().withName("accessPoint").build();
        AccessPoint accessPoint2 = newAccessPointBuilder().withName("AccessPoint").build();
        
        Package p1 = newPackageBuilder().withName("pkg1").withElements(accessPoint1).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(accessPoint2).build();
        
        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1,p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "AccessPointNamesAreUnique|Access point name is not unique: accessPoint",
                        "AccessPointNamesAreUnique|Access point name is not unique: AccessPoint"
                ));
    }
    
    @Test
    void testTargetMatchesBindingTarget() throws Exception {
        log.info("Testing constraint: TargetMatchesBindingTarget");
        
        AssociationEnd e0 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e1 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();
        
        NavigationProperty n0 = newNavigationPropertyBuilder().withName("n0").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e0").build()
        )
        .build();
        NavigationProperty n1 = newNavigationPropertyBuilder().withName("n1").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e1").build()
        )
        .build();
        NavigationProperty n2 = newNavigationPropertyBuilder().withName("n2").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.e2").build()
        )
        .build();
        
        StaticNavigation staticNav1 = newStaticNavigationBuilder().withName("staticNav1")
        		.withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(
                        newReferenceExpressionTypeBuilder().withExpression("targetChild").build()
        		)
        		.build();
        StaticNavigation staticNav2 = newStaticNavigationBuilder().withName("staticNav2")
        		.withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(
                        newReferenceExpressionTypeBuilder().withExpression("friend").build()
        		)
        		.build();
        
        EntityType parent = newEntityTypeBuilder().withName("parent")
				.withRelations(e0)
				.withNavigationProperties(n0)
				.build();
        EntityType child = newEntityTypeBuilder().withName("child")
				.withSuperEntityTypes(parent)
				.withRelations(ImmutableList.of(e1,e2))
				.withNavigationProperties(ImmutableList.of(n1,n2))
				.build();
        
        EntityType targetParent = newEntityTypeBuilder().withName("targetParent").build();
        EntityType targetChild = newEntityTypeBuilder().withName("targetChild")
        		.withSuperEntityTypes(targetParent).build();
        
        EntityType friend = newEntityTypeBuilder().withName("friend").build();
        
        e0.setTarget(targetParent);
        e1.setTarget(targetChild);
        e2.setTarget(friend);
        n0.setTarget(targetParent);
        n1.setTarget(targetChild);
        n2.setTarget(friend);
        staticNav1.setTarget(targetChild);
        staticNav2.setTarget(friend);
        
        MappedTransferObjectType targetTransferObject = newMappedTransferObjectTypeBuilder().withName("TargetTransferObject")
        		.withEntityType(targetChild).build();
        
        TransferObjectRelation transferRelation0 = newTransferObjectRelationBuilder().withName("TransferRelation0")
        		.withBinding(e0).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation1 = newTransferObjectRelationBuilder().withName("TransferRelation1")
        		.withBinding(e1).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation2 = newTransferObjectRelationBuilder().withName("TransferRelation2")
        		.withBinding(e2).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation3 = newTransferObjectRelationBuilder().withName("TransferRelation3")
        		.withBinding(n0).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation4 = newTransferObjectRelationBuilder().withName("TransferRelation4")
        		.withBinding(n1).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation5 = newTransferObjectRelationBuilder().withName("TransferRelation5")
        		.withBinding(n2).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation6 = newTransferObjectRelationBuilder().withName("TransferRelation6")
        		.withBinding(staticNav1).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();
        TransferObjectRelation transferRelation7 = newTransferObjectRelationBuilder().withName("TransferRelation7")
        		.withBinding(staticNav2).withTarget(targetTransferObject).withCardinality(newCardinalityBuilder().build()).build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
							.withName("TransferObject").withRelations(ImmutableList.of(
									transferRelation0,
									transferRelation1,
									transferRelation2,
									transferRelation3,
									transferRelation4,
									transferRelation5,
									transferRelation6,
									transferRelation7
							))
							.withEntityType(child)
							.build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
        			parent,
        			child,
        			targetParent,
        			targetChild,
        			friend,
        			transferObject,
        			targetTransferObject,
        			staticNav1,
        			staticNav2
        		))
        		.build();

        psmModel.addContent(model);
        
        runEpsilon(ImmutableList.of(
        		"TargetMatchesBindingTarget|EntityType of mapped transfer object type TargetTransferObject "
        		+ "(target of transfer object relation TransferRelation2) must match the target of the binding of transfer object relation TransferRelation2.",
        		"TargetMatchesBindingTarget|EntityType of mapped transfer object type TargetTransferObject "
        		+ "(target of transfer object relation TransferRelation5) must match the target of the binding of transfer object relation TransferRelation5.",
        		"TargetMatchesBindingTarget|EntityType of mapped transfer object type TargetTransferObject "
        		+ "(target of transfer object relation TransferRelation7) must match the target of the binding of transfer object relation TransferRelation7."),
        		Collections.emptyList());
    }
    
    @Test
    void testCardinalityMatchesBindingCardinality() throws Exception {
        log.info("Testing constraint: CardinalityMatchesBindingCardinality");

        AssociationEnd end0 = newAssociationEndBuilder().withName("end0")
                .withCardinality(
                		newCardinalityBuilder().withLower(0).withUpper(5).build()
                )
                .build();
        TransferObjectRelation transferRelation0 = newTransferObjectRelationBuilder().withName("TransferRelation0")
                .withBinding(end0).withCardinality(
                		newCardinalityBuilder().withLower(0).withUpper(5).build()
                )
                .build();
        
        AssociationEnd end1 = newAssociationEndBuilder().withName("end1")
                .withCardinality(
                		newCardinalityBuilder().withLower(1).withUpper(1).build()
                )
                .build();
        TransferObjectRelation transferRelation1 = newTransferObjectRelationBuilder().withName("TransferRelation1")
                .withBinding(end1).withCardinality(
                		newCardinalityBuilder().withLower(0).withUpper(5).build()
                )
                .build();
        
        Containment containment = newContainmentBuilder().withName("containment")
                .withCardinality(
                		newCardinalityBuilder().withLower(2).withUpper(3).build()
                )
                .build();
        TransferObjectRelation transferRelation2 = newTransferObjectRelationBuilder().withName("TransferRelation2")
                .withBinding(containment).withCardinality(
                		newCardinalityBuilder().withLower(2).withUpper(3).build()
                )
                .build();
        
        NavigationProperty navigation = newNavigationPropertyBuilder().withName("navigation")
                .withCardinality(
                		newCardinalityBuilder().withLower(2).withUpper(3).build()
                )
                .withGetterExpression(
                		newReferenceExpressionTypeBuilder().withExpression("self.containment").build()
                )
                .build();
        TransferObjectRelation transferRelation3 = newTransferObjectRelationBuilder().withName("TransferRelation3")
                .withBinding(navigation).withCardinality(
                		newCardinalityBuilder().withLower(1).withUpper(1).build()
                		)
                .build();
        
        StaticNavigation staticNav0 = newStaticNavigationBuilder().withName("staticNav0")
                .withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build())
                .withGetterExpression(
                        newReferenceExpressionTypeBuilder().withExpression("entity").build()
                )
                .build();
        TransferObjectRelation transferRelation4 = newTransferObjectRelationBuilder().withName("TransferRelation4")
                .withBinding(staticNav0).withCardinality(
                		newCardinalityBuilder().withLower(2).withUpper(3).build()
                )
                .build();
        
        StaticNavigation staticNav1 = newStaticNavigationBuilder().withName("staticNav1")
                .withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
                .withGetterExpression(
                        newReferenceExpressionTypeBuilder().withExpression("entity").build()
                )
                .build();
        TransferObjectRelation transferRelation5 = newTransferObjectRelationBuilder().withName("TransferRelation5")
                .withBinding(staticNav1).withCardinality(
                		newCardinalityBuilder().withLower(3).withUpper(4).build()
                )
                .build();

        EntityType entity = newEntityTypeBuilder().withName("entity")
                .withRelations(ImmutableList.of(end0,end1,containment))
                .withNavigationProperties(navigation)
                .build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
                            .withName("TransferObject").withRelations(ImmutableList.of(
                                    transferRelation0,
                                    transferRelation1,
                                    transferRelation2,
                                    transferRelation3,
                                    transferRelation4,
                                    transferRelation5
                            ))
                            .withEntityType(entity)
                            .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                    entity,
                    transferObject,
                    staticNav0,
                    staticNav1
                ))
        		.build();

        psmModel.addContent(model);
        
        runEpsilon(ImmutableList.of(
                "CardinalityMatchesBindingCardinality|Transfer object relation TransferRelation1 and its binding must have the same cardinality.",
                "CardinalityMatchesBindingCardinality|Transfer object relation TransferRelation3 and its binding must have the same cardinality.",
                "CardinalityMatchesBindingCardinality|Transfer object relation TransferRelation5 and its binding must have the same cardinality."),
                Collections.emptyList());
    }
    
    @Test
    void testDataTypeMatchesBindingDataType() throws Exception {
        log.info("Testing constraint: DataTypeMatchesBindingDataType");
        
        NumericType integerType = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();
        StringType stringType = newStringTypeBuilder().withName("string").withMaxLength(255).build(); 
        
        Attribute attribute0 = newAttributeBuilder().withName("attribute0").withDataType(integerType).build();
        Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(stringType).build();

        DataProperty property0 = newDataPropertyBuilder().withName("property0").withDataType(integerType).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute0").build()
        ).build();
        DataProperty property1 = newDataPropertyBuilder().withName("property1").withDataType(stringType).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute1").build()
        ).build();

        StaticData staticData0 = newStaticDataBuilder().withName("staticData0").withDataType(integerType)
                .withGetterExpression(newDataExpressionTypeBuilder().withExpression("10").build()).build();
        StaticData staticData1 = newStaticDataBuilder().withName("staticData1").withDataType(stringType)
                .withGetterExpression(newDataExpressionTypeBuilder().withExpression("exp").build()).build();

        EntityType entity = newEntityTypeBuilder().withName("entity")
            .withAttributes(ImmutableList.of(attribute0,attribute1))
            .withDataProperties(ImmutableList.of(property0,property1))
            .build();

        TransferAttribute transferAttribute0 = newTransferAttributeBuilder().withName("TransferAttribute0").withDataType(integerType).withBinding(attribute0).build();
        TransferAttribute transferAttribute1 = newTransferAttributeBuilder().withName("TransferAttribute1").withDataType(integerType).withBinding(attribute1).build();
        TransferAttribute transferAttribute2 = newTransferAttributeBuilder().withName("TransferAttribute2").withDataType(integerType).withBinding(property0).build();
        TransferAttribute transferAttribute3 = newTransferAttributeBuilder().withName("TransferAttribute3").withDataType(integerType).withBinding(property1).build();
        TransferAttribute transferAttribute4 = newTransferAttributeBuilder().withName("TransferAttribute4").withDataType(integerType).withBinding(staticData0).build();
        TransferAttribute transferAttribute5 = newTransferAttributeBuilder().withName("TransferAttribute5").withDataType(integerType).withBinding(staticData1).build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
                            .withName("TransferObject").withAttributes(ImmutableList.of(
                                    transferAttribute0,
                                    transferAttribute1,
                                    transferAttribute2,
                                    transferAttribute3,
                                    transferAttribute4,
                                    transferAttribute5
                            ))
                            .withEntityType(entity)
                            .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                    integerType,
                    stringType,
        			entity,
                    transferObject,
                    staticData0,
                    staticData1
                ))
        		.build();

        psmModel.addContent(model);
        
        runEpsilon(ImmutableList.of(
                "DataTypeMatchesBindingDataType|DataType of transfer attribute TransferAttribute1 must match the dataType of its binding.",
                "DataTypeMatchesBindingDataType|DataType of transfer attribute TransferAttribute3 must match the dataType of its binding.",
                "DataTypeMatchesBindingDataType|DataType of transfer attribute TransferAttribute5 must match the dataType of its binding."),
                Collections.emptyList());
    }

    @Test
    void testRequiredFlagMatchesBindingRequiredFlag() throws Exception {
       log.info("Testing constraint: DataTypeMatchesBindingDataType");
       
       NumericType integerType = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();
       
       Attribute attribute0 = newAttributeBuilder().withName("attribute0").withDataType(integerType).withRequired(false).build();
       Attribute attribute1 = newAttributeBuilder().withName("attribute1").withDataType(integerType).withRequired(true).build();

       DataProperty property0 = newDataPropertyBuilder().withName("property0").withDataType(integerType).withGetterExpression(
                   newDataExpressionTypeBuilder().withExpression("self.attribute0").build()
           ).withRequired(false).build();
       DataProperty property1 = newDataPropertyBuilder().withName("property1").withDataType(integerType).withGetterExpression(
                   newDataExpressionTypeBuilder().withExpression("self.attribute1").build()
           ).withRequired(true).build();

       StaticData staticData0 = newStaticDataBuilder().withName("staticData0").withDataType(integerType)
               .withGetterExpression(newDataExpressionTypeBuilder().withExpression("1").build()).withRequired(false).build();
       StaticData staticData1 = newStaticDataBuilder().withName("staticData1").withDataType(integerType)
               .withGetterExpression(newDataExpressionTypeBuilder().withExpression("1").build()).withRequired(true).build();

       EntityType entity = newEntityTypeBuilder().withName("entity")
               .withAttributes(ImmutableList.of(attribute0,attribute1))
               .withDataProperties(ImmutableList.of(property0,property1))
               .build();

       TransferAttribute transferAttribute0 = newTransferAttributeBuilder().withName("TransferAttribute0").withDataType(integerType)
               .withBinding(attribute0).withRequired(true).build();
       TransferAttribute transferAttribute1 = newTransferAttributeBuilder().withName("TransferAttribute1").withDataType(integerType)
               .withBinding(attribute1).withRequired(true).build();
       TransferAttribute transferAttribute2 = newTransferAttributeBuilder().withName("TransferAttribute2").withDataType(integerType)
               .withBinding(property0).withRequired(true).build();
       TransferAttribute transferAttribute3 = newTransferAttributeBuilder().withName("TransferAttribute3").withDataType(integerType)
               .withBinding(property1).withRequired(true).build();
       TransferAttribute transferAttribute4 = newTransferAttributeBuilder().withName("TransferAttribute4").withDataType(integerType)
               .withBinding(staticData0).withRequired(true).build();
       TransferAttribute transferAttribute5 = newTransferAttributeBuilder().withName("TransferAttribute5").withDataType(integerType)
               .withBinding(staticData1).withRequired(true).build();

       MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
                               .withName("TransferObject").withAttributes(ImmutableList.of(
                                       transferAttribute0,
                                       transferAttribute1,
                                       transferAttribute2,
                                       transferAttribute3,
                                       transferAttribute4,
                                       transferAttribute5
                               ))
                               .withEntityType(entity)
                               .build();

       Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                       entity,
                       transferObject,
                       staticData0,
                       staticData1
               ))
    		   .build();

           psmModel.addContent(model);
           
           runEpsilon(ImmutableList.of(
                   "RequiredFlagMatchesBindingRequiredFlag|Required flag of transfer attribute TransferAttribute0 must equal required flag of its binding.",
                   "RequiredFlagMatchesBindingRequiredFlag|Required flag of transfer attribute TransferAttribute2 must equal required flag of its binding.",
                   "RequiredFlagMatchesBindingRequiredFlag|Required flag of transfer attribute TransferAttribute4 must equal required flag of its binding."),
                   Collections.emptyList());
   }
    
    @Test
    void testSelectorTargetIsValid() throws Exception {
    	log.info("Testing constraint: SelectorTargetIsValid");
       
    	EntityType mapped = newEntityTypeBuilder().withName("mapped").build();
    	EntityType separate = newEntityTypeBuilder().withName("separate").build();

    	MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject").withEntityType(mapped).build();

    	StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav")
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).withTarget(separate).build();

    	ExposedGraph graph = newExposedGraphBuilder().withName("graph").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
    			.withSelector(staticNav).withMappedTransferObjectType(transferObject).build();

        AccessPoint accessPoint = newAccessPointBuilder().withName("accessPoint").withExposedGraphs(graph).build();
    	
    	Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
    	                    mapped,
    	                    separate,
    	                    transferObject,
    	                    staticNav,
    	                    accessPoint
    	                ))
    					.build();

    	        psmModel.addContent(model);
    	        
    	        runEpsilon(ImmutableList.of(
    	                "SelectorTargetIsValid|Target of selector of exposed graph graph must match the entity type of the exposed graph's mapped transfer object."),
    	                Collections.emptyList());
    }
    
    @Test
    void testSelectorCardinalityIsValid() throws Exception {
        log.info("Testing constraint: SelectorTargetIsValid");
        
        EntityType entity = newEntityTypeBuilder().withName("entity").build();
        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject").withEntityType(entity).build();
        StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav").withTarget(entity)
                .withCardinality(newCardinalityBuilder().withLower(1).withUpper(5).build()).build();

        ExposedGraph graph = newExposedGraphBuilder().withName("graph").withCardinality(newCardinalityBuilder().withLower(0).withUpper(5).build())
                .withSelector(staticNav).withMappedTransferObjectType(transferObject).build();
        AccessPoint accessPoint = newAccessPointBuilder().withName("accessPoint").withExposedGraphs(graph).build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            entity,
                            transferObject,
                            staticNav,
                            accessPoint
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "SelectorCardinalityIsValid|Cardinality of exposed graph graph must match cardinality of the exposed graph's selector."),
            Collections.emptyList());
    }
    
    @Test
    void testBoundOperationInheritanceIsValid() throws Exception {
        log.info("Testing constraint: BoundOperationInheritanceIsValid");
        
        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("parent").build();
        UnmappedTransferObjectType child = newUnmappedTransferObjectTypeBuilder().withName("child").withSuperTransferObjectTypes(parent).build();
        
        BoundOperation operation1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(child).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(parent).withCardinality(newCardinalityBuilder().build()))
                .build();
        
        BoundOperation operation2 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(parent).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(child).withCardinality(newCardinalityBuilder().build()))
                .build();
        
        BoundOperation operation3 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(child).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(parent).withCardinality(newCardinalityBuilder().build()))
                .build();
        
        BoundOperation operation4 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(parent).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(child).withCardinality(newCardinalityBuilder().build()))
                .build();
       
        EntityType parentEntityType1 = newEntityTypeBuilder().withName("parentEntityType1").build();
        MappedTransferObjectType parentTransferObject1 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject1").withEntityType(parentEntityType1)
                .withOperations(ImmutableList.of(operation1,operation3)).build();
        
        EntityType parentEntityType2 = newEntityTypeBuilder().withName("parentEntityType2").build();
        MappedTransferObjectType parentTransferObject2 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject2").withEntityType(parentEntityType2)
                .withOperations(operation2).build();
        
        EntityType childEntityType1 = newEntityTypeBuilder().withName("childEntityType").withSuperEntityTypes(parentEntityType2).build();
        MappedTransferObjectType childTransferObject = newMappedTransferObjectTypeBuilder().withName("childTransferObject").withEntityType(childEntityType1)
                .withSuperTransferObjectTypes(parentTransferObject2).withOperations(operation4).build();
        
        EntityType childEntityType2 = newEntityTypeBuilder().withName("childEntityType2").withSuperEntityTypes(ImmutableList.of(parentEntityType1,childEntityType1)).build();
        MappedTransferObjectType grandChildTransferObject = newMappedTransferObjectTypeBuilder().withName("grandChildTransferObject").withEntityType(childEntityType2)
                .withSuperTransferObjectTypes(ImmutableList.of(parentTransferObject1,childTransferObject)).build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            parent, child,
                            parentEntityType1, parentEntityType2, childEntityType1, childEntityType2,
                            parentTransferObject1, parentTransferObject2, childTransferObject, grandChildTransferObject
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "BoundOperationInheritanceIsValid|Mapped transfer object type: grandChildTransferObject is inheriting operation(s) having the same name from unrelated mapped transfer object."),
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
       
        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(ImmutableList.of(
                        operation1,operation2,operation3
                        ))
                .build();
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(overriden1)
                .build();
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(ImmutableList.of(operation4,overriden2))
                .build();
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType2)
        		.withOperations(ImmutableList.of(overriden1,overriden4))
                .build();
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType1,transferObjectType3))
        		.withOperations(ImmutableList.of(overriden1,overriden3))
                .build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "OverridingWithValidInput|Overriding of bound operation: operation2 of mapped transfer object type: transferObjectType2 cannot change input type.",
            "OverridingWithValidInput|Overriding of bound operation: operation3 of mapped transfer object type: transferObjectType4 cannot change input type.",
            "OverridingWithValidInput|Overriding of bound operation: operation4 of mapped transfer object type: transferObjectType3 cannot change input type."),
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
       
        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(ImmutableList.of(
                        operation1,operation2,operation3
                        ))
                .build();
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(overriden1)
                .build();
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(ImmutableList.of(operation4,overriden2))
                .build();
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType2)
        		.withOperations(ImmutableList.of(overriden1,overriden4))
                .build();
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType1,transferObjectType3))
        		.withOperations(ImmutableList.of(overriden1,overriden3))
                .build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "OverridingWithValidOutput|Overriding of bound operation: operation2 of mapped transfer object type: transferObjectType2 cannot change output type.",
            "OverridingWithValidOutput|Overriding of bound operation: operation3 of mapped transfer object type: transferObjectType4 cannot change output type.",
            "OverridingWithValidOutput|Overriding of bound operation: operation4 of mapped transfer object type: transferObjectType3 cannot change output type."),
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
                		newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType).withCardinality(newCardinalityBuilder().build()).build()
                		))
                .build();
        BoundOperation overriden1 = newBoundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType).withCardinality(newCardinalityBuilder().build()).build()
                		))
                .build();
        
        BoundOperation operation2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault3").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault4").withType(correctType).withCardinality(newCardinalityBuilder().build()).build()
                		))
                .build();
        BoundOperation overriden2 = newBoundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(wrongType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault3").withType(correctType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault4").withType(correctType).withCardinality(newCardinalityBuilder().build()).build()
                		))
                .build();
        
        BoundOperation operation3 = newBoundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().build()).build())
                .build();
        BoundOperation overriden3 = newBoundOperationBuilder().withName("operation3")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(wrongType).withCardinality(newCardinalityBuilder().build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType).withCardinality(newCardinalityBuilder().build()).build()
                		))
                .build();
        
        BoundOperation operation4 = newBoundOperationBuilder().withName("operation4")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation overriden4 = newBoundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().build()).build())
                .build();
       
        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(ImmutableList.of(
                        operation1,operation2,operation3
                        ))
                .build();
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(overriden1)
                .build();
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(ImmutableList.of(operation4,overriden2))
                .build();
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType2)
        		.withOperations(ImmutableList.of(overriden1,overriden4))
                .build();
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType1,transferObjectType3))
        		.withOperations(ImmutableList.of(overriden1,overriden3))
                .build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "OverridingWithValidFaults|Overriding of bound operation: operation2 of mapped transfer object type: transferObjectType2 cannot change the type of faults.",
            "OverridingWithValidFaults|Overriding of bound operation: operation3 of mapped transfer object type: transferObjectType4 cannot change the type of faults.",
            "OverridingWithValidFaults|Overriding of bound operation: operation4 of mapped transfer object type: transferObjectType3 cannot change the type of faults."),
            Collections.emptyList());
    }
    
    @Test
    void testInheritedBoundOperationHasNoImplementation() throws Exception {
        log.info("Testing constraint: InheritedBoundOperationHasNoImplementation");
        
        UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
       
        BoundOperation correctOperation1 = newBoundOperationBuilder().withName("correct")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
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
                .build();
        
        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(ImmutableList.of(withImplementation1,correctOperation1))
                .build();
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(transferObjectType0)
                .withOperations(withImplementation2)
                .build();
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
                .withOperations(correctOperation2)
                .build();
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType2)
                .withOperations(withImplementation3)
                .build();
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType1,transferObjectType3))
                .withOperations(ImmutableList.of(opWithoutImpl,correctOperation3))
                .build();
        
        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            type,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "InheritedBoundOperationHasNoImplementation|Bases of bound operation: operation cannot have implementation, if operation in"
            + " mapped transfer object type: transferObjectType4 doesn't have one.",
            "NeedToOverrideMultipleOperationImplementations|Mapped transfer object type: transferObjectType4 has inherited operations without implementation, "
                    + "but their bases have more than one implementation."),
            Collections.emptyList());
    }
    
    @Test
    void testNeedToOverrideMultipleOperationImplementations() throws Exception {
        log.info("Testing constraint: NeedToOverrideMultipleOperationImplementations");
        
        UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
       
        BoundOperation correctOperation1 = newBoundOperationBuilder().withName("correctOperation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation correctOperation2 = newBoundOperationBuilder().withName("correctOperation")
                .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        EntityType correctEntityType0 = newEntityTypeBuilder().withName("correctEntityType0").build();
        MappedTransferObjectType correctTransferObjectType0 = newMappedTransferObjectTypeBuilder().withName("correctTransferObjectType0").withEntityType(correctEntityType0)
                .withOperations(correctOperation1)
                .build();
        
        EntityType correctEntityType1 = newEntityTypeBuilder().withName("correctEntityType1").withSuperEntityTypes(correctEntityType0).build();
        MappedTransferObjectType correctTransferObjectType1 = newMappedTransferObjectTypeBuilder().withName("correctTransferObjectType1").withEntityType(correctEntityType1)
                .withSuperTransferObjectTypes(correctTransferObjectType0)
                .withOperations(correctOperation2)
                .build();
        
        EntityType correctEntityType2 = newEntityTypeBuilder().withName("correctEntityType2").withSuperEntityTypes(correctEntityType1).build();
        MappedTransferObjectType correctTransferObjectType2 = newMappedTransferObjectTypeBuilder().withName("correctTransferObjectType2").withEntityType(correctEntityType2)
                .withSuperTransferObjectTypes(correctTransferObjectType1)
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
        
        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(withImplementation1)
                .build();
        
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(transferObjectType0)
                .withOperations(withImplementation2)
                .build();
        
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
                .withOperations(correctOperation2)
                .build();
        
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType0)
                .withOperations(withImplementation3)
                .build();
        
        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(transferObjectType1)
                .withOperations(withImplementation3)
                .build();
        
        EntityType entityType5 = newEntityTypeBuilder().withName("entityType5").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType5 = newMappedTransferObjectTypeBuilder().withName("transferObjectType5").withEntityType(entityType5)
                .withSuperTransferObjectTypes(transferObjectType2)
                .build();
        
        EntityType entityType6 = newEntityTypeBuilder().withName("entityType6").withSuperEntityTypes(ImmutableList.of(entityType3,entityType4,entityType5)).build();
        MappedTransferObjectType transferObjectType6 = newMappedTransferObjectTypeBuilder().withName("transferObjectType6").withEntityType(entityType6)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType3,transferObjectType4,transferObjectType5))
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
            "NeedToOverrideMultipleOperationImplementations|Mapped transfer object type: transferObjectType6 has inherited operations without implementation, "
                    + "but their bases have more than one implementation."),
            Collections.emptyList());
    }
    
   @Test
   void testEntityTypeMatchesEntityTypeOfBaseMappedTransferObject() throws Exception {
       log.info("Testing constraint: EntityTypeMatchesEntityTypeOfBaseMappedTransferObject");
       
       EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
       EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
       
       MappedTransferObjectType parentTransferObject1 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject1").withEntityType(entityType1)
               .build();
       MappedTransferObjectType parentTransferObject2 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject2").withEntityType(entityType2)
               .build();
       MappedTransferObjectType childTransferObject1 = newMappedTransferObjectTypeBuilder().withName("childTransferObject1").withEntityType(entityType2)
               .withSuperTransferObjectTypes(ImmutableList.of(
                       parentTransferObject1,parentTransferObject2))
               .build();
       
       EntityType parentEntityType3 = newEntityTypeBuilder().withName("parentEntityType3").build();
       EntityType parentEntityType4 = newEntityTypeBuilder().withName("parentEntityType4").withSuperEntityTypes(parentEntityType3).build();
       EntityType childEntityType = newEntityTypeBuilder().withName("childEntityType").withSuperEntityTypes(parentEntityType4).build();
       
       MappedTransferObjectType parentTransferObject3 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject3").withEntityType(parentEntityType3)
               .build();
       MappedTransferObjectType parentTransferObject4 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject4").withEntityType(childEntityType)
                .withSuperTransferObjectTypes(parentTransferObject3).build();
       MappedTransferObjectType childTransferObject2 = newMappedTransferObjectTypeBuilder().withName("childTransferObject2").withEntityType(parentEntityType4)
               .withSuperTransferObjectTypes(parentTransferObject4)
               .build();
       
       Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                           entityType1,
                           entityType2,
                           childEntityType,
                           parentTransferObject1,
                           parentTransferObject2,
                           parentTransferObject3,
                           parentTransferObject4,
                           childTransferObject1,
                           childTransferObject2
                       )).build();

       psmModel.addContent(model);

       runEpsilon(ImmutableList.of(
           "EntityTypeMatchesEntityTypeOfBaseMappedTransferObject|Entity type of mapped transfer object type: parentTransferObject4"
           + " must derive from the entity types of the base mapped transfer object type of mapped transfer object type: parentTransferObject4",
           "EntityTypeMatchesEntityTypeOfBaseMappedTransferObject|Entity type of mapped transfer object type: childTransferObject1"
            + " must derive from the entity types of the base mapped transfer object type of mapped transfer object type: childTransferObject1",
            "EntityTypeMatchesEntityTypeOfBaseMappedTransferObject|Entity type of mapped transfer object type: childTransferObject2"
            + " must derive from the entity types of the base mapped transfer object type of mapped transfer object type: childTransferObject2"),
           Collections.emptyList());
   }
}
