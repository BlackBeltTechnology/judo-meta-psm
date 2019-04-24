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


    @Test
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

        /* TODO: dis juan es fikidy fukd up
        runEpsilon(ImmutableList.of("ValidPartnerRelations|Opposite partner relation of E1.e2 must be E1.e1"),
                null);
         /**/
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