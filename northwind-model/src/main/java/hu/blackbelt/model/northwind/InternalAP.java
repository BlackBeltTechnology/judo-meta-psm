package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.model.northwind.services.*;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternalAP {

    public AccessPoint $ = newAccessPointBuilder().build();

    public ExposedGraph categories = newExposedGraphBuilder().build();
    public ExposedGraph products = newExposedGraphBuilder().build();
    public ExposedGraph shippers = newExposedGraphBuilder().build();
    public ExposedGraph allInternationalOrders = newExposedGraphBuilder().build();
    public ExposedGraph ordersAssignedToEmployee = newExposedGraphBuilder().build();
    public ExposedGraph lastTwoWeekOrders = newExposedGraphBuilder().build();

    public void init(Model $model, ProductInfo $productInfo, CategoryInfo $categoryInfo, ShipperInfo $shipperInfo,
                     OrderInfo $orderInfo, InternationalOrderInfo $internationalOrderInfo, AllProducts $allProducts,
                     AllCategories $allCategories, AllShippers $allShippers,
                     OrderAssignedToEmployee $orderAssignedToEmployee, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks,
                     AllInternationalOrders $allInternationalOrders) {
        useAccessPoint($)
                .withName("internalAP")
                .withExposedGraphs(useExposedGraph(products)
                        .withName("products")
                        .withMappedTransferObjectType($productInfo.$)
                        .withSelector($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(useExposedGraph(shippers)
                        .withName("shippers")
                        .withMappedTransferObjectType($shipperInfo.$)
                        .withSelector($allShippers.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(useExposedGraph(categories)
                        .withName("categories")
                        .withMappedTransferObjectType($categoryInfo.$)
                        .withSelector($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(useExposedGraph(ordersAssignedToEmployee)
                        .withName("ordersAssignedToEmployee")
                        .withSelector($orderAssignedToEmployee.$)
                        .withMappedTransferObjectType($orderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(useExposedGraph(allInternationalOrders)
                        .withName("allInternationalOrders")
                        .withSelector($allInternationalOrders.$)
                        .withMappedTransferObjectType($internationalOrderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(useExposedGraph(lastTwoWeekOrders)
                        .withName("LastTwoWeekOrders")
                        .withSelector($ordersOfLastTwoWeeks.$)
                        .withMappedTransferObjectType($orderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedServices(newExposedServiceBuilder()
                        .withName("exposed")
                        .withOperationGroup($internationalOrderInfo.$)
                )
                .build();
        useModel($model).withElements($).build();
    }
}
