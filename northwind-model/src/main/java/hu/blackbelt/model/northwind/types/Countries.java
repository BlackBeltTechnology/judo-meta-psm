package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationMemberBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useEnumerationType;

public class Countries {
    /*
        <elements xsi:type="type:EnumerationType" xmi:id="_G2wVsI57EeioH6CUzUrG0Q" name="Countries">
          <members xmi:id="_HUnWYI57EeioH6CUzUrG0Q" name="HU"/>
          <members xmi:id="_KfjBUI57EeioH6CUzUrG0Q" name="AT" ordinal="1"/>
          <members xmi:id="_KyxfUI57EeioH6CUzUrG0Q" name="RO" ordinal="2"/>
          <members xmi:id="_LEloEI57EeioH6CUzUrG0Q" name="SK" ordinal="3"/>
        </elements>
    */
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
