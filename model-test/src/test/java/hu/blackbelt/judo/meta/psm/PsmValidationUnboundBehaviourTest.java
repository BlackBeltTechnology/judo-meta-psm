package hu.blackbelt.judo.meta.psm;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newBoundOperationBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.service.*;
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
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.util.builder.UnboundOperationBuilder;

class PsmValidationUnboundBehaviourTest {

	Logger logger = LoggerFactory.getLogger(PsmValidationUnboundBehaviourTest.class);

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	private PsmModel psmModel;
	private Log log = new Slf4jLog();

	@BeforeEach
	void setUp() {
		psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test").build();
	}

	private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
		try {
			Assertions.assertTrue(psmModel.isValid());
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

	final String MODEL_NAME = "model";
	final String ACCESSPOINT_NAME = "ap";
	final String EXPOSEDGRAPH_NAME = "eg";
	final String PARENT_ENTITY_TYPE = "pe";
	final String CHILD_ENTITY_TYPE = "ce";
	final String NAME_OF_ENTITY_TYPE_FOR_T1 = "e1";
	final String NAME_OF_ENTITY_TYPE_FOR_T2 = "e2";
	final String NAME_OF_ENTITY_TYPE_FOR_T3 = "e3";
	final String TRANSFER_OBJECT_1 = "t1";
	final String SELECTOR_NAME = "sn";
	final String PARENT_TRANSFER_OBJECT = "p";
	final String CHILD_TRANSFER_OBJECT = "c";
	final String TRANSFER_OBJECT_2 = "t2";
	final String TRANSFER_OBJECT_3 = "t3";
	final String TRANSFER_OBJECT_RELATION = "r";

	final String INPUT = "input";
	final String OUTPUT = "output";
	final String OPERATION = "OPERATION";

	final String GET_RANGE_VALID = "GET_RANGE_VALID";
	final String WRONG_OWNER = "WRONG_OWNER";
	
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
	final String DEFINED_OUTPUT = "DEFINED_OUTPUT";
	final String WRONG_OUTPUT_NAME = "WRONG_OUTPUT_NAME";
	final String WRONG_OUTPUT_TYPE = "WRONG_OUTPUT_TYPE";
	final String WRONG_OUTPUT_CARDINALITY = "WRONG_OUTPUT_CARDINALITY";
	final String DEFINED_RELATION = "DEFINED_RELATION";
	final String UNDEFINED_RELATION = "UNDEFINED_RELATION";
	final String UNDEFINED_PARAMS = "UNDEFINED_PARAMS";
	final String WRONG_PARAM_NAMES = "WRONG_PARAM_NAMES";
	final String WRONG_PARAM_TYPES = "WRONG_PARAM_TYPES";
	final String WRONG_PARAM_CARDINALITY = "WRONG_PARAM_CARDINALITY";
	final String WRONG_TRANSFER_OBJECT_RELATION = "wrong_r";
	final String UNDEFINED_INPUT = "UNDEFINED_INPUT";
	final String WRONG_INPUT_NAME = "WRONG_INPUT_NAME";
	final String WRONG_INPUT_TYPE = "WRONG_INPUT_TYPE";
	final String WRONG_INPUT_CARDINALITY = "WRONG_INPUT_CARDINALITY";
	final String WRONG_RELATION = "WRONG_RELATION";
	final String WRONG_RELATION_OPERATION = "WRONG_RELATION_OPERATION";

	final String UNDEFINED_OUTPUT_DEFINED_INPUT = "UNDEFINED_OUTPUT_DEFINED_INPUT";
	final String UNDEFINED_INPUT_DEFINED_OUTPUT = "UNDEFINED_INPUT_DEFINED_OUTPUT";

	private Parameter getParameterOfOperation(TransferObjectType t, String operationName, boolean output) {
		TransferOperation operation = t.getOperations().stream().filter(o -> o.getName().equals(operationName)).findAny().get();
		if (output) {
			return operation.getOutput();
		} else {
			return operation.getInput();
		}
	}
	
	private UnboundOperationBuilder unboundOperationDecorator(UnboundOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, boolean output, String paramName,
			TransferObjectType paramType, int paramLower, int paramUpper) {
		if (output) {
			return operation
					.withBehaviour(
							newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).build())
					.withOutput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build());
		} else {
			return operation
					.withBehaviour(
							newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).build())
					.withInput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build());
		}
	}

	private UnboundOperationBuilder unboundOperationDecorator(UnboundOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, String outputName, TransferObjectType outputType,
			int outputLower, int outputUpper, String inputName, TransferObjectType inputType, int inputLower,
			int inputUpper) {
		return operation
				.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).build())
				.withOutput(newParameterBuilder().withName(outputName).withType(outputType)
						.withCardinality(newCardinalityBuilder().withLower(outputLower).withUpper(outputUpper).build())
						.build())
				.withInput(newParameterBuilder().withName(inputName).withType(inputType)
						.withCardinality(newCardinalityBuilder().withLower(inputLower).withUpper(inputUpper).build())
						.build());
	}

	private UnboundOperationBuilder unboundOperationDecorator(UnboundOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, TransferObjectRelation relation, boolean output,
			String paramName, TransferObjectType paramType, int paramLower, int paramUpper) {
		if (output) {
			return operation
					.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner)
							.withRelation(relation).build())
					.withOutput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build());
		} else {
			return operation
					.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner)
							.withRelation(relation).build())
					.withInput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build());
		}
	}
	
	private UnboundOperationBuilder unboundOperationDecorator(UnboundOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, TransferObjectRelation relation, String outputName, TransferObjectType outputType,
			int outputLower, int outputUpper, String inputName, TransferObjectType inputType, int inputLower,
			int inputUpper) {
		return operation
				.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).withRelation(relation).build())
				.withOutput(newParameterBuilder().withName(outputName).withType(outputType)
						.withCardinality(newCardinalityBuilder().withLower(outputLower).withUpper(outputUpper).build())
						.build())
				.withInput(newParameterBuilder().withName(inputName).withType(inputType)
						.withCardinality(newCardinalityBuilder().withLower(inputLower).withUpper(inputUpper).build())
						.build());
	}

	@Test
	void testValidUnboundOperations() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();
		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName(SELECTOR_NAME).withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(EXPOSEDGRAPH_NAME).withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();
		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName(ACCESSPOINT_NAME).withRelations(owner).build();

		ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();

		t1.getOperations().addAll(ImmutableList.of(
				unboundOperationDecorator(newUnboundOperationBuilder().withName(GET_OPERATION_NAME),
						TransferOperationBehaviourType.GET, owner, true, OUTPUT, t1, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(CREATE_OPERATION_NAME),
						TransferOperationBehaviourType.CREATE, owner, OUTPUT, pt, 1, 1, INPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(UPDATE_OPERATION_NAME),
						TransferOperationBehaviourType.UPDATE, owner, OUTPUT, t1, 1, 1, INPUT, t1, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(DELETE_OPERATION_NAME),
						TransferOperationBehaviourType.DELETE, owner, false, INPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(SET_RELATION_OPERATION_NAME),
						TransferOperationBehaviourType.SET_RELATION, owner, relation, false, INPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(UNSET_RELATION_OPERATION_NAME),
						TransferOperationBehaviourType.UNSET_RELATION, owner, relation, false, INPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(ADD_ALL_TO_RELATION_OPERATION_NAME),
						TransferOperationBehaviourType.ADD_ALL_TO_RELATION, owner, relation, false, INPUT, ct, 1, 1).build(),

				unboundOperationDecorator(
						newUnboundOperationBuilder().withName(REMOVE_ALL_FROM_RELATION_OPERATION_NAME),
						TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION, owner, relation, false, INPUT, ct, 1, 1)
								.build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2, actor, ap, sn, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(Collections.emptyList(), Collections.emptyList());
	}

	@Test
	void testUnboundBehaviour() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withSuperEntityTypes(p).build();

		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();

		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();

		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();

		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		t1.getRelations().add(relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName(SELECTOR_NAME).withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(EXPOSEDGRAPH_NAME).withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();

		StaticNavigation wrong_sn = newStaticNavigationBuilder().withName(WRONG_SELECTOR_NAME).withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation wrong_eg = newTransferObjectRelationBuilder().withName(WRONG_EXPOSEDGRAPH_NAME)
				.withTarget(pt)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(wrong_sn)
				.build();

		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName(ACCESSPOINT_NAME)
				.withRelations(ImmutableList.of(owner, wrong_eg)).build();

		ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();

		e1.getOperations()
				.add(newBoundOperationBuilder().withName(BOUND_OP)
						.withOutput(newParameterBuilder().withName("output").withType(t1)
								.withCardinality(newCardinalityBuilder().withLower(owner.getCardinality().getLower())
										.withUpper(owner.getCardinality().getUpper()).build())
								.build())
						.withInstanceRepresentation(t1).build());

		t1.getOperations().addAll(ImmutableList.of(

				newBoundTransferOperationBuilder()

						.withName(WRONG_CONTAINER)
						.withBehaviour(newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.GET).withOwner(owner).build())
						.withBinding(e1.getOperations().get(0))
						.withOutput(newParameterBuilder().withName("output").withType(t1)
								.withCardinality(newCardinalityBuilder().withLower(owner.getCardinality().getLower())
										.withUpper(owner.getCardinality().getUpper()).build())
								.build())
						.build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE),
						TransferOperationBehaviourType.GET, pt, true, OUTPUT, t1, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OWNER_MTO),
						TransferOperationBehaviourType.GET, wrong_eg, true, OUTPUT, t1, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2, actor, ap, sn, ct, pt, c, p, wrong_sn)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"OperationIsValidUnboundBehaviour|'GET' operation: WRONG_CONTAINER (in: t1) must be owned by an unbound operation.",
				"OwnerIsRelationUnboundBehaviour|Owner of 'GET' operation: WRONG_OWNER_TYPE (in: t1) must be a relation."),
				Collections.emptyList());
	}

	@Test
	void testCreateUpdateUnboundOperations() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withSuperEntityTypes(p).build();

		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();

		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();

		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();

		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		t1.getRelations().add(relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName(SELECTOR_NAME).withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(EXPOSEDGRAPH_NAME).withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();

		StaticNavigation wrong_sn = newStaticNavigationBuilder().withName(WRONG_SELECTOR_NAME).withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation wrong_eg = newTransferObjectRelationBuilder().withName(WRONG_EXPOSEDGRAPH_NAME)
				.withTarget(pt)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(wrong_sn)
				.build();

		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName(ACCESSPOINT_NAME)
				.withRelations(ImmutableList.of(owner, wrong_eg)).build();

		ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();

		t1.getOperations().addAll(ImmutableList.of(

				unboundOperationDecorator(newUnboundOperationBuilder().withName(DEFINED_RELATION),
						TransferOperationBehaviourType.CREATE, owner, relation, true, OUTPUT, t1, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build(),

				newUnboundOperationBuilder().withName(UNDEFINED_PARAMS)
						.withBehaviour(newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.CREATE).withOwner(owner).build())
						.build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_PARAM_NAMES),
						TransferOperationBehaviourType.CREATE, owner, INPUT, pt, 1, 1, OUTPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_PARAM_TYPES),
						TransferOperationBehaviourType.CREATE, owner, OUTPUT, ct, 1, 1, INPUT, pt, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_PARAM_CARDINALITY),
						TransferOperationBehaviourType.CREATE, owner, OUTPUT, pt, 0, 1, INPUT, ct, 0, 1).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2, actor, ap, sn, ct, pt, c, p, wrong_sn)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"RelationIsUndefinedUnboundWithoutRelation|Relation must be undefined for 'CREATE' operation: DEFINED_RELATION (in: t1)",
				"CreateUpdateOperationOutputCardinalityIsValid|Cardinality of 'CREATE' operation's output parameter must be 1..1 (operation: WRONG_PARAM_CARDINALITY)",
				"CreateUpdateOperationOutputParameterIsDefined|'CREATE' operation must have an output parameter named 'output' (operation: UNDEFINED_PARAMS)",
				"CreateUpdateOperationOutputNameIsValid|'CREATE' operation's output parameter must be named 'output' (operation: WRONG_PARAM_NAMES)",
				"CreateUpdateOperationInputParameterIsDefined|'CREATE' operation must have an input parameter named 'input' (operation: UNDEFINED_PARAMS)",
				"CreateUpdateOperationInputNameIsValid|'CREATE' operation's input parameter must be named 'input' (operation: WRONG_PARAM_NAMES)",
				"CreateUpdateOperationInputTypeIsValid|Type of 'CREATE' operation's input parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_PARAM_TYPES)",
				"CreateUpdateOperationOutputTypeIsValid|Type of 'CREATE' operation's output parameter must be exposed graph's mapped transfer object type or its supertype (operation: WRONG_PARAM_TYPES)",
				"CreateUpdateOperationInputCardinalityIsValid|Cardinality of 'CREATE' operation's input parameter must be 1..1 (operation: WRONG_PARAM_CARDINALITY)"),
				Collections.emptyList());
	}

	@Test
	void testGetDeleteUnboundOperations() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withSuperEntityTypes(p).build();

		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();

		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();

		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();

		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		t1.getRelations().add(relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName(SELECTOR_NAME).withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(EXPOSEDGRAPH_NAME).withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();

		StaticNavigation wrong_sn = newStaticNavigationBuilder().withName(WRONG_SELECTOR_NAME).withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation wrong_eg = newTransferObjectRelationBuilder().withName(WRONG_EXPOSEDGRAPH_NAME)
				.withTarget(pt)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(wrong_sn)
				.build();

		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName(ACCESSPOINT_NAME)
				.withRelations(ImmutableList.of(owner, wrong_eg)).build();

		ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();

		t1.getOperations().addAll(ImmutableList.of(

				unboundOperationDecorator(newUnboundOperationBuilder().withName(UNDEFINED_OUTPUT_DEFINED_INPUT),
						TransferOperationBehaviourType.GET, owner, false, OUTPUT, t1, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OUTPUT_NAME),
						TransferOperationBehaviourType.GET, owner, true, INPUT, t1, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OUTPUT_TYPE),
						TransferOperationBehaviourType.GET, owner, true, OUTPUT, pt, owner.getCardinality().getLower(),
						owner.getCardinality().getUpper()).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OUTPUT_CARDINALITY),
						TransferOperationBehaviourType.GET, owner, true, OUTPUT, t1, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(UNDEFINED_INPUT_DEFINED_OUTPUT),
						TransferOperationBehaviourType.DELETE, owner, true, OUTPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_INPUT_NAME),
						TransferOperationBehaviourType.DELETE, owner, false, OUTPUT, ct, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE),
						TransferOperationBehaviourType.DELETE, owner, false, INPUT, pt, 1, 1).build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY),
						TransferOperationBehaviourType.DELETE, owner, false, INPUT, ct, 0, -1).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2, actor, ap, sn, ct, pt, c, p, wrong_sn)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"DeleteOperationInputParameterIsDefined|'DELETE' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT_DEFINED_OUTPUT)",
				"DeleteOperationInputTypeIsValid|Type of 'DELETE' operation's input parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_INPUT_TYPE)",
				"DeleteOperationInputCardinalityIsValid|Cardinality of 'DELETE' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY)",
				"DeleteOperationOutputParameterIsNotDefined|'DELETE' operation cannot have an output parameter (operation: UNDEFINED_INPUT_DEFINED_OUTPUT)",
				"DeleteOperationInputNameIsValid|'DELETE' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME)",
				"GetOperationOutputParameterIsDefined|'GET' operation must have an output parameter named 'output' (operation: UNDEFINED_OUTPUT_DEFINED_INPUT)",
				"GetOperationOutputTypeIsValid|Type of 'GET' operation's output parameter must be kind of exposed graph's mapped transfer object type (operation: WRONG_OUTPUT_TYPE)",
				"GetOperationOutputCardinalityIsValid|Cardinality of 'GET' operation's output parameter must be the same as its owner's (operation: WRONG_OUTPUT_CARDINALITY)",
				"GetOperationInputCardinalityIsValid|Cardinality of 'GET' operation's input parameter must be 0..1",
				"GetOperationInputNameIsValid|'GET' operation's input parameter must be named 'input' (operation: UNDEFINED_OUTPUT_DEFINED_INPUT)",
				"GetOperationOutputNameIsValid|'GET' operation's output parameter must be named 'output' (operation: WRONG_OUTPUT_NAME)"),
				Collections.emptyList());
	}

	@Test
	void testSetUnsetAddAllRemoveAllOperationUnboundOperations() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withSuperEntityTypes(p).build();

		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();

		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();

		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();

		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation wrong_relation = newTransferObjectRelationBuilder().withName(WRONG_TRANSFER_OBJECT_RELATION)
				.withTarget(t1).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		t1.getRelations().add(relation);
		t2.getRelations().add(wrong_relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName(SELECTOR_NAME).withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(EXPOSEDGRAPH_NAME).withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();

		StaticNavigation wrong_sn = newStaticNavigationBuilder().withName(WRONG_SELECTOR_NAME).withTarget(p)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();

		TransferObjectRelation wrong_owner = newTransferObjectRelationBuilder().withName(WRONG_EXPOSEDGRAPH_NAME)
				.withTarget(pt)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(wrong_sn)
				.build();

		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName(ACCESSPOINT_NAME)
				.withRelations(ImmutableList.of(owner, wrong_owner)).build();

		ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();

		t1.getOperations().addAll(ImmutableList.of(
				unboundOperationDecorator(newUnboundOperationBuilder().withName(UNDEFINED_RELATION),
						TransferOperationBehaviourType.SET_RELATION, owner, false, INPUT, ct, 1, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_RELATION),
						TransferOperationBehaviourType.SET_RELATION, owner, wrong_relation, false, INPUT, ct, 1, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(UNDEFINED_INPUT_DEFINED_OUTPUT),
						TransferOperationBehaviourType.SET_RELATION, owner, relation, true, OUTPUT, ct, 1, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_INPUT_NAME),
						TransferOperationBehaviourType.SET_RELATION, owner, relation, false, OUTPUT, ct, 1, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_INPUT_TYPE),
						TransferOperationBehaviourType.SET_RELATION, owner, relation, false, INPUT, pt, 1, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_INPUT_CARDINALITY),
						TransferOperationBehaviourType.SET_RELATION, owner, relation, false, INPUT, t1, 0, 1).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2, actor, ap, sn, ct, pt, c, p, wrong_sn)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"InputTypeIsValidUnboundWithRelation|Type of 'SET_RELATION' operation's input parameter must be kind of referenced mapped transfer object type (operation: WRONG_INPUT_TYPE).",
				"RelationIsDefinedUnboundWithRelation|Relation must be defined for 'SET_RELATION' operation: UNDEFINED_RELATION (in: t1).",
				"RelationIsValidUnboundWithRelation|Relation of 'SET_RELATION' operation: WRONG_RELATION must be one of the transfer object type referenced by the operation's owner.",
				"InputParameterIsDefinedUnboundWithRelation|'SET_RELATION' operation must have an input parameter named 'input' (operation: UNDEFINED_INPUT_DEFINED_OUTPUT).",
				"OutputParameterIsNotDefinedUnboundWithRelation|'SET_RELATION' operation cannot have an output parameter (operation: UNDEFINED_INPUT_DEFINED_OUTPUT).",
				"InputNameIsValidUnboundWithRelation|'SET_RELATION' operation's input parameter must be named 'input' (operation: WRONG_INPUT_NAME).",
				"InputCardinalityIsValidUnboundWithRelation|Cardinality of 'SET_RELATION' operation's input parameter must be 1..1 (operation: WRONG_INPUT_CARDINALITY)."),
				Collections.emptyList());
	}
	
	@Test
	void testGetRangeBehaviourUnbound() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withEntityType(e1)
				.build();
		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();
		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();
		
		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t3)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t2.getRelations().add(relation);
		
		TransferObjectRelation wrong_relation = newTransferObjectRelationBuilder().withName(WRONG_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(wrong_relation);
		
		t1.getOperations().addAll(ImmutableList.of(
				
				newUnboundOperationBuilder().withName(OPERATION).withInput(newParameterBuilder().withName(INPUT)
						.withType(t2).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build())
						.withOutput(newParameterBuilder().withName(OUTPUT)
						.withType(t2).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build())
						.withImplementation(newOperationBodyBuilder().build()).build()
				
		));
		
		t1.getOperations().addAll(ImmutableList.of(	
				
				unboundOperationDecorator(newUnboundOperationBuilder().withName(GET_RANGE_VALID),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, 
						getParameterOfOperation(t1, OPERATION , false), relation, OUTPUT, t3, 0, -1, INPUT, t2, 0, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OWNER_TYPE),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, 
						relation, relation, OUTPUT, t3, 0, -1, INPUT, t2, 0, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_OWNER),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, 
						getParameterOfOperation(t1, OPERATION , true), relation, OUTPUT, t3, 0, -1, INPUT, t2, 0, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(UNDEFINED_RELATION),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, 
						getParameterOfOperation(t1, OPERATION, false), OUTPUT, t3, 0, -1, INPUT, t2, 0, 1).build(),
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_RELATION_OPERATION),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, 
						getParameterOfOperation(t1, OPERATION, false), wrong_relation, OUTPUT, t3, 0, -1, INPUT, t2, 0, 1).build(),
				
				newUnboundOperationBuilder().withName(UNDEFINED_PARAMS)
				.withBehaviour(newTransferOperationBehaviourBuilder()
						.withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
						.withRelation(relation)
						.withOwner(getParameterOfOperation(t1, OPERATION , false)).build())
				.build(),

				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_PARAM_NAMES),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION,
						getParameterOfOperation(t1, OPERATION, false),relation, INPUT, t3, 0, -1, OUTPUT, t2, 0, 1).build(),
		
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_PARAM_TYPES),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION,
						getParameterOfOperation(t1, OPERATION , false),relation, OUTPUT, t1, 0, -1, INPUT, t3, 0, 1).build(),
		
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_PARAM_CARDINALITY),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION,
						getParameterOfOperation(t1, OPERATION, false),relation, OUTPUT, t3, 0, 1, INPUT, t2, 1, 1).build()
				
				));
		
		t2.getOperations().addAll(ImmutableList.of(	
				unboundOperationDecorator(newUnboundOperationBuilder().withName(WRONG_CONTAINER),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, 
						getParameterOfOperation(t1, OPERATION, false), relation, OUTPUT, t3, 0, -1, INPUT, t1, 0, 1).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, t2, t3)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				
				"GetRangeOperationOutputCardinalityIsValid|Cardinality of 'GET_RANGE_OF_RELATION' operation's output parameter must be 0..* (operation: WRONG_PARAM_CARDINALITY)",
				"GetRangeUnboundOperationInputTypeIsValid|Type of 'GET_RANGE_OF_RELATION' operation's input parameter must match the related input parameter type (operation: WRONG_PARAM_TYPES)",
				"ContainerOfGetRangeIsValid|Container of 'GET_RANGE_OF_RELATION' behaviour typed parameter is invalid (operation: WRONG_CONTAINER)",
				"GetRangeOperationOutputTypeIsValid|Type of 'GET_RANGE_OF_RELATION' operation's output parameter must be the target of it's relation (operation: WRONG_PARAM_TYPES)",
				"GetRangeOperationInputNameIsValid|'GET_RANGE_OF_RELATION' operation's input parameter must be named 'input' (operation: WRONG_PARAM_NAMES)",
				"GetRangeOperationOutputNameIsValid|'GET_RANGE_OF_RELATION' operation's output parameter must be named 'output' (operation: WRONG_PARAM_NAMES)",
				"OwnerOfGetRangeOfRelationBehaviourIsValid|Owner of 'GET_RANGE_OF_RELATION' must be the input parameter of an operation in it's container (operation: WRONG_OWNER)",
				"RelationOfGetRangeOfRelationBehaviourIsDefined|Relation for 'GET_RANGE_OF_RELATION' behaviour type must be defined (operation: UNDEFINED_RELATION)",
				"OwnerOfGetRangeOfRelationBehaviourIsParameter|Owner of 'GET_RANGE_OF_RELATION' behaviour type must be a parameter (operation: WRONG_OWNER_TYPE)",
				"RelationOfGetRangeOfRelationBehaviourIsValid|Relation for 'GET_RANGE_OF_RELATION' behaviour type must belong to the operation owner's type (operation: WRONG_RELATION_OPERATION)",
				"GetRangeOperationInputParameterIsDefined|'GET_RANGE_OF_RELATION' operation: UNDEFINED_PARAMS must have an input parameter named 'input'",
				"GetRangeOperationOutputParameterIsDefined|'GET_RANGE_OF_RELATION' operation must have an output parameter named 'output' (operation: UNDEFINED_PARAMS)",
				"GetRangeOperationInputCardinalityIsValid|Cardinality of 'GET_RANGE_OF_RELATION' operation's input parameter must be 0..1 (operation: WRONG_PARAM_CARDINALITY)"),
				Collections.emptyList());
	}
	
	@Test
	void testGetTemplateBehaviourUnbound() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withEntityType(e1)
				.build();
		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();
		
		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(relation);
		
		e1.getOperations().addAll(ImmutableList.of(
				newBoundOperationBuilder().withName(OPERATION).withInstanceRepresentation(t1)
						.withImplementation(newOperationBodyBuilder().build()).build()));
		
		t1.getOperations().addAll(ImmutableList.of(	
				
				newBoundTransferOperationBuilder().withName(WRONG_CONTAINER)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.GET_TEMPLATE)
							.withOwner(t2)
							.build())
					.withBinding(e1.getOperations().get(0))
					.build(),
					
				newUnboundOperationBuilder().withName(WRONG_OWNER)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.GET_TEMPLATE)
							.withOwner(e1)
							.build()).build(),
					
				newUnboundOperationBuilder().withName(DEFINED_RELATION)
					.withBehaviour(newTransferOperationBehaviourBuilder()
							.withBehaviourType(TransferOperationBehaviourType.GET_TEMPLATE)
							.withOwner(t2)
							.withRelation(relation)
							.build()).build()
					));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"RelationOfGetTemplateBehaviourIsUndefined|Relation for 'GET_TEMPLATE' behaviour types must be undefined",
				"OperationOfGetTemplateBehaviourIsValid|'GET_TEMPLATE' behaviour type must be owned by unbound operation",
				"OwnerOfGetTemplateBehaviourIsValid|Owner of 'GET_TEMPLATE' behaviour must be a transfer object type"),
				Collections.emptyList());
	}
	
	@Test
	void testCreateTargetIsNotAbstract() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).withAbstract_(true).build();
		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withAbstract_(true).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder()
				.withName(TRANSFER_OBJECT_1).withSuperTransferObjectTypes(pt).withEntityType(e1)
				.build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();
		MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION).withTarget(t2)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(relation);

		StaticNavigation sn = newStaticNavigationBuilder().withName(SELECTOR_NAME).withTarget(e1)
				.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("model::e1"))
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(EXPOSEDGRAPH_NAME).withTarget(t1)
				.withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).withBinding(sn).build();

		UnmappedTransferObjectType ap = newUnmappedTransferObjectTypeBuilder().withName(ACCESSPOINT_NAME)
				.withRelations(ImmutableList.of(owner)).build();

		ActorType actor = newActorTypeBuilder().withName("Actor").withTransferObjectType(ap).build();

		t1.getOperations().addAll(ImmutableList.of(

				unboundOperationDecorator(newUnboundOperationBuilder().withName(CREATE_OPERATION_NAME),
						TransferOperationBehaviourType.CREATE, owner, OUTPUT, pt, 1, 1, INPUT, ct, 1, 1).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, t1, t2, actor, ap, sn, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of("CreateTargetIsNotAbstract|Owner of 'CREATE' operation cannot reference the mapped transfer object of an abstract entity type."), Collections.emptyList());
	}
}
