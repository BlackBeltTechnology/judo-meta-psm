package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newContainmentBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useContainment;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Customer {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_86B-cINkEeiLE-B2bbL0fg" name="Customer">
          <relations xsi:type="data:AssociationEnd" xmi:id="_KCBq0LwNEeiOuYiCo6IbXQ" name="orders" target="_-H4RoINkEeiLE-B2bbL0fg" partner="_OL6RULwNEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98qus-dSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
          <relations xsi:type="data:Containment" xmi:id="_P60NsLwOEeiOuYiCo6IbXQ" name="addresses" target="_SDnggLv-EeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98qutOdSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd orders = newAssociationEndBuilder().build();
    public Containment addresses = newContainmentBuilder().build();

    public void init(Package $package, Order $order, Address $address) {

        useEntityType($).withName("Customer")
                .withRelations(useAssociationEnd(orders).withName("orders")
                        .withTarget($order.$)
                        .withPartner($order.customer)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(
                        useContainment(addresses).withName("addresses")
                        .withTarget($address.$)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
