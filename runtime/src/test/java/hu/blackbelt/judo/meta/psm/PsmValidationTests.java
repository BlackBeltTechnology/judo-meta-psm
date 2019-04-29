package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.ExecutionContext;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModelLoader;
import hu.blackbelt.judo.meta.psm.type.*;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Collection;

import static hu.blackbelt.epsilon.runtime.execution.ExecutionContext.executionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.contexts.EvlExecutionContext.evlExecutionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.model.emf.WrappedEmfModelContext.wrappedEmfModelContextBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

@Slf4j
class PsmValidationTests {

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";
    private ResourceSet executionResourceSet;
    private Resource psmResource;
    private ExecutionContext executionContext;

    @BeforeEach
    void setUp() {
        executionResourceSet = PsmModelLoader.createPsmResourceSet();
        psmResource = executionResourceSet.createResource(
                URI.createURI(createdSourceModelName));

        Log log = new Slf4jLog();

        // Execution context
        executionContext = executionContextBuilder()
                .log(log)
                .resourceSet(executionResourceSet)
                .metaModels(ImmutableList.of())
                .modelContexts(ImmutableList.of(
                        wrappedEmfModelContextBuilder()
                                .log(log)
                                .name("JUDOPSM")
                                .resource(psmResource)
                                .build()))
                .sourceDirectory(scriptDir())
                .build();
    }

    @AfterEach
    void tearDown() {
        executionContext = null;
        psmResource = null;
        executionResourceSet = null;
    }

    private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        // run the model / metadata loading
        executionContext.load();

        // Transformation script
        executionContext.executeProgram(
                evlExecutionContextBuilder()
                        .source("epsilon/validations/judopsm.evl")
                        .expectedErrors(expectedErrors)
                        .expectedWarnings(expectedWarnings)
                        .build());

        executionContext.commit();
        executionContext.close();
    }

    @Test
    void testModelNameIsUnique() throws Exception {
        log.info("Testing constraint: ModelNameIsUnique");

        Model m1 = newModelBuilder().withName("A").build();
        Model m2 = newModelBuilder().withName("A").build();

        psmResource.getContents().add(m1);
        psmResource.getContents().add(m2);

        runEpsilon(ImmutableList.of("ModelNameIsUnique|Model name is not unique: A"),
                ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"));
    }

    @Test
    void testNamespaceIsUnique() throws Exception {
        log.info("Testing constraint: NamespaceIsUnique");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newStringTypeBuilder().withName("String").withMaxLength(255).build(),
                        newCustomTypeBuilder().withName("String").build(),
                        newEntityTypeBuilder().withName("E").build(),
                        newUnmappedTransferObjectTypeBuilder().withName("E").build()
                ))
                .withPackages(ImmutableList.of(
                        newPackageBuilder().withName("P").build(),
                        newPackageBuilder().withName("P").build()
                ))
                .build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("NamespaceIsUnique|Names Set {P, E, String} are not unique in namespace M"),
                ImmutableList.of("TypeNamesAreUnique|Type name is not unique: String"));
    }

    @Test
    void testEnumerationMemberNameIsUnique() throws Exception {
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

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("EnumerationMemberNameIsUnique|Enum member names are not unique: E"),
                null);
    }

    @Test
    void EnumerationMemberValueIsUnique() throws Exception {
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

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("EnumerationMemberValueIsUnique|Enum member numbers are not unique: E"),
                null);
    }

    @Test
    void PrecisionIsLowerOrEqualThanScale() throws Exception {
        log.info("Testing constraint: PrecisionIsLowerOrEqualThanScale");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newNumericTypeBuilder()
                        .withName("InvalidPrecision")
                        .withPrecision(10)
                        .withScale(5)
                        .build()
                ))
                .build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("PrecisionIsLowerOrEqualThanScale|Precision (10) must be less than scale (5): InvalidPrecision"),
                null);
    }

    @Test
    void ValidPrecision() throws Exception {
        log.info("Testing constraint: ValidPrecision");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newNumericTypeBuilder()
                        .withName("InvalidPrecision")
                        .withPrecision(-2)
                        .withScale(5)
                        .build()
                ))
                .build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("ValidPrecision|Precision must be at least 0: InvalidPrecision"),
                null);
    }

    @Test
    void ValidMaxLength() throws Exception {
        log.info("Testing constraint: ValidMaxLength");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newStringTypeBuilder()
                        .withName("String")
                        .withMaxLength(-3)
                        .build()
                ))
                .build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("ValidMaxLength|MaxLength must be greater than 0: String"),
                null);


    }

    @Test
    void AttributeNameIsNotReserved() throws Exception {
        log.info("Testing constraint: AttributeNameIsNotReserved");

        StringType string = newStringTypeBuilder()
                .withName("String")
                .withMaxLength(255)
                .build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        string,
                        newEntityTypeBuilder()
                            .withName("E")
                            .withAttributes(newAttributeBuilder()
                                .withName("id")
                                .withDataType(string
                                ))
                                .build()
                ))
                .build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("AttributeNameIsNotReserved|Name E.id is reserved"),
                null);
    }

    @Test
    void RelationNameIsNotReserved() throws Exception {
        log.info("Testing constraint: RelationNameIsNotReserved");


        EntityType E2 = newEntityTypeBuilder().withName("E2").build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                                newEntityTypeBuilder()
                                    .withName("E1")
                                    .withRelations(newEndpointBuilder()
                                                    .withName("id")
                                                    .withTarget(E2)
                                                    .withCardinality(newCardinalityBuilder().build())
                                                    .build())
                                    .build(),
                                E2
                            )).build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("RelationNameIsNotReserved|Name E1.id is reserved"),
                null);
    }

    @Test
    void ValidPartnerRelations() throws Exception {
        log.info("Testing constraint: ValidPartnerRelations");

        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e2 = newEndpointBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e3 = newEndpointBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(ImmutableList.of(e1,e2,e3)).build();

        e1.setTarget(E1);
        e1.setPartner(e2);
        e2.setTarget(E1);
        e2.setPartner(e3);
        e3.setTarget(E1);
        e3.setPartner(e2);

        Model m  = newModelBuilder().withName("M").withElements(E1).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("ValidPartnerRelations|Opposite partner relation of E1.e2 must be E1.e1"),
                null);
    }

    @Test
    void ValidPartnerType() throws Exception {
        log.info("Testing constraint: ValidPartnerType");

        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e2 = newEndpointBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint e3 = newEndpointBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(ImmutableList.of(e2,e3)).build();
        EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(e1).build();
        EntityType E3 = newEntityTypeBuilder().withName("E3").build();

        e1.setTarget(E1);
        e1.setPartner(e3);
        e2.setTarget(E2);
        e3.setTarget(E3);
        e3.setPartner(e1);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1,E2,E3)).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("ValidPartnerType|Invalid partner type: E2.e1 for E1.e3","ValidPartnerType|Invalid partner type: E1.e3 for E2.e1"),
                null);
    }

    @Test
    void OneToOneRelationsAreNotRecommended() throws Exception {
        log.info("Testing constraint: OneToOneRelationsAreNotRecommended");

        Cardinality c1 = newCardinalityBuilder().withLower(1).withUpper(1).build();
        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(c1).build();
        EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(e1).build();


        Cardinality c2 = newCardinalityBuilder().withLower(1).withUpper(1).build();
        Endpoint e2 = newEndpointBuilder().withName("e2").withCardinality(c2).build();
        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e2).build();

        e2.setTarget(E2);
        e1.setTarget(E1);
        e1.setPartner(e2);
        e2.setPartner(e1);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1,E2)).build();

        psmResource.getContents().add(m);

        runEpsilon(null,
                ImmutableList.of("OneToOneRelationsAreNotRecommended|1-1 relations required on both sides are not recommended: E1.e2 - E2.e1","OneToOneRelationsAreNotRecommended|1-1 relations required on both sides are not recommended: E2.e1 - E1.e2"));

    }

    @Test
    void InheritanceIsNotRecursive() throws Exception {
        log.info("Testing constraint: InheritanceIsNotRecursive");

        EntityType E1 = newEntityTypeBuilder().withName("E1").build();
        EntityType E2 = newEntityTypeBuilder().withName("E2").build();
        EntityType E3 = newEntityTypeBuilder().withName("E3").build();

        E1.getSuperEntityTypes().add(E2);
        E2.getSuperEntityTypes().add(E1);
        E3.getSuperEntityTypes().add(E3);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E1,E2,E3)).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("InheritanceIsNotRecursive|Entity type E1 is recursive","InheritanceIsNotRecursive|Entity type E2 is recursive","InheritanceIsNotRecursive|Entity type E3 is recursive"),
                null);
    }

    @Test
    void PartnerIsNotSelf() throws Exception {
        log.info("Testing constraint: PartnerIsNotSelf");

        Endpoint e1 = newEndpointBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        EntityType E1 = newEntityTypeBuilder().withName("E1").withRelations(e1).build();

        e1.setTarget(E1);
        e1.setPartner(e1);

        Model m = newModelBuilder().withName("M").withElements(E1).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("PartnerIsNotSelf|Self partner relation found: E1.e1"),
                null);
    }

    @Test
    void AttributeNameIsUnique() throws Exception {
        log.info("Testing constraint: AttributeNameIsUnique");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255)
                .build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withScale(18)
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

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("AttributeNameIsUnique|Multiple attributes are added to entity E with the same name"),
                null);
    }

    @Test
    void RelationNameIsUnique() throws Exception {
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
                .withRelations(ImmutableList.of(endpoint,containment))
                .build();

        endpoint.setTarget(E);
        containment.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("RelationNameIsUnique|Multiple relations are added to entity E with the same name"),
                null);
    }

    @Test
    void NoAttributeAndRelationAreWithTheSameName() throws Exception {
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

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(string,E)).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("NoAttributeAndRelationAreWithTheSameName|Entity E has attributes and relations with the same name"),
                null);
    }

    @Test
    void OppositePartnerIsDefined() throws Exception {
        log.info("Testing constraint: OppositePartnerIsDefined");

        Endpoint e =newEndpointBuilder().withName("e").withCardinality(newCardinalityBuilder().build()).build();
        Endpoint f =newEndpointBuilder().withName("f").withCardinality(newCardinalityBuilder().build()).build();

        EntityType E1 =newEntityTypeBuilder().withName("E1").withRelations(e).build();
        EntityType E2 =newEntityTypeBuilder().withName("E2").withRelations(f).build();

        e.setTarget(E2);
        f.setTarget(E1);
        f.setPartner(e);

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(E1,E2)).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("OppositePartnerIsDefined|Missing opposite partner relation for E2.f"),
                null);
    }

    @Test
    void MaxLengthIsNotTooLarge() throws Exception {
        log.info("Testing constraint: MaxLengthIsNotTooLarge");

        Model m = newModelBuilder().withName("M")
                .withElements(
                  newStringTypeBuilder().withName("String").withMaxLength(4001).build()
                ).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("MaxLengthIsNotTooLarge|MaxLength must be less than/equals to 4000: String"),
                null);
    }

    @Test
    void StandaloneModelLoadedOnly() throws Exception {
        log.info("Testing constraint: StandaloneModelLoadedOnly");

        Model a = newModelBuilder().withName("A").build();
        Model b = newModelBuilder().withName("B").build();

        psmResource.getContents().add(a);
        psmResource.getContents().add(b);
        runEpsilon(null,
                ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"));
    }

    @Test
    void PackageHasNamespace() throws Exception {
        log.info("Testing constraint: PackageHasNamespace");

        Package pkg = newPackageBuilder().withName("pkg").build();
        Model m = newModelBuilder().withName("M").build();

        psmResource.getContents().add(m);
        psmResource.getContents().add(pkg);

        runEpsilon(ImmutableList.of("PackageHasNamespace|Package pkg must have exactly 1 namespace"),
                null);
    }

    @Test
    void NamespaceElementHasNamespace() throws Exception {
        log.info("Testing constraint: NamespaceElementHasNamespace");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M").build();

        psmResource.getContents().add(m);
        psmResource.getContents().add(string);

        runEpsilon(ImmutableList.of("NamespaceElementHasNamespace|Element String must have exactly 1 namespace"),
                null);
    }

    @Test
    void EnumerationMemberHasEnumerationType() throws Exception {
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
        psmResource.getContents().add(m);
        psmResource.getContents().add(enumMemb);
        runEpsilon(ImmutableList.of("EnumerationMemberHasEnumerationType|Enumeration member m1 must have exactly 1 enumeration"),
                null);
    }

    @Test
    void RelationCountConstraintHasUniqueName() throws Exception {
        log.info("Testing constraint: RelationCountConstraintHasUniqueName");

        Endpoint e = newEndpointBuilder().withName("e").withCardinality(newCardinalityBuilder().build()).build();
        Containment f = newContainmentBuilder().withName("f").withCardinality(newCardinalityBuilder().build()).build();

        RelationCountConstraint c1_1 = newRelationCountConstraintBuilder().withName("c1").withRelations(ImmutableList.of(f,e)).withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build();
        RelationCountConstraint c1_2 = newRelationCountConstraintBuilder().withName("c1").withRelations(ImmutableList.of(e,f)).withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build()).build();

        EntityType E = newEntityTypeBuilder().withName("E").withRelations(ImmutableList.of(e,f)).withRelationCountConstraints(ImmutableList.of(c1_1,c1_2)).build();

        f.setTarget(E);
        e.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("RelationCountConstraintHasUniqueName|Relation count constraints are not unique: E","RelationCountConstraintsAreNotSupportedYet|Relation count constraints are not supported yet"),
                null);
    }

    @Test
    void RelationBelongsToEntity() throws Exception {
        log.info("Testing constraint: RelationBelongsToEntity");

        Endpoint r1 = newEndpointBuilder().withCascadeDelete(true).withCardinality(newCardinalityBuilder().build()).build();
        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).build();
        r1.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(E).build();
        Containment r2 = newContainmentBuilder().withName("r2").withTarget(E).withCardinality(newCardinalityBuilder().build()).build();

        psmResource.getContents().add(m);
        psmResource.getContents().add(r2);
        runEpsilon(ImmutableList.of("RelationBelongsToEntity|Orphan relation: r2"),
                null);
    }

    @Test
    void AttributeBelongsToEntity() throws Exception {
        log.info("Testing constraint: AttributeBelongsToEntity");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build(),
                        string
                )).build();

        Attribute b = newAttributeBuilder().withName("b").withDataType(string).build();

        psmResource.getContents().add(m);
        psmResource.getContents().add(b);

        runEpsilon(ImmutableList.of("AttributeBelongsToEntity|Orphan attribute: b"),
                null);
    }

    @Test
    void EnumerationContainsAtLeastTwoMembers() throws Exception {
        log.info("Testing constraint: EnumerationContainsAtLeastTwoMembers");

        Model m = newModelBuilder().withName("M").withElements(
                newEnumerationTypeBuilder().withName("E").withMembers(
                        newEnumerationMemberBuilder().withName("m").build()
                ).build()
        ).build();

        psmResource.getContents().add(m);
        runEpsilon(null,
                ImmutableList.of("EnumerationContainsAtLeastTwoMembers|Enum E has no or only a single member"));
    }

    // clean this piece of shilling
    @Test
    void DataPropertyNameIsUnique() throws Exception {
        log.info("Testing constraint: DataPropertyNameIsUnique");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        DataProperty p1 = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();
        DataProperty p2 = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("upper(self.a)").build()).build();

        EntityType E = newEntityTypeBuilder().withName("E")
                        .withAttributes(newAttributeBuilder().withName("a").withDataType(string).build())
                        .withDataProperties(ImmutableList.of(p1,p2))
                .build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E,string)).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("DataPropertyNameIsUnique|Multiple data properties are added to entity E with the same name"),
                null);
    }

    @Test
    void NavigationPropertyNameIsUnique() throws Exception {
        log.info("Testing constraint: NavigationPropertyNameIsUnique");

        Containment r1 = newContainmentBuilder().withName("r1").withCascadeDelete(true).withCardinality(newCardinalityBuilder().build()).build();
        NavigationProperty n1 = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()
        ).build();
        NavigationProperty n2 = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.r1.r1.r1").build()
        ).build();


        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).withNavigationProperties(ImmutableList.of(n1,n2)).build();

        r1.setTarget(E);
        n1.setTarget(E);
        n2.setTarget(E);


        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("NavigationPropertyNameIsUnique|Multiple navigation properties are added to entity E with the same name"),
                null);
    }

    @Test
    void DataPropertyBelongsToEntity() throws Exception {
        log.info("Testing constraint: DataPropertyBelongsToEntity");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        EntityType E = newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build();
        DataProperty p = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E,string)).build();

        psmResource.getContents().add(m);
        psmResource.getContents().add(p);
        runEpsilon(ImmutableList.of("DataPropertyBelongsToEntity|Orphan data property: p"),
                null);
    }

    @Test
    void NavigationPropertyBelongsToEntity() throws Exception {
        log.info("Testing constraint: NavigationPropertyBelongsToEntity");

        Containment r1 = newContainmentBuilder().withName("r1").withCascadeDelete(true).withCardinality(newCardinalityBuilder().build()).build();
        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).build();
        r1.setTarget(E);
        Model m = newModelBuilder().withName("M").withElements(E).build();

        NavigationProperty n = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()).build();
        n.setTarget(E);

        psmResource.getContents().add(m);
        psmResource.getContents().add(n);

        runEpsilon(ImmutableList.of("NavigationPropertyBelongsToEntity|Orphan navigation property: n"),
                null);
    }


    //TODO: (t033) ask about those errors, check symmetry
    @Test
    void DataPropertyGetterTypeIsValid() throws Exception {
        log.info("Testing constraint: DataPropertyGetterTypeIsValid");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        BooleanType bool = newBooleanTypeBuilder().withName("Boolean").build();
        DateType date = newDateTypeBuilder().withName("Date").build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withScale(10).build();
        NumericType decimal = newNumericTypeBuilder().withName("Decimal").withPrecision(2).withScale(16).build();
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



        psmResource.getContents().add(m);
        /*TODO: see 033 expectedError*/
        runEpsilon(null,
                null);
    }

    //TODO: (t034) "all constraints have been satisfied"
    @Test
    void Measures() throws Exception {
        log.info("Testing constraint: Measures");

        //TODO: check if being dum-dum (href to judoPSM.model)
        Unit quintal = newUnitBuilder().withName("quintal").withRateDividend(100.0).withSymbol("q").build();
        Unit kilogram = newUnitBuilder().withName("kilogram").withSymbol("kg").build();
        Measure mass = newMeasureBuilder().withName("Mass").withSymbol("m").withUnits(ImmutableList.of(kilogram, quintal)).build();
        Model template = newModelBuilder().withName("Template").withElements(mass).build();

        //---

        MeasuredType massStoredInKg = newMeasuredTypeBuilder().withName("MassStoredInKg").withPrecision(4).withScale(15).withStoreUnit(kilogram).build(); //TODO: check if being dummy (storeUnit)
        MeasuredType massStoredInQ = newMeasuredTypeBuilder().withName("MassStoredInQ").withPrecision(4).withScale(15).withStoreUnit(quintal).build(); //TODO: check if being dummy (storeUnit)

        EntityType person = newEntityTypeBuilder().withName("Person").withAttributes(newAttributeBuilder().withName("weight").withDataType(massStoredInKg).build()).build();
        EntityType car = newEntityTypeBuilder().withName("Car")
                .withAttributes(
                        newAttributeBuilder().withName("weight").withDataType(massStoredInQ).build()
                ).withRelations(ImmutableList.of(
                        newEndpointBuilder().withName("passangers").withTarget(person).withCardinality(
                                newCardinalityBuilder().withUpper(4).withLower(0).build() //added lwr
                        ).build(),
                        newEndpointBuilder().withName("driver").withTarget(person).withCardinality(
                                newCardinalityBuilder().withLower(1).withUpper(1).build() //added upp
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

        psmResource.getContents().add(m);
        psmResource.getContents().add(template);
        runEpsilon(null,
                ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"));
    }

    public File scriptDir() {
        String relPath = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        File targetDir = new File(relPath + "../../src/main");
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }
        return targetDir;
    }
}