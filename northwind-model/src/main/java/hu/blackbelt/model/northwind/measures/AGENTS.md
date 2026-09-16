# AGENTS.md — `northwind-model/src/main/java/hu/blackbelt/model/northwind/measures`

Base and derived physical measurement definitions for the Northwind PSM model.

| File | Purpose |
| --- | --- |
| `Acceleration.java` | Defines derived measure `Acceleration`. Exports `init(...)`. Derives units from `Velocity` divided by `Time`. |
| `AmountOfSubstance.java` | Defines base measure `AmountOfSubstance`. Exports `init(...)`. Registers mole unit and symbols. |
| `Area.java` | Defines derived measure `Area`. Exports `init(...)`. Derives square units from `Length` squared. |
| `Capacitance.java` | Defines derived measure `Capacitance`. Exports `init(...)`. Derives farad units from `ElectricPotential` and `Work`. |
| `Density.java` | Defines derived measure `Density`. Exports `init(...)`. Derives units from `Mass` divided by `Volume`. |
| `ElectricCharge.java` | Defines derived measure `ElectricCharge`. Exports `init(...)`. Derives coulomb units from `ElectricCurrent` and `Time`. |
| `ElectricCurrent.java` | Defines base measure `ElectricCurrent`. Exports `init(...)`. Registers ampere unit and symbols. |
| `ElectricPotential.java` | Defines derived measure `ElectricPotential`. Exports `init(...)`. Derives volt units from `Work` and `ElectricCharge`. |
| `ElectricalConductance.java` | Defines derived measure `ElectricalConductance`. Exports `init(...)`. Derives siemens units from the reciprocal of `ElectricalResistance`. |
| `ElectricalResistance.java` | Defines derived measure `ElectricalResistance`. Exports `init(...)`. Derives ohm units from `ElectricPotential` and `ElectricCurrent`. |
| `Force.java` | Defines derived measure `Force`. Exports `init(...)`. Derives newton units from `Mass` and `Acceleration`. |
| `Frequency.java` | Defines derived measure `Frequency`. Exports `init(...)`. Derives hertz units from reciprocal of `Time`. |
| `Illuminance.java` | Defines derived measure `Illuminance`. Exports `init(...)`. Derives lux units from `LuminousIntensity` and `Area`. |
| `Inductance.java` | Defines derived measure `Inductance`. Exports `init(...)`. Derives henry units from `MagneticFlux` and `ElectricCurrent`. |
| `Length.java` | Defines base measure `Length`. Exports `init(...)`. Configures meter base unit, inch, foot, yard, mile, and metric multiples. |
| `LuminousIntensity.java` | Defines base measure `LuminousIntensity`. Exports `init(...)`. Registers candela unit and symbols. |
| `MagneticFlux.java` | Defines derived measure `MagneticFlux`. Exports `init(...)`. Derives weber units from `ElectricPotential` and `Time`. |
| `MagneticFluxDensity.java` | Defines derived measure `MagneticFluxDensity`. Exports `init(...)`. Derives tesla units from `MagneticFlux` and `Area`. |
| `Mass.java` | Defines base measure `Mass`. Exports `init(...)`. Configures kilogram base unit, gram, metric ton, and imperial weight units. |
| `Momentum.java` | Defines derived measure `Momentum`. Exports `init(...)`. Derives units from `Mass` and `Velocity`. |
| `MonthBasedTime.java` | Defines calendar duration measure `MonthBasedTime`. Exports `init(...)`. Configures month, quarter, and year duration units. |
| `Power.java` | Defines derived measure `Power`. Exports `init(...)`. Derives watt units from `Work` divided by `Time`. |
| `Pressure.java` | Defines derived measure `Pressure`. Exports `init(...)`. Derives pascal units from `Force` divided by `Area`. |
| `Temperature.java` | Defines base measure `Temperature`. Exports `init(...)`. Registers degree Celsius and Fahrenheit temperature units. |
| `ThermodynamicTemperature.java` | Defines base measure `ThermodynamicTemperature`. Exports `init(...)`. Registers kelvin unit. |
| `Time.java` | Defines temporal duration measure `Time`. Exports `init(...)`. Configures second base unit, nanosecond, millisecond, minute, hour, day, and week units. |
| `Velocity.java` | Defines derived measure `Velocity`. Exports `init(...)`. Derives velocity units from `Length` divided by `Time`. |
| `Volume.java` | Defines derived measure `Volume`. Exports `init(...)`. Derives cubic units and litre capacities from `Length`. |
| `Work.java` | Defines derived measure `Work` (energy). Exports `init(...)`. Derives joule units from `Force` multiplied by `Length`. |
