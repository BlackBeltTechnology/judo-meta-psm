package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.derived.StaticData;
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
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

class PsmValidationServiceTest {
    
	Logger logger = LoggerFactory.getLogger(PsmValidationServiceTest.class);

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
       EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").withSuperEntityTypes(entityType1).build();
       EntityType entityType3 = newEntityTypeBuilder().withName("entityType3").build();
       
       MappedTransferObjectType parentTransferObject1 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject1").withEntityType(entityType1)
               .build();
       MappedTransferObjectType parentTransferObject2 = newMappedTransferObjectTypeBuilder().withName("parentTransferObject2").withEntityType(entityType2)
               .build();
       MappedTransferObjectType childTransferObject1 = newMappedTransferObjectTypeBuilder().withName("childTransferObject1").withEntityType(entityType2)
               .withSuperTransferObjectTypes(ImmutableList.of(
                       parentTransferObject1,parentTransferObject2))
               .build();
       MappedTransferObjectType childTransferObject2 = newMappedTransferObjectTypeBuilder().withName("childTransferObject2").withEntityType(entityType3)
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
       MappedTransferObjectType childTransferObject3 = newMappedTransferObjectTypeBuilder().withName("childTransferObject3").withEntityType(parentEntityType4)
               .withSuperTransferObjectTypes(parentTransferObject4)
               .build();
       
       Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                           entityType1,
                           entityType2,
                           entityType3,
                           childEntityType,
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
                          unmappedParent1,unmappedParent2,
                          entityType1,entityType2,
                          mappedParent1,mappedParent2,
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
    		  .withAttributes(ImmutableList.of(attribute1,attribute2)).build();
      UnmappedTransferObjectType parent2 = newUnmappedTransferObjectTypeBuilder().withName("parent2").withRelations(relation).build();
      
      TransferAttribute wrongAttribute1 = newTransferAttributeBuilder().withName("element").withDataType(string).build();
      TransferAttribute wrongAttribute2 = newTransferAttributeBuilder().withName("ATTR").withDataType(string).build();
      EntityType entityType1 = newEntityTypeBuilder().withName("entityType1").build();
      MappedTransferObjectType child1 = newMappedTransferObjectTypeBuilder().withName("child1").withEntityType(entityType1)
              .withSuperTransferObjectTypes(ImmutableList.of(parent1,parent2))
              .withAttributes(ImmutableList.of(wrongAttribute1,wrongAttribute2))
              .build();
      
      TransferAttribute correctAttribute = newTransferAttributeBuilder().withName("own").withDataType(string).build();
      EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
      MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child").withEntityType(entityType2)
              .withSuperTransferObjectTypes(ImmutableList.of(parent1,parent2))
              .withAttributes(correctAttribute)
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			target,
              			parent1,parent2,
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
    		  .withRelations(ImmutableList.of(relation1,relation2)).build();
     
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
              .withSuperTransferObjectTypes(ImmutableList.of(parent1,parent2))
              .withRelations(ImmutableList.of(wrongRelation1,wrongRelation2))
              .build();
      
      UnmappedTransferObjectType target3 = newUnmappedTransferObjectTypeBuilder().withName("target3").build();
      TransferObjectRelation correctRelation = newTransferObjectRelationBuilder().withName("own").withTarget(target3)
    		  .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
    		  .withEmbedded(true).build();
      
      EntityType entityType2 = newEntityTypeBuilder().withName("entityType2").build();
      MappedTransferObjectType child2 = newMappedTransferObjectTypeBuilder().withName("child2").withEntityType(entityType2)
              .withSuperTransferObjectTypes(ImmutableList.of(parent1,parent2))
              .withRelations(correctRelation)
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			target11,target12,target21,target22,target3,
              			parent1,parent2,
                        entityType1,entityType2,
                        child1,child2
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
      
      TransferAttribute attribute1= newTransferAttributeBuilder().withName("attribute").withDataType(string).build();
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
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child
                      ))
    		  .build();
   
      psmModel.addContent(model);
   
      runEpsilon(ImmutableList.of(
          "InheritingUniqueAttributeNames|Transfer object type: child has inherited transfer attributes of the same name."),
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
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child
                      ))
    		  .build();
   
      psmModel.addContent(model);
   
      runEpsilon(ImmutableList.of(
          "InheritingUniqueAttributeNames|Transfer object type: child has inherited transfer attributes of the same name."),
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
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child
                      ))
    		  .build();
   
      psmModel.addContent(model);
   
      runEpsilon(ImmutableList.of(
          "InheritingUniqueRelationNames|Transfer object type: child has inherited transfer object relations of the same name."),
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
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child
                      ))
    		  .build();
   
      psmModel.addContent(model);
   
      runEpsilon(ImmutableList.of(
          "InheritingUniqueRelationNames|Transfer object type: child has inherited transfer object relations of the same name."),
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
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
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
              .withSuperTransferObjectTypes(ImmutableList.of(mappedParent2,parent))
              .build();
            
      Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
              			string,            
              			entityType1,entityType2,entityType3,
              			mappedParent1,mappedParent2,parent,
              			child
                      ))
    		  .build();
   
      psmModel.addContent(model);
   
      runEpsilon(ImmutableList.of(
          "InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed|Transfer object type: child has inherited transfer object relation(s) and inherited transfer attribute(s) of the same name."),
          Collections.emptyList());
   }
   
   @Test
   void testInheritedOperationAndTransferAttributeNamesAreUniqueLowerCase() throws Exception {
      log.info("Testing constraint: InheritedOperationAndTransferAttributeNamesAreUnique");
      
      StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();
      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
      
      TransferAttribute attribute = newTransferAttributeBuilder().withName("content").withDataType(string).build();
      
      BoundOperation operation = newBoundOperationBuilder().withName("content")
              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
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
          "InheritedOperationAndTransferAttributeNamesAreUnique|"
          + "Mapped transfer object type: child has inherited operation(s) and inherited transfer attribute(s) of the same name."),
          Collections.emptyList());
   }
   
   @Test
   void testInheritedOperationAndTransferAttributeNamesAreUniqueMixedCase() throws Exception {
	      log.info("Testing constraint: InheritedOperationAndTransferAttributeNamesAreUnique");
	      
	      StringType string = newStringTypeBuilder().withName("str").withMaxLength(10).build();
	      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
	      
	      TransferAttribute attribute = newTransferAttributeBuilder().withName("content").withDataType(string).build();
	      
	      BoundOperation operation = newBoundOperationBuilder().withName("Content")
	              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
	              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
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
	          "InheritedOperationAndTransferAttributeNamesAreUnique|"
	          + "Mapped transfer object type: child has inherited operation(s) and inherited transfer attribute(s) of the same name."),
	          Collections.emptyList());
   }
   
   @Test
   void testInheritedOperationAndTransferObjectRelationNamesAreUniqueLowerCase() throws Exception {
      log.info("Testing constraint: InheritedOperationAndTransferObjectRelationNamesAreUnique");
      
      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
      
      BoundOperation operation = newBoundOperationBuilder().withName("content")
              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
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
              			child
                      ))
    		  .build();
   
      psmModel.addContent(model);
   
      runEpsilon(ImmutableList.of(
          "InheritedOperationAndTransferObjectRelationNamesAreUnique|"
          + "Mapped transfer object type: child has inherited operation(s) and inherited transfer object relation(s) of the same name."),
          Collections.emptyList());
   }
   
   @Test
   void testInheritedOperationAndTransferObjectRelationNamesAreUniqueMixedCase() throws Exception {
	      log.info("Testing constraint: InheritedOperationAndTransferObjectRelationNamesAreUnique");
	      
	      UnmappedTransferObjectType type = newUnmappedTransferObjectTypeBuilder().withName("type").build();
	      
	      BoundOperation operation = newBoundOperationBuilder().withName("content")
	              .withInput(newParameterBuilder().withName("input").withType(type).withCardinality(newCardinalityBuilder().build()))
	              .withOutput(newParameterBuilder().withName("output").withType(type).withCardinality(newCardinalityBuilder().build()))
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
	              			type,
	    		  			entityType1,entityType2,entityType3,
	              			mappedParent1,mappedParent2,parent,
	              			child
	                      ))
	    		  .build();
	   
	      psmModel.addContent(model);
	   
	      runEpsilon(ImmutableList.of(
	          "InheritedOperationAndTransferObjectRelationNamesAreUnique|"
	          + "Mapped transfer object type: child has inherited operation(s) and inherited transfer object relation(s) of the same name."),
	          Collections.emptyList());
   }
}
