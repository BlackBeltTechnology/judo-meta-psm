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

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.ValueResolver;
import com.github.jknack.handlebars.cache.HighConcurrencyTemplateCache;
import com.github.jknack.handlebars.cache.TemplateCache;
import com.github.jknack.handlebars.helper.ConditionalHelpers;
import com.github.jknack.handlebars.helper.StringHelpers;
import com.github.jknack.handlebars.io.URLTemplateLoader;
import com.google.common.base.Charsets;
import hu.blackbelt.judo.generator.commons.URLResolver;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * This class holds the state over a generation process. The individual generation for templates uses
 * context to create Handlebars SpringEL instances.
 */
@Slf4j
public class PsmGeneratorContext {
    @Getter
    private final URLTemplateLoader templateLoader;

    @Getter
    private final URLResolver urlResolver;

    @Getter
    private final PsmModelResourceSupport modelResourceSupport;

    @Getter
    private final GeneratorModel generatorModel;

    @Getter
    private final Collection<Class> helpers;

    @Getter
    private final Collection<ValueResolver> valueResolvers;

    @Getter
    private final Class contextAccessor;


    TemplateCache templateCache = new HighConcurrencyTemplateCache();


    @Builder
    public PsmGeneratorContext(
            @NonNull PsmModel psmModel,
            @NonNull URLTemplateLoader templateLoader,
            @NonNull URLResolver urlResolver,
            @NonNull GeneratorModel generatorModel,
            Collection<Class> helpers,
            Collection<ValueResolver> valueResolvers,
            Class contextAccessor) {

        this.templateLoader = templateLoader;
        modelResourceSupport = PsmModelResourceSupport.psmModelResourceSupportBuilder()
                .resourceSet(psmModel.getResourceSet())
                .build();
        this.generatorModel = generatorModel;
        this.urlResolver = urlResolver;
        if (helpers == null) {
            this.helpers = new ArrayList<>();
        } else {
            this.helpers = helpers;
        }
        if (valueResolvers == null) {
            this.valueResolvers = new ArrayList<>();
        } else {
            this.valueResolvers = valueResolvers;
        }
        this.contextAccessor = contextAccessor;
    }

    public Handlebars createHandlebars() {
        Handlebars handlebars = new Handlebars();
        handlebars.with(templateLoader).with(templateCache);
        handlebars.setStringParams(true);
        handlebars.setCharset(Charsets.UTF_8);
        handlebars.registerHelpers(ConditionalHelpers.class);
        handlebars.prettyPrint(true);
        handlebars.setInfiniteLoops(true);
        handlebars.registerHelpers(StringHelpers.class);
//        handlebars.registerHelpers(ActorTypeHelpers.class);
        for (Class clazz : helpers) {
            handlebars.registerHelpers(clazz);
        }

        handlebars.registerHelper("times", (Helper<Integer>) (n, options) -> {
            String accum = "";
            for(Integer i = 0; i < n; ++i) {
                accum += options.fn(i);
            }
            return accum;
        });
        return handlebars;
    }

    public StandardEvaluationContext createSpringEvaluationContext() {
        StandardEvaluationContext springElContext = new StandardEvaluationContext();

        for (Class helper : helpers) {
            Arrays.stream(helper.getMethods()).filter(m ->
                            Modifier.isPublic(m.getModifiers()) &&
                                    Modifier.isStatic(m.getModifiers()))
                    .forEach(m -> springElContext.registerFunction(m.getName(), m));

        }
        return springElContext;
    }
}
