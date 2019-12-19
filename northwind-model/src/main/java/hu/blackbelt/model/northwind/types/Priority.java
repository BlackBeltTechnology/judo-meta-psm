package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationMemberBuilder;

public class Priority {

    public EnumerationType $ = newEnumerationTypeBuilder().build();

    public void init(Package $package) {
        useEnumerationType($).withName("Priority")
                .withMembers(newEnumerationMemberBuilder().withName("NORMAL").withOrdinal(0).build())
                .withMembers(newEnumerationMemberBuilder().withName("URGENT").withOrdinal(1).build())
                .build();

        usePackage($package).withElements($).build();
    }
}
