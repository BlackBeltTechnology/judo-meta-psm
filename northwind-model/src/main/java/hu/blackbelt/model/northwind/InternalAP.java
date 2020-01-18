package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.model.northwind.services.*;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternalAP {

    public AccessPoint $ = newAccessPointBuilder().build();

    public void init(Model $model, ProductInfo $productInfo, CategoryInfo $categoryInfo, ShipperInfo $shipperInfo,
                     OrderInfo $orderInfo, InternationalOrderInfo $internationalOrderInfo, AllProducts $allProducts,
                     AllCategories $allCategories, AllShippers $allShippers,
                     OrderAssignedToEmployee $orderAssignedToEmployee, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks,
                     AllInternationalOrders $allInternationalOrders) {
        useAccessPoint($)
                .withName("internalAP")
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("products")
                        .withMappedTransferObjectType($productInfo.$)
                        .withSelector($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withGet($productInfo.getAllProducts)
                        .withCreate($productInfo.createProduct)
                        .withUpdate($productInfo.updateProduct)
                        .withDelete($productInfo.deleteProduct)
                        .withSet($productInfo.setCategoryOfProduct)
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("shippers")
                        .withMappedTransferObjectType($shipperInfo.$)
                        .withSelector($allShippers.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withGet($shipperInfo.getAllShippers)
                        .withCreate($shipperInfo.createShipper)
                        .withUpdate($shipperInfo.updateShipper)
                        .withDelete($shipperInfo.deleteShipper)
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("categories")
                        .withMappedTransferObjectType($categoryInfo.$)
                        .withSelector($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withGet($categoryInfo.getAllCategories)
                        .withCreate($categoryInfo.createCategory)
                        .withUpdate($categoryInfo.updateCategory)
                        .withDelete($categoryInfo.deleteCategory)
                        .withSet($categoryInfo.setProductsOfCategory)
                        .withAddAll($categoryInfo.addProductsToCategory)
                        .withRemoveAll($categoryInfo.removeProductsFromCategory)
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("ordersAssignedToEmployee")
                        .withSelector($orderAssignedToEmployee.$)
                        .withMappedTransferObjectType($orderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("allInternationalOrders")
                        .withSelector($allInternationalOrders.$)
                        .withMappedTransferObjectType($internationalOrderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("LastTwoWeekOrders")
                        .withSelector($ordersOfLastTwoWeeks.$)
                        .withMappedTransferObjectType($orderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedServices(newExposedServiceBuilder().withName("exposed").withOperationGroup($internationalOrderInfo.$)).build();
        useModel($model).withElements($).build();
    }
}
