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

    public BoundTransferOperation getItems = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation createItem = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation updateItem  = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation deleteItem  = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation setProductOfItem  = newBoundTransferOperationBuilder().build();

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
                        .withGet(getItems)
                        .withCreate(createItem)
                        .withUpdate(updateItem)
                        .withDelete(deleteItem)
                        .withSet(setProductOfItem)
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
                .withOperations(useBoundTransferOperation(getItems)
                        .withName("getItems")
                        .withBinding("getDetails")
                        .build()
                )
                .withOperations(useBoundTransferOperation(createItem)
                        .withName("createItem")
                        .withBinding("createDetail")
                        .build()
                )
                .withOperations(useBoundTransferOperation(updateItem)
                        .withName("updateItem")
                        .withBinding("updateDetail")
                        .build()
                )
                .withOperations(useBoundTransferOperation(deleteItem)
                        .withName("deleteItem")
                        .withBinding("deleteDetail")
                        .build()
                )
                .withOperations(useBoundTransferOperation(setProductOfItem)
                        .withName("setProductOfItem")
                        .withBinding("setProductOfDetail")
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
