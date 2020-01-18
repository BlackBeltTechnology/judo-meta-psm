package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.NumericType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useNumericType;

public class Float {

    public NumericType $ = newNumericTypeBuilder().build();

    public void init(Package $package) {
        useNumericType($).withName("Float").withPrecision(7).withScale(4).build();

        usePackage($package).withElements($).build();
    }

}
