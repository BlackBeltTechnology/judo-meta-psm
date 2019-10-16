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

public class ElectricalConductance {

    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_eENjcB85EemH1tWVVVMmqg" name="ElectricalConductance">
      <units xmi:id="_fn_qYB85EemH1tWVVVMmqg" name="siemens" symbol="S"/>
      <terms xmi:id="_hssGAB85EemH1tWVVVMmqg" exponent="-1" unit="_MpgAEB85EemH1tWVVVMmqg"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit siemens = newUnitBuilder().build();

    public void init(Package $package, ElectricalResistance $electricalResistance) {
        useDerivedMeasure($)
                .withName("ElectricalConductance")
                .withUnits(useUnit(siemens)
                        .withName("siemens")
                        .withSymbol("S")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricalResistance.ohm))
                .build();

        usePackage($package).withElements($).build();
    }
}
