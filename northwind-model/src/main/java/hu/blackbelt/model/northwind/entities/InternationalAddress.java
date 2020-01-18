package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Countries;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class InternationalAddress {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute country = newAttributeBuilder().build();

    public void init(Package $package, Countries $countries, Address $address) {
        useEntityType($)
                .withName("InternationalAddress")
                .withSuperEntityTypes($address.$)
                .withAttributes(useAttribute(country)
                        .withName("country")
                        .withDataType($countries.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
