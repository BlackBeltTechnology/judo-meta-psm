package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationMemberBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useEnumerationType;

public class Titles {
    /*
        <elements xsi:type="type:EnumerationType" xmi:id="_hJ-K0I57EeioH6CUzUrG0Q" name="Titles">
          <members xmi:id="_iHpUAI57EeioH6CUzUrG0Q" name="MS"/>
          <members xmi:id="_jKZxgI57EeioH6CUzUrG0Q" name="MRS" ordinal="1"/>
          <members xmi:id="_j3WXEI57EeioH6CUzUrG0Q" name="MR" ordinal="2"/>
          <members xmi:id="_kgvSUI57EeioH6CUzUrG0Q" name="DR" ordinal="3"/>
        </elements>
    */
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
