package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.entities.Order;
import hu.blackbelt.model.northwind.types.*;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();

    public TransferAttribute orderDate = newTransferAttributeBuilder().build();
    public TransferAttribute shipperName = newTransferAttributeBuilder().build();
    public TransferAttribute priority = newTransferAttributeBuilder().build();
    public TransferAttribute shipped = newTransferAttributeBuilder().build();
    public TransferAttribute shipperLocation = newTransferAttributeBuilder().build();
    public TransferAttribute hasHeavyItem = newTransferAttributeBuilder().build();
    public TransferAttribute numberOfItems = newTransferAttributeBuilder().build();
    public TransferAttribute numberOfDiscountedItemsOutOfStock = newTransferAttributeBuilder().build();
    public TransferAttribute numberOfCategories = newTransferAttributeBuilder().build();
    public TransferAttribute totalPrice = newTransferAttributeBuilder().build();
    public TransferAttribute totalWeight = newTransferAttributeBuilder().build();

    public TransferObjectRelation items = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation shipper = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation discountedItemsOutOfStock = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation comments = newTransferObjectRelationBuilder().build();

    public BoundTransferOperation listItems = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation validateCreateInstanceItems = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation createInstanceItems = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation updateInstanceNorthwind_services_OrderInfo = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation deleteInstanceNorthwind_services_OrderInfo = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation refreshInstanceNorthwind_services_OrderInfo = newBoundTransferOperationBuilder().build();

    public BoundTransferOperation listCategories = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, TimeStamp $timeStamp, Priority $priority, Boolean $boolean,
                     Gps $gps, Integer $integer, Double $double, MassStoredInGrams $massStoredInGrams,
                     Order $order, OrderItem $orderItem, ShipperInfo $shipperInfo, CategoryInfo $categoryInfo,
                     ShipmentChange $shipmentChange, Comment $comment) {
        useMappedTransferObjectType($)
                .withName("OrderInfo")
                .withEntityType($order.$)
                .withAttributes(useTransferAttribute(orderDate)
                        .withName("orderDate")
                        .withRequired(true)
                        .withDataType($timeStamp.$)
                        .withBinding($order.orderDate)
                )
                .withAttributes(useTransferAttribute(priority)
                        .withName("priority")
                        .withRequired(false)
                        .withDataType($priority.$)
                        .withBinding($order.priority)
                )
                .withAttributes(useTransferAttribute(shipperName)
                        .withName("shipperName")
                        .withDataType($string.$)
                        .withBinding($order.shipperName)
                )
                .withAttributes(useTransferAttribute(shipped)
                        .withName("shipped")
                        .withDataType($boolean.$)
                        .withBinding($order.shipped)
                )
                .withAttributes(useTransferAttribute(shipperLocation)
                        .withName("shipperLocation")
                        .withDataType($gps.$)
                        .withBinding($order.shipperLocation)
                )
                .withAttributes(useTransferAttribute(hasHeavyItem)
                        .withName("hasHeavyItem")
                        .withDataType($boolean.$)
                        .withBinding($order.hasHeavyItem)
                )
                .withAttributes(useTransferAttribute(numberOfItems)
                        .withName("numberOfItems")
                        .withDataType($integer.$)
                        .withBinding($order.numberOfItems)
                )
                .withAttributes(useTransferAttribute(numberOfDiscountedItemsOutOfStock)
                        .withName("numberOfDiscountedItemsOutOfStock")
                        .withDataType($integer.$)
                        .withBinding($order.numberOfDiscountedItemsOutOfStock)
                )
                .withAttributes(useTransferAttribute(numberOfCategories)
                        .withName("numberOfCategories")
                        .withDataType($integer.$)
                        .withBinding($order.numberOfCategories)
                )
                .withAttributes(useTransferAttribute(totalPrice)
                        .withName("totalPrice")
                        .withDataType($double.$)
                        .withBinding($order.totalPrice)
                )
                .withAttributes(useTransferAttribute(totalWeight)
                        .withName("totalWeight")
                        .withDataType($massStoredInGrams.$)
                        .withBinding($order.totalWeight)
                )
                .withRelations(useTransferObjectRelation(items)
                        .withName("items")
                        .withBinding($order.orderDetails)
                        .withTarget($orderItem.$)
                        .withEmbedded(true)
                        .withEmbeddedCreate(true)
                        .withEmbeddedUpdate(true)
                        .withEmbeddedDelete(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1).withUpper(-1)
                        )
                )
                .withRelations(useTransferObjectRelation(discountedItemsOutOfStock)
                        .withName("discountedItemsOutOfStock")
                        .withBinding($order.discountedItemsOutOfStock)
                        .withTarget($orderItem.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        )
                )
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withBinding($order.categories)
                        .withTarget($categoryInfo.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        )
                )
                .withRelations(useTransferObjectRelation(shipper)
                        .withName("shipper")
                        .withBinding($order.shipper)
                        .withTarget($shipperInfo.$)
                        .withCardinality(newCardinalityBuilder())
                )
                .withRelations(useTransferObjectRelation(comments)
                        .withName("comments")
                        .withTarget($comment.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        ))
                .withOperations(useBoundTransferOperation(listItems)
                        .withName("_listItems")
                        .withBinding($order.listItems)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(items)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(0)
                                		.withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(createInstanceItems)
                        .withName("_createInstanceItems")
                        .withBinding($order.createInstanceItemsForNorthwind_services_OrderInfo)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE_INSTANCE)
                                .withOwner(items)
                                .build())
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(validateCreateInstanceItems)
                        .withName("_validateCreateInstanceItems")
                        .withBinding($order.validateCreateInstanceItemsForNorthwind_services_OrderInfo)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.VALIDATE_CREATE)
                                .withOwner(items)
                                .build())
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(updateInstanceNorthwind_services_OrderInfo)
                        .withName("_updateInstanceNorthwind_services_OrderInfo")
                        .withBinding($order.updateInstanceForNorthwind_services_OrderInfo)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE_INSTANCE)
                                .withOwner(this.$)
                                .build())
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType(this.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType(this.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(deleteInstanceNorthwind_services_OrderInfo)
                        .withName("_deleteInstanceNorthwind_services_OrderInfo")
                        .withBinding($order.deleteInstanceForNorthwind_services_OrderInfo)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE_INSTANCE)
                                .withOwner(this.$)
                                .build())
                        .build()
                )
                .withOperations(useBoundTransferOperation(refreshInstanceNorthwind_services_OrderInfo)
                        .withName("_refreshInstanceNorthwind_services_OrderInfo")
                        .withBinding($order.refreshInstanceForNorthwind_services_OrderInfo)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.REFRESH)
                                .withOwner(this.$)
                                .build())
                        .withOutput(newParameterBuilder()
                                .withName("output")
                                .withType(this.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(listCategories)
                        .withName("_listCategories")
                        .withBinding($order.listCategories)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(categories)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
