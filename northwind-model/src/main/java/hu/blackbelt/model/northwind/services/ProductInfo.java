package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.Product;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ProductInfo {


    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_o7IkkEWXEemHs64O5EYsyQ" name="ProductInfo" entityType="_6XH80INkEeiLE-B2bbL0fg">
      <relations xmi:id="_liE9YIFIEemFzY3ZWApzVQ" name="category" binding="_CkXK8LwDEeiOuYiCo6IbXQ" range="_xeUiAEZlEemHs64O5EYsyQ" target="_xxeTIEWXEemHs64O5EYsyQ">
        <cardinality xmi:id="_liE9YYFIEemFzY3ZWApzVQ" lower="1"/>
      </relations>
      <attributes xmi:id="_s0y9wEWXEemHs64O5EYsyQ" name="productName" required="true" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_LhnHUINvEeiLE-B2bbL0fg"/>
      <attributes xmi:id="_02GVgIFSEemFzY3ZWApzVQ" name="unitPrice" required="true" dataType="_VDVVQIUcEeipmMyz9cMCRA" binding="_bBDQ0INvEeiLE-B2bbL0fg"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public void init(Package $package, String $string, Double $double, Product $product,
                     CategoryInfo $categoryInfo, AllCategories $allCategories) {
        useMappedTransferObjectType($)
                .withName("ProductInfo")
                .withEntityType($product.$)
                .withAttributes(useTransferAttribute(unitPrice)
                        .withName("unitPrice")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($product.unitPrice)
                )
                .withAttributes(useTransferAttribute(productName)
                        .withName("productName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($product.productName)
                )
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($product.category)
                        .withTarget($categoryInfo.$)
                        .withRange($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .build();

        usePackage($package).withElements($).build();
    }
}
