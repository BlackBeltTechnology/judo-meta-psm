package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Url;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Supplier {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute homePage = newAttributeBuilder().build();
    public AssociationEnd suppliedProduct = newAssociationEndBuilder().build();

    public void init(Package $package, Url $url, Company $company, Product $product) {
        useEntityType($)
                .withName("Supplier")
                .withSuperEntityTypes($company.$)
                .withAttributes(useAttribute(homePage)
                        .withName("homePage")
                        .withDataType($url.$)
                )
                .withRelations(useAssociationEnd(suppliedProduct)
                        .withName("suppliedProducts")
                        .withTarget($product.$)
                        .withPartner($product.supplier)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
