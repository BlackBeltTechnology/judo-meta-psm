package hu.blackbelt.model.northwind.extension.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.optional.services.ProductInfo;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class GetRangeInputProductInfoCategory {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();
    public TransferObjectRelation owner = newTransferObjectRelationBuilder().build();

    public void init(Package $package, ProductInfo $optionalProductInfo) {

		useUnmappedTransferObjectType($)
                .withName("_GetRangeInputProductInfoCategory")
                .withRelations(useTransferObjectRelation(owner)
                        .withName("owner")
                        .withTarget($optionalProductInfo.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(0)
                                .withUpper(1)
                        ))
                .build();

        usePackage($package).withElements($).build();
    }
}
