package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.StringType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useStringType;

public class String {

    public StringType $ = newStringTypeBuilder().build();

    public void init(Package $package) {

        useStringType($).withName("String").withMaxLength(255).build();

        usePackage($package).withElements($).build();
    }

}
