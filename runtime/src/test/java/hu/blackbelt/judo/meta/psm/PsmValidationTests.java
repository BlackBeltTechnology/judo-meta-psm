package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.ExecutionContext;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.data.Endpoint;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModelLoader;
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
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
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

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newStringTypeBuilder()
                            .withName("String")
                            .withMaxLength(255)
                            .build(),
                        newEntityTypeBuilder()
                            .withName("E")
                            .withAttributes(newAttributeBuilder()
                                .withName("id")
                                .withDataType(newDateTypeBuilder()
                                            .withName("_8WfKgJlzEeiyrNaxr-HdNQ") //TODO: check if being dummy
                                            .build()
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

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                                newEntityTypeBuilder()
                                .withName("E1")
                                .withRelations(newEndpointBuilder()
                                                .withName("id")
                                                .withTarget(newEntityTypeBuilder()
                                                        .withName("_cn6_oJl2EeiyrNaxr-HdNQ")
                                                        .build())
                                                .withCardinality(newCardinalityBuilder()
                                                        .build())
                                                .build())
                                .build(),
                                newEntityTypeBuilder().withName("E2").build()
                            )).build();


        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("RelationNameIsNotReserved|Name E1.id is reserved"),
                null);
    }


    // TODO: 011 - fix
    //@Test
    void ValidPartnerRelations() throws Exception {
        log.info("Testing constraint: ValidPartnerRelations");

        Endpoint e1 = newEndpointBuilder()
                .withName("e1")
                .withTarget(newEntityTypeBuilder()
                        .withName("_3VNIUJl7EeiyrNaxr-HdNQ").build())
                .withPartner(newEndpointBuilder()
                        .withName("_q9gNQL2VEeiOuYiCo6IbXQ").build())
                .withCardinality(newCardinalityBuilder().build())
                .build();

        Endpoint e2 = newEndpointBuilder()
                .withName("e2")
                .withTarget(newEntityTypeBuilder()
                        .withName("_3VNIUJl7EeiyrNaxr-HdNQ")
                        .build())
                .withPartner(newEndpointBuilder()
                        .withName("_rTKUML2VEeiOuYiCo6IbXQ").build())
                .withCardinality(newCardinalityBuilder().build())
                .build();

        Endpoint e3 = newEndpointBuilder()
                .withName("e3")
                .withTarget(newEntityTypeBuilder()
                        .withName("_3VNIUJl7EeiyrNaxr-HdNQ")
                        .build())
                .withPartner(newEndpointBuilder()
                        .withName("_q9gNQL2VEeiOuYiCo6IbXQ").build())
                .withCardinality(newCardinalityBuilder().build())
                .build();
        newRelationCountConstraintBuilder();
        newTransferObjectRelationBuilder();
        Model m  = newModelBuilder().withName("M").withElements(newEntityTypeBuilder().withName("E1").withRelations(
                ImmutableList.of(e1,e2,e3)
        ).build()).build();
        /*
        Model m  = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder()
                                .withName("E1")
                                .withRelations(ImmutableList.of(
                                        newEndpointBuilder()
                                        .withName("e1")
                                        .withTarget(newEntityTypeBuilder()
                                                .withName("_3VNIUJl7EeiyrNaxr-HdNQ").build())
                                        .withPartner(newEndpointBuilder()
                                                .withName("_q9gNQL2VEeiOuYiCo6IbXQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                        .build(),
                                        newEndpointBuilder()
                                        .withName("e2")
                                        .withTarget(newEntityTypeBuilder()
                                                .withName("_3VNIUJl7EeiyrNaxr-HdNQ")
                                                .build())
                                        .withPartner(newEndpointBuilder()
                                                .withName("_rTKUML2VEeiOuYiCo6IbXQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                        .build(),
                                        newEndpointBuilder()
                                        .withName("e3")
                                        .withTarget(newEntityTypeBuilder()
                                                .withName("_3VNIUJl7EeiyrNaxr-HdNQ")
                                                .build())
                                        .withPartner(newEndpointBuilder()
                                                .withName("_q9gNQL2VEeiOuYiCo6IbXQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                        .build()
                                )).build())
                ).build();
        */
        psmResource.getContents().add(m);


        runEpsilon(ImmutableList.of("ValidPartnerRelations|Opposite partner relation of E1.e2 must be E1.e1"),
                null);
    }

    //TODO: 012 - fix with "ValidPartnerRelations()"
    //@Test
    void ValidPartnerType() throws Exception {
        log.info("Testing constraint: ValidPartnerType");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder()
                            .withName("E1")
                            .withRelations(ImmutableList.of(
                                    newEndpointBuilder()
                                        .withName("e2")
                                        .withTarget(newEntityTypeBuilder().withName("_SL_cMJmKEeiyrNaxr-HdNQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                    .build(),
                                    newEndpointBuilder()
                                        .withName("e3")
                                        .withTarget(newEntityTypeBuilder().withName("_mKioUJoZEeiyrNaxr-HdNQ").build())
                                        .withPartner(newEndpointBuilder().withName("__kNykL2VEeiOuYiCo6IbXQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                    .build())
                            ).build()/**/,
                        newEntityTypeBuilder()
                            .withName("E2")
                            .withRelations(
                                    newEndpointBuilder()
                                        .withName("e1")
                                        .withTarget(newEntityTypeBuilder().withName("_QUnq4JmKEeiyrNaxr-HdNQ").build())
                                        .withPartner(newEndpointBuilder().withName("_8y5hgL2VEeiOuYiCo6IbXQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                    .build()
                            ).build(),/**/
                        newEntityTypeBuilder()
                            .withName("E3").build()
                        )).build();


        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("ValidPartnerType|Invalid partner type: E2.e1 for E1.e3","ValidPartnerType|Invalid partner type: E1.e3 for E2.e1"),
                null);
    }

    //TODO: (013, t013) after 011 and 012
    //@Test
    void OneToOneRelationsAreNotRecommended() throws Exception {
        log.info("Testing constraint: OneToOneRelationsAreNotRecommended");


        Model m;
        //psmResource.getContents().add(M);
        runEpsilon(null,
                ImmutableList.of("OneToOneRelationsAreNotRecommended|1-1 relations required on both sides are not recommended: E1.e2 - E2.e1","OneToOneRelationsAreNotRecommended|1-1 relations required on both sides are not recommended: E1.e2 - E2.e1"));

    }

    //TODO: 014 - ask
    //@Test
    void InheritanceIsNotRecursive() throws Exception {
        log.info("Testing constraint: InheritanceIsNotRecursive");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder()
                                .withName("E1")
                                .withSuperEntityTypes(newEntityTypeBuilder().withName("_m2RJEJodEeiyrNaxr-HdNQ").build())
                        .build(),
                        newEntityTypeBuilder()
                                .withName("E2")
                                .withSuperEntityTypes(newEntityTypeBuilder().withName("_l7yd0JodEeiyrNaxr-HdNQ").build())
                        .build(),
                        newEntityTypeBuilder()
                                .withName("E3")
                                .withSuperEntityTypes(newEntityTypeBuilder().withName("_rPDHMJodEeiyrNaxr-HdNQ").build())
                        .build()
                )).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("InheritanceIsNotRecursive|Entity type E1 is recursive","InheritanceIsNotRecursive|Entity type E2 is recursive","InheritanceIsNotRecursive|Entity type E3 is recursive"),
                null);
    }

    //TODO: 015
    //@Test
    void PartnerIsNotSelf() throws Exception {
        log.info("Testing constraint: PartnerIsNotSelf");

        Model m = newModelBuilder().withName("M")
                .withElements(
                        ImmutableList.of(
                              newEntityTypeBuilder()
                                      .withName("E1")
                                      .withRelations(
                                              newEndpointBuilder()
                                                      .withName("e1")
                                                      .withTarget(newEntityTypeBuilder().withName("_3VNIUJl7EeiyrNaxr-HdNQ").build())
                                                      .withPartner(newEndpointBuilder().withName("_ug8CUL2WEeiOuYiCo6IbXQ").build())
                                                      .withCardinality(newCardinalityBuilder().build())
                                              .build()
                                      )
                                      .build()
                        )
                ).build();

        psmResource.getContents().add(m);

        runEpsilon(ImmutableList.of("PartnerIsNotSelf|Self partner relation found: E1.e1"),
                null);
    }

    @Test
    void AttributeNameIsUnique() throws Exception {
        log.info("Testing constraint: AttributeNameIsUnique");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newStringTypeBuilder()
                                .withName("String")
                                .withMaxLength(255)
                        .build(),
                        newNumericTypeBuilder()
                                .withName("Integer")
                                .withScale(18)
                        .build(),
                        newEntityTypeBuilder()
                                .withName("E")
                                .withAttributes(ImmutableList.of(
                                        newAttributeBuilder()
                                                .withName("a")
                                                .withDataType(newDateTypeBuilder()
                                                        .withName("_hqVaQJoeEeiyrNaxr-HdNQ")
                                                        .build())
                                        .build(),
                                        newAttributeBuilder()
                                                .withName("a")
                                                .withDataType(newDateTypeBuilder()
                                                        .withName("_jCGecJoeEeiyrNaxr-HdNQ")
                                                        .build())
                                        .build()
                                ))
                        .build()
                )).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("AttributeNameIsUnique|Multiple attributes are added to entity E with the same name"),
                null);
    }

    //TODO: check why the heck it's working
    @Test
    void RelationNameIsUnique() throws Exception {
        log.info("Testing constraint: RelationNameIsUnique");

        Model m = newModelBuilder().withName("M")
                .withElements(
                        newEntityTypeBuilder()
                                .withName("E")
                                .withRelations(ImmutableList.of(
                                        newEndpointBuilder()
                                                .withName("e")
                                                .withTarget(newEntityTypeBuilder().withName("_OEP5kJogEeiyrNaxr-HdNQ").build())
                                                .withCardinality(newCardinalityBuilder().build())
                                                .build(),
                                        newContainmentBuilder()
                                                .withName("e")
                                                .withTarget(newEntityTypeBuilder().withName("_OEP5kJogEeiyrNaxr-HdNQ").build())
                                                .withCardinality(newCardinalityBuilder().build())
                                                .build()
                                ))
                        .build()
                ).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("RelationNameIsUnique|Multiple relations are added to entity E with the same name"),
                null);
    }

    @Test
    void NoAttributeAndRelationAreWithTheSameName() throws Exception {
        log.info("Testing constraint: NoAttributeAndRelationAreWithTheSameName");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newStringTypeBuilder().withName("String").withMaxLength(255).build(),
                        newEntityTypeBuilder().withName("E")
                                .withAttributes(newAttributeBuilder().withName("x").withDataType(newDateTypeBuilder().withName("_5keiYJoiEeiyrNaxr-HdNQ").build()).build())
                                .withRelations(newEndpointBuilder()
                                        .withName("x")
                                        .withTarget(newEntityTypeBuilder()
                                                .withName("_0tFVoJoiEeiyrNaxr-HdNQ").build())
                                        .withCardinality(newCardinalityBuilder().build()).build())
                                .build()
                )).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("NoAttributeAndRelationAreWithTheSameName|Entity E has attributes and relations with the same name"),
                null);
    }

    //TODO: check (withPartner?)
    //@Test
    void OppositePartnerIsDefined() throws Exception {
        log.info("Testing constraint: OppositePartnerIsDefined");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder()
                                .withName("E1")
                                .withRelations(newEndpointBuilder().withName("e")
                                        .withTarget(newEntityTypeBuilder().withName("_GkQfwMIpEeiBdsJcLYLa1w").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                        .build())
                                .build(),
                        newEntityTypeBuilder()
                                .withName("E2")
                                .withRelations(newEndpointBuilder().withName("f")
                                        .withTarget(newEntityTypeBuilder().withName("_hJRQoJmGEeiyrNaxr-HdNQ"))
                                        .withPartner(newEndpointBuilder().withName("_dISfAL2XEeiOuYiCo6IbXQ").build())
                                        .withCardinality(newCardinalityBuilder().build())
                                        .build())
                                .build()
                )).build();

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

    //TODO: fix 22 (namespace)
    //@Test
    void PackageHasNamespace() throws Exception {
        log.info("Testing constraint: PackageHasNamespace");

        Model m = newModelBuilder().withName("M")
                .withPackages(newPackageBuilder().withName("pkg").build())
                .build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("PackageHasNamespace|Package pkg must have exactly 1 namespace"),
                null);
    }

    //TODO: fix 23 (namespace)
    //@Test
    void NamespaceElementHasNamespace() throws Exception {
        log.info("Testing constraint: NamespaceElementHasNamespace");

        Model m = newModelBuilder().withName("M")
                .withElements(
                        newStringTypeBuilder().withName("String").withMaxLength(255).build()
                ).build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("NamespaceElementHasNamespace|Element String must have exactly 1 namespace"),
                null);
    }

    //TODO: finish - 24
    //@Test
    void EnumerationMemberHasEnumerationType() throws Exception {
        log.info("Testing constraint: EnumerationMemberHasEnumerationType");

        Model m = newModelBuilder().withName("M")
                .withElements(newEnumerationTypeBuilder().withName("E")
                        .withMembers(ImmutableList.of(
                                newEnumerationMemberBuilder().withName("m2").withOrdinal(2).build(),
                                newEnumerationMemberBuilder().withName("m3")/*.withordinal(0)*/.build()
                        )).build()
                        //newEnumerationMemberBuilder().build()
                )
                .build();

        psmResource.getContents().add(m);
        runEpsilon(ImmutableList.of("EnumerationMemberHasEnumerationType|Enumeration member m1 must have exactly 1 enumeration"),
                null);
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