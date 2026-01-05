package hu.blackbelt.judo.meta.psm.cli;

import org.slf4j.Logger;
import hu.blackbelt.judo.cli.api.ModelValidator;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;

/**
 * PSM validator implementation.
 * <p>
 * Implements {@link ModelValidator} from model-cli-api for type-safe validation.
 */
public class PsmValidatorImpl implements ModelValidator {

    /**
     * Returns the model type identifier.
     *
     * @return "psm"
     */
    public String getModelType() {
        return "psm";
    }

    @Override
    public void validate(Logger logger, Object model) throws Exception {
        if (!(model instanceof PsmModel)) {
            throw new IllegalArgumentException(
                "Expected PsmModel but got: " + (model == null ? "null" : model.getClass().getName()));
        }
        PsmValidator.validatePsm(logger, (PsmModel) model);
    }

    /**
     * Validates the PSM model directly (type-safe convenience method).
     *
     * @param logger   the logger for validation messages
     * @param psmModel the PSM model to validate
     * @throws PsmModel.PsmValidationException if validation fails
     */
    public void validateModel(Logger logger, PsmModel psmModel) throws PsmModel.PsmValidationException {
        PsmValidator.validatePsm(logger, psmModel);
    }
}
