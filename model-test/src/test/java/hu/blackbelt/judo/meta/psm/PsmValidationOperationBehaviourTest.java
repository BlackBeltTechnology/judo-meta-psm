package hu.blackbelt.judo.meta.psm;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newAccessPointBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newExposedGraphBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newBoundOperationBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newBoundTransferOperationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferOperationBehaviourBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnboundOperationBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;

import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;


class PsmValidationOperationBehaviourTest {

    Logger logger = LoggerFactory.getLogger(PsmValidationOperationBehaviourTest.class);

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
    
	final String MODEL_NAME = "model";
	final String ACCESSPOINT_NAME = "ap";
	final String EXPOSEDGRAPH_NAME = "eg";
	final String PARENT_ENTITY_TYPE  = "pe";
	final String CHILD_ENTITY_TYPE  = "ce";
	final String NAME_OF_ENTITY_TYPE_FOR_T1  = "e1";
	final String NAME_OF_ENTITY_TYPE_FOR_T2 = "e2";
	final String NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH  = "t1";
	final String SELECTOR_NAME = "sn";
	final String PARENT_TRANSFER_OBJECT = "p";
	final String CHILD_TRANSFER_OBJECT = "c";
	final String NAME_OF_TRANSFER_RELATION_TARGET = "t2";
	final String TRANSFER_OBJECT_RELATION = "r";
	final String GET_OPERATION_NAME = "get";
	final String CREATE_OPERATION_NAME = "create";
	final String UPDATE_OPERATION_NAME = "update";
	final String DELETE_OPERATION_NAME = "delete";
	final String SET_RELATION_OPERATION_NAME = "set";
	final String UNSET_RELATION_OPERATION_NAME = "unset";
	final String ADD_ALL_TO_RELATION_OPERATION_NAME = "addAll";
	final String REMOVE_ALL_FROM_RELATION_OPERATION_NAME = "removeAll";
	
	final String WRONG_EXPOSEDGRAPH_NAME = "wrong_eg";
	final String WRONG_SELECTOR_NAME = "wrong_sn";
	final String BOUND_OP = "bound";
	
	final String WRONG_CONTAINER = "WRONG_CONTAINER";
	final String WRONG_OWNER_TYPE = "WRONG_OWNER_TYPE";
	final String WRONG_OWNER_MTO = "WRONG_OWNER_MTO";
	final String UNDEFINED_OUTPUT = "UNDEFINED_OUTPUT";
	final String DEFINED_INPUT = "DEFINED_INPUT";
	final String WRONG_OUTPUT_NAME = "WRONG_OUTPUT_NAME";
	final String WRONG_OUTPUT_TYPE = "WRONG_OUTPUT_TYPE";
	final String WRONG_OUTPUT_CARDINALITY = "WRONG_OUTPUT_CARDINALITY";
	final String DEFINED_RELATION = "DEFINED_RELATION";
	
	final String UNDEFINED_PARAMS = "UNDEFINED_PARAMS";
	final String WRONG_PARAM_NAMES = "WRONG_PARAM_NAMES";
	final String WRONG_PARAM_TYPES = "WRONG_PARAM_TYPES";
	final String WRONG_PARAM_CARDINALITY = "WRONG_PARAM_CARDINALITY";
	
	final String WRONG_TRANSFER_OBJECT_RELATION = "wrong_r";

    @Test
    void testValidUnboundOperations() throws Exception {

    	EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
    	
    	EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1)
    			.withSuperEntityTypes(p).build();
    	
    	EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE)
    			.withSuperEntityTypes(e1).build();
    	
    	EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
    	
    	MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
    			.withEntityType(p).build();
    	
    	MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH)
    			.withSuperTransferObjectTypes(pt)
    			.withEntityType(e1).build();

    	MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
    			.withSuperTransferObjectTypes(t1)
    			.withEntityType(c).build();
    	
    	MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_RELATION_TARGET)
    			.withEntityType(e2).build();
    	
    	TransferObjectRelation r = newTransferObjectRelationBuilder()
    			.withName(TRANSFER_OBJECT_RELATION)
    			.withTarget(t2)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	t1.getRelations().add(r);
    	
    	StaticNavigation sn = newStaticNavigationBuilder()
				.withName(SELECTOR_NAME)
				.withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph eg = newExposedGraphBuilder()
    					.withName(EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(t1)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(sn)
    					.build();
    	
    	AccessPoint ap = newAccessPointBuilder().withName(ACCESSPOINT_NAME)
    			.withExposedGraphs(eg)
    			.build();
    	
    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newUnboundOperationBuilder().withName(GET_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.GET)
    						.withOwner(eg)
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
    						.build())
    				.build(),
    			newUnboundOperationBuilder().withName(CREATE_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.CREATE)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(pt)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
        		newUnboundOperationBuilder().withName(UPDATE_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
        		newUnboundOperationBuilder().withName(DELETE_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.DELETE)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    			
        		newUnboundOperationBuilder().withName(SET_RELATION_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
    						.withOwner(eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    			
    			newUnboundOperationBuilder().withName(UNSET_RELATION_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
    						.withOwner(eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
        		newUnboundOperationBuilder().withName(ADD_ALL_TO_RELATION_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
    						.withOwner(eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
        		newUnboundOperationBuilder().withName(REMOVE_ALL_FROM_RELATION_OPERATION_NAME)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
    						.withOwner(eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build()
    			));
    	
        Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(
                            e1,e2,t1,t2,ap,sn,ct,pt,c,p)).build();

        psmModel.addContent(model);

        runEpsilon( Collections.emptyList(),
            Collections.emptyList());
    }
    
    @Test
    void testGetOperationUnboundOperations() throws Exception {
    
    	EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
    	
    	EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1)
    			.withSuperEntityTypes(p).build();
    	
    	EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE)
    			.withSuperEntityTypes(e1).build();
    	
    	EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
    	
    	MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
    			.withEntityType(p).build();
    	
    	MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH)
    			.withSuperTransferObjectTypes(pt)
    			.withEntityType(e1).build();

    	MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
    			.withSuperTransferObjectTypes(t1)
    			.withEntityType(c).build();
    	
    	MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_RELATION_TARGET)
    			.withEntityType(e2).build();
    	
    	TransferObjectRelation r = newTransferObjectRelationBuilder()
    			.withName(TRANSFER_OBJECT_RELATION)
    			.withTarget(t2)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	t1.getRelations().add(r);
    	
    	StaticNavigation sn = newStaticNavigationBuilder()
				.withName(SELECTOR_NAME)
				.withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph eg = newExposedGraphBuilder()
    					.withName(EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(t1)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(sn)
    					.build();
    	
    	StaticNavigation wrong_sn = newStaticNavigationBuilder()
				.withName(WRONG_SELECTOR_NAME)
				.withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph wrong_eg = newExposedGraphBuilder()
    					.withName(WRONG_EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(pt)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(wrong_sn)
    					.build();
    	
    	AccessPoint ap = newAccessPointBuilder().withName(ACCESSPOINT_NAME)
    			.withExposedGraphs(ImmutableList.of(eg,wrong_eg))
    			.build();
    	
    	e1.getOperations().add(
    			newBoundOperationBuilder().withName(BOUND_OP)
    				.withOutput(newParameterBuilder()
							.withName("output")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
							.build())
					.withInstanceRepresentation(t1)
    				.build()
    			);
    	
    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.GET)
							.withOwner(eg)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withOutput(newParameterBuilder()
							.withName("output")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
							.build())
					.build(),
					
				newUnboundOperationBuilder().withName(DEFINED_RELATION)
						.withBehaviour(newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.GET)
								.withOwner(eg)
								.withRelation(r)
								.build())
						.withOutput(newParameterBuilder()
								.withName("output")
								.withType(t1)
								.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
								.build())
						.build(),
    			
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.GET)
    						.withOwner(pt)
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.GET)
    						.withOwner(wrong_eg)
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_OUTPUT)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.GET)
        						.withOwner(eg)
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(DEFINED_INPUT)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.GET)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_OUTPUT_NAME)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.GET)
        						.withOwner(eg)
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("param")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_OUTPUT_TYPE)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.GET)
        						.withOwner(eg)
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_OUTPUT_CARDINALITY)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.GET)
        						.withOwner(eg)
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build())
        						.build())
        				.build()
    			));
    	
        Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(
                            e1,e2,t1,t2,ap,sn,ct,pt,c,p,wrong_sn)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"RelationOfGetBehaviourIsUndefined|Relation must be undefined for 'GET' operation: DEFINED_RELATION (in: t1)",
        		"OperationOfGetBehaviourIsValid|'GET' operation: WRONG_CONTAINER (in: t1) must be unbound operation",
        		"GetOperationOutputParameterIsDefined|'GET' operation must have an output parameter named 'output' (operation: UNDEFINED_OUTPUT)",
        		"GetOperationOutputTypeIsValid|Type of 'GET' operation's output parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_OUTPUT_TYPE)",
        		"OwnerOfGetBehaviourIsValid|Mapped transfer object of owner exposed graph of 'GET' operation: WRONG_OWNER_MTO (in: t1) must match the operation's container.",
        		"OwnerOfGetBehaviourIsExposedGraph|Owner of 'GET' operation: WRONG_OWNER_TYPE (in: t1) must be exposed graph.",
        		"GetOperationOutputCardinalityIsValid|Cardinality of 'GET' operation's output parameter must be the same as its owner's (operation: WRONG_OUTPUT_CARDINALITY)",
        		"GetOperationInputParameterIsNotDefined|'GET' operation cannot have an input parameter (operation: DEFINED_INPUT)",
        		"GetOperationOutputNameIsValid|'GET' operation's output parameter must be named 'output' (operation: WRONG_OUTPUT_NAME)"),
            Collections.emptyList());
    }
    
    @Test
    void testCreateOperationUnboundOperations() throws Exception {
    	
    	EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
    	
    	EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1)
    			.withSuperEntityTypes(p).build();
    	
    	EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE)
    			.withSuperEntityTypes(e1).build();
    	
    	EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
    	
    	MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
    			.withEntityType(p).build();
    	
    	MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH)
    			.withSuperTransferObjectTypes(pt)
    			.withEntityType(e1).build();

    	MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
    			.withSuperTransferObjectTypes(t1)
    			.withEntityType(c).build();
    	
    	MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_RELATION_TARGET)
    			.withEntityType(e2).build();
    	
    	TransferObjectRelation r = newTransferObjectRelationBuilder()
    			.withName(TRANSFER_OBJECT_RELATION)
    			.withTarget(t2)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	t1.getRelations().add(r);
    	
    	StaticNavigation sn = newStaticNavigationBuilder()
				.withName(SELECTOR_NAME)
				.withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph eg = newExposedGraphBuilder()
    					.withName(EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(t1)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(sn)
    					.build();
    	
    	StaticNavigation wrong_sn = newStaticNavigationBuilder()
				.withName(WRONG_SELECTOR_NAME)
				.withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph wrong_eg = newExposedGraphBuilder()
    					.withName(WRONG_EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(pt)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(wrong_sn)
    					.build();
    	
    	AccessPoint ap = newAccessPointBuilder().withName(ACCESSPOINT_NAME)
    			.withExposedGraphs(ImmutableList.of(eg,wrong_eg))
    			.build();
    	
    	e1.getOperations().add(
    			newBoundOperationBuilder().withName(BOUND_OP)
				.withInput(newParameterBuilder()
						.withName("input")
						.withType(ct)
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
						.build())
				.withOutput(newParameterBuilder()
						.withName("output")
						.withType(pt)
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
						.build())
					.withInstanceRepresentation(t1)
    				.build()
    			);

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.CREATE)
							.withOwner(eg)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(ct)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withOutput(newParameterBuilder()
							.withName("output")
							.withType(pt)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
				
				newUnboundOperationBuilder().withName(DEFINED_RELATION)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.CREATE)
							.withOwner(eg)
							.withRelation(r)
							.build())
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(ct)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withOutput(newParameterBuilder()
							.withName("output")
							.withType(pt)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
    			
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.CREATE)
    						.withOwner(pt)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(pt)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.CREATE)
    						.withOwner(wrong_eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(pt)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_PARAMS)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.CREATE)
        						.withOwner(eg)
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_PARAM_NAMES)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.CREATE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("iput")
        						.withType(ct)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("oput")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_PARAM_TYPES)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.CREATE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(ct)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_PARAM_CARDINALITY)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.CREATE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(ct)
        						.withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
        						.build())
        				.build()
    			));
    	
        Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(
                            e1,e2,t1,t2,ap,sn,ct,pt,c,p,wrong_sn)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"RelationOfCreateBehaviourIsUndefined|Relation must be undefined for 'CREATE' operation: DEFINED_RELATION (in: t1)",
        		"CreateOperationOutputCardinalityIsValid|Cardinality of 'CREATE' operation's output parameter must be 1..1 (operation: WRONG_PARAM_CARDINALITY)",
        		"CreateOperationOutputParameterIsDefined|'CREATE' operation must have an output parameter named 'output' (operation: UNDEFINED_PARAMS)",
        		"CreateOperationOutputNameIsValid|'CREATE' operation's output parameter must be named 'output' (operation: WRONG_PARAM_NAMES)",
        		"CreateOperationInputParameterIsDefined|'CREATE' operation must have an input parameter named 'input' (operation: UNDEFINED_PARAMS)",
        		"CreateOperationInputNameIsValid|'CREATE' operation's input parameter must be named 'input' (operation: WRONG_PARAM_NAMES)",
        		"OperationOfCreateBehaviourIsValid|'CREATE' operation: WRONG_CONTAINER (in: t1) must be unbound operation",
        		"OwnerOfCreateBehaviourIsValid|Mapped transfer object of owner exposed graph of 'CREATE' operation: WRONG_OWNER_MTO (in: t1) must match the operation's container.",
        		"OwnerOfCreateBehaviourIsExposedGraph|Owner of 'CREATE' operation: WRONG_OWNER_TYPE (in: t1) must be exposed graph.",
        		"CreateOperationInputTypeIsValid|Type of 'CREATE' operation's input parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_PARAM_TYPES)",
        		"CreateOperationOutputTypeIsValid|Type of 'CREATE' operation's output parameter must be exposed graph's mapped transfer object type or its supertype (operation: WRONG_PARAM_TYPES)",
        		"CreateOperationInputCardinalityIsValid|Cardinality of 'CREATE' operation's input parameter must be 1..1 (operation: WRONG_PARAM_CARDINALITY)"),
            Collections.emptyList());
    }
    
    @Test
    void testUpdateOperationUnboundOperations() throws Exception {
      
    	final String MODEL_NAME = "model";
    	final String ACCESSPOINT_NAME = "ap";
    	final String EXPOSEDGRAPH_NAME = "eg";
    	final String WRONG_EXPOSEDGRAPH_NAME = "wrong_eg";
    	final String PARENT_ENTITY_TYPE  = "pe";
    	final String CHILD_ENTITY_TYPE  = "ce";
    	final String NAME_OF_ENTITY_TYPE_FOR_T1  = "e1";
    	final String NAME_OF_ENTITY_TYPE_FOR_T2 = "e2";
    	final String NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH  = "t1";
    	final String SELECTOR_NAME = "sn";
    	final String WRONG_SELECTOR_NAME = "wrong_sn";
    	final String PARENT_TRANSFER_OBJECT = "p";
    	final String CHILD_TRANSFER_OBJECT = "c";
    	final String NAME_OF_TRANSFER_RELATION_TARGET = "t2";
    	final String TRANSFER_OBJECT_RELATION = "r";
    	final String BOUND_OP = "bound";
    	
    	EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
    	
    	EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1)
    			.withSuperEntityTypes(p).build();
    	
    	EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE)
    			.withSuperEntityTypes(e1).build();
    	
    	EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
    	
    	MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
    			.withEntityType(p).build();
    	
    	MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH)
    			.withSuperTransferObjectTypes(pt)
    			.withEntityType(e1).build();

    	MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
    			.withSuperTransferObjectTypes(t1)
    			.withEntityType(c).build();
    	
    	MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_RELATION_TARGET)
    			.withEntityType(e2).build();
    	
    	TransferObjectRelation r = newTransferObjectRelationBuilder()
    			.withName(TRANSFER_OBJECT_RELATION)
    			.withTarget(t2)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	t1.getRelations().add(r);
    	
    	StaticNavigation sn = newStaticNavigationBuilder()
				.withName(SELECTOR_NAME)
				.withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph eg = newExposedGraphBuilder()
    					.withName(EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(t1)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(sn)
    					.build();
    	
    	StaticNavigation wrong_sn = newStaticNavigationBuilder()
				.withName(WRONG_SELECTOR_NAME)
				.withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph wrong_eg = newExposedGraphBuilder()
    					.withName(WRONG_EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(pt)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(wrong_sn)
    					.build();
    	
    	AccessPoint ap = newAccessPointBuilder().withName(ACCESSPOINT_NAME)
    			.withExposedGraphs(ImmutableList.of(eg,wrong_eg))
    			.build();
    	
    	e1.getOperations().add(
    			newBoundOperationBuilder().withName(BOUND_OP)
				.withInput(newParameterBuilder()
						.withName("input")
						.withType(ct)
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
						.build())
				.withOutput(newParameterBuilder()
						.withName("output")
						.withType(pt)
						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
						.build())
					.withInstanceRepresentation(t1)
    				.build()
    			);
    	
    	final String WRONG_CONTAINER = "WRONG_CONTAINER";
    	final String WRONG_OWNER_TYPE = "WRONG_OWNER_TYPE";
    	final String WRONG_OWNER_MTO = "WRONG_OWNER_MTO";
    	final String UNDEFINED_PARAMS = "UNDEFINED_PARAMS";
    	final String WRONG_PARAM_NAMES = "WRONG_PARAM_NAMES";
    	final String WRONG_PARAM_TYPES = "WRONG_PARAM_TYPES";
    	final String WRONG_PARAM_CARDINALITY = "WRONG_PARAM_CARDINALITY";
    	final String DEFINED_RELATION = "DEFINED_RELATION";

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.UPDATE)
							.withOwner(eg)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(ct)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withOutput(newParameterBuilder()
							.withName("output")
							.withType(pt)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
				
					newUnboundOperationBuilder().withName(DEFINED_RELATION)
						.withBehaviour(newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.UPDATE)
								.withOwner(eg)
								.withRelation(r)
								.build())
						.withInput(newParameterBuilder()
								.withName("input")
								.withType(ct)
								.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
								.build())
						.withOutput(newParameterBuilder()
								.withName("output")
								.withType(pt)
								.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
								.build())
						.build(),
    			
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
    						.withOwner(pt)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(pt)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
    						.withOwner(wrong_eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(ct)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.withOutput(newParameterBuilder()
    						.withName("output")
    						.withType(pt)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_PARAMS)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
        						.withOwner(eg)
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_PARAM_NAMES)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("iput")
        						.withType(ct)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("oput")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_PARAM_TYPES)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(ct)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_PARAM_CARDINALITY)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UPDATE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(ct)
        						.withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
        						.build())
        				.build()
    			));
    	
        Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(
                            e1,e2,t1,t2,ap,sn,ct,pt,c,p,wrong_sn)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"RelationOfUpdateBehaviourIsUndefined|Relation must be undefined for 'UPDATE' operation: DEFINED_RELATION (in: t1)",
        		"UpdateOperationOutputCardinalityIsValid|Cardinality of 'UPDATE' operation's output parameter must be 1..1 (operation: WRONG_PARAM_CARDINALITY)",
        		"UpdateOperationOutputParameterIsDefined|'UPDATE' operation must have an output parameter named 'output' (operation: UNDEFINED_PARAMS)",
        		"UpdateOperationOutputNameIsValid|'UPDATE' operation's output parameter must be named 'output' (operation: WRONG_PARAM_NAMES)",
        		"UpdateOperationInputParameterIsDefined|'UPDATE' operation must have an input parameter named 'input' (operation: UNDEFINED_PARAMS)",
        		"UpdateOperationInputNameIsValid|'UPDATE' operation's input parameter must be named 'input' (operation: WRONG_PARAM_NAMES)",
        		"OperationOfUpdateBehaviourIsValid|'UPDATE' operation: WRONG_CONTAINER (in: t1) must be unbound operation",
        		"OwnerOfUpdateBehaviourIsValid|Mapped transfer object of owner exposed graph of 'UPDATE' operation: WRONG_OWNER_MTO (in: t1) must match the operation's container.",
        		"OwnerOfUpdateBehaviourIsExposedGraph|Owner of 'UPDATE' operation: WRONG_OWNER_TYPE (in: t1) must be exposed graph.",
        		"UpdateOperationInputTypeIsValid|Type of 'UPDATE' operation's input parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_PARAM_TYPES)",
        		"UpdateOperationOutputTypeIsValid|Type of 'UPDATE' operation's output parameter must be exposed graph's mapped transfer object type or its supertype (operation: WRONG_PARAM_TYPES)",
        		"UpdateOperationInputCardinalityIsValid|Cardinality of 'UPDATE' operation's input parameter must be 1..1 (operation: WRONG_PARAM_CARDINALITY)"),
            Collections.emptyList());
    }
    
    @Test
    void testDeleteOperationUnboundOperations() throws Exception {
      
    	final String MODEL_NAME = "model";
    	final String ACCESSPOINT_NAME = "ap";
    	final String EXPOSEDGRAPH_NAME = "eg";
    	final String WRONG_EXPOSEDGRAPH_NAME = "wrong_eg";
    	final String PARENT_ENTITY_TYPE  = "pe";
    	final String CHILD_ENTITY_TYPE  = "ce";
    	final String NAME_OF_ENTITY_TYPE_FOR_T1  = "e1";
    	final String NAME_OF_ENTITY_TYPE_FOR_T2 = "e2";
    	final String NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH  = "t1";
    	final String SELECTOR_NAME = "sn";
    	final String WRONG_SELECTOR_NAME = "wrong_sn";
    	final String PARENT_TRANSFER_OBJECT = "p";
    	final String CHILD_TRANSFER_OBJECT = "c";
    	final String NAME_OF_TRANSFER_RELATION_TARGET = "t2";
    	final String TRANSFER_OBJECT_RELATION = "r";
    	final String BOUND_OP = "bound";
    	
    	EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
    	
    	EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1)
    			.withSuperEntityTypes(p).build();
    	
    	EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE)
    			.withSuperEntityTypes(e1).build();
    	
    	EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
    	
    	MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
    			.withEntityType(p).build();
    	
    	MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH)
    			.withSuperTransferObjectTypes(pt)
    			.withEntityType(e1).build();

    	MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
    			.withSuperTransferObjectTypes(t1)
    			.withEntityType(c).build();
    	
    	MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_RELATION_TARGET)
    			.withEntityType(e2).build();
    	
    	TransferObjectRelation r = newTransferObjectRelationBuilder()
    			.withName(TRANSFER_OBJECT_RELATION)
    			.withTarget(t2)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	t1.getRelations().add(r);
    	
    	StaticNavigation sn = newStaticNavigationBuilder()
				.withName(SELECTOR_NAME)
				.withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph eg = newExposedGraphBuilder()
    					.withName(EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(t1)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(sn)
    					.build();
    	
    	StaticNavigation wrong_sn = newStaticNavigationBuilder()
				.withName(WRONG_SELECTOR_NAME)
				.withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph wrong_eg = newExposedGraphBuilder()
    					.withName(WRONG_EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(pt)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(wrong_sn)
    					.build();
    	
    	AccessPoint ap = newAccessPointBuilder().withName(ACCESSPOINT_NAME)
    			.withExposedGraphs(ImmutableList.of(eg,wrong_eg))
    			.build();
    	
    	e1.getOperations().add(
    			newBoundOperationBuilder().withName(BOUND_OP)
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withInstanceRepresentation(t1)
    				.build()
    			);
    	
    	final String WRONG_CONTAINER = "WRONG_CONTAINER";
    	final String WRONG_OWNER_TYPE = "WRONG_OWNER_TYPE";
    	final String WRONG_OWNER_MTO = "WRONG_OWNER_MTO";
    	final String UNDEFINED_INPUT = "UNDEFINED_INPUT";
    	final String DEFINED_OUTPUT = "DEFINED_OUTPUT";
    	final String WRONG_INPUT_NAME = "WRONG_INPUT_NAME";
    	final String WRONG_INPUT_TYPE = "WRONG_INPUT_TYPE";
    	final String WRONG_INPUT_CARDINALITY = "WRONG_INPUT_CARDINALITY";
    	final String DEFINED_RELATION = "DEFINED_RELATION";

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.DELETE)
							.withOwner(eg)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
				
					newUnboundOperationBuilder().withName(DEFINED_RELATION)
						.withBehaviour(newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.DELETE)
								.withOwner(eg)
								.withRelation(r)
								.build())
						.withInput(newParameterBuilder()
								.withName("input")
								.withType(t1)
								.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
								.build())
						.build(),
    			
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.DELETE)
    						.withOwner(pt)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.DELETE)
    						.withOwner(wrong_eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_INPUT)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.DELETE)
        						.withOwner(eg)
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(DEFINED_OUTPUT)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.DELETE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_INPUT_NAME)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.DELETE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("param")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.DELETE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.DELETE)
        						.withOwner(eg)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build())
        						.build())
        				.build()
    			));
    	
        Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(
                            e1,e2,t1,t2,ap,sn,ct,pt,c,p,wrong_sn)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"RelationOfDeleteBehaviourIsUndefined|Relation must be undefined for 'DELETE' operation: DEFINED_RELATION (in: t1)",
        		"OperationOfDeleteBehaviourIsValid|'DELETE' operation: WRONG_CONTAINER (in: t1) must be unbound operation",
        		"DeleteOperationInputParameterIsDefined|'DELETE' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT)",
        		"DeleteOperationInputTypeIsValid|Type of 'DELETE' operation's input parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_INPUT_TYPE)",
        		"DeleteOperationInputCardinalityIsValid|Cardinality of 'DELETE' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY)",
        		"OwnerOfDeleteBehaviourIsValid|Mapped transfer object of owner exposed graph of 'DELETE' operation: WRONG_OWNER_MTO (in: t1) must match the operation's container.",
        		"OwnerOfDeleteBehaviourIsExposedGraph|Owner of 'DELETE' operation: WRONG_OWNER_TYPE (in: t1) must be exposed graph.",
        		"DeleteOperationOutputParameterIsNotDefined|'DELETE' operation cannot have an output parameter (operation: DEFINED_OUTPUT)",
        		"DeleteOperationInputNameIsValid|'DELETE' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME)"),
            Collections.emptyList());
    }
    
    @Test
    void testSetUnsetAddAllRemoveAllOperationUnboundOperations() throws Exception {
      
    	EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
    	
    	EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1)
    			.withSuperEntityTypes(p).build();
    	
    	EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE)
    			.withSuperEntityTypes(e1).build();
    	
    	EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
    	
    	MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
    			.withEntityType(p).build();
    	
    	MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_OBJECT_OF_EXPOSED_GRAPH)
    			.withSuperTransferObjectTypes(pt)
    			.withEntityType(e1).build();

    	MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
    			.withSuperTransferObjectTypes(t1)
    			.withEntityType(c).build();
    	
    	MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(NAME_OF_TRANSFER_RELATION_TARGET)
    			.withEntityType(e2).build();
    	
    	TransferObjectRelation r = newTransferObjectRelationBuilder()
    			.withName(TRANSFER_OBJECT_RELATION)
    			.withTarget(t2)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	TransferObjectRelation wrong_r = newTransferObjectRelationBuilder()
    			.withName(WRONG_TRANSFER_OBJECT_RELATION)
    			.withTarget(t1)
    			.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    			.build();
    	
    	t1.getRelations().add(r);
    	t2.getRelations().add(wrong_r);
    	
    	StaticNavigation sn = newStaticNavigationBuilder()
				.withName(SELECTOR_NAME)
				.withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph eg = newExposedGraphBuilder()
    					.withName(EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(t1)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(sn)
    					.build();
    	
    	StaticNavigation wrong_sn = newStaticNavigationBuilder()
				.withName(WRONG_SELECTOR_NAME)
				.withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
				.build();
    	
    	ExposedGraph wrong_eg = newExposedGraphBuilder()
    					.withName(WRONG_EXPOSEDGRAPH_NAME)
    					.withMappedTransferObjectType(pt)
    					.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
    					.withSelector(wrong_sn)
    					.build();
    	
    	AccessPoint ap = newAccessPointBuilder().withName(ACCESSPOINT_NAME)
    			.withExposedGraphs(ImmutableList.of(eg,wrong_eg))
    			.build();
    	
    	e1.getOperations().add(
    			newBoundOperationBuilder().withName(BOUND_OP)
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.withInstanceRepresentation(t1)
    				.build()
    			);
    	
    	final String WRONG_CONTAINER_SET = "WRONG_CONTAINER_SET";
    	final String WRONG_OWNER_TYPE_SET = "WRONG_OWNER_TYPE_SET";
    	final String WRONG_OWNER_MTO_SET = "WRONG_OWNER_MTO_SET";
    	final String UNDEFINED_INPUT_SET = "UNDEFINED_INPUT_SET";
    	final String DEFINED_OUTPUT_SET = "DEFINED_OUTPUT_SET";
    	final String WRONG_INPUT_NAME_SET = "WRONG_INPUT_NAME_SET";
    	final String WRONG_INPUT_TYPE_SET = "WRONG_INPUT_TYPE_SET";
    	final String WRONG_INPUT_CARDINALITY_SET = "WRONG_INPUT_CARDINALITY_SET";
    	final String WRONG_RELATION_SET = "WRONG_RELATION_SET";
    	final String UNDEFINED_RELATION_SET = "UNDEFINED_RELATION_SET";

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER_SET)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
							.withOwner(eg)
							.withRelation(r)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
					
		    	newUnboundOperationBuilder().withName(UNDEFINED_RELATION_SET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    			
	    		newUnboundOperationBuilder().withName(WRONG_RELATION_SET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
    						.withOwner(eg)
    						.withRelation(wrong_r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
					
					
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE_SET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
    						.withOwner(pt)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO_SET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
    						.withOwner(wrong_eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_INPUT_SET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(DEFINED_OUTPUT_SET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_INPUT_NAME_SET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("param")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE_SET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_SET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build())
        						.build())
        				.build()
    			));
    	
    	final String WRONG_CONTAINER_UNSET = "WRONG_CONTAINER_UNSET";
    	final String WRONG_OWNER_TYPE_UNSET = "WRONG_OWNER_TYPE_UNSET";
    	final String WRONG_OWNER_MTO_UNSET = "WRONG_OWNER_MTO_UNSET";
    	final String UNDEFINED_INPUT_UNSET = "UNDEFINED_INPUT_UNSET";
    	final String DEFINED_OUTPUT_UNSET = "DEFINED_OUTPUT_UNSET";
    	final String WRONG_INPUT_NAME_UNSET = "WRONG_INPUT_NAME_UNSET";
    	final String WRONG_INPUT_TYPE_UNSET = "WRONG_INPUT_TYPE_UNSET";
    	final String WRONG_INPUT_CARDINALITY_UNSET = "WRONG_INPUT_CARDINALITY_UNSET";
    	final String WRONG_RELATION_UNSET = "WRONG_RELATION_UNSET";
    	final String UNDEFINED_RELATION_UNSET = "UNDEFINED_RELATION_UNSET";

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER_UNSET)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
							.withOwner(eg)
							.withRelation(r)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
					
		    	newUnboundOperationBuilder().withName(UNDEFINED_RELATION_UNSET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    			
	    		newUnboundOperationBuilder().withName(WRONG_RELATION_UNSET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
    						.withOwner(eg)
    						.withRelation(wrong_r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
					
					
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE_UNSET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
    						.withOwner(pt)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO_UNSET)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
    						.withOwner(wrong_eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_INPUT_UNSET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(DEFINED_OUTPUT_UNSET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_INPUT_NAME_UNSET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("param")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE_UNSET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_UNSET)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.UNSET_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build())
        						.build())
        				.build()
    			));

    	final String WRONG_CONTAINER_ADDALL = "WRONG_CONTAINER_ADDALL";
    	final String WRONG_OWNER_TYPE_ADDALL = "WRONG_OWNER_TYPE_ADDALL";
    	final String WRONG_OWNER_MTO_ADDALL = "WRONG_OWNER_MTO_ADDALL";
    	final String UNDEFINED_INPUT_ADDALL = "UNDEFINED_INPUT_ADDALL";
    	final String DEFINED_OUTPUT_ADDALL = "DEFINED_OUTPUT_ADDALL";
    	final String WRONG_INPUT_NAME_ADDALL = "WRONG_INPUT_NAME_ADDALL";
    	final String WRONG_INPUT_TYPE_ADDALL = "WRONG_INPUT_TYPE_ADDALL";
    	final String WRONG_INPUT_CARDINALITY_ADDALL = "WRONG_INPUT_CARDINALITY_ADDALL";
    	final String WRONG_RELATION_ADDALL = "WRONG_RELATION_ADDALL";
    	final String UNDEFINED_RELATION_ADDALL = "UNDEFINED_RELATION_ADDALL";

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER_ADDALL)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
							.withOwner(eg)
							.withRelation(r)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
					
		    	newUnboundOperationBuilder().withName(UNDEFINED_RELATION_ADDALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    			
	    		newUnboundOperationBuilder().withName(WRONG_RELATION_ADDALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
    						.withOwner(eg)
    						.withRelation(wrong_r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
					
					
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE_ADDALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
    						.withOwner(pt)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO_ADDALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
    						.withOwner(wrong_eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_INPUT_ADDALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(DEFINED_OUTPUT_ADDALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_INPUT_NAME_ADDALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("param")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE_ADDALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_ADDALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build())
        						.build())
        				.build()
    			));
    	
    	final String WRONG_CONTAINER_REMOVEALL = "WRONG_CONTAINER_REMOVEALL";
    	final String WRONG_OWNER_TYPE_REMOVEALL = "WRONG_OWNER_TYPE_REMOVEALL";
    	final String WRONG_OWNER_MTO_REMOVEALL = "WRONG_OWNER_MTO_REMOVEALL";
    	final String UNDEFINED_INPUT_REMOVEALL = "UNDEFINED_INPUT_REMOVEALL";
    	final String DEFINED_OUTPUT_REMOVEALL = "DEFINED_OUTPUT_REMOVEALL";
    	final String WRONG_INPUT_NAME_REMOVEALL = "WRONG_INPUT_NAME_REMOVEALL";
    	final String WRONG_INPUT_TYPE_REMOVEALL = "WRONG_INPUT_TYPE_REMOVEALL";
    	final String WRONG_INPUT_CARDINALITY_REMOVEALL = "WRONG_INPUT_CARDINALITY_REMOVEALL";
    	final String WRONG_RELATION_REMOVEALL = "WRONG_RELATION_REMOVEALL";
    	final String UNDEFINED_RELATION_REMOVEALL = "UNDEFINED_RELATION_REMOVEALL";

    	t1.getOperations().addAll(ImmutableList.of(
    			
    			newBoundTransferOperationBuilder().withName(WRONG_CONTAINER_REMOVEALL)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
							.withOwner(eg)
							.withRelation(r)
							.build())
					.withBinding(e1.getOperations().get(0))
					.withInput(newParameterBuilder()
							.withName("input")
							.withType(t1)
							.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
							.build())
					.build(),
					
		    	newUnboundOperationBuilder().withName(UNDEFINED_RELATION_REMOVEALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
    						.withOwner(eg)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    			
	    		newUnboundOperationBuilder().withName(WRONG_RELATION_REMOVEALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
    						.withOwner(eg)
    						.withRelation(wrong_r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
					
					
    			newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE_REMOVEALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
    						.withOwner(pt)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
        		newUnboundOperationBuilder().withName(WRONG_OWNER_MTO_REMOVEALL)
    				.withBehaviour(newTransferOperationBehaviourBuilder()
    						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
    						.withOwner(wrong_eg)
    						.withRelation(r)
    						.build())
    				.withInput(newParameterBuilder()
    						.withName("input")
    						.withType(t1)
    						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
    						.build())
    				.build(),
    				
    			newUnboundOperationBuilder().withName(UNDEFINED_INPUT_REMOVEALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(DEFINED_OUTPUT_REMOVEALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.withOutput(newParameterBuilder()
        						.withName("output")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(eg.getCardinality().getLower()).withUpper(eg.getCardinality().getUpper()).build())
        						.build())
        				.build(),
        				
        		newUnboundOperationBuilder().withName(WRONG_INPUT_NAME_REMOVEALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("param")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE_REMOVEALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(pt)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
        						.build())
        				.build(),
        				
            	newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_REMOVEALL)
        				.withBehaviour(newTransferOperationBehaviourBuilder()
        						.withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
        						.withOwner(eg)
        						.withRelation(r)
        						.build())
        				.withInput(newParameterBuilder()
        						.withName("input")
        						.withType(t1)
        						.withCardinality(newCardinalityBuilder().withLower(1).withUpper(2).build())
        						.build())
        				.build()
    			));
    	
        Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(
                            e1,e2,t1,t2,ap,sn,ct,pt,c,p,wrong_sn)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of(
        		"OwnerOfSetRelationBehaviourIsValid|Mapped transfer object of owner exposed graph of 'SET_RELATION' operation: WRONG_OWNER_MTO_SET (in: t1) must match the operation's container.",
        		"SetRelationOperationInputTypeIsValid|Type of 'SET_RELATION' operation's input parameter must be kind of referenced mapped transfer object type (operation: WRONG_INPUT_TYPE_SET)",
        		"RelationOfSetRelationBehaviourIsDefined|Relation must be defined for 'SET_RELATION' operation: UNDEFINED_RELATION_SET (in: t1)",
        		"RelationOfSetRelationBehaviourIsValid|Relation of 'SET_RELATION' operation: WRONG_RELATION_SET must be one of the transfer object type referenced by the operation's owner",
        		"OperationOfSetRelationBehaviourIsValid|'SET_RELATION' operation: WRONG_CONTAINER_SET (in: t1) must be owned by an unbound operation",
        		"SetRelationOperationInputParameterIsDefined|'SET_RELATION' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT_SET)",
        		"SetRelationOperationOutputParameterIsNotDefined|'SET_RELATION' operation cannot have an output parameter (operation: DEFINED_OUTPUT_SET)",
        		"OwnerOfSetRelationBehaviourIsExposedGraph|Owner of 'SET_RELATION' operation: WRONG_OWNER_TYPE_SET (in: t1) must be exposed graph.",
        		"SetRelationOperationInputNameIsValid|'SET_RELATION' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME_SET)",
        		"SetRelationOperationInputCardinalityIsValid|Cardinality of 'SET_RELATION' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY_SET)",
        		
        		"OwnerOfUnsetRelationBehaviourIsValid|Mapped transfer object of owner exposed graph of 'UNSET_RELATION' operation: WRONG_OWNER_MTO_UNSET (in: t1) must match the operation's container.",
        		"UnsetRelationOperationInputTypeIsValid|Type of 'UNSET_RELATION' operation's input parameter must be kind of referenced mapped transfer object type (operation: WRONG_INPUT_TYPE_UNSET)",
        		"RelationOfUnsetRelationBehaviourIsDefined|Relation must be defined for 'UNSET_RELATION' operation: UNDEFINED_RELATION_UNSET (in: t1)",
        		"RelationOfUnsetRelationBehaviourIsValid|Relation of 'UNSET_RELATION' operation: WRONG_RELATION_UNSET must be one of the transfer object type referenced by the operation's owner",
        		"OperationOfUnsetRelationBehaviourIsValid|'UNSET_RELATION' operation: WRONG_CONTAINER_UNSET (in: t1) must be owned by an unbound operation",
        		"UnsetRelationOperationInputParameterIsDefined|'UNSET_RELATION' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT_UNSET)",
        		"UnsetRelationOperationOutputParameterIsNotDefined|'UNSET_RELATION' operation cannot have an output parameter (operation: DEFINED_OUTPUT_UNSET)",
        		"OwnerOfUnsetRelationBehaviourIsExposedGraph|Owner of 'UNSET_RELATION' operation: WRONG_OWNER_TYPE_UNSET (in: t1) must be exposed graph.",
        		"UnsetRelationOperationInputNameIsValid|'UNSET_RELATION' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME_UNSET)",
        		"UnsetRelationOperationInputCardinalityIsValid|Cardinality of 'UNSET_RELATION' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY_UNSET)",
        		
        		"OwnerOfAddAllToRelationBehaviourIsValid|Mapped transfer object of owner exposed graph of 'ADD_ALL_TO_RELATION' operation: WRONG_OWNER_MTO_ADDALL (in: t1) must match the operation's container.",
        		"AddAllToRelationOperationInputTypeIsValid|Type of 'ADD_ALL_TO_RELATION' operation's input parameter must be kind of referenced mapped transfer object type (operation: WRONG_INPUT_TYPE_ADDALL)",
        		"RelationOfAddAllToRelationBehaviourIsDefined|Relation must be defined for 'ADD_ALL_TO_RELATION' operation: UNDEFINED_RELATION_ADDALL (in: t1)",
        		"RelationOfAddAllToRelationBehaviourIsValid|Relation of 'ADD_ALL_TO_RELATION' operation: WRONG_RELATION_ADDALL must be one of the transfer object type referenced by the operation's owner",
        		"OperationOfAddAllToRelationBehaviourIsValid|'ADD_ALL_TO_RELATION' operation: WRONG_CONTAINER_ADDALL (in: t1) must be owned by an unbound operation",
        		"AddAllToRelationOperationInputParameterIsDefined|'ADD_ALL_TO_RELATION' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT_ADDALL)",
        		"AddAllToRelationOperationOutputParameterIsNotDefined|'ADD_ALL_TO_RELATION' operation cannot have an output parameter (operation: DEFINED_OUTPUT_ADDALL)",
        		"OwnerOfAddAllToRelationBehaviourIsExposedGraph|Owner of 'ADD_ALL_TO_RELATION' operation: WRONG_OWNER_TYPE_ADDALL (in: t1) must be exposed graph.",
        		"AddAllToRelationOperationInputNameIsValid|'ADD_ALL_TO_RELATION' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME_ADDALL)",
        		"AddAllToRelationOperationInputCardinalityIsValid|Cardinality of 'ADD_ALL_TO_RELATION' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY_ADDALL)",
        		
        		"OwnerOfRemoveAllFromRelationBehaviourIsValid|Mapped transfer object of owner exposed graph of 'REMOVE_ALL_FROM_RELATION' operation: WRONG_OWNER_MTO_REMOVEALL (in: t1) must match the operation's container.",
        		"RemoveAllFromRelationOperationInputTypeIsValid|Type of 'REMOVE_ALL_FROM_RELATION' operation's input parameter must be kind of referenced mapped transfer object type (operation: WRONG_INPUT_TYPE_REMOVEALL)",
        		"RelationOfRemoveAllFromRelationBehaviourIsDefined|Relation must be defined for 'REMOVE_ALL_FROM_RELATION' operation: UNDEFINED_RELATION_REMOVEALL (in: t1)",
        		"RelationOfRemoveAllFromRelationBehaviourIsValid|Relation of 'REMOVE_ALL_FROM_RELATION' operation: WRONG_RELATION_REMOVEALL must be one of the transfer object type referenced by the operation's owner",
        		"OperationOfRemoveAllFromRelationBehaviourIsValid|'REMOVE_ALL_FROM_RELATION' operation: WRONG_CONTAINER_REMOVEALL (in: t1) must be owned by an unbound operation",
        		"RemoveAllFromRelationOperationInputParameterIsDefined|'REMOVE_ALL_FROM_RELATION' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT_REMOVEALL)",
        		"RemoveAllFromRelationOperationOutputParameterIsNotDefined|'REMOVE_ALL_FROM_RELATION' operation cannot have an output parameter (operation: DEFINED_OUTPUT_REMOVEALL)",
        		"OwnerOfRemoveAllFromRelationBehaviourIsExposedGraph|Owner of 'REMOVE_ALL_FROM_RELATION' operation: WRONG_OWNER_TYPE_REMOVEALL (in: t1) must be exposed graph.",
        		"RemoveAllFromRelationOperationInputNameIsValid|'REMOVE_ALL_FROM_RELATION' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME_REMOVEALL)",
        		"RemoveAllFromRelationOperationInputCardinalityIsValid|Cardinality of 'REMOVE_ALL_FROM_RELATION' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY_REMOVEALL)"),
        	Collections.emptyList());
    }

}
