package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Url;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class OnlineOrder {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_jUJwQJupEeidMOq99SGQ3A" name="OnlineOrder" superEntityTypes="_-H4RoINkEeiLE-B2bbL0fg">
          <attributes xmi:id="_sG6mYJupEeidMOq99SGQ3A" name="webshopUrl" dataType="_A5EFMIN4EeiLE-B2bbL0fg" required="true"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute webshopUrl = newAttributeBuilder().build();

    public void init(Package $package, Url $url, Order $order) {
        useEntityType($)
                .withName("OnlineOrder")
                .withSuperEntityTypes($order.$)
                .withAttributes(useAttribute(webshopUrl)
                        .withName("webshopUrl")
                        .withDataType($url.$)
                        .withRequired(true)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
