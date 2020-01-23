package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class OnlineInternationalOrder {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute onlineTrackingNumber = newAttributeBuilder().build();

    public void init(Package $package, String $string, InternationalOrder $internationalOrder, OnlineOrder $onlineOrder) {
        useEntityType($)
                .withName("OnlineInternationalOrder")
                .withSuperEntityTypes($internationalOrder.$)
                .withSuperEntityTypes($onlineOrder.$)
                .withAttributes(useAttribute(onlineTrackingNumber)
                        .withName("onlineTrackingNumber")
                        .withDataType($string.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
