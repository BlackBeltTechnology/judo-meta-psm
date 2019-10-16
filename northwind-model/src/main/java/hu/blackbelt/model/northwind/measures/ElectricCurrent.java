package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ElectricCurrent {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_Vtka4B80EemH1tWVVVMmqg" name="ElectricCurrent">
      <units xmi:id="_wsXjoB80EemH1tWVVVMmqg" name="milliampere" rateDividend="0.001" symbol="mA"/>
      <units xmi:id="_O-NKcB81EemH1tWVVVMmqg" name="ampere" symbol="A"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public Unit milliampere = newUnitBuilder().build();
    public Unit ampere = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("ElectricCurrent")
                .withUnits(useUnit(milliampere)
                        .withName("milliampere")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("mA")
                )
                .withUnits(useUnit(ampere)
                        .withName("ampere")
                        .withSymbol("A")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
