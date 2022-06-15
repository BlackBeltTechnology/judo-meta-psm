package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.util.Collection;

@Slf4j
class PsmValidationAccesspointTest {

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	private PsmModel psmModel;

	@BeforeEach
	void setUp() {
		psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test").build();
	}

	private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
		try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
			bufferedLog.debug("PSM diagnostics: " + psmModel.getDiagnosticsAsString());
        	Assertions.assertTrue(psmModel.isValid());
			PsmEpsilonValidator.validatePsm(bufferedLog, psmModel,
					new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."), expectedErrors,
					expectedWarnings);
		} catch (EvlScriptExecutionException ex) {
			log.error("EVL failed", ex);
			log.error("\u001B[31m - expected errors: {}\u001B[0m", expectedErrors);
			log.error("\u001B[31m - unexpected errors: {}\u001B[0m", ex.getUnexpectedErrors());
			log.error("\u001B[31m - errors not found: {}\u001B[0m", ex.getErrorsNotFound());
			log.error("\u001B[33m - expected warnings: {}\u001B[0m", expectedWarnings);
			log.error("\u001B[33m - unexpected warnings: {}\u001B[0m", ex.getUnexpectedWarnings());
			log.error("\u001B[33m - warnings not found: {}\u001B[0m", ex.getWarningsNotFound());
			throw ex;
		}
	}
}
