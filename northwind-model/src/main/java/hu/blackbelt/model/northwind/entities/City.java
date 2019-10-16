package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class City {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_eKHIwJuzEeidMOq99SGQ3A" name="City">
          <attributes xmi:id="_huAGQJuzEeidMOq99SGQ3A" name="name" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute name = newAttributeBuilder().build();

    public void init(Package $package, String $string) {
        useEntityType($).withName("City")
                .withAttributes(useAttribute(name)
                        .withName("name")
                        .withDataType($string.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
