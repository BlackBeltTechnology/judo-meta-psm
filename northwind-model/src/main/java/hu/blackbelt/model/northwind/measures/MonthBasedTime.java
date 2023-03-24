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

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MonthBasedTime {

    public Measure $ = newMeasureBuilder().build();
    public DurationUnit month = newDurationUnitBuilder().build();
    public DurationUnit year = newDurationUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("MonthBasedTime")
                .withUnits(useDurationUnit(month)
                        .withName("month")
                        .withUnitType(DurationType.MONTH)
                )
                .withUnits(useDurationUnit(year)
                        .withName("year")
                        .withRateDividend(new Double("12.0"))
                        .withUnitType(DurationType.YEAR)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
