package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.entities.Shipper;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class AllShippers {

    public StaticNavigation $ = newStaticNavigationBuilder().build();

    public void init(Package $package, Shipper $shipper) {
        useStaticNavigation($)
                .withName("allShippers")
                .withTarget($shipper.$)
                .withCardinality(newCardinalityBuilder().withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder()
                        .withExpression("demo::entities::Shipper")
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
