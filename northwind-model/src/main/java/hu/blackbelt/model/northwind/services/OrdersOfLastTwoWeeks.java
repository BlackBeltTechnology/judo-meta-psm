package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.entities.Order;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrdersOfLastTwoWeeks {

    public StaticNavigation $ = newStaticNavigationBuilder().build();

    public void init(Package $package, Order $order) {
        useStaticNavigation($)
                .withName("ordersOfLastTwoWeeks")
                .withTarget($order.$)
                .withCardinality(newCardinalityBuilder().withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("demo::entities::Order!filter(o | o.orderDate > `2019-01-01T00:00:00Z`)"))
                .build();

        usePackage($package).withElements($).build();
    }
}
