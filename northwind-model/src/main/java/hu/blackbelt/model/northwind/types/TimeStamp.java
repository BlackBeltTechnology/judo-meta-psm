package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.TimestampType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newTimestampTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useTimestampType;

public class TimeStamp {

    public TimestampType $ = newTimestampTypeBuilder().build();

    public void init(Package $package) {
        useTimestampType($).withName("TimeStamp").build();

        usePackage($package).withElements($).build();
    }

}
