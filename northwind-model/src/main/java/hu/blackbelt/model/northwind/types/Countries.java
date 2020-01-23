package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

public class Countries {

    public EnumerationType $ = newEnumerationTypeBuilder().build();

    public void init(Package $package) {
        useEnumerationType($).withName("Countries")
                .withMembers(newEnumerationMemberBuilder().withName("HU").withOrdinal(0).build())
                .withMembers(newEnumerationMemberBuilder().withName("AT").withOrdinal(1).build())
                .withMembers(newEnumerationMemberBuilder().withName("RO").withOrdinal(2).build())
                .withMembers(newEnumerationMemberBuilder().withName("SK").withOrdinal(3).build())
                .build();

        usePackage($package).withElements($).build();
    }

}
