package hu.blackbelt.judo.meta.psm;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newAccessPointBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newExposedGraphBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newBoundOperationBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
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
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
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
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.util.builder.BoundOperationBuilder;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.util.builder.BoundTransferOperationBuilder;

class PsmValidationBoundBehaviourTest {

	Logger logger = LoggerFactory.getLogger(PsmValidationBoundBehaviourTest.class);

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

	final String PARENT_ENTITY_TYPE = "pe";
	final String CHILD_ENTITY_TYPE = "ce";

	final String NAME_OF_ENTITY_TYPE_FOR_T1 = "e1";
	final String NAME_OF_ENTITY_TYPE_FOR_T2 = "e2";
	final String NAME_OF_ENTITY_TYPE_FOR_T3 = "e3";

	final String TRANSFER_OBJECT_1 = "t1";
	final String TRANSFER_OBJECT_2 = "t2";
	final String TRANSFER_OBJECT_3 = "t3";

	final String TRANSFER_OBJECT_RELATION_1 = "r1";
	final String TRANSFER_OBJECT_RELATION_2 = "r2";

	final String PARENT_TRANSFER_OBJECT = "p";
	final String CHILD_TRANSFER_OBJECT = "c";

	final String INPUT = "input";
	final String OUTPUT = "output";

	final String GET_RELATION_BINDING = "GET_RELATION_BINDING";
	final String GET_RELATION = "GET_RELATION";

	final String CREATE_RELATION_BINDING = "CREATE_RELATION_BINDING";
	final String CREATE_RELATION = "CREATE_RELATION";

	final String UPDATE_RELATION_BINDING = "UPDATE_RELATION_BINDING";
	final String UPDATE_RELATION = "UPDATE_RELATION";

	final String DELETE_RELATION_BINDING = "DELETE_RELATION_BINDING";
	final String DELETE_RELATION = "DELETE_RELATION";

	final String SET_RELATION_OF_RELATION_BINDING = "SET_RELATION_OF_RELATION_BINDING";
	final String SET_RELATION_OF_RELATION = "SET_RELATION_OF_RELATION";

	final String UNSET_RELATION_OF_RELATION_BINDING = "UNSET_RELATION_OF_RELATION_BINDING";
	final String UNSET_RELATION_OF_RELATION = "UNSET_RELATION_OF_RELATION";

	final String ADD_ALL_TO_RELATION_OF_RELATION_BINDING = "ADD_ALL_TO_RELATION_OF_RELATION_BINDING";
	final String ADD_ALL_TO_RELATION_OF_RELATION = "ADD_ALL_TO_RELATION_OF_RELATION";

	final String REMOVE_ALL_FROM_RELATION_OF_RELATION_BINDING = "REMOVE_ALL_FROM_RELATION_OF_RELATION_BINDING";
	final String REMOVE_ALL_FROM_RELATION_OF_RELATION = "REMOVE_ALL_FROM_RELATION_OF_RELATION";

	final String WRONG_CONTAINER = "WRONG_CONTAINER";
	final String WRONG_OWNER_TYPE = "WRONG_OWNER_TYPE";
	final String WRONG_OWNER_RELATION = "WRONG_OWNER_RELATION";

	final String DEFINED_RELATION = "DEFINED_RELATION";
	final String DEFINED_RELATION_BINDING = "DEFINED_RELATION_BINDING";

	final String DEFINED_INPUT = "DEFINED_INPUT";
	final String DEFINED_INPUT_BINDING = "DEFINED_INPUT_BINDING";

	final String UNDEFINED_OUTPUT = "UNDEFINED_OUTPUT";
	final String UNDEFINED_OUTPUT_BINDING = "UNDEFINED_OUTPUT_BINDING";

	final String WRONG_OUTPUT_NAME = "WRONG_OUTPUT_NAME";
	final String WRONG_OUTPUT_NAME_BINDING = "WRONG_OUTPUT_NAME_BINDING";

	final String WRONG_OUTPUT_TYPE = "WRONG_OUTPUT_TYPE";
	final String WRONG_OUTPUT_TYPE_BINDING = "WRONG_OUTPUT_TYPE_BINDING";

	final String WRONG_OUTPUT_CARDINALITY = "WRONG_OUTPUT_CARDINALITY";
	final String WRONG_OUTPUT_CARDINALITY_BINDING = "WRONG_OUTPUT_CARDINALITY_BINDING";

	final String DEFINED_OUTPUT = "DEFINED_OUTPUT";
	final String UNDEFINED_INPUT = "UNDEFINED_INPUT";
	final String WRONG_INPUT_NAME = "WRONG_INPUT_NAME";
	final String WRONG_INPUT_TYPE = "WRONG_INPUT_TYPE";
	final String WRONG_INPUT_CARDINALITY = "WRONG_INPUT_CARDINALITY";

	final String DEFINED_OUTPUT_BINDING = "DEFINED_OUTPUT_BINDING";
	final String UNDEFINED_INPUT_BINDING = "UNDEFINED_INPUT_BINDING";
	final String WRONG_INPUT_NAME_BINDING = "WRONG_INPUT_NAME_BINDING";
	final String WRONG_INPUT_TYPE_BINDING = "WRONG_INPUT_TYPE_BINDING";
	final String WRONG_INPUT_CARDINALITY_BINDING = "WRONG_INPUT_CARDINALITY_BINDING";
	
	final String UNDEFINED_RELATION = "UNDEFINED_RELATION";
	final String UNDEFINED_RELATION_BINDING = "UNDEFINED_RELATION_BINDING";
	final String WRONG_RELATION = "WRONG_RELATION";
	final String WRONG_RELATION_BINDING = "WRONG_RELATION_BINDING";
	
	final String WRONG_PARAM_NAME = "WRONG_PARAM_NAME";
	
	final String TRANSFER_OBJECT_RELATION = "TRANSFER_OBJECT_RELATION";
	final String OWNER_OPERATION = "OWNER_OPERATION";

	private BoundOperation getBoundOperationByName(final EntityType entityType, final String name) {
		return entityType.getOperations().stream().filter(o -> o.getName().equals(name)).findAny().get();
	}

	private BoundTransferOperationBuilder boundTransferOperationDecorator(BoundTransferOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, BoundOperation binding, boolean output,
			String paramName, TransferObjectType paramType, int paramLower, int paramUpper) {
		if (output) {
			return operation
					.withBehaviour(
							newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).build())
					.withOutput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build())
					.withBinding(binding);
		} else {
			return operation
					.withBehaviour(
							newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).build())
					.withInput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build())
					.withBinding(binding);
		}
	}

	private BoundTransferOperationBuilder boundTransferOperationDecorator(BoundTransferOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, BoundOperation binding, String outputName,
			TransferObjectType outputType, int outputLower, int outputUpper, String inputName,
			TransferObjectType inputType, int inputLower, int inputUpper) {
		return operation
				.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner).build())
				.withOutput(newParameterBuilder().withName(outputName).withType(outputType)
						.withCardinality(newCardinalityBuilder().withLower(outputLower).withUpper(outputUpper).build())
						.build())
				.withInput(newParameterBuilder().withName(inputName).withType(inputType)
						.withCardinality(newCardinalityBuilder().withLower(inputLower).withUpper(inputUpper).build())
						.build())
				.withBinding(binding);
	}

	private BoundTransferOperationBuilder boundTransferOperationDecorator(BoundTransferOperationBuilder operation,
			TransferOperationBehaviourType type, NamedElement owner, TransferObjectRelation relation,
			BoundOperation binding, boolean output, String paramName, TransferObjectType paramType, int paramLower,
			int paramUpper) {
		if (output) {
			return operation
					.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner)
							.withRelation(relation).build())
					.withOutput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build())
					.withBinding(binding);
		} else {
			return operation
					.withBehaviour(newTransferOperationBehaviourBuilder().withBehaviourType(type).withOwner(owner)
							.withRelation(relation).build())
					.withInput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build())
					.withBinding(binding);
		}
	}

	private BoundOperationBuilder boundOperationDecorator(BoundOperationBuilder operation,
			MappedTransferObjectType representation, boolean output, String paramName, TransferObjectType paramType,
			int paramLower, int paramUpper) {
		if (output) {
			return operation.withInstanceRepresentation(representation)
					.withOutput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build());
		} else {
			return operation.withInstanceRepresentation(representation)
					.withInput(newParameterBuilder().withName(paramName).withType(paramType)
							.withCardinality(
									newCardinalityBuilder().withLower(paramLower).withUpper(paramUpper).build())
							.build());
		}
	}

	private BoundOperationBuilder boundOperationDecorator(BoundOperationBuilder operation,
			MappedTransferObjectType representation, String outputName, TransferObjectType outputType, int outputLower,
			int outputUpper, String inputName, TransferObjectType inputType, int inputLower, int inputUpper) {
		return operation.withInstanceRepresentation(representation)
				.withOutput(newParameterBuilder().withName(outputName).withType(outputType)
						.withCardinality(newCardinalityBuilder().withLower(outputLower).withUpper(outputUpper).build())
						.build())
				.withInput(newParameterBuilder().withName(inputName).withType(inputType)
						.withCardinality(newCardinalityBuilder().withLower(inputLower).withUpper(inputUpper).build())
						.build());
	}

	@Test
	void testValidBoundBehaviour() throws Exception {

		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e1).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_1)
				.withSuperTransferObjectTypes(pt).withEntityType(e1).build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(t1).withEntityType(c).build();
		MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();
		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_1)
				.withTarget(type).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(owner);

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_2)
				.withTarget(t3).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		type.getRelations().add(relation);

		e1.getOperations().addAll(ImmutableList.of(
				boundOperationDecorator(newBoundOperationBuilder().withName(GET_RELATION_BINDING), t1, true, OUTPUT,
						type, owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(CREATE_RELATION_BINDING), t1, OUTPUT, type,
						1, 1, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UPDATE_RELATION_BINDING), t1, OUTPUT, type,
						1, 1, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(DELETE_RELATION_BINDING), t1, false, INPUT,
						type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(SET_RELATION_OF_RELATION_BINDING), t1,
						false, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UNSET_RELATION_OF_RELATION_BINDING), t1,
						false, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(ADD_ALL_TO_RELATION_OF_RELATION_BINDING),
						t1, false, INPUT, type, 1, 1).build(),
				boundOperationDecorator(
						newBoundOperationBuilder().withName(REMOVE_ALL_FROM_RELATION_OF_RELATION_BINDING), t1, false,
						INPUT, type, 1, 1).build()));

		t1.getOperations().addAll(ImmutableList.of(

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(GET_RELATION),
						TransferOperationBehaviourType.GET_RELATION, owner,
						getBoundOperationByName(e1, GET_RELATION_BINDING), true, OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(CREATE_RELATION),
						TransferOperationBehaviourType.CREATE_RELATION, owner,
						getBoundOperationByName(e1, CREATE_RELATION_BINDING), OUTPUT, type, 1, 1, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UPDATE_RELATION),
						TransferOperationBehaviourType.UPDATE_RELATION, owner,
						getBoundOperationByName(e1, UPDATE_RELATION_BINDING), OUTPUT, type, 1, 1, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(DELETE_RELATION),
						TransferOperationBehaviourType.DELETE_RELATION, owner,
						getBoundOperationByName(e1, DELETE_RELATION_BINDING), false, INPUT, type, 1, 1).build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(SET_RELATION_OF_RELATION),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, SET_RELATION_OF_RELATION_BINDING), false, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNSET_RELATION_OF_RELATION),
						TransferOperationBehaviourType.UNSET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, UNSET_RELATION_OF_RELATION_BINDING), false, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(
						newBoundTransferOperationBuilder().withName(ADD_ALL_TO_RELATION_OF_RELATION),
						TransferOperationBehaviourType.ADD_ALL_TO_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, ADD_ALL_TO_RELATION_OF_RELATION_BINDING), false, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(
						newBoundTransferOperationBuilder().withName(REMOVE_ALL_FROM_RELATION_OF_RELATION),
						TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, REMOVE_ALL_FROM_RELATION_OF_RELATION_BINDING), false, INPUT, type,
						1, 1).build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, type, t3, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(Collections.emptyList(), Collections.emptyList());
	}

	@Test
	void testBoundBehaviour() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_1)
				.withEntityType(e1).build();
		MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withEntityType(e2).build();
		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_1)
				.withTarget(type).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(owner);

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_2)
				.withTarget(t3).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		type.getRelations().add(relation);

		e1.getOperations().addAll(ImmutableList.of(

				boundOperationDecorator(newBoundOperationBuilder().withName(CREATE_RELATION_BINDING), t1, OUTPUT, type,
						1, 1, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UPDATE_RELATION_BINDING), t1, OUTPUT, type,
						1, 1, INPUT, type, 1, 1).build()));

		t1.getOperations().addAll(ImmutableList.of(

				newUnboundOperationBuilder().withName(WRONG_CONTAINER)
						.withBehaviour(newTransferOperationBehaviourBuilder()
								.withBehaviourType(TransferOperationBehaviourType.GET_RELATION).withOwner(owner)
								.build())
						.withOutput(newParameterBuilder().withName(OUTPUT).withType(type)
								.withCardinality(newCardinalityBuilder().withLower(owner.getCardinality().getLower())
										.withUpper(owner.getCardinality().getUpper()).build())
								.build())
						.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OWNER_TYPE),
						TransferOperationBehaviourType.CREATE_RELATION, t3,
						getBoundOperationByName(e1, CREATE_RELATION_BINDING), OUTPUT, type, 1, 1, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OWNER_RELATION),
						TransferOperationBehaviourType.UPDATE_RELATION, relation,
						getBoundOperationByName(e1, UPDATE_RELATION_BINDING), OUTPUT, type, 1, 1, INPUT, type, 1, 1)
								.build()

		));

		Model model = newModelBuilder().withName(MODEL_NAME).withElements(ImmutableList.of(e1, e2, e3, t1, type, t3))
				.build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"OwnerIsValidBoundBehaviour|Owner of 'UPDATE_RELATION' behaviour  (t1.WRONG_OWNER_RELATION) must be a transfer object relation inherited or owned by the transfer object type containing the operation",
				"OperationIsValidBoundBehaviour|'GET_RELATION' operation: WRONG_CONTAINER (in: t1) must be owned by an bound transfer operation.",
				"OwnerIsRelationBoundBehaviour|Owner of 'CREATE_RELATION' behaviour  (t1.WRONG_OWNER_TYPE) must be a transfer object relation"),
				Collections.emptyList());
	}

	@Test
	void testValidBoundBehaviourWithoutRelationGet() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_1)
				.withEntityType(e1).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withSuperTransferObjectTypes(pt).withEntityType(e2).build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(type).withEntityType(c).build();

		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_1)
				.withTarget(type).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(owner);

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_2)
				.withTarget(t3).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		type.getRelations().add(relation);

		e1.getOperations().addAll(ImmutableList.of(
				boundOperationDecorator(newBoundOperationBuilder().withName(GET_RELATION_BINDING), t1, true, OUTPUT,
						type, owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(DEFINED_INPUT_BINDING), t1, OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper(), INPUT, type, 1, 1)
								.build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UNDEFINED_OUTPUT_BINDING), t1, false, INPUT,
						type, owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_OUTPUT_NAME_BINDING), t1, true, INPUT,
						type, owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_OUTPUT_TYPE_BINDING), t1, true,
						OUTPUT, pt, owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_OUTPUT_CARDINALITY_BINDING), t1, true,
						OUTPUT, type, 1, 1).build()));

		t1.getOperations().addAll(ImmutableList.of(

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(DEFINED_RELATION),
						TransferOperationBehaviourType.GET_RELATION, owner, relation,
						getBoundOperationByName(e1, GET_RELATION_BINDING), true, OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(DEFINED_INPUT),
						TransferOperationBehaviourType.GET_RELATION, owner,
						getBoundOperationByName(e1, DEFINED_INPUT_BINDING), OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper(), INPUT, type, 1, 1)
								.build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNDEFINED_OUTPUT),
						TransferOperationBehaviourType.GET_RELATION, owner,
						getBoundOperationByName(e1, UNDEFINED_OUTPUT_BINDING), false, INPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OUTPUT_NAME),
						TransferOperationBehaviourType.GET_RELATION, owner,
						getBoundOperationByName(e1, WRONG_OUTPUT_NAME_BINDING), true, INPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OUTPUT_TYPE),
						TransferOperationBehaviourType.GET_RELATION, owner,
						getBoundOperationByName(e1, WRONG_OUTPUT_TYPE_BINDING), true, OUTPUT, pt,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OUTPUT_CARDINALITY),
						TransferOperationBehaviourType.GET_RELATION, owner,
						getBoundOperationByName(e1, WRONG_OUTPUT_CARDINALITY_BINDING), true, OUTPUT, type, 1, 1)
								.build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, type, t3, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"GetRelationOperationOutputTypeIsValid|Output type of 'GET_RELATION' operation's (t1.WRONG_OUTPUT_TYPE) binding must be kind of referenced mapped transfer object type",
				"GetOperationOutputCardinalityIsValid|Output cardinality of 'GET_RELATION' operation's (t1.WRONG_OUTPUT_CARDINALITY) binding must be the same as its owner's",
				"GetRelationOperationInputParameterIsNotDefined|'GET' operation's binding cannot have an input parameter (operation: UNDEFINED_OUTPUT)",
				"RelationIsUndefinedBoundWithoutRelation|Relation must be undefined for 'GET_RELATION' operation: DEFINED_RELATION (in: t1)",
				"GetRelationOperationOutputParameterIsDefined|'GET' operation's binding must have an output parameter named 'output' (operation: UNDEFINED_OUTPUT)",
				"GetRelationOperationInputParameterIsNotDefined|'GET' operation's binding cannot have an input parameter (operation: DEFINED_INPUT)",
				"GetRelationOperationOutputNameIsValid|Output of 'GET' operation's binding must be named 'output' (operation: WRONG_OUTPUT_NAME)"),
				Collections.emptyList());
	}

	@Test
	void testValidBoundBehaviourDelete() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_1)
				.withEntityType(e1).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withSuperTransferObjectTypes(pt).withEntityType(e2).build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(type).withEntityType(c).build();

		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_1)
				.withTarget(type).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(owner);

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_2)
				.withTarget(t3).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		type.getRelations().add(relation);

		e1.getOperations().addAll(ImmutableList.of(

				boundOperationDecorator(newBoundOperationBuilder().withName(DEFINED_OUTPUT_BINDING), t1, OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper(), INPUT, type, 1, 1)
								.build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UNDEFINED_INPUT_BINDING), t1, true, OUTPUT,
						type, owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),

				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_NAME_BINDING), t1, false,
						OUTPUT, type, 1, 1).build(),

				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_TYPE_BINDING), t1, false, INPUT,
						pt, 1, 1).build(),

				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_BINDING), t1, false,
						INPUT, ct, 0, -1).build()));

		t1.getOperations().addAll(ImmutableList.of(

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(DEFINED_OUTPUT),
						TransferOperationBehaviourType.DELETE_RELATION, owner,
						getBoundOperationByName(e1, DEFINED_OUTPUT_BINDING), OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper(), INPUT, type, 1, 1)
								.build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNDEFINED_INPUT),
						TransferOperationBehaviourType.DELETE_RELATION, owner,
						getBoundOperationByName(e1, UNDEFINED_INPUT_BINDING), true, OUTPUT, type,
						owner.getCardinality().getLower(), owner.getCardinality().getUpper()).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_NAME),
						TransferOperationBehaviourType.DELETE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_INPUT_NAME_BINDING), false, OUTPUT, type, 1, 1).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_TYPE),
						TransferOperationBehaviourType.DELETE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_INPUT_TYPE_BINDING), false, INPUT, pt, 1, 1).build(),

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_CARDINALITY),
						TransferOperationBehaviourType.DELETE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_INPUT_CARDINALITY_BINDING), false, INPUT, ct, 0, -1)
								.build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, type, t3, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"DeleteRelationOperationInputCardinalityIsValid|Input cardinality of 'DELETE' operation's binding must be 1..1 (operation: WRONG_INPUT_CARDINALITY)",
				"DeleteRelationOperationInputNameIsValid|Input of 'DELETE' operation's binding must be named 'input' (operation: WRONG_INPUT_NAME)",
				"DeleteRelationOperationInputParameterIsDefined|'DELETE_RELATION' operation's binding must have an input parameter named 'input' (operation: UNDEFINED_INPUT)",
				"DeleteOperationOutputParameterIsNotDefined|'DELETE_RELATION' operation's binding cannot have an output parameter (operation: UNDEFINED_INPUT)",
				"DeleteRelationOperationInputTypeIsValid|Input type of 'DELETE' operation's binding must be kind of the mapped transfer object type referenced by owner (operation: WRONG_INPUT_TYPE)",
				"DeleteOperationOutputParameterIsNotDefined|'DELETE_RELATION' operation's binding cannot have an output parameter (operation: DEFINED_OUTPUT)"),
				Collections.emptyList());
	}

	@Test
	void testValidBoundBehaviourCreateUpdate() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_1)
				.withEntityType(e1).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withSuperTransferObjectTypes(pt).withEntityType(e2).build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(type).withEntityType(c).build();

		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_1)
				.withTarget(type).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(owner);

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_2)
				.withTarget(t3).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		type.getRelations().add(relation);

		e1.getOperations().addAll(ImmutableList.of(
				boundOperationDecorator(newBoundOperationBuilder().withName(UNDEFINED_INPUT_BINDING), t1, true, OUTPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_NAME_BINDING), t1, OUTPUT, type,
						1, 1, WRONG_PARAM_NAME, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_TYPE_BINDING), t1, OUTPUT, pt,
						1, 1, INPUT, pt, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_BINDING), t1, OUTPUT, type,
						1, 1, INPUT, type, 1, -1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UNDEFINED_OUTPUT_BINDING), t1, false, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_OUTPUT_NAME_BINDING), t1, WRONG_PARAM_NAME, type,
						1, 1, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_OUTPUT_TYPE_BINDING), t1, OUTPUT, ct,
						1, 1, INPUT, ct, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_OUTPUT_CARDINALITY_BINDING), t1, OUTPUT, type,
						1, -1, INPUT, type, 1, 1).build()
				));

		t1.getOperations().addAll(ImmutableList.of(

				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNDEFINED_INPUT),
						TransferOperationBehaviourType.CREATE_RELATION, owner,
						getBoundOperationByName(e1, UNDEFINED_INPUT_BINDING), true, OUTPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_NAME),
						TransferOperationBehaviourType.UPDATE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_INPUT_NAME_BINDING), OUTPUT, type, 1, 1, WRONG_PARAM_NAME, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_TYPE),
						TransferOperationBehaviourType.CREATE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_INPUT_TYPE_BINDING), OUTPUT, pt, 1, 1, INPUT, pt, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_CARDINALITY),
						TransferOperationBehaviourType.UPDATE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_INPUT_CARDINALITY_BINDING), OUTPUT, type, 1, 1, INPUT, type, 1, -1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNDEFINED_OUTPUT),
						TransferOperationBehaviourType.CREATE_RELATION, owner,
						getBoundOperationByName(e1, UNDEFINED_OUTPUT_BINDING), false, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OUTPUT_NAME),
						TransferOperationBehaviourType.UPDATE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_OUTPUT_NAME_BINDING), WRONG_PARAM_NAME, type, 1, 1, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OUTPUT_TYPE),
						TransferOperationBehaviourType.CREATE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_OUTPUT_TYPE_BINDING), OUTPUT, ct, 1, 1, INPUT, ct, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_OUTPUT_CARDINALITY),
						TransferOperationBehaviourType.UPDATE_RELATION, owner,
						getBoundOperationByName(e1, WRONG_OUTPUT_CARDINALITY_BINDING), OUTPUT, type, 1, -1, INPUT, type, 1, 1)
								.build()));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, type, t3, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
				"CreateUpdateRelationOperationOutputNameIsValid|Output of 'UPDATE_RELATION' operation's binding must be named 'output' (operation: WRONG_OUTPUT_NAME)",
				"CreateUpdateRelationOperationInputCardinalityIsValid|Input cardinality of 'UPDATE_RELATION' operation's binding must be 1..1 (operation: WRONG_INPUT_CARDINALITY)",
				"CreateUpdateRelationOperationOutputTypeIsValid|Output type of 'CREATE_RELATION' operation's binding must be the mapped transfer object type referenced by owner or its supertype (operation: WRONG_OUTPUT_TYPE)",
				"CreateUpdateRelationOperationInputNameIsValid|Input of 'UPDATE_RELATION' operation's binding must be named 'input' (operation: WRONG_INPUT_NAME)",
				"CreateUpdateRelationOperationInputTypeIsValid|Input type of 'CREATE_RELATION' operation's binding must be kind of the mapped transfer object type referenced by owner (operation: WRONG_INPUT_TYPE)",
				"CreateUpdateRelationOperationInputParameterIsDefined|'CREATE_RELATION' operation's binding must have an input parameter named 'input' (operation: UNDEFINED_INPUT)",
				"CreateUpdateRelationOperationOutputCardinalityIsValid|Output cardinality of 'UPDATE_RELATION' operation's binding must be 1..1 (operation: WRONG_OUTPUT_CARDINALITY)",
				"CreateUpdateRelationOperationOutputParameterIsDefined|'CREATE_RELATION' operation's binding must have an output parameter named 'output' (operation: UNDEFINED_OUTPUT)"
				), Collections.emptyList());
	}

	@Test
	void testValidBoundBehaviourWithRelation() throws Exception {

		EntityType e1 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T1).build();
		EntityType p = newEntityTypeBuilder().withName(PARENT_ENTITY_TYPE).build();
		EntityType e2 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T2).withSuperEntityTypes(p).build();
		EntityType c = newEntityTypeBuilder().withName(CHILD_ENTITY_TYPE).withSuperEntityTypes(e2).build();
		EntityType e3 = newEntityTypeBuilder().withName(NAME_OF_ENTITY_TYPE_FOR_T3).build();

		MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_1)
				.withEntityType(e1).build();

		MappedTransferObjectType pt = newMappedTransferObjectTypeBuilder().withName(PARENT_TRANSFER_OBJECT)
				.withEntityType(p).build();
		MappedTransferObjectType type = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_2)
				.withSuperTransferObjectTypes(pt).withEntityType(e2).build();
		MappedTransferObjectType ct = newMappedTransferObjectTypeBuilder().withName(CHILD_TRANSFER_OBJECT)
				.withSuperTransferObjectTypes(type).withEntityType(c).build();

		MappedTransferObjectType t3 = newMappedTransferObjectTypeBuilder().withName(TRANSFER_OBJECT_3)
				.withEntityType(e3).build();

		TransferObjectRelation owner = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_1)
				.withTarget(type).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		t1.getRelations().add(owner);

		TransferObjectRelation relation = newTransferObjectRelationBuilder().withName(TRANSFER_OBJECT_RELATION_2)
				.withTarget(t3).withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build()).build();
		type.getRelations().add(relation);

		e1.getOperations().addAll(ImmutableList.of(
				boundOperationDecorator(newBoundOperationBuilder().withName(UNDEFINED_RELATION_BINDING), t1, false, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_RELATION_BINDING), t1, false, INPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(UNDEFINED_INPUT_BINDING), t1, true, OUTPUT, type, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_NAME_BINDING), t1, false, OUTPUT, type,1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_TYPE_BINDING), t1, false, INPUT, pt, 1, 1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_CARDINALITY_BINDING), t1, false, INPUT, ct, 0, -1).build(),
				boundOperationDecorator(newBoundOperationBuilder().withName(DEFINED_OUTPUT_BINDING), t1, true, INPUT, type, 1, 1).build()
				));

		t1.getOperations().addAll(ImmutableList.of(
				
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNDEFINED_RELATION),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner,
						getBoundOperationByName(e1, UNDEFINED_RELATION_BINDING), false, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_RELATION),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, owner,
						getBoundOperationByName(e1, WRONG_RELATION_BINDING), false, INPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(UNDEFINED_INPUT),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, UNDEFINED_INPUT_BINDING), true, OUTPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_NAME),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, WRONG_INPUT_NAME_BINDING), false, OUTPUT, type, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_TYPE),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, WRONG_INPUT_TYPE_BINDING), false, INPUT, pt, 1, 1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_CARDINALITY),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, WRONG_INPUT_CARDINALITY_BINDING), false, INPUT, ct, 0, -1)
								.build(),
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(DEFINED_OUTPUT),
						TransferOperationBehaviourType.SET_RELATION_OF_RELATION, owner, relation,
						getBoundOperationByName(e1, DEFINED_OUTPUT_BINDING), true, INPUT, type, 1, 1)
								.build()
				));

		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, type, t3, ct, pt, c, p)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
			"InputCardinalityIsValidBoundWithRelation|Cardinality of the input of 'SET_RELATION_OF_RELATION' operation's binding must be 1..1 (operation: WRONG_INPUT_CARDINALITY).",
			"InputTypeIsValidBoundWithRelation|Input type of 'SET_RELATION_OF_RELATION' operation's binding must be kind of mapped transfer object type referenced by the owner (operation: WRONG_INPUT_TYPE).",
			"RelationIsDefinedBoundWithRelation|Relation must be defined for 'SET_RELATION_OF_RELATION' operation: UNDEFINED_RELATION (in: t1).",
			"RelationIsValidBoundWithRelation|Relation of 'SET_RELATION_OF_RELATION' operation: WRONG_RELATION must be one of the transfer object type referenced by the operation's owner.",
			"InputNameIsValidBoundWithRelation|Input of 'SET_RELATION_OF_RELATION' operation's binding must be named 'input' (operation: WRONG_INPUT_NAME).",
			"OutputParameterIsNotDefinedBoundWithRelation|'SET_RELATION_OF_RELATION' operation's binding cannot have an output parameter (operation: DEFINED_OUTPUT).",
			"OutputParameterIsNotDefinedBoundWithRelation|'SET_RELATION_OF_RELATION' operation's binding cannot have an output parameter (operation: UNDEFINED_INPUT).",
			"InputParameterIsDefinedBoundWithRelation|'SET_RELATION_OF_RELATION' operation's binding must have an input parameter named 'input' (operation: DEFINED_OUTPUT).",
			"InputParameterIsDefinedBoundWithRelation|'SET_RELATION_OF_RELATION' operation's binding must have an input parameter named 'input' (operation: UNDEFINED_INPUT)."
				), Collections.emptyList());
	}
	
	@Test
	void testBoundGetRangeInput() throws Exception {

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

		e1.getOperations().addAll(ImmutableList.of(
				boundOperationDecorator(newBoundOperationBuilder().withName(WRONG_INPUT_TYPE_BINDING), t1,
						OUTPUT, t3, 0, -1, INPUT,t3, 1, 1).build()));

		Parameter inp = newParameterBuilder().withName(INPUT).withCardinality(newCardinalityBuilder().build()).withType(t2).build();
		
		t1.getOperations().addAll(ImmutableList.of(
				
				newUnboundOperationBuilder().withName(OWNER_OPERATION).withInput(inp)
					.withImplementation(newOperationBodyBuilder().build()).build(),
				
				boundTransferOperationDecorator(newBoundTransferOperationBuilder().withName(WRONG_INPUT_TYPE),
						TransferOperationBehaviourType.GET_RANGE_OF_RELATION, inp, relation,
						getBoundOperationByName(e1, WRONG_INPUT_TYPE_BINDING), true, OUTPUT, t3, 0, -1)
						.withInput(newParameterBuilder().withName(INPUT).withType(t3).withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()))
								.build()));
		
		Model model = newModelBuilder().withName(MODEL_NAME)
				.withElements(ImmutableList.of(e1, e2, e3, t1, t2, t3)).build();

		psmModel.addContent(model);

		runEpsilon(ImmutableList.of(
			"GetRangeBoundTransferOperationInputTypeIsValid|Type of 'GET_RANGE_OF_RELATION' operation's input parameter must match the container of the relation (operation: WRONG_INPUT_TYPE)"
			), Collections.emptyList());
	}
}
