package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Phone;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Induvidual {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_cPlugL1tEeiOuYiCo6IbXQ" name="Individual" superEntityTypes="_rIapkLzhEeiOuYiCo6IbXQ _86B-cINkEeiLE-B2bbL0fg">
          <attributes xmi:id="_hZhcwL1tEeiOuYiCo6IbXQ" name="phone" dataType="_Lw4a8IOGEeiLE-B2bbL0fg"/>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute phone = newAttributeBuilder().build();

    public void init(Package $package, Phone $phone, Person $person, Customer $customer) {
        useEntityType($).withName("Individual")
                .withSuperEntityTypes($person.$)
                .withSuperEntityTypes($customer.$)
                .withAttributes(useAttribute(phone)
                        .withName("phone")
                        .withDataType($phone.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
