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

public class ElectricCharge {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_1MUEQB81EemH1tWVVVMmqg" name="ElectricCharge">
      <units xmi:id="_32iO0B81EemH1tWVVVMmqg" name="coulomb" symbol="C"/>
      <terms xmi:id="_7OzyMB81EemH1tWVVVMmqg" unit="_O-NKcB81EemH1tWVVVMmqg"/>
      <terms xmi:id="_6tAFoB81EemH1tWVVVMmqg" unit="_SlUs8B2GEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit coulomb = newUnitBuilder().build();

    public void init(Package $package, ElectricCurrent $electricCurrent, Time $time) {
        useDerivedMeasure($)
                .withName("ElectricCharge")
                .withUnits(useUnit(coulomb)
                        .withName("coulomb")
                        .withSymbol("C")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($electricCurrent.ampere)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($time.second)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
