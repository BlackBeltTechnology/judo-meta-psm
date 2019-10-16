package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Titles;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Person {

    /*
        <elements xsi:type="data:EntityType" xmi:id="_rIapkLzhEeiOuYiCo6IbXQ" name="Person">
          <attributes xmi:id="_5nWpwIOFEeiLE-B2bbL0fg" name="lastName" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_9angAIOFEeiLE-B2bbL0fg" name="firstName" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="__dhy8IOFEeiLE-B2bbL0fg" name="title" dataType="_hJ-K0I57EeioH6CUzUrG0Q"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute lastName = newAttributeBuilder().build();
    public Attribute firstName = newAttributeBuilder().build();
    public Attribute title = newAttributeBuilder().build();

    public void init(Package $package, String $string, Titles $titles) {
        useEntityType($)
                .withName("Person")
                .withAttributes(useAttribute(lastName)
                        .withName("lastName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(firstName)
                        .withName("firstName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(title)
                        .withName("title")
                        .withDataType($titles.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
