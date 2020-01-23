package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

public class Titles {

    public EnumerationType $ = newEnumerationTypeBuilder().build();

    public void init(Package $package) {
        useEnumerationType($).withName("Titles")
                .withMembers(newEnumerationMemberBuilder().withName("MS").withOrdinal(0).build())
                .withMembers(newEnumerationMemberBuilder().withName("MRS").withOrdinal(1).build())
                .withMembers(newEnumerationMemberBuilder().withName("MR").withOrdinal(2).build())
                .withMembers(newEnumerationMemberBuilder().withName("DR").withOrdinal(3).build())
                .build();

        usePackage($package).withElements($).build();
    }

}
