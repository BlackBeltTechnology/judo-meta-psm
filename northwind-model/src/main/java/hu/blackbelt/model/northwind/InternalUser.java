package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.InternationalOrderInfo;
import hu.blackbelt.model.northwind.services.OrderInfo;
import hu.blackbelt.model.northwind.services.OrdersOfLastTwoWeeks;
import hu.blackbelt.model.northwind.services.ShipperInfo;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.useActorType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternalUser {

    public ActorType $ = newActorTypeBuilder().build();
    
    public TransferObjectRelation allShippers = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation allInternationalOrders = newTransferObjectRelationBuilder().build();
    
    public UnboundOperation principal = newUnboundOperationBuilder().build();
    public UnboundOperation mapPrincipal = newUnboundOperationBuilder().build();
    public UnboundOperation listAllShippers = newUnboundOperationBuilder().build();
    public UnboundOperation listAllInternationalOrders = newUnboundOperationBuilder().build();
    public UnboundOperation createInstanceAllShipper = newUnboundOperationBuilder().build();
    public UnboundOperation createInstanceAllInternationalOrders = newUnboundOperationBuilder().build();
    public UnboundOperation validateCreateInstanceAllShipper = newUnboundOperationBuilder().build();
    public UnboundOperation validateCreateInstanceAllInternationalOrders = newUnboundOperationBuilder().build();
    
    public TransferObjectRelation lastTwoWeekOrders = newTransferObjectRelationBuilder().build();

    public void init(Model $model, InternalAP $internalAP, InternationalOrderInfo $internationalOrderInfo, ShipperInfo $shipperInfo, OrderInfo $orderInfo, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks) {
        useActorType($)
                .withName("InternalUser")
                .withTransferObjectType($internalAP.$)
                .withRealm("")
                .withRelations(useTransferObjectRelation(allShippers)
                        .withName("allShippers")
                        .withTarget($shipperInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withEmbedded(false)
                        .withEmbeddedCreate(true)
                        .withEmbeddedDelete(true)
                        .withEmbeddedUpdate(true)
                        .withAccess(true)
                        .build()
                )
                .withRelations(useTransferObjectRelation(allInternationalOrders)
                        .withName("allInternationalOrders")
                        .withTarget($internationalOrderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withEmbedded(false)
                        .withEmbeddedCreate(true)
                        .withEmbeddedDelete(true)
                        .withEmbeddedUpdate(true)
                        .withAccess(true)
                        .build()
                )
                .withOperations(useUnboundOperation(principal)
                        .withName("_principal")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_PRINCIPAL)
                                .withOwner(this.$)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internalAP.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(mapPrincipal)
                        .withName("_map_principal")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.MAP_PRINCIPAL)
                                .withOwner(this.$)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internalAP.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(listAllShippers)
                        .withName("_listAllShippers")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(allShippers)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(listAllInternationalOrders)
                        .withName("_listAllInternationalOrders")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createInstanceAllShipper)
                        .withName("_createInstanceAllShipper")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE_INSTANCE)
                                .withOwner(allShippers)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createInstanceAllInternationalOrders)
                        .withName("_createInstanceAllInternationalOrders")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE_INSTANCE)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(validateCreateInstanceAllShipper)
                        .withName("_validateCreateInstanceAllShipper")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.VALIDATE_CREATE)
                                .withOwner(allShippers)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(validateCreateInstanceAllInternationalOrders)
                        .withName("_validateCreateInstanceAllInternationalOrders")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.VALIDATE_CREATE)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .build()
                )
                .withRelations(useTransferObjectRelation(lastTwoWeekOrders)
                        .withName("LastTwoWeekOrders")
                        .withTarget($orderInfo.$)
                        .withBinding($ordersOfLastTwoWeeks.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .build();

        useModel($model).withElements($).build();
    }
}
