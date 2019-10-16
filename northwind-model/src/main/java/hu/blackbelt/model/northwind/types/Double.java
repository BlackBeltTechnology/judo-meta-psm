package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.NumericType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useNumericType;

public class Double {
    /*
        <elements xsi:type="type:NumericType" xmi:id="_VDVVQIUcEeipmMyz9cMCRA" name="Double" precision="15" scale="4"/>
    */
    public NumericType $ = newNumericTypeBuilder().build();

    public void init(Package $package) {
        useNumericType($).withName("Double").withPrecision(15).withScale(4).build();

        usePackage($package).withElements($).build();
    }

}
