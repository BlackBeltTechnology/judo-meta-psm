package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.services.*;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternalAP {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();

    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation shippers = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation allInternationalOrders = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation ordersAssignedToEmployee = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation lastTwoWeekOrders = newTransferObjectRelationBuilder().build();

    public TransferObjectRelation exposed = newTransferObjectRelationBuilder().build();

    public void init(Model $model, ProductInfo $productInfo, CategoryInfo $categoryInfo, ShipperInfo $shipperInfo,
                     OrderInfo $orderInfo, InternationalOrderInfo $internationalOrderInfo, AllProducts $allProducts,
                     AllCategories $allCategories, AllShippers $allShippers,
                     OrderAssignedToEmployee $orderAssignedToEmployee, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks,
                     AllInternationalOrders $allInternationalOrders) {
        useUnmappedTransferObjectType($)
                .withName("internalAP")
                .withRelations(useTransferObjectRelation(products)
                        .withName("products")
                        .withTarget($productInfo.$)
                        .withBinding($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(shippers)
                        .withName("shippers")
                        .withTarget($shipperInfo.$)
                        .withBinding($allShippers.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withTarget($categoryInfo.$)
                        .withBinding($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(ordersAssignedToEmployee)
                        .withName("ordersAssignedToEmployee")
                        .withTarget($orderInfo.$)
                        .withBinding($orderAssignedToEmployee.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(allInternationalOrders)
                        .withName("allInternationalOrders")
                        .withTarget($internationalOrderInfo.$)
                        .withBinding($allInternationalOrders.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
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
                .withRelations(useTransferObjectRelation(exposed)
                        .withName("exposed")
                        .withTarget($internationalOrderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                                .withUpper(1))
                        .build()
                )
                .build();
        useModel($model).withElements($).build();
    }
}
