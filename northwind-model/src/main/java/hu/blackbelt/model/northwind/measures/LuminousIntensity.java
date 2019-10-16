package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class LuminousIntensity {

    /*
    <elements xsi:type="measure:Measure" xmi:id="_eFbBMB81EemH1tWVVVMmqg" name="LuminousIntensity">
      <units xmi:id="_flGEMB81EemH1tWVVVMmqg" name="candela" symbol="cd"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public Unit candela = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("LuminousIntensity")
                .withUnits(useUnit(candela)
                        .withName("candela")
                        .withSymbol("cd")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
