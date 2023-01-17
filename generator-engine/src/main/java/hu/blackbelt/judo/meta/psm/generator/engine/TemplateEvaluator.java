package hu.blackbelt.judo.meta.psm.generator.engine;

import com.github.jknack.handlebars.Template;
import lombok.Getter;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.io.IOException;
import java.util.Map;

@Getter
public class TemplateEvaluator {
    final org.springframework.expression.Expression factoryExpression;
    final org.springframework.expression.Expression pathExpression;
    final Template template;
    final Map<String, Expression> templateExpressions;
    final PsmGeneratorContext projectGenerator;
    final StandardEvaluationContext standardEvaluationContext;

    public TemplateEvaluator(PsmGeneratorContext projectGenerator, GeneratorTemplate generatorTemplate, StandardEvaluationContext standardEvaluationContext) throws IOException {
        this.projectGenerator = projectGenerator;
        this.standardEvaluationContext = standardEvaluationContext;
        ExpressionParser parser = generatorTemplate.getParser();
        templateExpressions = generatorTemplate.parseExpressions();
        if (generatorTemplate.getFactoryExpression() != null) {
            factoryExpression = parser.parseExpression(generatorTemplate.getFactoryExpression());
        } else {
            factoryExpression = null;
        }
        pathExpression = parser.parseExpression(generatorTemplate.getPathExpression());
        if (generatorTemplate.isCopy()) {
            template = null;
        } else if (generatorTemplate.getTemplate() != null && !"".equals(generatorTemplate.getTemplate().trim())) {
            template = projectGenerator.createHandlebars().compileInline(generatorTemplate.getTemplate());
        } else if (generatorTemplate.getTemplateName() != null && !"".equals(generatorTemplate.getTemplateName().trim())) {
            template = projectGenerator.createHandlebars().compile(generatorTemplate.getTemplateName());
        } else {
            template = null;
        }
    }

    public <C> C getFactoryExpressionResultOrValue(GeneratorTemplate template, Object value, Class<C> type) {
        if (getFactoryExpression() == null && type.isAssignableFrom(value.getClass())) {
            return (C) value;
        } else {
            try {
                return getFactoryExpression().getValue(standardEvaluationContext, value, type);
            } catch (Exception e) {
                throw new IllegalArgumentException("Could not evaluate factory expression in " + template.toString());
            }
        }
    }
}
