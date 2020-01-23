package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class InternationalOrder {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute customsDescription = newAttributeBuilder().build();
    public Attribute exciseTax = newAttributeBuilder().build();

    public void init(Package $package, String $string, Double $double, Order $order) {
        useEntityType($)
                .withName("InternationalOrder")
                .withSuperEntityTypes($order.$)
                .withAttributes(useAttribute(customsDescription)
                        .withName("customsDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(exciseTax)
                        .withName("exciseTax")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
