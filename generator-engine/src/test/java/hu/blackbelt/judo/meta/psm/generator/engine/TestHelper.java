package hu.blackbelt.judo.meta.psm.generator.engine;

import com.github.jknack.handlebars.internal.lang3.StringUtils;
import hu.blackbelt.judo.generator.commons.StaticMethodValueResolver;
import hu.blackbelt.judo.generator.commons.annotations.TemplateHelper;
import hu.blackbelt.judo.meta.psm.PsmUtils;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import lombok.SneakyThrows;
import lombok.extern.java.Log;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

@Log
@TemplateHelper
public class TestHelper extends StaticMethodValueResolver {

    public static String fQName(ActorType actorType) {
        return PsmUtils.namespaceToString(actorType.getNamespace()) + "::" + actorType.getName();
    }


    public static String plainName(String input) {
        return input == null ? "" : input
//                .replaceAll("[^\\\\u(\\p{XDigit}{4})]", "_")
                .replaceAll("[^\\.A-Za-z0-9_]", "_").toLowerCase();
    }

    public static String cleanup(String string) {
        return string == null ? "" : string.replaceAll("[\\n\\t ]", "");
    }

    public static String pathName(String fqName) {
        return fqName == null ? "" : fqName
                .replaceAll("\\.", "__")
                .replaceAll("::", "__")
                .replaceAll("#", "__")
                .replaceAll("/", "__")
                .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                .toLowerCase();
    }

    public static String path(String fqName) {
        if (fqName == null) {
            return "";
        }
        String fq = pathName(fqName);
        if (fq.lastIndexOf("__") > -1) {
            return fq.substring(fq.lastIndexOf("__") + 2);
        } else {
            return fq;
        }
    }

    public static String packageName(String packageName) {
        if (packageName == null) {
            return "";
        }

        List<String> nameTokens = stream(packageName
                .split("::"))
                .collect(Collectors.toList());
        if (nameTokens.size() > 2) {
            nameTokens.remove(0);
            nameTokens.remove(nameTokens.size() - 1);
            return nameTokens.stream()
                    .map(s -> StringUtils.capitalize(
                            stream(s.replaceAll("#", "::")
                                    .replaceAll("\\.", "::")
                                    .replaceAll("/", "::")
                                    .replaceAll("_", "::")
                                    .split("::"))
                                    .map(t -> StringUtils.capitalize(t))
                                    .collect(Collectors.joining())
                    ))
                    .collect(Collectors.joining());
        }
        return null;
    }

    public static String modelName(String fqName) {
        if (fqName == null) {
            return "";
        }
        String[] splitted = fqName.split("::");
        return fqClass(stream(splitted)
                .map(s -> StringUtils.capitalize(s))
                .findFirst().get());
    }

    @Deprecated
    public static String fqClass(String fqName) {
        if (fqName == null) {
            return "";
        }
        return stream(fqName.replaceAll("#", "::")
                .replaceAll("\\.", "::")
                .replaceAll("/", "::")
                .replaceAll("_", "::")
                .split("::"))
                .map(s -> StringUtils.capitalize(s))
                .collect(Collectors.joining());
    }

    public static String fqClassWithoutModel(String fqName) {
        if (fqName == null) {
            return "";
        }
        return stream(fqName.replaceAll("#", "::")
                .replaceAll("\\.", "::")
                .replaceAll("/", "::")
                .split("::"))
                .skip(1)
                .map(s -> StringUtils.capitalize(s))
                .collect(Collectors.joining());
    }

}
