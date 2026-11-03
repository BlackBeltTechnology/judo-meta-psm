package hu.blackbelt.judo.meta.psm.validation;

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

import hu.blackbelt.judo.zeta.validation.core.ValidationResult;

import java.util.Collection;
import java.util.Collections;

/**
 * Exception thrown when PSM Java validation fails.
 */
public class PsmJavaValidationException extends Exception {

    private final Collection<ValidationResult> validationResults;
    private final Collection<String> unexpectedErrors;
    private final Collection<String> errorsNotFound;
    private final Collection<String> unexpectedWarnings;
    private final Collection<String> warningsNotFound;

    public PsmJavaValidationException(String message,
                                       Collection<ValidationResult> validationResults,
                                       Collection<String> unexpectedErrors,
                                       Collection<String> errorsNotFound,
                                       Collection<String> unexpectedWarnings,
                                       Collection<String> warningsNotFound) {
        super(message);
        this.validationResults = validationResults;
        this.unexpectedErrors = unexpectedErrors;
        this.errorsNotFound = errorsNotFound;
        this.unexpectedWarnings = unexpectedWarnings;
        this.warningsNotFound = warningsNotFound;
    }

    public PsmJavaValidationException(String message, Collection<ValidationResult> validationResults) {
        this(message, validationResults, Collections.emptyList(), Collections.emptyList(),
                Collections.emptyList(), Collections.emptyList());
    }

    public Collection<ValidationResult> getValidationResults() {
        return validationResults;
    }

    public Collection<String> getUnexpectedErrors() {
        return unexpectedErrors;
    }

    public Collection<String> getErrorsNotFound() {
        return errorsNotFound;
    }

    public Collection<String> getUnexpectedWarnings() {
        return unexpectedWarnings;
    }

    public Collection<String> getWarningsNotFound() {
        return warningsNotFound;
    }
}
