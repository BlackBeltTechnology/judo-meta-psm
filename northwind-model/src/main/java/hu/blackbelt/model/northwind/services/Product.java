package hu.blackbelt.model.northwind.services;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

public class Product {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute weight = newTransferAttributeBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public void init(Package $package, String $string, Double $double, MassStoredInKilograms $massStoredInKilograms,
                     hu.blackbelt.model.northwind.entities.Product $product, Category $category,
                     AllCategories $allCategories) {
        useMappedTransferObjectType($)
                .withName("Product")
                .withEntityType($product.$)
                .withAttributes(useTransferAttribute(productName)
                        .withName("productName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($product.productName)
                )
                .withAttributes(useTransferAttribute(unitPrice)
                        .withName("unitPrice")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($product.unitPrice)
                )
                .withAttributes(useTransferAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInKilograms.$)
                        .withBinding($product.weight)
                )
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($product.category)
                        .withTarget($category.$)
                        .withRange($allCategories.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                                .withUpper(1)
                        )
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
