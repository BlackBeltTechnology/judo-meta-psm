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

public class Inductance {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_fFXB8B86EemH1tWVVVMmqg" name="Inductance">
      <units xmi:id="_gz8qsB86EemH1tWVVVMmqg" name="henry" symbol="H"/>
      <terms xmi:id="_jClsgB86EemH1tWVVVMmqg" unit="_tCx0gB85EemH1tWVVVMmqg"/>
      <terms xmi:id="_jXkeAB86EemH1tWVVVMmqg" exponent="-1" unit="_O-NKcB81EemH1tWVVVMmqg"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit henry = newUnitBuilder().build();

    public void init(Package $package, MagneticFlux $magneticFlux, ElectricCurrent $electricCurrent) {
        useDerivedMeasure($)
                .withName("Inductance")
                .withUnits(useUnit(henry)
                        .withName("henry")
                        .withSymbol("H")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($magneticFlux.weber)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricCurrent.ampere)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
