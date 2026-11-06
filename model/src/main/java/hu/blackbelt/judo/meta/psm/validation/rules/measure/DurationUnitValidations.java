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

    // Constraint/Critique name constants
    private static final String MICROSECOND_RATE_IS_VALID = "MicrosecondRateIsValid";
    private static final String MILLISECOND_RATE_IS_VALID = "MillisecondRateIsValid";
    private static final String SECOND_RATE_IS_VALID = "SecondRateIsValid";
    private static final String MINUTE_RATE_IS_VALID = "MinuteRateIsValid";
    private static final String HOUR_RATE_IS_VALID = "HourRateIsValid";
    private static final String DAY_RATE_IS_VALID = "DayRateIsValid";
    private static final String WEEK_RATE_IS_VALID = "WeekRateIsValid";
    private static final String YEAR_RATE_IS_VALID = "YearRateIsValid";


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

    @Constraint(name = MICROSECOND_RATE_IS_VALID, message = "Rate of microsecond temporal measure unit is invalid")
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
                        MICROSECOND_RATE_IS_VALID,
                        "Rate of microsecond (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = MILLISECOND_RATE_IS_VALID, message = "Rate of millisecond temporal measure unit is invalid")
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
                        MILLISECOND_RATE_IS_VALID,
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
                        MILLISECOND_RATE_IS_VALID,
                        "Rate of millisecond (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = SECOND_RATE_IS_VALID, message = "Rate of second temporal measure unit is invalid")
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
                        SECOND_RATE_IS_VALID,
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
                        SECOND_RATE_IS_VALID,
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
                        SECOND_RATE_IS_VALID,
                        "Rate of second (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = MINUTE_RATE_IS_VALID, message = "Rate of minute temporal measure unit is invalid")
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
                        MINUTE_RATE_IS_VALID,
                        "Rate of minute (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = HOUR_RATE_IS_VALID, message = "Rate of hour temporal measure unit is invalid")
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
                        HOUR_RATE_IS_VALID,
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
                        HOUR_RATE_IS_VALID,
                        "Rate of hour (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = DAY_RATE_IS_VALID, message = "Rate of day temporal measure unit is invalid")
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
                        DAY_RATE_IS_VALID,
                        "Rate of day (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = WEEK_RATE_IS_VALID, message = "Rate of week temporal measure unit is invalid")
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
                        WEEK_RATE_IS_VALID,
                        "Rate of week (" + self.getName() + ") temporal measure unit is invalid",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = YEAR_RATE_IS_VALID, message = "Rate of year temporal measure unit is invalid")
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
                        YEAR_RATE_IS_VALID,
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
