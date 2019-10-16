package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Territory {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_QckxAINlEeiLE-B2bbL0fg" name="Territory">
          <attributes xmi:id="_XOCQMIOFEeiLE-B2bbL0fg" name="territoryDescription" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_klno0LwOEeiOuYiCo6IbXQ" name="employees" target="_ONN9gINlEeiLE-B2bbL0fg" partner="_h-pmkLwOEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quwudSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="__dS14LwOEeiOuYiCo6IbXQ" name="region" target="_RocuQINlEeiLE-B2bbL0fg" partner="_BEhSYLwPEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98rVwOdSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_vb1JMOdXEeiJv53TEP0vvQ" name="shipper" target="_GnEEcINlEeiLE-B2bbL0fg" partner="_ll8CIOdXEeiJv53TEP0vvQ">
            <cardinality xmi:id="_JiLnAOdYEeiJv53TEP0vvQ"/>
          </relations>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute territoryDescription = newAttributeBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();
    public AssociationEnd region = newAssociationEndBuilder().build();
    public AssociationEnd shipper = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Employee $employee, Region $region, Shipper $shipper) {
        useEntityType($)
                .withName("Territory")
                .withAttributes(useAttribute(territoryDescription)
                        .withName("territoryDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(employees)
                        .withName("territory")
                        .withTarget($employee.$)
                        .withPartner($employee.territory)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(region)
                        .withName("region")
                        .withTarget($region.$)
                        .withPartner($region.territories)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(shipper)
                        .withName("shipper")
                        .withTarget($shipper.$)
                        .withPartner($shipper.territory)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
