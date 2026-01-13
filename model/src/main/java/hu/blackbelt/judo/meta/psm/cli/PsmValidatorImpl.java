package hu.blackbelt.judo.meta.psm.cli;

import org.slf4j.Logger;

import hu.blackbelt.judo.cli.api.CliValidationException;
import hu.blackbelt.judo.cli.api.ModelValidator;
import hu.blackbelt.judo.meta.psm.PsmEpsilonValidator;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;

/**
 * PSM validator implementation.
 * <p>
 * Implements {@link ModelValidator} from judo-cli-api for type-safe validation.
 * Uses Epsilon (EVL) validation.
 * <p>
 * Note: Zeta validation support was removed - see JNG-6354.
 */
public class PsmValidatorImpl implements ModelValidator {

    @Override
    public String getModelType() {
        return "psm";
    }

    @Override
    public void validate(Logger logger, Object model) throws CliValidationException {
        if (!(model instanceof PsmModel)) {
            throw new IllegalArgumentException(
                "Expected PsmModel but got: " + (model == null ? "null" : model.getClass().getName()));
        }
        PsmModel psmModel = (PsmModel) model;

        try {
            PsmEpsilonValidator.validatePsm(logger, psmModel,
                PsmEpsilonValidator.calculatePsmValidationScriptURI());
        } catch (Exception e) {
            throw new CliValidationException("psm",
                "EVL validation failed: " + e.getMessage(), e);
        }
    }
}
