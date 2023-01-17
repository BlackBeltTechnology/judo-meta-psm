package hu.blackbelt.judo.meta.psm.generator.engine;

import hu.blackbelt.judo.generator.commons.GeneratedFile;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import lombok.Builder;
import lombok.Getter;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Builder(builderMethodName = "psmGeneratorResult")
@Getter
public final class PsmGeneratorResult {

    @Builder.Default
    Map<ActorType, Collection<GeneratedFile>> generatedByActors = new ConcurrentHashMap<>();

    @Builder.Default
    Collection<GeneratedFile> generated = new CopyOnWriteArrayList<>();
}
