package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Customer {

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
