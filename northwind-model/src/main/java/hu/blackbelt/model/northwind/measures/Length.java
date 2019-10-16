package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Length {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_vrNREB1REemwg4NgOjaKeA" name="Length">
      <units xmi:id="_nzyzcB1SEemwg4NgOjaKeA" name="nanometre" rateDividend="1.0E-9" symbol="nm"/>
      <units xmi:id="_tSZxMB1SEemwg4NgOjaKeA" name="micrometre" rateDividend="1.0E-6" symbol="&#x3bc;m"/>
      <units xmi:id="_yhwK8B1SEemwg4NgOjaKeA" name="millimetre" rateDividend="0.001" symbol="mm"/>
      <units xmi:id="_2Z1PwB1SEemwg4NgOjaKeA" name="centimetre" rateDividend="0.01" symbol="cm"/>
      <units xmi:id="_4EKDkB1SEemwg4NgOjaKeA" name="decimetre" rateDividend="0.1" symbol="dm"/>
      <units xmi:id="_5oYPYB1SEemwg4NgOjaKeA" name="metre" symbol="m"/>
      <units xmi:id="_7eDXkB1SEemwg4NgOjaKeA" name="kilometre" rateDividend="1000.0" symbol="km"/>
      <units xmi:id="_yH5cgB1-Eemwg4NgOjaKeA" name="inch" rateDividend="0.0254" symbol="&quot;"/>
      <units xmi:id="_9Dr0oB1-Eemwg4NgOjaKeA" name="foot" rateDividend="0.3048" symbol="ft"/>
      <units xmi:id="__nz-QB1-Eemwg4NgOjaKeA" name="mile" rateDividend="1609.344" symbol="mi"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public Unit nanometre = newUnitBuilder().build();
    public Unit micrometre = newUnitBuilder().build();
    public Unit millimetre = newUnitBuilder().build();
    public Unit centimetre = newUnitBuilder().build();
    public Unit decimetre = newUnitBuilder().build();
    public Unit metre = newUnitBuilder().build();
    public Unit kilometre = newUnitBuilder().build();
    public Unit inch = newUnitBuilder().build();
    public Unit foot = newUnitBuilder().build();
    public Unit mile = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("Length")
                .withUnits(useUnit(nanometre)
                        .withName("nanometre")
                        .withRateDividend(new Double("1.0E-9"))
                        .withSymbol("nm")
                )
                .withUnits(useUnit(micrometre)
                        .withName("micrometre")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("\u03bc")
                )
                .withUnits(useUnit(millimetre)
                        .withName("millimetre")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("mm")
                )
                .withUnits(useUnit(centimetre)
                        .withName("centimetre")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("cm")
                )
                .withUnits(useUnit(decimetre)
                        .withName("decimetre")
                        .withRateDividend(new Double("0.1"))
                        .withSymbol("dm")
                )
                .withUnits(useUnit(metre)
                        .withName("metre")
                        .withSymbol("m")
                )
                .withUnits(useUnit(kilometre)
                        .withName("kilometre")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("km")
                )
                .withUnits(useUnit(inch)
                        .withName("inch")
                        .withRateDividend(new Double("0.0254"))
                        .withSymbol("\"")
                )
                .withUnits(useUnit(foot)
                        .withName("foot")
                        .withRateDividend(new Double("0.3048"))
                        .withSymbol("ft")
                )
                .withUnits(useUnit(mile)
                        .withName("mile")
                        .withRateDividend(new Double("1609.344"))
                        .withSymbol("mi")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
