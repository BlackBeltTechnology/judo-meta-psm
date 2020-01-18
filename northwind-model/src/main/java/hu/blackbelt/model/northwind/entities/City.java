package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class City {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute name = newAttributeBuilder().build();

    public void init(Package $package, String $string) {
        useEntityType($).withName("City")
                .withAttributes(useAttribute(name)
                        .withName("name")
                        .withDataType($string.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
