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

public class ElectricPotential {

    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_kXwsgB82EemH1tWVVVMmqg" name="ElectricPotential">
      <units xmi:id="_ly8REB82EemH1tWVVVMmqg" name="volt" symbol="V"/>
      <units xmi:id="_XbIhMB86EemH1tWVVVMmqg" name="kilovolt" rateDividend="1000.0" symbol="kV"/>
      <terms xmi:id="_EgRhEB83EemH1tWVVVMmqg" unit="_CbRhMB17Eemwg4NgOjaKeA"/>
      <terms xmi:id="_E5IF8B83EemH1tWVVVMmqg" exponent="-1" unit="_32iO0B81EemH1tWVVVMmqg"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit volt = newUnitBuilder().build();
    public Unit kilovolt = newUnitBuilder().build();

    public void init(Package $package, Work $work, ElectricCharge $electricCharge) {
        useDerivedMeasure($).withName("ElectricPotential")
                .withUnits(useUnit(volt)
                        .withName("volt")
                        .withSymbol("V")
                )
                .withUnits(useUnit(kilovolt)
                        .withName("kilovolt")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("kV")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($work.joule)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricCharge.coulomb)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
