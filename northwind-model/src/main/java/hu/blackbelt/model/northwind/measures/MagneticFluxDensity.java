package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MagneticFluxDensity {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit tesla = newUnitBuilder().build();

    public void init(Package $package, MagneticFlux $magneticFlux, Area $area) {
        useDerivedMeasure($)
                .withName("MagneticFluxDensity")
                .withUnits(useUnit(tesla)
                        .withName("tesla")
                        .withSymbol("T")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($magneticFlux.weber)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($area.squareMetre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
