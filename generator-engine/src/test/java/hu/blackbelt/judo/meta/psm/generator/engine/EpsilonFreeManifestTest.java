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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.Manifest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Regression (design D1a): the built OSGi manifest imports no Epsilon package and exports the real engine package.
 * The bundle plugin writes the manifest at package time, so this class runs in the surefire execution bound to
 * the verify phase (see pom.xml, execution id manifest-check); it is excluded from default-test.
 */
public class EpsilonFreeManifestTest {

    private static final String EPSILON_PACKAGE = "hu.blackbelt.epsilon";

    private static Manifest builtManifest() throws Exception {
        Path manifestPath = Paths.get("target/classes/META-INF/MANIFEST.MF");
        assertThat(manifestPath).as("bundle plugin manifest written at package time").exists();
        try (InputStream in = Files.newInputStream(manifestPath)) {
            return new Manifest(in);
        }
    }

    @Test
    void manifestImportsNoEpsilonPackage() throws Exception {
        String imports = builtManifest().getMainAttributes().getValue("Import-Package");
        assertThat(imports).isNotNull().doesNotContain(EPSILON_PACKAGE);
    }

    @Test
    void manifestExportsRealEnginePackage() throws Exception {
        String exports = builtManifest().getMainAttributes().getValue("Export-Package");
        assertThat(exports).isNotNull().contains("hu.blackbelt.judo.meta.psm.generator.engine");
    }
}
