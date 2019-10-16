package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class InternationalOrder {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_MoVqYINlEeiLE-B2bbL0fg" name="InternationalOrder" superEntityTypes="_-H4RoINkEeiLE-B2bbL0fg">
          <attributes xmi:id="_FpOkYIN_EeiLE-B2bbL0fg" name="customsDescription" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_It85oIN_EeiLE-B2bbL0fg" name="exciseTax" dataType="_VDVVQIUcEeipmMyz9cMCRA" required="true"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute customsDescription = newAttributeBuilder().build();
    public Attribute exciseTax = newAttributeBuilder().build();

    public void init(Package $package, String $string, Double $double, Order $order) {
        useEntityType($)
                .withName("InternationalOrder")
                .withSuperEntityTypes($order.$)
                .withAttributes(useAttribute(customsDescription)
                        .withName("customsDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(exciseTax)
                        .withName("exciseTax")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
