package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Countries;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class InternationalAddress {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_vTNmEL2REeiOuYiCo6IbXQ" name="InternationalAddress" superEntityTypes="_SDnggLv-EeiOuYiCo6IbXQ">
          <attributes xmi:id="_bAzd8Lv-EeiOuYiCo6IbXQ" name="country" dataType="_G2wVsI57EeioH6CUzUrG0Q"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute country = newAttributeBuilder().build();

    public void init(Package $package, Countries $countries, Address $address) {
        useEntityType($)
                .withName("InternationalAddress")
                .withSuperEntityTypes($address.$)
                .withAttributes(useAttribute(country)
                        .withName("country")
                        .withDataType($countries.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
