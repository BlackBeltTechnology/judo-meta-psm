package hu.blackbelt.model.northwind.types.measured;

import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.measures.Mass;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasuredTypeBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasuredType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MassStoredInKilograms {

    /*
      <elements xsi:type="measure:MeasuredType" xmi:id="_h2iYkB1XEemwg4NgOjaKeA" name="MassStoredInKilograms" precision="15" scale="4" storeUnit="_C8XYsB1SEemwg4NgOjaKeA"/>
    */
    public MeasuredType $ = newMeasuredTypeBuilder().build();

    public void init(Package $package, Mass $mass) {
        useMeasuredType($)
                .withName("MassStoredInKilograms").withPrecision(15).withScale(4).withStoreUnit($mass.kilogram).build();

        usePackage($package).withElements($).build();
    }

}
