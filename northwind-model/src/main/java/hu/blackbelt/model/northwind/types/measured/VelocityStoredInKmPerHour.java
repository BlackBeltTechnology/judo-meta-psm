package hu.blackbelt.model.northwind.types.measured;

import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.measures.Velocity;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasuredTypeBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasuredType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class VelocityStoredInKmPerHour {

    /*
             <elements xsi:type="measure:MeasuredType" xmi:id="_bfc2gB1eEemwg4NgOjaKeA" name="VelocityStoredInKmPerHour" precision="15" scale="4" storeUnit="_zR6KoB1UEemwg4NgOjaKeA"/>
     */
    public MeasuredType $ = newMeasuredTypeBuilder().build();

    public void init(Package $package, Velocity $velocity) {
        useMeasuredType($)
                .withName("VelocityStoredInKmPerHour").withPrecision(15).withScale(4).withStoreUnit($velocity.kilometrePerHour).build();

        usePackage($package).withElements($).build();
    }

}
