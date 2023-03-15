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

import com.github.jknack.handlebars.Context;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.io.IOException;
import java.util.*;


/**
 * Generator template describes one generation properties.
 * <ul>
 *     <li>factoryExpression: A SpringEL Expression which can result a collection which will be used as list of generated output. The collection's elements is used
 *     as the 'self' inside the template and pathExpression.</li>
 *     <li>pathExpression: A SpringEL Expression which is used what is the target of the generated template. It returns a string which is a relative path. When `actorTypeBased` is used,
 *     the target directory will be created as the actor target concated with actor's target directory</li>
 *     <li>actorTypeBased: boolean arguments. When it set the template factory will be executed in all actors, and the `actorType` will be placed in template context.</li>
 *     <li>templateName: the relative path for template used for generation. (except `copy` is false.</li>
 *     <li>copy: when it set generation will be ignored, the file file will be copied. When factoryExpression returns several elements, the file will be copied several times.</li>
 * </ul>
 */
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(builderMethodName = "generatorTemplateBuilder")
@ToString(exclude = "parser")
public class GeneratorTemplate {

	private String name;

	private String factoryExpression;
	private String pathExpression;

	private String template;

	private String templateName;

	private String templateBaseUri;

	@Builder.Default
	private boolean actorTypeBased = false;

	@Builder.Default
	private boolean exclude = false;

	@Builder.Default
	private Collection<TemplateSpringELExpression> templateContext = new HashSet();

	@Builder.Default
	@Getter
	private ExpressionParser parser = new SpelExpressionParser();

	@Builder.Default
	private boolean copy = false;

	public Map<String, org.springframework.expression.Expression> parseExpressions() {
		Map<String, org.springframework.expression.Expression> templateExpressions = new HashMap<>();
		templateContext.stream().forEach(ctx -> {
			final org.springframework.expression.Expression contextTemplate = parser.parseExpression(ctx.getExpression());
			templateExpressions.put(ctx.getName(), contextTemplate);
		});
		return templateExpressions;
	}

	public TemplateEvaluator getTemplateEvalulator(PsmGeneratorContext projectGenerator, StandardEvaluationContext standardEvaluationContext) throws IOException {
		return new TemplateEvaluator(projectGenerator, this, standardEvaluationContext);
	}

	public void evalToContextBuilder(TemplateEvaluator templateEvaluator, Context.Builder contextBuilder, StandardEvaluationContext templateExpressionContext) {
		templateContext.stream().forEach(ctx -> {
			Expression expression = templateEvaluator.getTemplateExpressions().get(ctx.getName());
			if (expression != null) {
				try {
					Class type = templateEvaluator.getTemplateExpressions().get(ctx.getName()).getValueType(templateExpressionContext);
					Object rootObject = templateEvaluator.getTemplateExpressions().get(ctx.getName()).getValue(templateExpressionContext, type);
					Object value = templateEvaluator.getTemplateExpressions().get(ctx.getName()).getValue(templateExpressionContext, rootObject);
					contextBuilder.combine(ctx.getName(), value);
				} catch (Exception e) {
					throw new IllegalArgumentException("Could not evaluate template context expression: " + expression.getExpressionString() + " in " + this);
				}
			}
		});
	}

}

