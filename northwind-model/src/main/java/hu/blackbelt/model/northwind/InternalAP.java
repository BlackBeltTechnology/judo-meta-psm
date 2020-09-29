package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.model.northwind.services.*;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class InternalAP {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();
    
    public TransferAttribute email = newTransferAttributeBuilder().build();

    public void init(Model $model, String $string, ProductInfo $productInfo, CategoryInfo $categoryInfo, ShipperInfo $shipperInfo,
                     OrderInfo $orderInfo, InternationalOrderInfo $internationalOrderInfo, AllProducts $allProducts,
                     AllCategories $allCategories, AllShippers $allShippers,
                     OrderAssignedToEmployee $orderAssignedToEmployee, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks,
                     AllInternationalOrders $allInternationalOrders) {
        useUnmappedTransferObjectType($)
                .withName("internalAP")
                .withAttributes(useTransferAttribute(email)
                        .withName("email")
                        .withRequired(false)
                        .withDataType($string.$)
                )
                .build();
        useModel($model).withElements($).build();
    }
}
