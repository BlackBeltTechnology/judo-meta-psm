package hu.blackbelt.judo.meta.psm.validation.rules.measure;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2024 BlackBelt Technology
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

import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

import java.util.Optional;

/**
 * Validation rules for DurationUnit.
 * Corresponds to validations/measure/durationUnit.evl
 * 
 * Note: These validations are simplified versions. The full rate calculations
 * require psmUtils.getRate() which is complex to implement.
 */
@ValidationContext(DurationUnit.class)
public class DurationUnitValidations {

    // Helper class for rate calculation
    private static class Rate {
        final double dividend;
        final double divisor;
        
        Rate(double dividend, double divisor) {
            this.dividend = dividend;
            this.divisor = divisor;
        }
    }

    private Optional<Rate> getRate(DurationUnit self, DurationType targetType) {
        if (self.eContainer() == null || !(self.eContainer() instanceof Measure)) {
            return Optional.empty();
        }
        
        Measure measure = (Measure) self.eContainer();
        Optional<DurationUnit> targetUnit = measure.getUnits().stream()
                .filter(u -> u instanceof DurationUnit)
                .map(u -> (DurationUnit) u)
                .filter(u -> u.getUnitType() == targetType)
                .findFirst();
        
        if (!targetUnit.isPresent()) {
            return Optional.empty();
        }
        
        DurationUnit target = targetUnit.get();
        return Optional.of(new Rate(
                self.getRateDividend() * target.getRateDivisor(),
                self.getRateDivisor() * target.getRateDividend()
        ));
    }

    @Constraint(name = "MicrosecondRateIsValid", message = "Rate of microsecond temporal measure unit is invalid")
    public ValidationRule microsecondRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.MICROSECOND) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToNanosecond = getRate(self, DurationType.NANOSECOND);
        if (rateToNanosecond.isPresent()) {
            Rate rate = rateToNanosecond.get();
            if (rate.dividend != rate.divisor * 1000.0d) {
                return ValidationResult.fail(
                        "MicrosecondRateIsValid",
                        "Rate of microsecond (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "MillisecondRateIsValid", message = "Rate of millisecond temporal measure unit is invalid")
    public ValidationRule millisecondRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.MILLISECOND) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToNanosecond = getRate(self, DurationType.NANOSECOND);
        Optional<Rate> rateToMicrosecond = getRate(self, DurationType.MICROSECOND);
        
        if (rateToNanosecond.isPresent()) {
            Rate rate = rateToNanosecond.get();
            if (rate.dividend != rate.divisor * 1000000.0d) {
                return ValidationResult.fail(
                        "MillisecondRateIsValid",
                        "Rate of millisecond (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        if (rateToMicrosecond.isPresent()) {
            Rate rate = rateToMicrosecond.get();
            if (rate.dividend != rate.divisor * 1000.0d) {
                return ValidationResult.fail(
                        "MillisecondRateIsValid",
                        "Rate of millisecond (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "SecondRateIsValid", message = "Rate of second temporal measure unit is invalid")
    public ValidationRule secondRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.SECOND) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToNanosecond = getRate(self, DurationType.NANOSECOND);
        Optional<Rate> rateToMicrosecond = getRate(self, DurationType.MICROSECOND);
        Optional<Rate> rateToMillisecond = getRate(self, DurationType.MILLISECOND);
        
        if (rateToNanosecond.isPresent()) {
            Rate rate = rateToNanosecond.get();
            if (rate.dividend != rate.divisor * 1000000000.0d) {
                return ValidationResult.fail(
                        "SecondRateIsValid",
                        "Rate of second (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        if (rateToMicrosecond.isPresent()) {
            Rate rate = rateToMicrosecond.get();
            if (rate.dividend != rate.divisor * 1000000.0d) {
                return ValidationResult.fail(
                        "SecondRateIsValid",
                        "Rate of second (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        if (rateToMillisecond.isPresent()) {
            Rate rate = rateToMillisecond.get();
            if (rate.dividend != rate.divisor * 1000.0d) {
                return ValidationResult.fail(
                        "SecondRateIsValid",
                        "Rate of second (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "MinuteRateIsValid", message = "Rate of minute temporal measure unit is invalid")
    public ValidationRule minuteRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.MINUTE) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToSecond = getRate(self, DurationType.SECOND);
        
        if (rateToSecond.isPresent()) {
            Rate rate = rateToSecond.get();
            if (rate.dividend != rate.divisor * 60.0d) {
                return ValidationResult.fail(
                        "MinuteRateIsValid",
                        "Rate of minute (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "HourRateIsValid", message = "Rate of hour temporal measure unit is invalid")
    public ValidationRule hourRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.HOUR) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToMinute = getRate(self, DurationType.MINUTE);
        Optional<Rate> rateToSecond = getRate(self, DurationType.SECOND);
        
        if (rateToMinute.isPresent()) {
            Rate rate = rateToMinute.get();
            if (rate.dividend != rate.divisor * 60.0d) {
                return ValidationResult.fail(
                        "HourRateIsValid",
                        "Rate of hour (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        if (rateToSecond.isPresent()) {
            Rate rate = rateToSecond.get();
            if (rate.dividend != rate.divisor * 3600.0d) {
                return ValidationResult.fail(
                        "HourRateIsValid",
                        "Rate of hour (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "DayRateIsValid", message = "Rate of day temporal measure unit is invalid")
    public ValidationRule dayRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.DAY) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToHour = getRate(self, DurationType.HOUR);
        
        if (rateToHour.isPresent()) {
            Rate rate = rateToHour.get();
            if (rate.dividend != rate.divisor * 24.0d) {
                return ValidationResult.fail(
                        "DayRateIsValid",
                        "Rate of day (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "WeekRateIsValid", message = "Rate of week temporal measure unit is invalid")
    public ValidationRule weekRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.WEEK) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToDay = getRate(self, DurationType.DAY);
        
        if (rateToDay.isPresent()) {
            Rate rate = rateToDay.get();
            if (rate.dividend != rate.divisor * 7.0d) {
                return ValidationResult.fail(
                        "WeekRateIsValid",
                        "Rate of week (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "YearRateIsValid", message = "Rate of year temporal measure unit is invalid")
    public ValidationRule yearRateIsValid() {
        return (element, context) -> {
            DurationUnit self = (DurationUnit) element;
        if (self.getUnitType() != DurationType.YEAR) {
            return ValidationResult.pass();
        }

        Optional<Rate> rateToMonth = getRate(self, DurationType.MONTH);
        
        if (rateToMonth.isPresent()) {
            Rate rate = rateToMonth.get();
            if (rate.dividend != rate.divisor * 12.0d) {
                return ValidationResult.fail(
                        "YearRateIsValid",
                        "Rate of year (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }
}
