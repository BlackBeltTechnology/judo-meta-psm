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

public class MagneticFluxDensity {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_5RraUB85EemH1tWVVVMmqg" name="MagneticFluxDensity">
      <units xmi:id="_7U6dYB85EemH1tWVVVMmqg" name="tesla" symbol="T"/>
      <terms xmi:id="_IqxrQB86EemH1tWVVVMmqg" unit="_tCx0gB85EemH1tWVVVMmqg"/>
      <terms xmi:id="_JEhoAB86EemH1tWVVVMmqg" exponent="-1" unit="_eD5KMB1TEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit tesla = newUnitBuilder().build();

    public void init(Package $package, MagneticFlux $magneticFlux, Area $area) {
        useDerivedMeasure($)
                .withName("MagneticFluxDensity")
                .withUnits(useUnit(tesla)
                        .withName("tesla")
                        .withSymbol("T")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($magneticFlux.weber)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($area.squareMetre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
