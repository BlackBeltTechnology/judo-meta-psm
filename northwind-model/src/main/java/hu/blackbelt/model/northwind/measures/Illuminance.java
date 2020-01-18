package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Illuminance {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit lux = newUnitBuilder().build();

    public void init(Package $package, LuminousIntensity $luminousIntensity, Area $area) {
        useDerivedMeasure($)
                .withName("Illuminance")
                .withUnits(useUnit(lux)
                        .withName("lux")
                        .withSymbol("lx")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($luminousIntensity.candela))
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($area.squareMetre))
                .build();

        usePackage($package).withElements($).build();
    }
}
