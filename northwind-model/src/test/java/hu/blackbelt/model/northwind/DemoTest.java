package hu.blackbelt.model.northwind;

import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.calculatePsmValidationScriptURI;
import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.validatePsm;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class DemoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testValidation() throws Exception {
        Demo demo = new Demo();
        PsmModel psmModel = demo.fullDemo();

        log.debug(psmModel.asString());

        log.info(psmModel.getDiagnosticsAsString());

        assertTrue(psmModel.isValid());
        try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
            validatePsm(bufferedLog, psmModel, calculatePsmValidationScriptURI());
        }
    }
}