package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Address {

    /*
        <elements xsi:type="data:EntityType" xmi:id="_SDnggLv-EeiOuYiCo6IbXQ" name="Address">
          <attributes xmi:id="_VByh0Lv-EeiOuYiCo6IbXQ" name="address" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_X28KALv-EeiOuYiCo6IbXQ" name="region" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <attributes xmi:id="_ZGwzILv-EeiOuYiCo6IbXQ" name="postalCode" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_teSs8Lv-EeiOuYiCo6IbXQ" name="city" target="_eKHIwJuzEeidMOq99SGQ3A">
            <cardinality xmi:id="_98rVwudSEeiJv53TEP0vvQ" lower="1"/>
          </relations>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute address = newAttributeBuilder().build();
    public Attribute region = newAttributeBuilder().build();
    public Attribute postalCode = newAttributeBuilder().build();
    public AssociationEnd city = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, City $city) {
        useEntityType($).withName("Address")
                .withAttributes(useAttribute(address)
                        .withName("address")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(region)
                        .withName("region")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(postalCode)
                        .withName("postalCode")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(city)
                        .withName("city")
                        .withTarget($city.$)
                        .withCardinality(newCardinalityBuilder().withLower(1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
