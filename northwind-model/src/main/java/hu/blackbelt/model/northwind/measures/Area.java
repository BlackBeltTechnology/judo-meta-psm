package hu.blackbelt.model.northwind.measures;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Area {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit squareMillimetre = newUnitBuilder().build();
    public Unit squareCentimetre = newUnitBuilder().build();
    public Unit squareDecimetre = newUnitBuilder().build();
    public Unit squareMetre = newUnitBuilder().build();
    public Unit hectare = newUnitBuilder().build();
    public Unit squareKilometre = newUnitBuilder().build();

    public void init(Package $package, Length $length) {
        useDerivedMeasure($)
                .withName("Area")
                .withUnits(useUnit(squareMillimetre)
                        .withName("squareMillimetre")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("mm\u00b2")
                )
                .withUnits(useUnit(squareCentimetre)
                        .withName("squareCentimetre")
                        .withRateDividend(new Double("1.0E-4"))
                        .withSymbol("cm\u00b2")
                )
                .withUnits(useUnit(squareDecimetre)
                        .withName("squareDecimetre")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("dm\u00b2")
                )
                .withUnits(useUnit(squareMetre)
                        .withName("squareMetre")
                        .withSymbol("m\u00b2")
                )
                .withUnits(useUnit(hectare)
                        .withName("hectare")
                        .withRateDividend(new Double("10000.0"))
                        .withSymbol("ha")
                )
                .withUnits(useUnit(squareKilometre)
                        .withName("squareKilometre")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("km\u00b2")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(2)
                        .withUnit($length.metre)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
