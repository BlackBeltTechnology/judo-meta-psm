package hu.blackbelt.model.northwind.types.measured;

import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.measures.Time;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasuredTypeBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasuredType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class TimeStoredInSeconds {

    /*
          <elements xsi:type="measure:MeasuredType" xmi:id="_PGtxgB1ZEemwg4NgOjaKeA" name="TimeStoredInSeconds" precision="15" scale="4" storeUnit="_SlUs8B2GEemwg4NgOjaKeA"/>
    */
    public MeasuredType $ = newMeasuredTypeBuilder().build();

    public void init(Package $package, Time $time) {
        useMeasuredType($)
                .withName("TimeStoredInSeconds").withPrecision(15).withScale(4).withStoreUnit($time.second).build();

        usePackage($package).withElements($).build();
    }

}
