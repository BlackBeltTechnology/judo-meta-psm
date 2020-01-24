package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Capacitance {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit pikofarad = newUnitBuilder().build();
    public Unit nanofarad = newUnitBuilder().build();
    public Unit microfarad = newUnitBuilder().build();
    public Unit farad = newUnitBuilder().build();

    public void init(Package $package, Work $work, ElectricPotential $electricPotential) {
        useDerivedMeasure($)
                .withName("Capacitance")
                .withUnits(useUnit(pikofarad)
                        .withName("pikofarad")
                        .withRateDividend(new Double("1.0E-12"))
                        .withSymbol("pF")
                )
                .withUnits(useUnit(nanofarad)
                        .withName("nanofarad")
                        .withRateDividend(new Double("1.0E-9"))
                        .withSymbol("nF")
                )
                .withUnits(useUnit(microfarad)
                        .withName("microfarad")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("\u03bcF")
                )
                .withUnits(useUnit(farad)
                        .withName("farad")
                        .withSymbol("F")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($work.joule)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricPotential.volt)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
