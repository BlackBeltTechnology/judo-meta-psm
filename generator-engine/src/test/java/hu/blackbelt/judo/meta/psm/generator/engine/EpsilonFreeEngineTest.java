package hu.blackbelt.judo.meta.psm.generator.engine;

/*-
 * #%L
 * Judo :: PSM :: Model :: Generator :: Engine
 * %%
 * Copyright (C) 2018 - 2023 BlackBelt Technology
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

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Regression: the PSM generator engine must not depend on the Epsilon runtime (design D1a).
 */
public class EpsilonFreeEngineTest {

    private static final String EPSILON_PACKAGE = "hu.blackbelt.epsilon";
    private static final String EPSILON_LOGGER = "hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger";

    @Test
    void engineClassDoesNotReferenceEpsilon() throws Exception {
        assertThat(PsmGenerator.class).isNotNull();
        String resource = PsmGenerator.class.getName().replace('.', '/') + ".class";
        try (InputStream in = PsmGenerator.class.getClassLoader().getResourceAsStream(resource)) {
            assertThat(in).isNotNull();
            String constantPool = new String(in.readAllBytes(), StandardCharsets.ISO_8859_1);
            assertThat(constantPool).doesNotContain(EPSILON_PACKAGE.replace('.', '/'));
            assertThat(constantPool).doesNotContain(EPSILON_LOGGER);
            assertThat(constantPool).contains("hu/blackbelt/judo/generator/commons/BufferedSlf4jLogger");
        }
    }
}
