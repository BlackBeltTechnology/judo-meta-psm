# judo-meta-psm

[![Build Status](https://github.com/BlackBeltTechnology/judo-meta-psm/actions/workflows/build.yml/badge.svg?branch=develop)](https://github.com/BlackBeltTechnology/judo-meta-psm/actions/workflows/build.yml)

## Introduction

> PSM is an acronym, which stands for "Platform Specific Model"

This repository contains the PSM meta model.

It acts as an eclipse plugin with features and sites, can be used standalone and in standard OSGi (without eclipse).

In essence this is the JUDO runtime's meta model or an entry point to actual operations-related modules. From a transformation
point of view this model is the first in the chain, followed by [ASM](https://github.com/BlackBeltTechnology/judo-meta-asm), [Measure](https://github.com/BlackBeltTechnology/judo-meta-measure), etc...

## Context

This project is a building block of the [judo-community](https://github.com/BlackBeltTechnology/judo-community) aggregator
project. In order to better understand how this module fits into our ecosystem, please check the corresponding documentation!

## Model Validation

PSM models are validated using two complementary validation frameworks:

* **EVL (Epsilon Validation Language)**: Original validation implementation located in `model/src/main/epsilon/validations/`
* **Java Validation Framework (Zeta)**: Native Java validation with better IDE support and ~7.5x performance improvement, located in `model/src/main/java/hu/blackbelt/judo/meta/psm/validation/`

Both frameworks implement identical validation rules and produce consistent results.

See [Validation Documentation](docs/validation/README.md) for PSM-specific details.

For comprehensive Zeta framework documentation, see the [judo-zeta repository](https://github.com/BlackBeltTechnology/judo-zeta).

## Contributing to the project

Everyone is welcome to contribute to JUDO! As a starter, please read the corresponding [CONTRIBUTING](CONTRIBUTING.md) guide for details!

## License

This project is licensed under the [Eclipse Public License - v 2.0](https://www.eclipse.org/legal/epl-2.0/).
