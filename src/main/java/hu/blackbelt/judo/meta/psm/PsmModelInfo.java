package hu.blackbelt.judo.meta.psm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Version;
import org.osgi.framework.VersionRange;

import java.io.File;
import java.util.Dictionary;
import java.util.Hashtable;

@AllArgsConstructor
@ToString
@Getter
public class PsmModelInfo {

    public static final String FILE = "file";
    public static final String NAME = "name";
    public static final String VERSION = "version";
    public static final String CHECKSUM = "checksum";
    public static final String META_VERSION = "meta-version";
    public static final String URI = "uri";

    File file;
    String name;
    Version version;
    URI uri;
    String checksum;
    VersionRange metaVersion;

    public Dictionary<String, Object> toDictionary() {
        Dictionary<String, Object> ret = new Hashtable();
        ret.put(FILE, file);
        ret.put(NAME, name);
        ret.put(VERSION, version);
        ret.put(URI, uri);
        ret.put(CHECKSUM, checksum);
        ret.put(META_VERSION, metaVersion);
        return ret;
    }
}
