package hu.blackbelt.judo.meta.psm.runtime;

import lombok.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import java.util.Dictionary;
import java.util.Hashtable;

@AllArgsConstructor
@ToString
@Getter
@Builder(builderMethodName = "buildPsmModel")
public class PsmModel {

    public static final String NAME = "name";
    public static final String VERSION = "version";
    public static final String CHECKSUM = "checksum";
    public static final String META_VERSION_RANGE = "meta-version-range";
    public static final String URI = "uri";
    public static final String RESOURCE = "resource";

    @NonNull
    String name;
    @NonNull
    String version;
    @NonNull
    URI uri;
    @Builder.Default
    String checksum = "NonDefined";

    String metaVersionRange;
    @NonNull
    Resource resource;

    public Dictionary<String, Object> toDictionary() {
        Dictionary<String, Object> ret = new Hashtable<>();
        ret.put(NAME, name);
        ret.put(VERSION, version);
        ret.put(URI, uri);
        ret.put(CHECKSUM, checksum);
        ret.put(META_VERSION_RANGE, metaVersionRange);
        ret.put(RESOURCE, resource);
        return ret;
    }

}
