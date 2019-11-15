package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedService;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;

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
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.*;

class PsmValidationAccesspointTest {
    
	Logger logger = LoggerFactory.getLogger(PsmValidationAccesspointTest.class);

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
    void testAccessPointUnboundOperationsAreUnique() throws Exception {
       log.info("Testing constraint: AccessPointUnboundOperationsAreUnique");
       
       UnboundOperation unboundOperation1 = newUnboundOperationBuilder().withName("unboundOperation1")
               .withImplementation(newOperationBodyBuilder().build())
               .build();
       ExposedService exposedService1 = newExposedServiceBuilder().withOperation(unboundOperation1).build();
       
       UnboundOperation unboundOperation2 = newUnboundOperationBuilder().withName("unboundOperation2")
               .withImplementation(newOperationBodyBuilder().build())
               .build();
       ExposedService exposedService2 = newExposedServiceBuilder().withOperation(unboundOperation2).build();
       
       ExposedService exposedService3 = newExposedServiceBuilder().withOperation(unboundOperation2).build();
       
       AccessPoint accessPoint = newAccessPointBuilder().withName("accessPoint")
               .withExposedServices(ImmutableList.of(
                       exposedService1,
                       exposedService2,
                       exposedService3
                       ))
               .build();
       
       
       Model model = newModelBuilder().withName("M").withElements(ImmutableList.of(
                        unboundOperation1,
                        unboundOperation2,
                        accessPoint
                       )).build();
    
       psmModel.addContent(model);
    
       runEpsilon(ImmutableList.of(
           "AccessPointUnboundOperationsAreUnique|Exposed services of access point accessPoint are referencing to the same unbound operation."),
           Collections.emptyList());
    }
    
    @Test
    void testCardinalityLowerIsGreaterThanOrEqualToZero() throws Exception {
           log.info("Testing constraint: CardinalityLowerIsGreaterThanOrEqualToZero");

           EntityType entity = newEntityTypeBuilder().withName("entity").build();
           MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject").withEntityType(entity).build();
           StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav").withTarget(entity)
                   .withCardinality(newCardinalityBuilder().withLower(1).withUpper(5).build()).build();

           ExposedGraph graph = newExposedGraphBuilder().withName("graph").withCardinality(newCardinalityBuilder().withLower(-1).withUpper(5).build())
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
               "CardinalityLowerIsGreaterThanOrEqualToZero|Lower attribute of exposed graph: graph must be greater than or equal to zero",
               "SelectorCardinalityIsValid|Cardinality of exposed graph graph must match cardinality of the exposed graph's selector."),
               Collections.emptyList());
    }
    
    @Test
    void testLowerMustBeLessOrEqualToUpper() throws Exception {
           log.info("Testing constraint: LowerMustBeLessOrEqualToUpper");

           EntityType entity = newEntityTypeBuilder().withName("entity").build();
           MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject").withEntityType(entity).build();
           StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav").withTarget(entity)
                   .withCardinality(newCardinalityBuilder().withLower(1).withUpper(5).build()).build();

           ExposedGraph graph = newExposedGraphBuilder().withName("graph").withCardinality(newCardinalityBuilder().withLower(3).withUpper(2).build())
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
               "LowerMustBeLessOrEqualToUpper|Lower (3) must be less or equal to upper (2) of exposed graph: graph",
               "SelectorCardinalityIsValid|Cardinality of exposed graph graph must match cardinality of the exposed graph's selector."),
               Collections.emptyList());
    }
    
    @Test
    void testCardinalityUpperIsAtLeastOne() throws Exception {
           log.info("Testing constraint: CardinalityUpperIsAtLeastOne");

           EntityType entity = newEntityTypeBuilder().withName("entity").build();
           MappedTransferObjectType transferObject = newMappedTransferObjectTypeBuilder().withName("transferObject").withEntityType(entity).build();
           StaticNavigation staticNav = newStaticNavigationBuilder().withName("staticNav").withTarget(entity)
                   .withCardinality(newCardinalityBuilder().withLower(1).withUpper(5).build()).build();

           ExposedGraph graph = newExposedGraphBuilder().withName("graph").withCardinality(newCardinalityBuilder().withLower(0).withUpper(0).build())
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
               "CardinalityUpperIsAtLeastOne|Invalid upper attribute of exposed graph: graph",
               "SelectorCardinalityIsValid|Cardinality of exposed graph graph must match cardinality of the exposed graph's selector."),
               Collections.emptyList());
    }
}
