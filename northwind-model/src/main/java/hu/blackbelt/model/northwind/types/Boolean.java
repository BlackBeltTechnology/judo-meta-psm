package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.BooleanType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newBooleanTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useBooleanType;

public class Boolean {

    public BooleanType $ = newBooleanTypeBuilder().build();

    public void init(Package $package) {
        useBooleanType($).withName("Boolean").build();

        usePackage($package).withElements($).build();
    }

}
