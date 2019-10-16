package hu.blackbelt.model.northwind.types.measured;

import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.measures.Area;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasuredTypeBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasuredType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class AreaStoredInSquareMetre {

    /*
          <elements xsi:type="measure:MeasuredType" xmi:id="_fdkrMB1ZEemwg4NgOjaKeA" name="AreaStoredInSquareMetre" precision="15" scale="4" storeUnit="_eD5KMB1TEemwg4NgOjaKeA"/>
    */
    public MeasuredType $ = newMeasuredTypeBuilder().build();

    public void init(Package $package, Area $area) {
        useMeasuredType($)
                .withName("AreaStoredInSquareMetre").withPrecision(15).withScale(4).withStoreUnit($area.squareMetre).build();

        usePackage($package).withElements($).build();
    }
}