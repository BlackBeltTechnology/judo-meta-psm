package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.CustomType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCustomTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useCustomType;

public class Binary {

    public CustomType $ = newCustomTypeBuilder().build();

    public void init(Package $package) {
        useCustomType($).withName("Binary").build();

        usePackage($package).withElements($).build();
    }

}
