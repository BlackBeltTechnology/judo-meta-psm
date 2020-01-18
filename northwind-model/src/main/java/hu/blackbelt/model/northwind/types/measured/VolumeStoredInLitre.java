package hu.blackbelt.model.northwind.types.measured;

import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.measures.Volume;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasuredTypeBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasuredType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class VolumeStoredInLitre {

    public MeasuredType $ = newMeasuredTypeBuilder().build();

    public void init(Package $package, Volume $volume) {
        useMeasuredType($)
                .withName("VolumeStoredInLitre").withPrecision(15).withScale(4).withStoreUnit($volume.litre).build();

        usePackage($package).withElements($).build();
    }
}
