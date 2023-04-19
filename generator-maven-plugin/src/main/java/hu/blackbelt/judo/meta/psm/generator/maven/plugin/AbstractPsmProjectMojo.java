package hu.blackbelt.judo.meta.psm.generator.maven.plugin;

/*-
 * #%L
 * Judo :: PSM :: Model :: Generator :: Maven :: Plugin
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

import com.google.common.io.Files;
import hu.blackbelt.judo.meta.psm.PsmUtils;
import hu.blackbelt.judo.meta.psm.generator.engine.PsmGeneratorParameter;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.*;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.classworlds.realm.ClassRealm;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.eclipse.aether.resolution.ArtifactResult;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.LoadArguments.psmLoadArgumentsBuilder;
import static java.util.Optional.of;

public abstract class AbstractPsmProjectMojo extends AbstractMojo {

    final int BUFFER_SIZE = 4096;

    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    public MavenProject project;

    @Component
    public RepositorySystem repoSystem;

    @Parameter(defaultValue = "${repositorySystemSession}", readonly = true, required = true)
    public RepositorySystemSession repoSession;

    @Parameter(defaultValue = "${project.remoteProjectRepositories}", readonly = true, required = true)
    public List<RemoteRepository> repositories;

    @Parameter(defaultValue = "${plugin}", readonly = true)

    public PluginDescriptor pluginDescriptor;

    @Parameter(property = "psm")
    public String psm;

    @Parameter(property = "destination", defaultValue = "${project.basedir}/target/backend-project")
    public File destination;

    @Parameter(property = "modelName")
    public String modelName;

    @Parameter(property = "actors")
    public List<String> actors;

    Set<URL> classPathUrls = new HashSet<>();


    public abstract void performExecutionOnPsmParameters(PsmGeneratorParameter.PsmGeneratorParameterBuilder builder) throws Exception;


    public PsmGeneratorParameter.PsmGeneratorParameterBuilder addPsmModel(PsmGeneratorParameter.PsmGeneratorParameterBuilder psmGeneratorParameterBuilder) throws MojoExecutionException {
        URI psmUri = null;
        PsmModel psmModel = null;
        PsmModelResourceSupport psmModelResourceSupport = null;

        if (psm != null && !psm.trim().equals("")) {
            psmUri = getArtifact(psm).toURI();

            if (modelName == null || modelName.trim().equals("")) {
                try {
                    psmModel = PsmModel.loadPsmModel(psmLoadArgumentsBuilder()
                            .inputStream(
                                    of(psmUri).orElseThrow(() ->
                                                    new IllegalArgumentException("psmModel or psmModelSourceUri have to be defined"))
                                            .toURL().openStream())
                            .validateModel(false));

                    psmModelResourceSupport = PsmModelResourceSupport.psmModelResourceSupportBuilder()
                            .resourceSet(psmModel.getResourceSet())
                            .build();

                    modelName = psmModelResourceSupport.getStreamOfPsmNamespaceModel()
                            .findFirst().orElseThrow(() -> new IllegalStateException("Cannot find Model element")).getName();
                } catch (IOException | PsmModel.PsmValidationException e) {
                    throw new MojoExecutionException("Could not load model: ", e);
                }
            }
        }
        psmGeneratorParameterBuilder.psmModel(psmModel);
        return psmGeneratorParameterBuilder;
    }

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        // Needed for to access project's dependencies.
        // Info: http://blog.chalda.cz/2018/02/17/Maven-plugin-and-fight-with-classloading.html
        try {
            setContextClassLoader();
        } catch (Exception e) {
            throw new MojoExecutionException("Failed to set classloader", e);
        }


        PsmGeneratorParameter.PsmGeneratorParameterBuilder osmGeneratorParameterBuilder = PsmGeneratorParameter.psmGeneratorParameter();
        addPsmModel(osmGeneratorParameterBuilder);

        osmGeneratorParameterBuilder
                .targetDirectoryResolver(() -> destination)
                .actorTypeTargetDirectoryResolver(a -> destination)
                .actorTypePredicate(a -> actors == null || actors.isEmpty() || actors.contains(PsmUtils.namespaceToString(a.getNamespace()) + "::" + a.getName()));

        try {
            performExecutionOnPsmParameters(osmGeneratorParameterBuilder);
        } catch (URISyntaxException e) {
            throw new MojoExecutionException("Invalid URL: ", e);
        } catch (IOException e) {
            throw new MojoExecutionException("IO Error: ", e);
        } catch (Exception e) {
            throw new MojoExecutionException("Unknown exception: ", e);
        }
    }

    private void setContextClassLoader() throws DependencyResolutionRequiredException, MalformedURLException {
        // Project dependencies
        for (Object mavenCompilePath : project.getCompileClasspathElements()) {
            String currentPathProcessed = (String) mavenCompilePath;
            classPathUrls.add(new File(currentPathProcessed).toURI().toURL());
        }

        // Add plugin defined dependencies
        for (Artifact artifact : pluginDescriptor.getArtifacts()) {
            classPathUrls.add(getArtifactFile(artifact));
        }

        // Plugin dependencies
        final ClassRealm classRealm = pluginDescriptor.getClassRealm();
        for (URL url : classRealm.getURLs()) {
            classPathUrls.add(url);
        }

        URL[] urlsForClassLoader = classPathUrls.toArray(new URL[classPathUrls.size()]);
        getLog().debug("Set urls for URLClassLoader: " + Arrays.asList(urlsForClassLoader));

        // need to define parent classloader which knows all dependencies of the plugin
        ClassLoader classLoader = new URLClassLoader(urlsForClassLoader, AbstractPsmProjectMojo.class.getClassLoader());
        Thread.currentThread().setContextClassLoader(classLoader);
    }

    @SneakyThrows({MalformedURLException.class})
    private URL getArtifactFile(Artifact artifact) {
        return artifact.getFile().toURI().toURL();
    }

    /**
     * Get the artifact file from the given url.
     *
     * @param url
     * @return
     * @throws MojoExecutionException
     */
    public File getArtifact(String url) throws MojoExecutionException {
        if (url.startsWith("mvn:")) {
            String mvnUrl = url;
            String subUrl = "";
            if (mvnUrl.contains("!")) {
                subUrl = mvnUrl.substring(mvnUrl.lastIndexOf("!") + 1);
                mvnUrl = mvnUrl.substring(0, mvnUrl.lastIndexOf("!"));
            }
            ArtifactResult resolutionResult = getArtifactResult(mvnUrl);
            // The file should exists, but we never know.
            File file = resolutionResult.getArtifact().getFile();
            if (file == null || !file.exists()) {
                getLog().warn("Artifact " + url.toString() + " has no attached file. Its content will not be copied in the target model directory.");
            }

            if (subUrl.equals("")) {
                return file;
            } else {
                // Extract file from JAR or ZIP
                File fileFromArchive = null;
                try {
                    fileFromArchive = getFileFromArchive(file, subUrl);
                } catch (IOException e) {
                    throw new MojoExecutionException("Could not decompress: " + fileFromArchive.getAbsolutePath() + " file: " + fileFromArchive);
                }
                if (fileFromArchive == null || !fileFromArchive.exists()) {
                    throw new MojoExecutionException("File " + subUrl + " does not exists in " + file.getAbsolutePath());
                }
                return fileFromArchive;
            }
        } else {
            File file = new File(url);
            if (file == null || !file.exists()) {
                getLog().warn("File " + url.toString() + " does not exists.");
            }
            return file;
        }
    }

    @AllArgsConstructor
    class ArchiveTuplet {
        ArchiveEntry archiveEntry;
        ArchiveInputStream archiveInputStream;
    }

    public void iterateArchive(File archive, Function<ArchiveTuplet, Boolean> callOnArchiveEntry) throws IOException {
        CompressorInputStream compressorInputStream = null;
        ArchiveInputStream archiveInputStream = null;
        try {
            if (archive.getName().toLowerCase().endsWith(".tgz") || archive.getName().toLowerCase().endsWith(".tar.gz")) {
                compressorInputStream = new GzipCompressorInputStream(new FileInputStream(archive));
                archiveInputStream = new TarArchiveInputStream(compressorInputStream);
            } else if (archive.getName().toLowerCase().endsWith(".zip") || archive.getName().toLowerCase().endsWith(".jar")) {
                archiveInputStream = new ZipArchiveInputStream(new FileInputStream(archive));
            } else if (archive.getName().toLowerCase().endsWith(".bz2") || archive.getName().toLowerCase().endsWith(".tar.bzip2")) {
                compressorInputStream = new BZip2CompressorInputStream(new FileInputStream(archive));
                archiveInputStream = new TarArchiveInputStream(compressorInputStream);
            }

            if (archiveInputStream == null) {
                throw new IOException("Could not open: " + archive.getAbsolutePath());
            }
            if (archiveInputStream != null) {
                ArchiveEntry entry;
                while ((entry = archiveInputStream.getNextEntry()) != null) {
                    if (callOnArchiveEntry.apply(new ArchiveTuplet(entry, archiveInputStream))) {
                        return;
                    }
                }
            }
        } finally {
            if (compressorInputStream != null) {
                try {
                    compressorInputStream.close();
                } catch (Exception e) {
                }
            }

            if (archiveInputStream != null) {
                try {
                    archiveInputStream.close();
                } catch (Exception e) {
                }
            }
        }
    }


    public File getFileFromArchive(File archive, String path) throws IOException {

        final AtomicReference<File> outFile = new AtomicReference<>();

        iterateArchive(archive, a -> {
            ArchiveEntry archiveEntry = a.archiveEntry;
            ArchiveInputStream archiveInputStream = a.archiveInputStream;
            if (!archiveEntry.isDirectory() && archiveEntry.getName().equals(path)) {
                try {
                    outFile.set(File.createTempFile("artifacthandler", archiveEntry.getName().replaceAll("/", "_")));
                } catch (IOException e) {
                    throw new RuntimeException("Could not create temp file: ", e);
                }
                try (
                        FileOutputStream fos = new FileOutputStream(outFile.get(), false);
                        BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER_SIZE)) {

                    int count;
                    byte data[] = new byte[BUFFER_SIZE];

                    while ((count = archiveInputStream.read(data, 0, BUFFER_SIZE)) != -1) {
                        dest.write(data, 0, count);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Could not extract: ", e);
                }
                return true;
            }
            return false;
        });
        return outFile.get();
    }

    /**
     * Get the artifact file from the given url.
     *
     * @param url
     * @return
     * @throws MojoExecutionException
     */
    public File getResolvedTemplateDirectory(String url) throws MojoExecutionException {
        if (url.startsWith("mvn:")) {
            String mvnUrl = url;
            String subUrl = "";
            if (mvnUrl.contains("!")) {
                subUrl = mvnUrl.substring(mvnUrl.lastIndexOf("!") + 1);
                mvnUrl = mvnUrl.substring(0, mvnUrl.lastIndexOf("!"));
            }
            ArtifactResult resolutionResult = getArtifactResult(mvnUrl);
            // The file should exists, but we never know.
            File file = resolutionResult.getArtifact().getFile();
            if (file == null || !file.exists()) {
                getLog().warn("Artifact " + url.toString() + " has no attached file. Its content will not be copied in the target model directory.");
            }

            if (!file.getName().toLowerCase().endsWith(".jar") &&
                    !file.getName().toLowerCase().endsWith(".zip")) {
                return file;
            } else {
                // Extract file from JAR or ZIP
                File fileFromArchive = null;
                try {
                    if (subUrl.startsWith("/")) {
                        subUrl = subUrl.substring(1);
                    }
                    fileFromArchive = extractArchive(file, subUrl);
                } catch (IOException e) {
                    throw new MojoExecutionException("Could not decompress: " + fileFromArchive.getAbsolutePath() + " file: " + fileFromArchive);
                }
                if (fileFromArchive == null || !fileFromArchive.exists()) {
                    throw new MojoExecutionException("File " + subUrl + " does not exists in " + file.getAbsolutePath());
                }
                return fileFromArchive;
            }
        } else {
            File file = new File(url);
            if (file == null || !file.exists() || !file.isDirectory()) {
                getLog().warn("Directory " + url.toString() + " does not existt.");
            }
            return file;
        }
    }

    public File extractArchive(File archive, String path) throws IOException {
        File targetDir = Files.createTempDir();
        targetDir.mkdirs();
        iterateArchive(archive, a -> {
            ArchiveEntry archiveEntry = a.archiveEntry;
            ArchiveInputStream archiveInputStream = a.archiveInputStream;

            if (!archiveEntry.isDirectory() && archiveEntry.getName().startsWith(path)) {
                String relPath = archiveEntry.getName().substring(path.length());
                File outFile = new File(targetDir, relPath);
                outFile.getParentFile().mkdirs();
                int count;
                byte data[] = new byte[BUFFER_SIZE];

                try (FileOutputStream fos = new FileOutputStream(outFile, false);
                     BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER_SIZE)) {
                    while ((count = archiveInputStream.read(data, 0, BUFFER_SIZE)) != -1) {
                        dest.write(data, 0, count);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Could not extract: ", e);
                }
            }
            return false;
        });
        return targetDir;
    }

    /**
     * Get the artifact result from the given url.
     *
     * @param url
     * @return
     * @throws MojoExecutionException
     */
    public ArtifactResult getArtifactResult(String url) throws MojoExecutionException {
        org.eclipse.aether.artifact.Artifact artifact = new DefaultArtifact(url.toString().substring(4));
        ArtifactRequest req = new ArtifactRequest().setRepositories(this.repositories).setArtifact(artifact);
        ArtifactResult resolutionResult;
        try {
            resolutionResult = repoSystem.resolveArtifact(repoSession, req);
        } catch (ArtifactResolutionException e) {
            throw new MojoExecutionException("Artifact " + url.toString() + " could not be resolved.", e);
        }
        return resolutionResult;
    }

}
