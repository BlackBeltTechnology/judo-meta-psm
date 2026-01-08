package hu.blackbelt.judo.meta.psm.cli;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import hu.blackbelt.judo.cli.api.CliValidationException;
import hu.blackbelt.judo.cli.api.ModelValidator;
import hu.blackbelt.judo.cli.api.ValidationType;
import hu.blackbelt.judo.meta.psm.PsmEpsilonValidator;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.zeta.validation.core.Severity;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;

/**
 * PSM validator implementation.
 * <p>
 * Implements {@link ModelValidator} from model-cli-api for type-safe validation.
 * Supports both Epsilon (EVL) and Zeta (Java) validation engines.
 */
public class PsmValidatorImpl implements ModelValidator {

    @Override
    public String getModelType() {
        return "psm";
    }

    @Override
    public Set<ValidationType> getSupportedTypes() {
        return Set.of(ValidationType.EPSILON, ValidationType.ZETA, ValidationType.BOTH);
    }

    @Override
    public void validate(Logger logger, Object model) throws CliValidationException {
        // Default to EPSILON validation
        validate(logger, model, ValidationType.EPSILON);
    }

    @Override
    public void validate(Logger logger, Object model, ValidationType type) throws CliValidationException {
        if (!(model instanceof PsmModel)) {
            throw new IllegalArgumentException(
                "Expected PsmModel but got: " + (model == null ? "null" : model.getClass().getName()));
        }
        
        PsmModel psmModel = (PsmModel) model;
        List<CliValidationException> exceptions = new ArrayList<>();

        // Run EPSILON validation
        if (type == ValidationType.EPSILON || type == ValidationType.BOTH) {
            try {
                validateWithEpsilon(logger, psmModel);
            } catch (CliValidationException e) {
                exceptions.add(e);
            }
        }

        // Run ZETA validation
        if (type == ValidationType.ZETA || type == ValidationType.BOTH) {
            try {
                validateWithZeta(logger, psmModel);
            } catch (CliValidationException e) {
                exceptions.add(e);
            }
        }

        // If there were any exceptions, combine and throw
        if (!exceptions.isEmpty()) {
            if (exceptions.size() == 1) {
                throw exceptions.get(0);
            }
            // Combine all errors from multiple validators
            List<String> allErrors = new ArrayList<>();
            for (CliValidationException e : exceptions) {
                for (String error : e.getErrors()) {
                    String prefix = e.getValidationType() != null 
                        ? "[" + e.getValidationType().name() + "] " 
                        : "";
                    allErrors.add(prefix + error);
                }
            }
            throw new CliValidationException("psm", type, allErrors);
        }
    }

    private void validateWithEpsilon(Logger logger, PsmModel psmModel) throws CliValidationException {
        try {
            PsmEpsilonValidator.validatePsm(logger, psmModel, 
                PsmEpsilonValidator.calculatePsmValidationScriptURI());
        } catch (Exception e) {
            throw new CliValidationException("psm", ValidationType.EPSILON, 
                "Epsilon validation failed: " + e.getMessage(), e);
        }
    }

    private void validateWithZeta(Logger logger, PsmModel psmModel) throws CliValidationException {
        List<ValidationResult> results = PsmValidator.validate(logger, psmModel);
        
        // Collect errors
        List<String> errors = results.stream()
                .filter(r -> r.getSeverity() == Severity.ERROR)
                .map(r -> "[" + r.getConstraintName() + "] " + r.getMessage())
                .collect(Collectors.toList());
        
        // Log warnings
        results.stream()
                .filter(r -> r.getSeverity() == Severity.WARNING)
                .forEach(w -> logger.warn("[{}] {}", w.getConstraintName(), w.getMessage()));
        
        // Log and throw errors
        if (!errors.isEmpty()) {
            for (String error : errors) {
                logger.error(error);
            }
            throw new CliValidationException("psm", ValidationType.ZETA, errors);
        }
    }
}
