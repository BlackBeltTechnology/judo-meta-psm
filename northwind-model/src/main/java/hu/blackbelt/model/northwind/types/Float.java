package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.NumericType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useNumericType;

public class Float {
    /*
        <elements xsi:type="type:NumericType" xmi:id="_WX24MIUcEeipmMyz9cMCRA" name="Float" precision="7" scale="4"/>
    */
    public NumericType $ = newNumericTypeBuilder().build();

    public void init(Package $package) {
        useNumericType($).withName("Float").withPrecision(7).withScale(4).build();

        usePackage($package).withElements($).build();
    }

}
