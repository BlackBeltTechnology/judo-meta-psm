package hu.blackbelt.judo.meta.psm.generator.engine;

import com.google.common.collect.ImmutableMap;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import lombok.Builder;
import lombok.NonNull;

import java.io.File;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Builder(builderMethodName = "psmGeneratorParameter")
public final class PsmGeneratorParameter {
    PsmGeneratorContext generatorContext;

    @Builder.Default
    Predicate<ActorType> actorTypePredicate = a -> true;

    @NonNull
    Function<ActorType, File> actorTypeTargetDirectoryResolver;

    @NonNull
    Supplier<File> targetDirectoryResolver;

    Log log;

    @Builder.Default
    Supplier<Map<String, ?>> extraContextVariables = () -> ImmutableMap.of();
}
