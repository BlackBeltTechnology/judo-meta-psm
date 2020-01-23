package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Phone;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Induvidual {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute phone = newAttributeBuilder().build();

    public void init(Package $package, Phone $phone, Person $person, Customer $customer) {
        useEntityType($).withName("Individual")
                .withSuperEntityTypes($person.$)
                .withSuperEntityTypes($customer.$)
                .withAttributes(useAttribute(phone)
                        .withName("phone")
                        .withDataType($phone.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
