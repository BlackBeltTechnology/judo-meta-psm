package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Url;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class OnlineOrder {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute webshopUrl = newAttributeBuilder().build();

    public void init(Package $package, Url $url, Order $order) {
        useEntityType($)
                .withName("OnlineOrder")
                .withSuperEntityTypes($order.$)
                .withAttributes(useAttribute(webshopUrl)
                        .withName("webshopUrl")
                        .withDataType($url.$)
                        .withRequired(true)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
