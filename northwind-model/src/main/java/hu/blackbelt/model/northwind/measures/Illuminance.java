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

public class Illuminance {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_wsFoEB86EemH1tWVVVMmqg" name="Illuminance">
      <units xmi:id="_x8b1oB86EemH1tWVVVMmqg" name="lux" symbol="lx"/>
      <terms xmi:id="_1I2HQB86EemH1tWVVVMmqg" unit="_flGEMB81EemH1tWVVVMmqg"/>
      <terms xmi:id="_1cs3YB86EemH1tWVVVMmqg" exponent="-1" unit="_eD5KMB1TEemwg4NgOjaKeA"/>
    </elements>
     */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit lux = newUnitBuilder().build();

    public void init(Package $package, LuminousIntensity $luminousIntensity, Area $area) {
        useDerivedMeasure($)
                .withName("Illuminance")
                .withUnits(useUnit(lux)
                        .withName("lux")
                        .withSymbol("lx")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($luminousIntensity.candela))
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($area.squareMetre))
                .build();

        usePackage($package).withElements($).build();
    }
}
