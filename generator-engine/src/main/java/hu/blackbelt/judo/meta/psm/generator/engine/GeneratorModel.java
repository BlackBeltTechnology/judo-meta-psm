package hu.blackbelt.judo.meta.psm.generator.engine;

/*-
 * #%L
 * Judo :: PSM :: Model :: Genetator :: Engine
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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;


/**
 * Generator model describes a collection of generator template and global expression mapped to variables.
 */
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(builderMethodName = "generatorModelBuilder")
public class GeneratorModel {

	@Builder.Default
	private String name = "not set";

	@Builder.Default
	private Collection<TemplateSpringELExpression> templateContext = new HashSet();


	@Builder.Default
	private Collection<GeneratorTemplate> templates = new HashSet<>();

	public static GeneratorModel loadYamlURL(String originalUri, URL yaml) throws IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
		GeneratorModel model = null;
		try {
			InputStream is = yaml.openStream();
			model = mapper.readValue(is, new TypeReference<GeneratorModel>(){});
			if (model.getTemplates() == null) {
				model.setTemplates(new ArrayList<>());
			}
			model.getTemplates().forEach(t -> {
				t.setTemplateBaseUri(originalUri);
			});
		} catch (FileNotFoundException e) {
			log.warn("Yaml file not defined: " + yaml.toString());
		} catch (IOException e) {
			throw new IllegalArgumentException("Yaml file read error: " + yaml.toString(), e);
		}
		// if (model != null) {
		//	log.debug(ReflectionToStringBuilder.toString(model.getTemplates(), ToStringStyle.MULTI_LINE_STYLE));
		// }
		return model;
	}

	public void overrideTemplates(Collection<GeneratorTemplate> overridedTemplates) {
		Collection<GeneratorTemplate> templatesToReplace = new HashSet<>();

		templates.forEach(t -> {
			overridedTemplates.stream().filter(o ->
					(o.getName() != null && o.getName().equals(t.getName())) ||
					(o.getName() == null && o.getTemplateName().equals(t.getTemplateName()))
			).forEach(f -> templatesToReplace.add(t));
		});
		templates.removeAll(templatesToReplace);
		templates.addAll(overridedTemplates.stream().filter(o -> !o.isExclude()).collect(Collectors.toList()));
	}
}

