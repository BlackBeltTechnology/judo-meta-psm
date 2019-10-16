package hu.blackbelt.model.northwind;

import hu.blackbelt.epsilon.runtime.execution.exceptions.ScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.calculatePsmValidationScriptURI;
import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.validatePsm;

@Slf4j
class DemoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testValidation() throws URISyntaxException, ScriptExecutionException {
        Demo demo = new Demo();
        PsmModel psmModel = demo.fullDemo();

        log.info(psmModel.asString());

        log.info(psmModel.getDiagnosticsAsString());

        validatePsm(new Slf4jLog(log), psmModel, calculatePsmValidationScriptURI());
    }
}