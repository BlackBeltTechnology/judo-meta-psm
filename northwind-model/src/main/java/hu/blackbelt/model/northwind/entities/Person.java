package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Titles;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Person {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute lastName = newAttributeBuilder().build();
    public Attribute firstName = newAttributeBuilder().build();
    public Attribute title = newAttributeBuilder().build();

    public void init(Package $package, String $string, Titles $titles) {
        useEntityType($)
                .withName("Person")
                .withAttributes(useAttribute(lastName)
                        .withName("lastName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(firstName)
                        .withName("firstName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(title)
                        .withName("title")
                        .withDataType($titles.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
