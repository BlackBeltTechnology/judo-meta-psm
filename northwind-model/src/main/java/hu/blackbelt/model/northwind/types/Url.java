package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.StringType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useStringType;

public class Url {

    /*
        <elements xsi:type="type:StringType" xmi:id="_A5EFMIN4EeiLE-B2bbL0fg" name="URL" maxLength="1024"/>
    */
    public StringType $ = newStringTypeBuilder().build();

    public void init(Package $package) {
        useStringType($).withName("URL").withMaxLength(1024).build();

        usePackage($package).withElements($).build();
    }

}
