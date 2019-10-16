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

public class ElectricalResistance {

    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_C2EXIB85EemH1tWVVVMmqg" name="ElectricalResistance">
      <units xmi:id="_GsrcUB85EemH1tWVVVMmqg" name="microohm" rateDividend="1.0E-6" symbol="&#x3bc;&#x3a9;"/>
      <units xmi:id="_LK-MkB85EemH1tWVVVMmqg" name="milliohm" rateDividend="0.001" symbol="m&#x3a9;"/>
      <units xmi:id="_MpgAEB85EemH1tWVVVMmqg" name="ohm" symbol="&#x3a9;"/>
      <terms xmi:id="_QXQrQB85EemH1tWVVVMmqg" unit="_ly8REB82EemH1tWVVVMmqg"/>
      <terms xmi:id="_Q07esB85EemH1tWVVVMmqg" exponent="-1" unit="_O-NKcB81EemH1tWVVVMmqg"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit ohm = newUnitBuilder().build();
    public Unit microohm = newUnitBuilder().build();
    public Unit milliohm = newUnitBuilder().build();

    public void init(Package $package, ElectricPotential $electricPotential, ElectricCurrent $electricCurrent) {
        useDerivedMeasure($)
                .withName("ElectricalResistance")
                .withUnits(useUnit(microohm)
                        .withName("microohm")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("\u03bc\u03a9")
                )
                .withUnits(useUnit(milliohm)
                        .withName("milliohm")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("m\u03a9")
                )
                .withUnits(useUnit(ohm)
                        .withName("ohm")
                        .withSymbol("\u03a9")
                )
                .withTerms(newMeasureDefinitionTermBuilder().withUnit($electricPotential.volt))
                .withTerms(newMeasureDefinitionTermBuilder().withExponent(-1).withUnit($electricCurrent.ampere))
                .build();

        usePackage($package).withElements($).build();
    }
}
