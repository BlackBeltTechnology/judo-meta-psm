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

public class OnlineInternationalOrder {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_EhVb8JusEeidMOq99SGQ3A" name="OnlineInternationalOrder" superEntityTypes="_MoVqYINlEeiLE-B2bbL0fg _jUJwQJupEeidMOq99SGQ3A">
          <attributes xmi:id="_G10AAJusEeidMOq99SGQ3A" name="onlineTrackingNumber" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute onlineTrackingNumber = newAttributeBuilder().build();

    public void init(Package $package, String $string, InternationalOrder $internationalOrder, OnlineOrder $onlineOrder) {
        useEntityType($)
                .withName("OnlineInternationalOrder")
                .withSuperEntityTypes($internationalOrder.$)
                .withSuperEntityTypes($onlineOrder.$)
                .withAttributes(useAttribute(onlineTrackingNumber)
                        .withName("onlineTrackingNumber")
                        .withDataType($string.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
