package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.Order;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.*;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderInfoQuery {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_ETGEYCVQEemLpvUY7MQgng" name="OrderInfoQuery" entityType="_-H4RoINkEeiLE-B2bbL0fg" entityReferencePresence="REQUIRED">
      <relations xmi:id="_8M4aICVuEemLpvUY7MQgng" name="items" binding="_2CC44LwNEeiOuYiCo6IbXQ" target="_nao6QCVuEemLpvUY7MQgng" embedded="true">
        <cardinality xmi:id="_-kd8kCVuEemLpvUY7MQgng" upper="-1"/>
      </relations>
      <relations xmi:id="_djRLUHrHEemPuYxp6QV8dA" name="categories" binding="_qMfVoHrHEemPuYxp6QV8dA" target="_xxeTIEWXEemHs64O5EYsyQ" embedded="true">
        <cardinality xmi:id="_J1w0AHrJEemPuYxp6QV8dA" upper="-1"/>
      </relations>
      <attributes xmi:id="_U4tLwCVQEemLpvUY7MQgng" name="orderDate" required="true" dataType="_Z9J8IIN1EeiLE-B2bbL0fg" binding="_WXvUoIN1EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_u7NrYCVQEemLpvUY7MQgng" name="shipperName" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_5i40sCVQEemLpvUY7MQgng"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();

    public TransferAttribute orderDate = newTransferAttributeBuilder().build();
    public TransferAttribute shipped = newTransferAttributeBuilder().build();
//    public TransferAttribute orderOfCompany = newTransferAttributeBuilder().build();
    public TransferAttribute shipperName = newTransferAttributeBuilder().build();
//    public TransferAttribute shipperHasTerritory = newTransferAttributeBuilder().build();
//    public TransferAttribute shipperIsCustomer = newTransferAttributeBuilder().build();
//    public TransferAttribute shippedByManufacturer = newTransferAttributeBuilder().build();
//    public TransferAttribute shippedByManufacturer2 = newTransferAttributeBuilder().build();
    public TransferAttribute hasHeavyItem = newTransferAttributeBuilder().build();
//    public TransferAttribute notOnlyLightItems = newTransferAttributeBuilder().build();
//    public TransferAttribute noManufacturerDefined = newTransferAttributeBuilder().build();
    public TransferAttribute numberOfItems = newTransferAttributeBuilder().build();
    public TransferAttribute numberOfDiscountedItemsOutOfStock = newTransferAttributeBuilder().build();
//    public TransferAttribute numberOfProducts = newTransferAttributeBuilder().build();
    public TransferAttribute numberOfCategories = newTransferAttributeBuilder().build();
    public TransferAttribute totalPrice = newTransferAttributeBuilder().build();
    public TransferAttribute totalWeight = newTransferAttributeBuilder().build();
//    public TransferAttribute averageProductWeight = newTransferAttributeBuilder().build();
//    public TransferAttribute averageItemWeight = newTransferAttributeBuilder().build();
//    public TransferAttribute cheapestItemPrice = newTransferAttributeBuilder().build();
//    public TransferAttribute numberOfProductsInCategories = newTransferAttributeBuilder().build();
//    public TransferAttribute numberOfDiscountedProductsInCategories = newTransferAttributeBuilder().build();

    public TransferObjectRelation items = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation discountedItemsOutOfStock = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
//    public TransferObjectRelation dhlTerritory = newTransferObjectRelationBuilder().build();

    public void init(Package $package, String $string, TimeStamp $timeStamp, Boolean $boolean, Integer $integer,
                     Double $double, MassStoredInGrams $massStoredInGrams, Order $order, OrderItemQuery $orderItemQuery,
                     CategoryInfo $categoryInfo, TerritoryInfo $territoryInfo) {
        useMappedTransferObjectType($)
                .withName("OrderInfoQuery")
                .withEntityType($order.$)
                .withAttributes(useTransferAttribute(orderDate)
                        .withName("orderDate")
                        .withRequired(true)
                        .withDataType($timeStamp.$)
                        .withBinding($order.orderDate)
                )
                .withAttributes(useTransferAttribute(shipped)
                        .withName("shipped")
                        .withDataType($boolean.$)
                        .withBinding($order.shipped)
                )
//                .withAttributes(useTransferAttribute(orderOfCompany)
//                        .withName("orderOfCompany")
//                        .withDataType($boolean.$)
//                        .withBinding($order.orderOfCompany)
//                )
                .withAttributes(useTransferAttribute(shipperName)
                        .withName("shipperName")
                        .withDataType($string.$)
                        .withBinding($order.shipperName)
                )
//                .withAttributes(useTransferAttribute(shipperHasTerritory)
//                        .withName("shipperHasTerritory")
//                        .withDataType($boolean.$)
//                        .withBinding($order.shipperHasTerritory)
//                )
//                .withAttributes(useTransferAttribute(shippedByManufacturer)
//                        .withName("shippedByManufacturer")
//                        .withDataType($boolean.$)
//                        .withBinding($order.shippedByManufacturer)
//                )
//                .withAttributes(useTransferAttribute(shippedByManufacturer2)
//                        .withName("shippedByManufacturer2")
//                        .withDataType($boolean.$)
//                        .withBinding($order.shippedByManufacturer2)
//                )
//                .withAttributes(useTransferAttribute(shipperIsCustomer)
//                        .withName("shipperIsCustomer")
//                        .withDataType($boolean.$)
//                        .withBinding($order.shipperIsCustomer)
//                )
                .withAttributes(useTransferAttribute(hasHeavyItem)
                        .withName("hasHeavyItem")
                        .withDataType($boolean.$)
                        .withBinding($order.hasHeavyItem)
                )
//                .withAttributes(useTransferAttribute(notOnlyLightItems)
//                        .withName("notOnlyLightItems")
//                        .withDataType($boolean.$)
//                        .withBinding($order.notOnlyLightItems)
//                )
//                .withAttributes(useTransferAttribute(noManufacturerDefined)
//                        .withName("noManufacturerDefined")
//                        .withDataType($boolean.$)
//                        .withBinding($order.noManufacturerDefined)
//                )
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
//                .withAttributes(useTransferAttribute(numberOfProducts)
//                        .withName("numberOfProducts")
//                        .withDataType($integer.$)
//                        .withBinding($order.numberOfProducts)
//                )
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
//                .withAttributes(useTransferAttribute(cheapestItemPrice)
//                        .withName("cheapestItemPrice")
//                        .withDataType($double.$)
//                        .withBinding($order.cheapestItemPrice)
//                )
                .withAttributes(useTransferAttribute(totalWeight)
                        .withName("totalWeight")
                        .withDataType($massStoredInGrams.$)
                        .withBinding($order.totalWeight)
                )
//                .withAttributes(useTransferAttribute(averageProductWeight)
//                        .withName("averageProductWeight")
//                        .withDataType($massStoredInGrams.$)
//                        .withBinding($order.averageProductWeight)
//                )
//                .withAttributes(useTransferAttribute(averageItemWeight)
//                        .withName("averageItemWeight")
//                        .withDataType($massStoredInGrams.$)
//                        .withBinding($order.averageItemWeight)
//                )
                .withRelations(useTransferObjectRelation(items)
                        .withName("items")
                        .withBinding($order.orderDetails)
                        .withTarget($orderItemQuery.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1).withUpper(-1)
                        )
                )
                .withRelations(useTransferObjectRelation(discountedItemsOutOfStock)
                        .withName("discountedItemsOutOfStock")
                        .withBinding($order.discountedItemsOutOfStock)
                        .withTarget($orderItemQuery.$)
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
                        ))
//                .withRelations(useTransferObjectRelation(dhlTerritory)
//                        .withName("dhlTerritory")
//                        .withBinding($order.dhlTerritory)
//                        .withTarget($territoryInfo.$)
//                        .withEmbedded(true)
//                        .withCardinality(newCardinalityBuilder())
//                )
//                .withAttributes(useTransferAttribute(numberOfProductsInCategories)
//                        .withName("numberOfProductsInCategories")
//                        .withDataType($integer.$)
//                        .withBinding($order.numberOfProductsInCategories)
//                )
//                .withAttributes(useTransferAttribute(numberOfDiscountedProductsInCategories)
//                        .withName("numberOfDiscountedProductsInCategories")
//                        .withDataType($integer.$)
//                        .withBinding($order.numberOfDiscountedProductsInCategories)
//                )

                .build();

        usePackage($package).withElements($).build();
    }
}
