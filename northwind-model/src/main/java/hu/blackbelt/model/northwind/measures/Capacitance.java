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

public class Capacitance {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_MeJWkB83EemH1tWVVVMmqg" name="Capacitance">
      <units xmi:id="_QoAH4B83EemH1tWVVVMmqg" name="pikofarad" rateDividend="1.0E-12" symbol="pF"/>
      <units xmi:id="_TlB5sB83EemH1tWVVVMmqg" name="nanofarad" rateDividend="1.0E-9" symbol="nF"/>
      <units xmi:id="_T90NIB83EemH1tWVVVMmqg" name="microfarad" rateDividend="1.0E-6" symbol="&#x3bc;F"/>
      <units xmi:id="_UXM9gB83EemH1tWVVVMmqg" name="farad" symbol="F"/>
      <terms xmi:id="_hRg30B83EemH1tWVVVMmqg" unit="_32iO0B81EemH1tWVVVMmqg"/>
      <terms xmi:id="_k2TNMB83EemH1tWVVVMmqg" exponent="-1" unit="_ly8REB82EemH1tWVVVMmqg"/>
    </elements>
    */
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
