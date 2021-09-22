package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.BinaryType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newBinaryTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.useBinaryType;

public class Photo {

    public BinaryType $ = newBinaryTypeBuilder().build();

    public void init(Package $package) {
        useBinaryType($).withName("Photo").withMimeTypes("image/*").build();

        usePackage($package).withElements($).build();
    }

}
