package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.entities.InternationalOrder;
import hu.blackbelt.model.northwind.entities.Order;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Gps;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.Priority;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.TimeStamp;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternationalOrderInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute customsDescription = newTransferAttributeBuilder().build();
    public TransferAttribute exciseTax = newTransferAttributeBuilder().build();

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
    
    public BoundTransferOperation getOrderItems = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation createItem = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation updateItem = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation deleteItem = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation setProductOfItem = newBoundTransferOperationBuilder().build();

    public BoundTransferOperation getCategoriesOfItems = newBoundTransferOperationBuilder().build();
    
    public void init(Package $package, String $string, Double $double, InternationalOrder $internationalOrder,
                     OrderInfo $orderInfo, TimeStamp $timeStamp, Priority $priority, Boolean $boolean,
                     Gps $gps, Integer $integer, MassStoredInGrams $massStoredInGrams,
                     Order $order, OrderItem $orderItem, ShipperInfo $shipperInfo, CategoryInfo $categoryInfo,
                     ShipmentChange $shipmentChange, Comment $comment) {
        useMappedTransferObjectType($)
                .withName("InternationalOrderInfo")
                .withEntityType($internationalOrder.$)
                .withAttributes(useTransferAttribute(customsDescription)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withBinding($internationalOrder.customsDescription)
                )
                .withAttributes(useTransferAttribute(exciseTax)
                        .withName("exciseTax")
                        .withDataType($double.$)
                        .withRequired(true)
                        .withBinding($internationalOrder.exciseTax)
                )
                .withAttributes(useTransferAttribute(customsDescription)
                        .withName("customsDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withBinding($internationalOrder.customsDescription)
                )
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
                        )
                )
                .withOperations(useBoundTransferOperation(getOrderItems)
                        .withName("getOrderItems")
                        .withBinding($order.getDetails)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RELATION)
                                .withOwner(items)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(createItem)
                        .withName("createItem")
                        .withBinding($order.createDetail)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE_RELATION)
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
                .withOperations(useBoundTransferOperation(updateItem)
                        .withName("updateItem")
                        .withBinding($order.updateDetail)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE_RELATION)
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
                .withOperations(useBoundTransferOperation(deleteItem)
                        .withName("deleteItem")
                        .withBinding($order.deleteDetail)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE_RELATION)
                                .withOwner(items)
                                .build())
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(setProductOfItem)
                        .withName("setProductOfItem")
                        .withBinding($order.setProductOfDetail)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.SET_RELATION_OF_RELATION)
                                .withOwner(items)
                                .withRelation($orderItem.product)
                                .build())
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(getCategoriesOfItems)
                        .withName("getCategoriesOfItems")
                        .withBinding($order._getCategories)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RELATION)
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
