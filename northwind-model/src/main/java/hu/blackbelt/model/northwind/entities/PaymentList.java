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

public class PaymentList {

    /*
        <elements xsi:type="data:EntityType" xmi:id="_ehrfwOdYEeiJv53TEP0vvQ" name="PaymentList">
          <relations xsi:type="data:AssociationEnd" xmi:id="_nxkWwOdYEeiJv53TEP0vvQ" name="employees" target="_ONN9gINlEeiLE-B2bbL0fg">
            <cardinality xmi:id="_tO5iIOdYEeiJv53TEP0vvQ" lower="1" upper="-1"/>
          </relations>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();

    public void init(Package $package, Employee $employee) {
        useEntityType($)
                .withName("PaymentList")
                .withRelations(useAssociationEnd(employees)
                        .withName("employees")
                        .withTarget($employee.$)
                        .withCardinality(newCardinalityBuilder().withLower(1).withUpper(-1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
