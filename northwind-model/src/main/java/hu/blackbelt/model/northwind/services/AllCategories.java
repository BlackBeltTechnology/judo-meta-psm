package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.entities.Category;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class AllCategories {

    public StaticNavigation $ = newStaticNavigationBuilder().build();

    public void init(Package $package, Category $category) {
        useStaticNavigation($)
                .withName("allCategories")
                .withTarget($category.$)
                .withCardinality(newCardinalityBuilder().withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder()
                        .withExpression("demo::entities::Category")
                )
                .build();

        usePackage($package).withElements($).build();
    }

}
