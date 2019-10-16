package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Store {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_c7JHIOdVEeiJv53TEP0vvQ" name="Store">
          <relations xsi:type="data:AssociationEnd" xmi:id="_gqZAEOdVEeiJv53TEP0vvQ" name="products" target="_6XH80INkEeiLE-B2bbL0fg" partner="_VnJ8IOdVEeiJv53TEP0vvQ">
            <cardinality xmi:id="_oRVjUOdVEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
        </elements>
     */
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
