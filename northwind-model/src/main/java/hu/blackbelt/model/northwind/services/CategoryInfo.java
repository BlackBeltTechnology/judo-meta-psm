package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.Category;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class CategoryInfo {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_xxeTIEWXEemHs64O5EYsyQ" name="CategoryInfo" entityType="_43ZPcINkEeiLE-B2bbL0fg">
      <relations xmi:id="_iy32wEWgEemHs64O5EYsyQ" name="products" binding="_892OYLwCEeiOuYiCo6IbXQ" range="_vA7SgEZlEemHs64O5EYsyQ" target="_o7IkkEWXEemHs64O5EYsyQ">
        <cardinality xmi:id="_Paez0EWiEemHs64O5EYsyQ" upper="-1"/>
      </relations>
      <attributes xmi:id="_zWg-UEWXEemHs64O5EYsyQ" name="categoryName" required="true" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_v7k5EINmEeiLE-B2bbL0fg"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute categoryName = newTransferAttributeBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();

    public void init(Package $package, String $string, Category $category, ProductInfo $productInfo, AllProducts $allProducts) {
        useMappedTransferObjectType($)
                .withName("CategoryInfo")
                .withEntityType($category.$)
                .withAttributes(useTransferAttribute(categoryName)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withBinding($category.categoryName)
                )
                .withRelations(useTransferObjectRelation(products)
                        .withName("products")
                        .withBinding($category.products)
                        .withTarget($productInfo.$)
                        .withRange($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        )
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
