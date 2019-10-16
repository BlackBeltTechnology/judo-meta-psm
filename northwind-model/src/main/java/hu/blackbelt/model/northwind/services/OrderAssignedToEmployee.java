package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.entities.Order;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useStaticNavigation;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderAssignedToEmployee {
    /*
        <elements xsi:type="derived:StaticNavigation" xmi:id="_EuQ5MCYbEemLpvUY7MQgng" name="ordersAssignedToEmployee" target="_-H4RoINkEeiLE-B2bbL0fg">
          <cardinality xmi:id="_KCnuwCYbEemLpvUY7MQgng" upper="-1"/>
          <getterExpression xmi:id="_cFwiQDneEemsDIfvozHEKg" expression="northwind::entities::Employee.orders"/>
        </elements>
    */
    public StaticNavigation $ = newStaticNavigationBuilder().build();

    public void init(Package $package, Order $order) {
        useStaticNavigation($)
                .withName("ordersAssignedToEmployee")
                .withTarget($order.$)
                .withCardinality(newCardinalityBuilder().withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("northwind::entities::Employee.orders"))
                .build();

        usePackage($package).withElements($).build();
    }
}
