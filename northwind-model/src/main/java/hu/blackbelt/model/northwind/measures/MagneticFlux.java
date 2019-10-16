package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newDerivedMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureDefinitionTermBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useDerivedMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MagneticFlux {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_qhYOwB85EemH1tWVVVMmqg" name="MagneticFlux">
      <units xmi:id="_tCx0gB85EemH1tWVVVMmqg" name="weber" symbol="Wb"/>
      <terms xmi:id="_zfxGEB85EemH1tWVVVMmqg" unit="_ly8REB82EemH1tWVVVMmqg"/>
      <terms xmi:id="_z3IdMB85EemH1tWVVVMmqg" unit="_SlUs8B2GEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit weber = newUnitBuilder().build();

    public void init(Package $package, ElectricPotential $electricPotential, Time $time) {
        useDerivedMeasure($)
                .withName("MagneticFlux")
                .withUnits(useUnit(weber)
                        .withName("weber")
                        .withSymbol("Wb")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($electricPotential.volt)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($time.second)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
