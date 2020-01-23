package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Store {

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd products = newAssociationEndBuilder().build();

    public void init(Package $package, Product $product) {
        useEntityType($).withName("Store")
                .withRelations(useAssociationEnd(products)
                        .withName("products")
                        .withTarget($product.$)
                        .withPartner($product.store)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build())
                .build();

        usePackage($package).withElements($).build();
    }
}
