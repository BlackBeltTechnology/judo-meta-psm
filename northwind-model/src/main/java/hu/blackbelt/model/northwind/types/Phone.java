package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.StringType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useStringType;

public class Phone {

    public StringType $ = newStringTypeBuilder().build();

    public void init(Package $package) {
        useStringType($).withName("Phone").withMaxLength(20).build();

        usePackage($package).withElements($).build();
    }

}
