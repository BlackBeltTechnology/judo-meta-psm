package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.DateType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newDateTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useDateType;

public class Date {

    /*
        <elements xsi:type="type:DateType" xmi:id="_YoqOYIN1EeiLE-B2bbL0fg" name="Date"/>
    */
    public DateType $ = newDateTypeBuilder().build();

    public void init(Package $package) {
        useDateType($).withName("Date").build();

        usePackage($package).withElements($).build();
    }

}
