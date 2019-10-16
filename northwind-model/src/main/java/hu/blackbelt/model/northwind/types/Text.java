package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.StringType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useStringType;

public class Text {
    /*
        <elements xsi:type="type:StringType" xmi:id="_tXQUoIOGEeiLE-B2bbL0fg" name="Text" maxLength="250"/>
    */
    public StringType $ = newStringTypeBuilder().build();

    public void init(Package $package) {
        useStringType($).withName("Text").withMaxLength(250).build();

        usePackage($package).withElements($).build();
    }

}
