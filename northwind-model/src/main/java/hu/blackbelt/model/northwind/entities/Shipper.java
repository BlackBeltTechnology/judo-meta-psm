package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Shipper {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_GnEEcINlEeiLE-B2bbL0fg" name="Shipper" superEntityTypes="_DJ29wINlEeiLE-B2bbL0fg">
          <relations xsi:type="data:AssociationEnd" xmi:id="_Z9PKULwNEeiOuYiCo6IbXQ" name="shipperOrders" target="_-H4RoINkEeiLE-B2bbL0fg" partner="_WVBGcLwNEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quvOdSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_ll8CIOdXEeiJv53TEP0vvQ" name="territory" target="_QckxAINlEeiLE-B2bbL0fg" partner="_vb1JMOdXEeiJv53TEP0vvQ">
            <cardinality xmi:id="_EeeckOdYEeiJv53TEP0vvQ"/>
          </relations>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd shipperOrders = newAssociationEndBuilder().build();
    public AssociationEnd territory = newAssociationEndBuilder().build();

    public void init(Package $package, Company $company, Order $order, Territory $territory) {
        useEntityType($)
                .withName("Shipper")
                .withSuperEntityTypes($company.$)
                .withRelations(useAssociationEnd(shipperOrders)
                        .withName("shipperOrders")
                        .withTarget($order.$)
                        .withPartner($order.shipper)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(territory)
                        .withName("territory")
                        .withTarget($territory.$)
                        .withPartner($territory.shipper)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
