package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

class PsmValidationServiceTest {

    Logger logger = LoggerFactory.getLogger(PsmValidationServiceTest.class);

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
        	logger.debug("PSM diagnostics: {}", psmModel.getDiagnosticsAsString());
        	Assertions.assertTrue(psmModel.isValid());
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
    void testOverridingWithValidInput() throws Exception {
        log.info("Testing constraint: OverridingWithValidInput");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        UnboundOperation operation1 = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden1 = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation2 = newUnboundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden2 = newUnboundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation3 = newUnboundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden3 = newUnboundOperationBuilder().withName("operation3")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation4 = newUnboundOperationBuilder().withName("operation4")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden4 = newUnboundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        EntityType entityType0 = newEntityTypeBuilder().withName("entityType0").build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(ImmutableList.of(
                        operation1,operation2,operation3))
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
        		"InheritedUnboundOperationsAreValid|Transfer object type: transferObjectType4 is inheriting unbound operations with the same name but different signature.",
        		"NeedToOverrideMultipleUnboundOperations|Transfer object type: transferObjectType4 must override inherited unbound operations of the same name.",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation2 in transferObjectType2)",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation4 in transferObjectType3)",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation3 in transferObjectType4)"
        		),
            Collections.emptyList());
    }

    @Test
    void testOverridingWithValidOutput() throws Exception {
        log.info("Testing constraint: OverridingWithValidOutput");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        UnboundOperation operation1 = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden1 = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation2 = newUnboundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden2 = newUnboundOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation3 = newUnboundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden3 = newUnboundOperationBuilder().withName("operation3")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation4 = newUnboundOperationBuilder().withName("operation4")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden4 = newUnboundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withImplementation(newOperationBodyBuilder().build())
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
        		"InheritedUnboundOperationsAreValid|Transfer object type: transferObjectType4 is inheriting unbound operations with the same name but different signature.",
        		"NeedToOverrideMultipleUnboundOperations|Transfer object type: transferObjectType4 must override inherited unbound operations of the same name.",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation2 in transferObjectType2)",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation4 in transferObjectType3)",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation3 in transferObjectType4)"),
            Collections.emptyList());
    }

    @Test
    void testOverridingWithValidFaults() throws Exception {
        log.info("Testing constraint: OverridingWithValidFaults");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        UnboundOperation operation1 = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                		.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden1a = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                		.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden1b = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                		.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden1c = newUnboundOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(correctType)
                			.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType)
                		.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation2 = newUnboundOperationBuilder().withName("operation2")
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
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden2 = newUnboundOperationBuilder().withName("operation2")
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
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation3 = newUnboundOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build())
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        UnboundOperation overriden3 = newUnboundOperationBuilder().withName("operation3")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(ImmutableList.of(
                		newParameterBuilder().withName("fault1").withType(wrongType).withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build(),
                		newParameterBuilder().withName("fault2").withType(correctType).withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build()
                		))
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        UnboundOperation operation4 = newUnboundOperationBuilder().withName("operation4")
        		.withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
        		.withImplementation(newOperationBodyBuilder().build())
        		.build();
        UnboundOperation overriden4 = newUnboundOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withFaults(newParameterBuilder().withName("fault1").withType(correctType).withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build())
                .withImplementation(newOperationBodyBuilder().build())
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
        		.withOperations(ImmutableList.of(overriden1a,operation4))
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
        		.withOperations(ImmutableList.of(overriden2))
                .build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType2)
        		.withOperations(ImmutableList.of(overriden1b,overriden4))
                .build();

        EntityType entityType4 = newEntityTypeBuilder().withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType1,transferObjectType3))
        		.withOperations(ImmutableList.of(overriden1c,overriden3))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"InheritedUnboundOperationsAreValid|Transfer object type: transferObjectType4 is inheriting unbound operations with the same name but different signature.",
        		"NeedToOverrideMultipleUnboundOperations|Transfer object type: transferObjectType4 must override inherited unbound operations of the same name.",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation2 in transferObjectType2)",
        		"OverridingWithValidParameters|Overriding of unbound operation cannot change parameters (bound operation operation3 in transferObjectType4)"),
            Collections.emptyList());
    }
    
    @Test
    void testOverridingWithValidInputBoundTransferoperation() throws Exception {
        log.info("Testing constraint: OverridingWithValidInput");

        UnmappedTransferObjectType correctType = newUnmappedTransferObjectTypeBuilder().withName("correctType").build();
        UnmappedTransferObjectType wrongType = newUnmappedTransferObjectTypeBuilder().withName("wrongType").build();

        BoundOperation bound1 = newBoundOperationBuilder().withName("bound1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation boundOverriden1 = newBoundOperationBuilder().withName("bound1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation bound2 = newBoundOperationBuilder().withName("bound2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation boundOverriden2 = newBoundOperationBuilder().withName("bound2")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation bound3 = newBoundOperationBuilder().withName("bound3")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation boundOverriden3 = newBoundOperationBuilder().withName("bound3")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();

        BoundOperation bound4 = newBoundOperationBuilder().withName("bound4")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        BoundOperation boundOverriden4 = newBoundOperationBuilder().withName("bound4")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .build();
        
        BoundTransferOperation operation1 = newBoundTransferOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(bound1)
                .build();
        BoundTransferOperation overriden1 = newBoundTransferOperationBuilder().withName("operation1")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(boundOverriden1)
                .build();

        BoundTransferOperation operation2 = newBoundTransferOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(bound2)
                .build();
        BoundTransferOperation overriden2 = newBoundTransferOperationBuilder().withName("operation2")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(boundOverriden2)
                .build();

        BoundTransferOperation operation3 = newBoundTransferOperationBuilder().withName("operation3")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(bound3)
                .build();
        BoundTransferOperation overriden3 = newBoundTransferOperationBuilder().withName("operation3")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(boundOverriden3)
                .build();

        BoundTransferOperation operation4 = newBoundTransferOperationBuilder().withName("operation4")
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(bound4)
                .build();
        BoundTransferOperation overriden4 = newBoundTransferOperationBuilder().withName("operation4")
                .withInput(newParameterBuilder().withName("input").withType(wrongType).withCardinality(newCardinalityBuilder().build()))
                .withOutput(newParameterBuilder().withName("output").withType(correctType).withCardinality(newCardinalityBuilder().build()))
                .withBinding(boundOverriden4)
                .build();

        EntityType entityType0 = newEntityTypeBuilder()
                        .withName("entityType0")
                        .withOperations(ImmutableList.of(
                        bound1,bound2,bound3)).build();
        MappedTransferObjectType transferObjectType0 = newMappedTransferObjectTypeBuilder().withName("transferObjectType0").withEntityType(entityType0)
                .withOperations(ImmutableList.of(
                        operation1,operation2,operation3))
                .build();
        bound1.setInstanceRepresentation(transferObjectType0);
        bound2.setInstanceRepresentation(transferObjectType0);
        bound3.setInstanceRepresentation(transferObjectType0);

        EntityType entityType1 = newEntityTypeBuilder()
                        .withOperations(boundOverriden1).withName("entityType1").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType1 = newMappedTransferObjectTypeBuilder().withName("transferObjectType1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(transferObjectType0)
                        .withOperations(overriden1)
                .build();
        boundOverriden1.setInstanceRepresentation(transferObjectType1);

        EntityType entityType2 = newEntityTypeBuilder()
                        .withOperations(ImmutableList.of(bound4,boundOverriden2)).withName("entityType2").withSuperEntityTypes(entityType0).build();
        MappedTransferObjectType transferObjectType2 = newMappedTransferObjectTypeBuilder().withName("transferObjectType2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(transferObjectType0)
                        .withOperations(ImmutableList.of(operation4,overriden2))
                .build();
        bound4.setInstanceRepresentation(transferObjectType2);
        boundOverriden2.setInstanceRepresentation(transferObjectType2);

        EntityType entityType3 = newEntityTypeBuilder()
                        .withOperations(ImmutableList.of(boundOverriden1,boundOverriden4)).withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType transferObjectType3 = newMappedTransferObjectTypeBuilder().withName("transferObjectType3").withEntityType(entityType3)
                .withSuperTransferObjectTypes(transferObjectType2)
                        .withOperations(ImmutableList.of(overriden1,overriden4))
                .build();
        boundOverriden1.setInstanceRepresentation(transferObjectType3);
        boundOverriden4.setInstanceRepresentation(transferObjectType3);

        EntityType entityType4 = newEntityTypeBuilder()
                        .withOperations(ImmutableList.of(boundOverriden1,boundOverriden3))
                        .withName("entityType4").withSuperEntityTypes(ImmutableList.of(entityType1,entityType3)).build();
        MappedTransferObjectType transferObjectType4 = newMappedTransferObjectTypeBuilder().withName("transferObjectType4").withEntityType(entityType4)
                .withSuperTransferObjectTypes(ImmutableList.of(transferObjectType1,transferObjectType3))
                        .withOperations(ImmutableList.of(overriden1,overriden3))
                .build();
        boundOverriden1.setInstanceRepresentation(transferObjectType4);
        boundOverriden3.setInstanceRepresentation(transferObjectType4);

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            correctType,wrongType,
                            entityType0,entityType1,entityType2,entityType3,entityType4,
                            transferObjectType0,transferObjectType1,transferObjectType2,transferObjectType3,transferObjectType4
                        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"NeedToOverrideMultipleBoundTransferOperations|Transfer object type: transferObjectType4 must override inherited bound transfer operations of the same name.",
        		"OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation bound3 in entityType4)",
        		"OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation bound4 in entityType3)",
        		"OverridingWithValidParameters|Overriding of bound transfer operation cannot change parameters (bound operation operation2 in transferObjectType2)",
        		"OverridingWithValidParameters|Overriding of bound transfer operation cannot change parameters (bound operation operation4 in transferObjectType3)",
        		"OverridingWithValidParameters|Overriding of bound operation cannot change parameters (bound operation bound2 in entityType2)",
        		"InheritedBoundTransferOperationsAreValid|Transfer object type: transferObjectType4 is inheriting bound transfer operations with the same name but different signature.",
        		"InheritedOperationsAreValid|Entity type: entityType4 is inheriting operations with the same name but different signature.",
        		"OverridingWithValidParameters|Overriding of bound transfer operation cannot change parameters (bound operation operation3 in transferObjectType4)"),
            Collections.emptyList());
    }

    @Test
    void testEntityTypeMatchesEntityTypeOfBaseMappedTransferObject() throws Exception {
        log.info("Testing constraint: EntityTypeMatchesEntityTypeOfBaseMappedTransferObject");

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").build();

        MappedTransferObjectType parentTransferObject1 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject1").withEntityType(entityType1)
                .build();
        MappedTransferObjectType parentTransferObject2 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject2").withEntityType(entityType2)
                .build();
        MappedTransferObjectType childTransferObject1 = newMappedTransferObjectTypeBuilder().withName("childTransferObject1").withEntityType(entityType2)
                .withSuperTransferObjectTypes(ImmutableList.of(
                        parentTransferObject1, parentTransferObject2))
                .build();
        MappedTransferObjectType childTransferObject2 = newMappedTransferObjectTypeBuilder().withName("childTransferObject2").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(
                        parentTransferObject1, parentTransferObject2))
                .build();

        EntityType parentEntityType3 = newEntityTypeBuilder().withName("parentEntityType3").build();
        EntityType parentEntityType4 = newEntityTypeBuilder().withName("parentEntityType4").withSuperEntityTypes(parentEntityType3).build();
        EntityType childEntityType = newEntityTypeBuilder().withName("childEntityType").withSuperEntityTypes(parentEntityType4).build();

        MappedTransferObjectType parentTransferObject3 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject3").withEntityType(parentEntityType3)
                .build();
        MappedTransferObjectType parentTransferObject4 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject4").withEntityType(childEntityType)
                .withSuperTransferObjectTypes(parentTransferObject3).build();
        MappedTransferObjectType childTransferObject3 = newMappedTransferObjectTypeBuilder().withName("childTransferObject3").withEntityType(parentEntityType4)
                .withSuperTransferObjectTypes(parentTransferObject4)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                entityType1,
                entityType2,
                entityType3,
                childEntityType,
                parentEntityType3,
                parentEntityType4,
                parentTransferObject1,
                parentTransferObject2,
                parentTransferObject3,
                parentTransferObject4,
                childTransferObject1,
                childTransferObject2,
                childTransferObject3
        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "EntityTypeMatchesEntityTypeOfBaseMappedTransferObject|Entity type of mapped transfer object type: childTransferObject2"
                        + " must derive from the entity types of the base mapped transfer object type of mapped transfer object type: childTransferObject2",
                "EntityTypeMatchesEntityTypeOfBaseMappedTransferObject|Entity type of mapped transfer object type: childTransferObject3"
                        + " must derive from the entity types of the base mapped transfer object type of mapped transfer object type: childTransferObject3"),
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
                .withAttributes(ImmutableList.of(attribute0, attribute1))
                .withDataProperties(ImmutableList.of(property0, property1))
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
                        transferAttribute5))
                .withEntityType(entity)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                integerType,
                stringType,
                entity,
                transferObject,
                staticData0,
                staticData1)).build();

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
        ).withRequired(false).build();

        StaticData staticData0 = newStaticDataBuilder().withName("staticData0").withDataType(integerType)
                .withGetterExpression(newDataExpressionTypeBuilder().withExpression("1").build()).withRequired(false).build();
        StaticData staticData1 = newStaticDataBuilder().withName("staticData1").withDataType(integerType)
                .withGetterExpression(newDataExpressionTypeBuilder().withExpression("1").build()).withRequired(true).build();

        EntityType entity = newEntityTypeBuilder().withName("entity")
                .withAttributes(ImmutableList.of(attribute0, attribute1))
                .withDataProperties(ImmutableList.of(property0, property1))
                .build();

        TransferAttribute transferAttribute0 = newTransferAttributeBuilder().withName("TransferAttribute0").withDataType(integerType)
                .withBinding(attribute0).withRequired(true).build();
        TransferAttribute transferAttribute1 = newTransferAttributeBuilder().withName("TransferAttribute1").withDataType(integerType)
                .withBinding(attribute1).withRequired(true).build();
        TransferAttribute transferAttribute2 = newTransferAttributeBuilder().withName("TransferAttribute2").withDataType(integerType)
                .withBinding(property0).withRequired(true).build();
        TransferAttribute transferAttribute3 = newTransferAttributeBuilder().withName("TransferAttribute3").withDataType(integerType)
                .withBinding(property1).withRequired(false).build();
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
                staticData1, integerType
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
    void testTargetMatchesBindingTarget() throws Exception {
        log.info("Testing constraint: TargetMatchesBindingTarget");

        AssociationEnd e0 = newAssociationEndBuilder().withName("e0").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e1 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();

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
                .withRelations(ImmutableList.of(e1, e2))
                .withNavigationProperties(ImmutableList.of(n1, n2))
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

        EntityType target0 = newEntityTypeBuilder().withName("target0").build();
        MappedTransferObjectType mappedTarget0 = newMappedTransferObjectTypeBuilder().withName("mappedTarget0").withEntityType(target0).build();
        AssociationEnd end0 = newAssociationEndBuilder().withName("end0")
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(5).build())
                .withTarget(target0)
                .build();
        TransferObjectRelation transferRelation0 = newTransferObjectRelationBuilder().withName("TransferRelation0")
                .withBinding(end0).withCardinality(newCardinalityBuilder().withLower(0).withUpper(5).build())
                .withTarget(mappedTarget0)
                .build();

        EntityType target1 = newEntityTypeBuilder().withName("target1").build();
        MappedTransferObjectType mappedTarget1 = newMappedTransferObjectTypeBuilder().withName("mappedTarget1").withEntityType(target1).build();
        AssociationEnd end1 = newAssociationEndBuilder().withName("end1")
                .withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
                .withTarget(target1)
                .build();
        TransferObjectRelation transferRelation1 = newTransferObjectRelationBuilder().withName("TransferRelation1")
                .withBinding(end1).withCardinality(newCardinalityBuilder().withLower(0).withUpper(5).build())
                .withTarget(mappedTarget1)
                .build();

        EntityType target2 = newEntityTypeBuilder().withName("target2").build();
        MappedTransferObjectType mappedTarget2 = newMappedTransferObjectTypeBuilder().withName("mappedTarget2").withEntityType(target2).build();
        Containment containment = newContainmentBuilder().withName("containment")
                .withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build())
                .withTarget(target2)
                .build();
        TransferObjectRelation transferRelation2 = newTransferObjectRelationBuilder().withName("TransferRelation2")
                .withBinding(containment).withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build())
                .withTarget(mappedTarget2)
                .build();

        EntityType target3 = newEntityTypeBuilder().withName("target3").build();
        MappedTransferObjectType mappedTarget3 = newMappedTransferObjectTypeBuilder().withName("mappedTarget3").withEntityType(target3).build();
        NavigationProperty navigation = newNavigationPropertyBuilder().withName("navigation")
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.containment").build())
                .withTarget(target3)
                .build();
        TransferObjectRelation transferRelation3 = newTransferObjectRelationBuilder().withName("TransferRelation3")
                .withBinding(navigation).withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
                .withTarget(mappedTarget3)
                .build();

        EntityType target4 = newEntityTypeBuilder().withName("target4").build();
        MappedTransferObjectType mappedTarget4 = newMappedTransferObjectTypeBuilder().withName("mappedTarget4").withEntityType(target4).build();
        StaticNavigation staticNav0 = newStaticNavigationBuilder().withName("staticNav0")
                .withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build())
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("entity").build())
                .withTarget(target4)
                .build();
        TransferObjectRelation transferRelation4 = newTransferObjectRelationBuilder().withName("TransferRelation4")
                .withBinding(staticNav0).withCardinality(newCardinalityBuilder().withLower(2).withUpper(3).build())
                .withTarget(mappedTarget4)
                .build();

        EntityType target5 = newEntityTypeBuilder().withName("target5").build();
        MappedTransferObjectType mappedTarget5 = newMappedTransferObjectTypeBuilder().withName("mappedTarget5").withEntityType(target5).build();
        StaticNavigation staticNav1 = newStaticNavigationBuilder().withName("staticNav1")
                .withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("entity").build())
                .withTarget(target5)
                .build();
        TransferObjectRelation transferRelation5 = newTransferObjectRelationBuilder().withName("TransferRelation5")
                .withBinding(staticNav1).withCardinality(newCardinalityBuilder().withLower(3).withUpper(4).build())
                .withTarget(mappedTarget5)
                .build();

        EntityType entity = newEntityTypeBuilder().withName("entity")
                .withRelations(ImmutableList.of(end0, end1, containment))
                .withNavigationProperties(navigation)
                .build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
                .withName("TransferObject").withRelations(ImmutableList.of(
                        transferRelation0,transferRelation1,transferRelation2,transferRelation3,transferRelation4,transferRelation5))
                .withEntityType(entity)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                entity, transferObject, staticNav0, staticNav1,target0,mappedTarget0,target1,mappedTarget1,target2,mappedTarget2,target3,mappedTarget3,target4,mappedTarget4,target5,mappedTarget5
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
    void testTransferObjectRelationIsEmbedded() throws Exception {
        log.info("Testing constraint: TransferObjectRelationIsEmbedded");
        
        UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
        
        TransferObjectRelation r = newTransferObjectRelationBuilder().withName("R").withTarget(target)
        		.withCardinality(newCardinalityBuilder().build()).build();
        
        UnmappedTransferObjectType o = newUnmappedTransferObjectTypeBuilder().withName("O").withRelations(r).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(o,target)).build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("TransferObjectRelationIsEmbedded|Transfer object relation R is referencing to unembedded unmapped transfer object type: target"),
                Collections.emptyList());
    }

    @Test
    void testTransferObjectRelationBindingIsValid() throws Exception {
        log.info("Testing constraint: TransferObjectRelationBindingIsValid");

        AssociationEnd e0 = newAssociationEndBuilder().withName("e1").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e1 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build()).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e3").withCardinality(newCardinalityBuilder().build()).build();

        EntityType target0 = newEntityTypeBuilder().withName("target0").build();
        MappedTransferObjectType target0Mapping = newMappedTransferObjectTypeBuilder().withName("target0Mapping").withEntityType(target0).build();
        NavigationProperty n0 = newNavigationPropertyBuilder().withName("n0").withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e0").build())
        		.withTarget(target0)
                .build();
        
        EntityType target1 = newEntityTypeBuilder().withName("target1").build();
        MappedTransferObjectType target1Mapping = newMappedTransferObjectTypeBuilder().withName("target1Mapping").withEntityType(target1).build();
        NavigationProperty n1 = newNavigationPropertyBuilder().withName("n1").withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e1").build())
        		.withTarget(target1)
                .build();
        
        EntityType target2 = newEntityTypeBuilder().withName("target2").build();
        MappedTransferObjectType target2Mapping = newMappedTransferObjectTypeBuilder().withName("target2Mapping").withEntityType(target2).build();
        NavigationProperty n2 = newNavigationPropertyBuilder().withName("n2").withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build())
        		.withTarget(target2)
        		.build();

        EntityType target = newEntityTypeBuilder().withName("target3").build();
        MappedTransferObjectType targetMapping = newMappedTransferObjectTypeBuilder().withName("targetMapping").withEntityType(target).build();
        StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav")
                .withCardinality(newCardinalityBuilder().build())
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("child").build())
        		.withTarget(target)
                .build();

        EntityType parent = newEntityTypeBuilder().withName("parent")
                .withRelations(e0)
                .withNavigationProperties(n0)
                .build();
        MappedTransferObjectType parentMapping = newMappedTransferObjectTypeBuilder().withName("parentMapping").withEntityType(parent).build();
        EntityType child = newEntityTypeBuilder().withName("child")
                .withSuperEntityTypes(parent)
                .withRelations(e1)
                .withNavigationProperties(n1)
                .build();
        MappedTransferObjectType childMapping = newMappedTransferObjectTypeBuilder().withName("childMapping")
        		.withSuperTransferObjectTypes(parentMapping)
        		.withEntityType(child).build();
        EntityType friend = newEntityTypeBuilder().withName("friend")
                .withRelations(e2)
                .withNavigationProperties(n2)
                .build();
        MappedTransferObjectType friendMapping = newMappedTransferObjectTypeBuilder().withName("friendMapping").withEntityType(friend).build();

        e0.setTarget(friend);
        e1.setTarget(friend);
        e1.setPartner(e2);
        e2.setTarget(child);
        e2.setPartner(e1);

        TransferObjectRelation transferRelation0 = newTransferObjectRelationBuilder()
                .withName("TransferRelation0").withCardinality(newCardinalityBuilder().build())
                .withTarget(friendMapping).withBinding(e0).build();
        TransferObjectRelation transferRelation1 = newTransferObjectRelationBuilder()
                .withName("TransferRelation1").withBinding(e1).withCardinality(newCardinalityBuilder().build())
                .withTarget(friendMapping).build();
        TransferObjectRelation transferRelation2 = newTransferObjectRelationBuilder()
                .withName("TransferRelation2").withCardinality(newCardinalityBuilder().build())
                .withTarget(childMapping).withBinding(e2).build();
        TransferObjectRelation transferRelation3 = newTransferObjectRelationBuilder()
                .withName("TransferRelation3").withCardinality(newCardinalityBuilder().build())
                .withBinding(n0).withTarget(target0Mapping).build();
        TransferObjectRelation transferRelation4 = newTransferObjectRelationBuilder()
                .withName("TransferRelation4").withCardinality(newCardinalityBuilder().build())
                .withTarget(target1Mapping).withBinding(n1).build();
        TransferObjectRelation transferRelation5 = newTransferObjectRelationBuilder()
                .withName("TransferRelation5").withCardinality(newCardinalityBuilder().build())
                .withTarget(target2Mapping).withBinding(n2).build();
        TransferObjectRelation transferRelation6 = newTransferObjectRelationBuilder()
                .withName("TransferRelation6").withCardinality(newCardinalityBuilder().build())
                .withTarget(targetMapping).withBinding(staticNav).build();

        MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder()
                .withName("TransferObject").withRelations(ImmutableList.of(
                        transferRelation0,transferRelation1,transferRelation2,transferRelation3,transferRelation4,transferRelation5,transferRelation6))
                .withEntityType(child)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                parent,child,friend,transferObject,staticNav,
                target,target0,target1,target2,target0Mapping,target1Mapping,target2Mapping,targetMapping,friendMapping,childMapping,parentMapping))
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
    void testTransferObjectTypeNamesAreUnique() throws Exception {
        log.info("Testing critique: TransferObjectTypeNamesAreUnique");
        
        EntityType entity = newEntityTypeBuilder().withName("entity").build();
        MappedTransferObjectType transferObject1 = newMappedTransferObjectTypeBuilder().withName("TransferObject")
        		.withEntityType(entity).build();
        UnmappedTransferObjectType transferObject2 = newUnmappedTransferObjectTypeBuilder().withName("transferObject").build();
        
        Package p1 = newPackageBuilder().withName("pkg1").withElements(ImmutableList.of(transferObject1,entity)).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(transferObject2).build();

        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1, p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "TransferObjectTypeNamesAreUnique|There are two or more transfer object types of the same name: TransferObject",
                        "TransferObjectTypeNamesAreUnique|There are two or more transfer object types of the same name: transferObject"));
    }

    @Test
    void testUnmappedTransferObjectTypeHasNoMappedSuperTransferObjectType() throws Exception {
        log.info("Testing constraint: UnmappedTransferObjectTypeHasNoMappedSuperTransferObjectType");

        UnmappedTransferObjectType unmappedParent1 = newUnmappedTransferObjectTypeBuilder().withName("unmappedParent1").build();
        UnmappedTransferObjectType unmappedParent2 = newUnmappedTransferObjectTypeBuilder().withName("unmappedParent2").withSuperTransferObjectTypes(unmappedParent1).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(unmappedParent2)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent").withEntityType(entityType2)
                .withSuperTransferObjectTypes(unmappedParent1)
                .build();

        UnmappedTransferObjectType unmappedChild = newUnmappedTransferObjectTypeBuilder().withName("unmappedChild").withSuperTransferObjectTypes(mappedParent2).build();


        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                unmappedParent1, unmappedParent2,
                entityType1, entityType2,
                mappedParent1, mappedParent2,
                unmappedChild
        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "UnmappedTransferObjectTypeHasNoMappedSuperTransferObjectType|Unmapped transfer object type: unmappedChild cannot derive from mapped transfer object type."),
                Collections.emptyList());
    }

    @Test
    void testInheritedAndOwnTransferAttributeNameIsUniqueInTransferObjectType() throws Exception {
        log.info("Testing constraint: InheritedAndOwnTransferAttributeNameIsUniqueInTransferObjectType");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        TransferAttribute attribute1 = newTransferAttributeBuilder().withName("attribute").withDataType(string).build();
        TransferAttribute attribute2 = newTransferAttributeBuilder().withName("attr").withDataType(string).build();

        UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
        TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("element").withTarget(target)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        UnmappedTransferObjectType parent1 = newUnmappedTransferObjectTypeBuilder().withName("parent1")
                .withAttributes(ImmutableList.of(attribute1, attribute2)).build();
        UnmappedTransferObjectType parent2 = newUnmappedTransferObjectTypeBuilder().withName("parent2").withRelations(relation).build();

        TransferAttribute wrongAttribute1 = newTransferAttributeBuilder().withName("element").withDataType(string).build();
        TransferAttribute wrongAttribute2 = newTransferAttributeBuilder().withName("ATTR").withDataType(string).build();
        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(ImmutableList.of(parent1, parent2))
                .withAttributes(ImmutableList.of(wrongAttribute1, wrongAttribute2))
                .build();

        TransferAttribute correctAttribute = newTransferAttributeBuilder().withName("own").withDataType(string).build();
        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
        MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType2)
                .withSuperTransferObjectTypes(ImmutableList.of(parent1, parent2))
                .withAttributes(correctAttribute)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,
                target,
                parent1, parent2,
                entityType1,
                child1,
                entityType2,
                child2
        ))
                .build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritedAndOwnTransferAttributeNameIsUniqueInTransferObjectType|"
                        + "Transfer attribute: element has the same name as inherited content(s) of transfer object type: child1",
                "InheritedAndOwnTransferAttributeNameIsUniqueInTransferObjectType|"
                        + "Transfer attribute: ATTR has the same name as inherited content(s) of transfer object type: child1"
                ),
                Collections.emptyList());
    }

    @Test
    void testInheritedAndOwnTransferObjectRelationNameIsUniqueInTransferObjectType() throws Exception {
        log.info("Testing constraint: InheritedAndOwnTransferObjectRelationNameIsUniqueInTransferObjectType");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        TransferAttribute attribute = newTransferAttributeBuilder().withName("element").withDataType(string).build();

        UnmappedTransferObjectType target11 = newUnmappedTransferObjectTypeBuilder().withName("target11").build();
        TransferObjectRelation relation1 = newTransferObjectRelationBuilder().withName("relation").withTarget(target11)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();
        UnmappedTransferObjectType target12 = newUnmappedTransferObjectTypeBuilder().withName("target12").build();
        TransferObjectRelation relation2 = newTransferObjectRelationBuilder().withName("rel").withTarget(target12)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        UnmappedTransferObjectType parent1 = newUnmappedTransferObjectTypeBuilder().withName("parent1").withAttributes(attribute).build();
        UnmappedTransferObjectType parent2 = newUnmappedTransferObjectTypeBuilder().withName("parent2")
                .withRelations(ImmutableList.of(relation1, relation2)).build();

        UnmappedTransferObjectType target21 = newUnmappedTransferObjectTypeBuilder().withName("target21").build();
        TransferObjectRelation wrongRelation1 = newTransferObjectRelationBuilder().withName("element").withTarget(target21)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        UnmappedTransferObjectType target22 = newUnmappedTransferObjectTypeBuilder().withName("target22").build();
        TransferObjectRelation wrongRelation2 = newTransferObjectRelationBuilder().withName("REL").withTarget(target22)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withEntityType(entityType1)
                .withSuperTransferObjectTypes(ImmutableList.of(parent1, parent2))
                .withRelations(ImmutableList.of(wrongRelation1, wrongRelation2))
                .build();

        UnmappedTransferObjectType target3 = newUnmappedTransferObjectTypeBuilder().withName("target3").build();
        TransferObjectRelation correctRelation = newTransferObjectRelationBuilder().withName("own").withTarget(target3)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
        MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(ImmutableList.of(parent1, parent2))
                .withRelations(correctRelation)
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,
                target11, target12, target21, target22, target3,
                parent1, parent2,
                entityType1, entityType2,
                child1, child2
        ))
                .build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritedAndOwnTransferObjectRelationNameIsUniqueInTransferObjectType|"
                        + "Transfer object relation: element has the same name as inherited content(s) of transfer object type: child1",
                "InheritedAndOwnTransferObjectRelationNameIsUniqueInTransferObjectType|"
                        + "Transfer object relation: REL has the same name as inherited content(s) of transfer object type: child1"),
                Collections.emptyList());
    }

    @Test
    void testInheritingUniqueAttributeNamesLowerCase() throws Exception {
        log.info("Testing constraint: InheritingUniqueAttributeNames");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        TransferAttribute attribute1 = newTransferAttributeBuilder().withName("attribute").withDataType(string).build();
        TransferAttribute attribute2 = newTransferAttributeBuilder().withName("attribute").withDataType(string).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withAttributes(attribute1)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(mappedParent1)
                .build();

        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withAttributes(attribute2).build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2, parent))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,
                entityType1, entityType2, entityType3,
                mappedParent1, mappedParent2, parent,
                child
        ))
                .build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritingUniqueTransferAttributeNames|Transfer object type: child has inherited transfer attributes of the same name."),
                Collections.emptyList());
    }

    @Test
    void testInheritingUniqueAttributeNamesMixedCase() throws Exception {
        log.info("Testing constraint: InheritingUniqueAttributeNames");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        TransferAttribute attribute1 = newTransferAttributeBuilder().withName("attribute").withDataType(string).build();
        TransferAttribute attribute2 = newTransferAttributeBuilder().withName("ATTRIBUTE").withDataType(string).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withAttributes(attribute1)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(mappedParent1)
                .build();

        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withAttributes(attribute2).build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2, parent))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,
                entityType1, entityType2, entityType3,
                mappedParent1, mappedParent2, parent,
                child
        ))
                .build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritingUniqueTransferAttributeNames|Transfer object type: child has inherited transfer attributes of the same name."),
                Collections.emptyList());
    }

    @Test
    void testInheritingUniqueRelationNamesLowerCase() throws Exception {
        log.info("Testing constraint: InheritingUniqueRelationNames");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        UnmappedTransferObjectType target1 = newUnmappedTransferObjectTypeBuilder().withName("target1").build();
        TransferObjectRelation relation1 = newTransferObjectRelationBuilder().withName("relation").withTarget(target1)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        UnmappedTransferObjectType target2 = newUnmappedTransferObjectTypeBuilder().withName("target2").build();
        TransferObjectRelation relation2 = newTransferObjectRelationBuilder().withName("relation").withTarget(target2)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withRelations(relation1)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(mappedParent1)
                .build();

        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withRelations(relation2).build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2, parent))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,target1,target2,
                entityType1, entityType2, entityType3,
                mappedParent1, mappedParent2, parent,
                child
        )).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritingUniqueTransferObjectRelationNames|Transfer object type: child has inherited transfer object relations of the same name."),
                Collections.emptyList());
    }

    @Test
    void testInheritingUniqueRelationNamesMixedCase() throws Exception {
        log.info("Testing constraint: InheritingUniqueRelationNames");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        UnmappedTransferObjectType target1 = newUnmappedTransferObjectTypeBuilder().withName("target1").build();
        TransferObjectRelation relation1 = newTransferObjectRelationBuilder().withName("relation").withTarget(target1)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        UnmappedTransferObjectType target2 = newUnmappedTransferObjectTypeBuilder().withName("target2").build();
        TransferObjectRelation relation2 = newTransferObjectRelationBuilder().withName("RELATION").withTarget(target2)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withRelations(relation1)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(mappedParent1)
                .build();

        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withRelations(relation2).build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2, parent))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string, target1,target2,
                entityType1, entityType2, entityType3,
                mappedParent1, mappedParent2, parent,
                child)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritingUniqueTransferObjectRelationNames|Transfer object type: child has inherited transfer object relations of the same name."),
                Collections.emptyList());
    }

    @Test
    void testInheritingAttributesAndRelationsOfTheSameNameIsNotAllowedLowerCase() throws Exception {
        log.info("Testing constraint: InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        TransferAttribute attribute1 = newTransferAttributeBuilder().withName("content").withDataType(string).build();
        TransferAttribute attribute2 = newTransferAttributeBuilder().withName("attribute").withDataType(string).build();

        UnmappedTransferObjectType target1 = newUnmappedTransferObjectTypeBuilder().withName("target1").build();
        TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("content").withTarget(target1)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withAttributes(attribute1)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(mappedParent1)
                .withAttributes(attribute2)
                .build();

        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withRelations(relation).build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2, parent))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,target1,
                entityType1, entityType2, entityType3,
                mappedParent1, mappedParent2, parent,
                child
        ))
                .build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed|Transfer object type: child has inherited transfer object relation(s) and inherited transfer attribute(s) of the same name."),
                Collections.emptyList());
    }

    @Test
    void testInheritingAttributesAndRelationsOfTheSameNameIsNotAllowedMixedCase() throws Exception {
        log.info("Testing constraint: InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed");

        StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();

        TransferAttribute attribute1 = newTransferAttributeBuilder().withName("CONTENT").withDataType(string).build();
        TransferAttribute attribute2 = newTransferAttributeBuilder().withName("attribute").withDataType(string).build();

        UnmappedTransferObjectType target1 = newUnmappedTransferObjectTypeBuilder().withName("target1").build();
        TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("content").withTarget(target1)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
                .withEmbedded(true).build();

        EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
        MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
                .withAttributes(attribute1)
                .build();

        EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
        MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
                .withSuperTransferObjectTypes(mappedParent1)
                .withAttributes(attribute2)
                .build();

        UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withRelations(relation).build();

        EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
        MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
                .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2, parent))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                string,target1,
                entityType1, entityType2, entityType3,
                mappedParent1, mappedParent2, parent,
                child
        ))
                .build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed|Transfer object type: child has inherited transfer object relation(s) and inherited transfer attribute(s) of the same name."),
                Collections.emptyList());
    }

   @Test
   void testInheritedTransferOperationAndTransferAttributeNamesAreUniqueLowerCase() throws Exception {
      log.info("Testing constraint: InheritedTransferOperationAndTransferAttributeNamesAreUnique");

      StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();
      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();

      TransferAttribute attribute = newTransferAttributeBuilder().withName("content").withDataType(string).build();

      UnboundOperation operation = newUnboundOperationBuilder().withName("content")
              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
              .withImplementation(newOperationBodyBuilder().build())
              .build();

      EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
      MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
              .withOperations(operation)
              .build();

      EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
      MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
    		  .withSuperTransferObjectTypes(mappedParent1)
              .build();

      UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withAttributes(attribute).build();

      EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
      MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();

      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,type,
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child
                      ))
    		  .build();

      psmModel.addContent(model);

      runEpsilon(ImmutableList.of(
          "InheritedTransferOperationAndTransferAttributeNamesAreUnique|"
          + "Transfer object type: child has inherited transfer operation(s) and inherited transfer attribute(s) of the same name."),
          Collections.emptyList());
   }

   @Test
   void testInheritedTransferOperationAndTransferAttributeNamesAreUniqueMixedCase() throws Exception {
	      log.info("Testing constraint: InheritedTransferOperationAndTransferAttributeNamesAreUnique");

	      StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();
	      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();

	      TransferAttribute attribute = newTransferAttributeBuilder().withName("content").withDataType(string).build();

	      UnboundOperation operation = newUnboundOperationBuilder().withName("Content")
	              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
	              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
	              .withImplementation(newOperationBodyBuilder().build())
	              .build();

	      EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
	      MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
	              .withOperations(operation)
	              .build();

	      EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
	      MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
	    		  .withSuperTransferObjectTypes(mappedParent1)
	              .build();

	      UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withAttributes(attribute).build();

	      EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
	      MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
	              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
	              .build();

	      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
	              			string,type,
	              			entityType1,entityType2,entityType3,
	              			mappedParent1,mappedParent2,parent,
	              			child
	                      ))
	    		  .build();

	      psmModel.addContent(model);

	      runEpsilon(ImmutableList.of(
	          "InheritedTransferOperationAndTransferAttributeNamesAreUnique|"
	          + "Transfer object type: child has inherited transfer operation(s) and inherited transfer attribute(s) of the same name."),
	          Collections.emptyList());
   }

   @Test
   void testInheritedTransferOperationAndTransferObjectRelationNamesAreUniqueLowerCase() throws Exception {
      log.info("Testing constraint: InheritedTransferOperationAndTransferObjectRelationNamesAreUnique");

      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();

      UnboundOperation operation = newUnboundOperationBuilder().withName("content")
              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
              .withImplementation(newOperationBodyBuilder().build())
              .build();

      UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
      TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("content").withTarget(target)
    		  .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
    		  .withEmbedded(true).build();

      EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
      MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
              .withOperations(operation)
              .build();

      EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
      MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
    		  .withSuperTransferObjectTypes(mappedParent1)
              .build();

      UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withRelations(relation).build();

      EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
      MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();

      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			type,
    		  			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child, target
                      ))
    		  .build();

      psmModel.addContent(model);

      runEpsilon(ImmutableList.of(
          "InheritedTransferOperationAndTransferObjectRelationNamesAreUnique|"
          + "Transfer object type: child has inherited transfer operation(s) and inherited transfer object relation(s) of the same name."),
          Collections.emptyList());
   }

   @Test
   void testInheritedTransferOperationAndTransferObjectRelationNamesAreUniqueMixedCase() throws Exception {
	      log.info("Testing constraint: InheritedTransferOperationAndTransferObjectRelationNamesAreUnique");

	      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();

	      UnboundOperation operation = newUnboundOperationBuilder().withName("content")
	              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
	              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
	              .withImplementation(newOperationBodyBuilder().build())
	              .build();

	      UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
	      TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("CONTENT").withTarget(target)
	    		  .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
	    		  .withEmbedded(true).build();

	      EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
	      MappedTransferObjectType mappedParent1 = newMappedTransferObjectTypeBuilder().withName("mappedParent1").withEntityType(entityType1)
	              .withOperations(operation)
	              .build();

	      EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
	      MappedTransferObjectType mappedParent2 = newMappedTransferObjectTypeBuilder().withName("mappedParent2").withEntityType(entityType2)
	    		  .withSuperTransferObjectTypes(mappedParent1)
	              .build();

	      UnmappedTransferObjectType parent = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withRelations(relation).build();

	      EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").withSuperEntityTypes(entityType2).build();
	      MappedTransferObjectType child = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType3)
	              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
	              .build();

	      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
	              			type,target,
	    		  			entityType1,entityType2,entityType3,
	              			mappedParent1,mappedParent2,parent,
	              			child
	                      ))
	    		  .build();

	      psmModel.addContent(model);

	      runEpsilon(ImmutableList.of(
	          "InheritedTransferOperationAndTransferObjectRelationNamesAreUnique|"
	          + "Transfer object type: child has inherited transfer operation(s) and inherited transfer object relation(s) of the same name."),
	          Collections.emptyList());
   }

    @Test
    void testCardinalityLowerIsGreaterThanOrEqualToZeroRelation() throws Exception {
        log.info("Testing constraint: CardinalityLowerIsGreaterThanOrEqualToZero");

        UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
        TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("relation").withTarget(target)
                .withCardinality(newCardinalityBuilder().withLower(-1).withUpper(1).build()).withEmbedded(true).build();

        UnmappedTransferObjectType transferObject = newUnmappedTransferObjectTypeBuilder().withName("unmapped")
                .withRelations(relation).build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(target, transferObject)).build();

        psmModel.addContent(model);

        runEpsilon(
                ImmutableList.of("CardinalityLowerIsGreaterThanOrEqualToZero|"
                        + "Lower attribute of element: relation must be greater than or equal to zero"),
                Collections.emptyList());
    }

    @Test
    void testCardinalityLowerMustBeLessOrEqualToUpperRelation() throws Exception {
        log.info("Testing constraint: CardinalityLowerMustBeLessOrEqualToUpper");

        UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
        TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("relation").withTarget(target)
                .withCardinality(newCardinalityBuilder().withLower(3).withUpper(1).build()).withEmbedded(true).build();

        UnmappedTransferObjectType transferObject = newUnmappedTransferObjectTypeBuilder().withName("unmapped")
                .withRelations(relation).build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(target, transferObject)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "CardinalityLowerMustBeLessOrEqualToUpper|Lower (3) must be less or equal to upper (1) of element: relation"),
                Collections.emptyList());
    }

    @Test
    void testCardinalityUpperIsAtLeastOneRelation() throws Exception {
        log.info("Testing constraint: CardinalityUpperIsAtLeastOne");

        UnmappedTransferObjectType target = newUnmappedTransferObjectTypeBuilder().withName("target").build();
        TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("relation").withTarget(target)
                .withCardinality(newCardinalityBuilder().withLower(3).withUpper(0).build()).withEmbedded(true).build();

        UnmappedTransferObjectType transferObject = newUnmappedTransferObjectTypeBuilder().withName("unmapped")
                .withRelations(relation).build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(target, transferObject)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("CardinalityUpperIsAtLeastOne|Invalid upper attribute of element: relation",
                "CardinalityLowerMustBeLessOrEqualToUpper|Lower (3) must be less or equal to upper (0) of element: relation"),
                Collections.emptyList());
    }

    @Test
    void testCardinalityLowerIsGreaterThanOrEqualToZeroParameter() throws Exception {
        log.info("Testing constraint: CardinalityLowerIsGreaterThanOrEqualToZero");

        UnmappedTransferObjectType unmapped = newUnmappedTransferObjectTypeBuilder().withName("unmapped").build();

        UnboundOperation unbound1 = newUnboundOperationBuilder().withName("bound").withInput(
                newParameterBuilder().withName("input").withCardinality(newCardinalityBuilder().withLower(-1).build()).withType(unmapped).build())
                .withImplementation(newOperationBodyBuilder().build())
        		.build();
        UnboundOperation unbound2 = newUnboundOperationBuilder().withName("unbound")
                .withOutput(newParameterBuilder().withName("output").withCardinality(newCardinalityBuilder().withLower(-2).build()).withType(unmapped).build())
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        
        EntityType entity = newEntityTypeBuilder().withName("entity").build();
        
        MappedTransferObjectType mapped = newMappedTransferObjectTypeBuilder().withName("mapped")
                .withEntityType(entity)
                .withOperations(ImmutableList.of(unbound1,unbound2))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(unmapped, mapped, entity)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "CardinalityLowerIsGreaterThanOrEqualToZero|Lower attribute of element: output must be greater than or equal to zero",
                "CardinalityLowerIsGreaterThanOrEqualToZero|Lower attribute of element: input must be greater than or equal to zero"),
                Collections.emptyList());
    }

    @Test
    void testCardinalityLowerMustBeLessOrEqualToUpperParameter() throws Exception {
        log.info("Testing constraint: CardinalityLowerMustBeLessOrEqualToUpper");

        UnmappedTransferObjectType unmapped = newUnmappedTransferObjectTypeBuilder().withName("unmapped").build();

        UnboundOperation unbound1 = newUnboundOperationBuilder().withName("bound").withInput(
                newParameterBuilder().withName("input").withCardinality(newCardinalityBuilder().withLower(2).withUpper(1).build()).withType(unmapped).build())
        		.withImplementation(newOperationBodyBuilder().build())
        		.build();
        UnboundOperation unbound2 = newUnboundOperationBuilder().withName("unbound")
                .withOutput(newParameterBuilder().withName("output").withCardinality(newCardinalityBuilder().withLower(3).withUpper(2).build()).withType(unmapped).build())
                .withImplementation(newOperationBodyBuilder().build())
                .build();

        EntityType entity = newEntityTypeBuilder().withName("entity").build();
        
        MappedTransferObjectType mapped = newMappedTransferObjectTypeBuilder().withName("mapped")
                .withEntityType(entity)
                .withOperations(ImmutableList.of(unbound1, unbound2))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(unmapped, mapped, entity)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "CardinalityLowerMustBeLessOrEqualToUpper|Lower (2) must be less or equal to upper (1) of element: input",
                "CardinalityLowerMustBeLessOrEqualToUpper|Lower (3) must be less or equal to upper (2) of element: output"),
                Collections.emptyList());
    }

    @Test
    void testCardinalityUpperIsAtLeastOneParameter() throws Exception {
        log.info("Testing constraint: CardinalityUpperIsAtLeastOne");

        UnmappedTransferObjectType unmapped = newUnmappedTransferObjectTypeBuilder().withName("unmapped").build();

        UnboundOperation unbound1 = newUnboundOperationBuilder().withName("bound")
        		.withInput(newParameterBuilder().withName("input").withCardinality(newCardinalityBuilder().withLower(0).withUpper(0).build()).withType(unmapped).build())
        		.withImplementation(newOperationBodyBuilder().build())
        		.build();
        UnboundOperation unbound2 = newUnboundOperationBuilder().withName("unbound")
                .withOutput(newParameterBuilder().withName("output").withCardinality(newCardinalityBuilder().withLower(0).withUpper(0).build()).withType(unmapped).build())
                .withImplementation(newOperationBodyBuilder().build())
                .build();
        
        EntityType entityType = newEntityTypeBuilder().withName("entity").build();
        
        MappedTransferObjectType mapped = newMappedTransferObjectTypeBuilder().withName("mapped")
                .withEntityType(entityType)
                .withOperations(ImmutableList.of(unbound1,unbound2))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(unmapped, mapped, entityType)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "CardinalityUpperIsAtLeastOne|Invalid upper attribute of element: output",
                "CardinalityUpperIsAtLeastOne|Invalid upper attribute of element: input"),
                Collections.emptyList());
    }
    
    @Test
    void testOwnerIsMappedTransferObjectType() throws Exception {
        log.info("Testing constraint: OwnerIsMappedTransferObjectType");
        
        BoundOperation operation1 = newBoundOperationBuilder().withName("operation1").build();
        
        EntityType entityType = newEntityTypeBuilder().withName("entityType").withOperations(operation1).build();
        MappedTransferObjectType transferObjectType = newMappedTransferObjectTypeBuilder().withName("transferObjectType")
        		.withEntityType(entityType).build();
        operation1.setInstanceRepresentation(transferObjectType);
        
        BoundTransferOperation transferOp = newBoundTransferOperationBuilder().withName("transferOp").withBinding(operation1).build();
        
        UnmappedTransferObjectType unmapped = newUnmappedTransferObjectTypeBuilder().withName("unmapped").withOperations(transferOp).build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            entityType,transferObjectType,unmapped)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "OwnerIsMappedTransferObjectType|Container of bound transfer operation must be mapped transfer object type (operation: transferOp)"),
            Collections.emptyList());
    }
    
    @Test
    void testBindingIsValid() throws Exception {
        log.info("Testing constraint: BindingIsValid");
        
        BoundOperation operation = newBoundOperationBuilder().withName("operation").build();
        
        EntityType entityType = newEntityTypeBuilder().withName("entityType").withOperations(operation).build();
        MappedTransferObjectType transferObjectType = newMappedTransferObjectTypeBuilder().withName("transferObjectType")
        		.withEntityType(entityType).build();
        operation.setInstanceRepresentation(transferObjectType);
        
        BoundTransferOperation transferOp = newBoundTransferOperationBuilder().withName("transferOp").withBinding(operation).build();
        
        EntityType otherEntityType = newEntityTypeBuilder().withName("other").build();
        MappedTransferObjectType mapped = newMappedTransferObjectTypeBuilder().withName("mapped")
        		.withEntityType(otherEntityType)
        		.withOperations(transferOp).build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            entityType,transferObjectType,mapped,otherEntityType)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "BindingIsValid|Binding of bound transfer operation must be an operation of the owner transfer object type (operation: transferOp)"),
            Collections.emptyList());
    }
    
    @Test
    void testParametersAreValid() throws Exception {
        log.info("Testing constraint: ParametersAreValid");

        UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
        UnmappedTransferObjectType otherType = newUnmappedTransferObjectTypeBuilder().withName("otherType").build();

        BoundOperation operation1 = newBoundOperationBuilder()
        		.withInput(newParameterBuilder().withName("inp").withType(type).withCardinality(newCardinalityBuilder().build()).build()).withName("operation1").build();
        BoundOperation operation2 = newBoundOperationBuilder()
        		.withInput(newParameterBuilder().withName("inp").withType(type).withCardinality(newCardinalityBuilder().build()).build()).withName("operation2").build();
        BoundOperation operation3 = newBoundOperationBuilder().withName("operation3").build();
        
        EntityType entityType = newEntityTypeBuilder().withName("entityType").withOperations(ImmutableList.of(operation1,operation2,operation3)).build();
        MappedTransferObjectType transferObjectType = newMappedTransferObjectTypeBuilder().withName("transferObjectType")
        		.withEntityType(entityType).build();
        operation1.setInstanceRepresentation(transferObjectType);
        operation2.setInstanceRepresentation(transferObjectType);
        operation3.setInstanceRepresentation(transferObjectType);
        
        BoundTransferOperation transferOp1 = newBoundTransferOperationBuilder().withName("transferOp1")
        		.withInput(newParameterBuilder().withName("inp").withType(type).withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build()).build()).withBinding(operation1).build();
        BoundTransferOperation transferOp2 = newBoundTransferOperationBuilder().withName("transferOp2")
        		.withInput(newParameterBuilder().withName("inp").withType(otherType).withCardinality(newCardinalityBuilder().build()).build()).withBinding(operation2).build();
        BoundTransferOperation transferOp3 = newBoundTransferOperationBuilder().withName("transferOp3")
        		.withInput(newParameterBuilder().withName("inp").withType(otherType).withCardinality(newCardinalityBuilder().build()).build()).withBinding(operation3).build();
        
        transferObjectType.getOperations().addAll(ImmutableList.of(transferOp1,transferOp2,transferOp3));

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                            entityType,transferObjectType,type,otherType)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
            "ParametersAreValid|Parameters of bound transfer operation must match binding's parameters (operation: transferOp1)",
            "ParametersAreValid|Parameters of bound transfer operation must match binding's parameters (operation: transferOp2)",
            "ParametersAreValid|Parameters of bound transfer operation must match binding's parameters (operation: transferOp3)"),
            Collections.emptyList());
    }
    
    @Test
    void testInitOperationCannotHaveInput() throws Exception {
        log.info("Testing constraint: InitOperationCannotHaveInput");

        UnmappedTransferObjectType unmapped = newUnmappedTransferObjectTypeBuilder().withName("unmapped").build();

        UnboundOperation unbound = newUnboundOperationBuilder().withName("unbound")
        		.withInput(newParameterBuilder().withName("input").withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).withType(unmapped).build())
        		.withImplementation(newOperationBodyBuilder().build())
        		.withInitializer(true)
        		.build();
        
        EntityType entityType = newEntityTypeBuilder().withName("entity").build();
        
        MappedTransferObjectType mapped = newMappedTransferObjectTypeBuilder().withName("mapped")
                .withEntityType(entityType)
                .withOperations(ImmutableList.of(unbound))
                .build();

        Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(unmapped, mapped, entityType)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
                "InitOperationCannotHaveInput|Initializer operation: unbound cannot have input."),
                Collections.emptyList());
    }
    
    @Test
    void testEmbeddedOnBothSidesAreNotAllowed() throws Exception {
        log.info("Testing constraint: EmbeddedOnBothSidesAreNotAllowed");
        
		EntityType e1 = newEntityTypeBuilder().withName("E1").build();
		EntityType e2 = newEntityTypeBuilder().withName("E2").build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName("T1")
				.withEntityType(e1).build();
		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName("T2")
				.withEntityType(e2).build();
		
		AssociationEnd end1 = newAssociationEndBuilder().withName("end1").withTarget(e2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		AssociationEnd end2 = newAssociationEndBuilder().withName("end2").withTarget(e1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		e1.getRelations().add(end1);
		e2.getRelations().add(end2);
		end1.setPartner(end2);
		end2.setPartner(end1);
		
		TransferObjectRelation r1 = newTransferObjectRelationBuilder().withName("r1")
				.withTarget(t2)
				.withEmbedded(true)
				.withBinding(end1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(r1);
		
		TransferObjectRelation r2 = newTransferObjectRelationBuilder().withName("r2")
				.withTarget(t1)
				.withEmbedded(true)
				.withBinding(end2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t2.getRelations().add(r2);
        
        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(e1,e2,t1,t2)).build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("EmbeddedOnBothSidesAreNotAllowed|Circular aggregation found on relation: M::E2.r2",
        		"EmbeddedOnBothSidesAreNotAllowed|Circular aggregation found on relation: M::E1.r1"),
                Collections.emptyList());
    }
    
    @Test
    void testAllRequiredFeaturesHaveBindingIfCreatable() throws Exception {
        log.info("Testing constraint: AllRequiredFeaturesHaveBindingIfCreatable");
        
        NumericType integerType = newNumericTypeBuilder().withName("int").withPrecision(10).withScale(1).build();
        StringType stringType = newStringTypeBuilder().withName("string").withMaxLength(255).build();

        Attribute attribute0 = newAttributeBuilder().withName("attribute0").withRequired(true).withDataType(integerType).build();
        Attribute attribute1 = newAttributeBuilder().withName("attribute1").withRequired(true).withDataType(stringType).build();
        Attribute attribute2 = newAttributeBuilder().withName("attribute2").withRequired(true).withDataType(integerType).build();
        Attribute attribute3 = newAttributeBuilder().withName("attribute3").withRequired(true).withDataType(stringType).build();
        
		EntityType p = newEntityTypeBuilder().withName("p").build();
		EntityType e1 = newEntityTypeBuilder().withName("e1").withSuperEntityTypes(p)
				.withAttributes(ImmutableList.of(attribute0,attribute1))
				.build();
		EntityType c = newEntityTypeBuilder().withName("c").withSuperEntityTypes(e1).build();
		EntityType e2 = newEntityTypeBuilder().withName("e2")
				.withAttributes(ImmutableList.of(attribute2,attribute3))
				.build();
		EntityType e3 = newEntityTypeBuilder().withName("e3").build();
		
		AssociationEnd association0 = newAssociationEndBuilder().withName("association0")
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
									.withTarget(e3).build();
		AssociationEnd association1 = newAssociationEndBuilder().withName("association1")
				.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
				.withTarget(e3).build();
		
		e1.getRelations().add(association0);
		e2.getRelations().add(association1);
		
		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName("pt")
				.withEntityType(p).build();
		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName("t1").withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName("ct")
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();
		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName("t2")
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName("relation").withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName("sn").withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		TransferObjectRelation eg = newTransferObjectRelationBuilder().withName("eg").withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();
		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName("ap").withRelations(eg).build();

        ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();
		
		BoundOperation op = newBoundOperationBuilder().withName("binding")
				.withInstanceRepresentation(t1)
				.withInput(newParameterBuilder().withName("input")
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
						.withType(t2).build())
				.withOutput(newParameterBuilder().withName("output")
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
						.withType(t2).build())
				.build();

		e1.getOperations().add(op);
		
		t1.getOperations().addAll(ImmutableList.of(

				newUnboundOperationBuilder().withName("create")
					.withBehaviour(
							newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.CREATE).withOwner(eg).build())
					.withOutput(newParameterBuilder().withName("output").withType(pt)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withInput(newParameterBuilder().withName("input").withType(ct)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
				
				newBoundTransferOperationBuilder().withName("create_relation")
					.withBehaviour(
							newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.CREATE_RELATION).withOwner(relation).build())
					.withOutput(newParameterBuilder().withName("output").withType(t2)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withInput(newParameterBuilder().withName("input").withType(t2)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withBinding(op)
					.build()
		));

		Model model = newModelBuilder().withName("model")
				.withElements(ImmutableList.of(e1, e2, e3, t1, t2, stringType, integerType, actor, ap, sn, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"AllRequiredFeaturesHaveBindingIfCreatable|t2 is used by create operation and excludes required features: association1, attribute3, attribute2",
				"AllRequiredFeaturesHaveBindingIfCreatable|t1 is used by create operation and excludes required features: attribute1, attribute0, association0"),
				Collections.emptyList());
    }
}
