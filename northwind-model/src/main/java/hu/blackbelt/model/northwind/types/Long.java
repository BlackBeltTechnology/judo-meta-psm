package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.NumericType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useNumericType;

public class Long {

    /*
        <elements xsi:type="type:NumericType" xmi:id="_SZ-GUIUcEeipmMyz9cMCRA" name="Long" precision="18"/>
    */
    public NumericType $ = newNumericTypeBuilder().build();

    public void init(Package $package) {
        useNumericType($).withName("Long").withPrecision(18).build();

        usePackage($package).withElements($).build();
    }

}
