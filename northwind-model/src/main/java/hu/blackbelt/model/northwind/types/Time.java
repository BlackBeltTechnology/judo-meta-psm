package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.TimeType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

public class Time {

    public TimeType $ = newTimeTypeBuilder().build();

    public void init(Package $package) {
        useTimeType($).withName("Time").build();

        usePackage($package).withElements($).build();
    }

}
