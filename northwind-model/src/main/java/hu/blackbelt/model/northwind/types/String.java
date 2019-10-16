package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.StringType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useStringType;

public class String {
    /*
        <elements xsi:type="type:StringType" xmi:id="_Nppx8IUcEeipmMyz9cMCRA" name="String" maxLength="255"/>
    */
    public StringType $ = newStringTypeBuilder().build();

    public void init(Package $package) {

        useStringType($).withName("String").withMaxLength(255).build();

        usePackage($package).withElements($).build();
    }

}
