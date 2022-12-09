forEach: Entity
path: {{path}}/{{boundedContext.nameCamelCase}}
fileName: {{namePascalCase}}.java
---
package {{options.package}}.{{boundedContext.nameCamelCase}};

{{#isInterface}}
public interface {{namePascalCase}}{{#ifContains "outgoingClassRefs[*].relationType" "Generalization"}} extends {{jp "outgoingClassRefs[?(@.relationType=='Generalization')].value.namePascalCase"}}{{/ifContains}}
{

{{#operations}}
    {{#isOverride}}
    @Override
    {{/isOverride}}
    {{returnType}} {{name}}();
{{/operations}}
  
}

{{else}}
public {{#isAbstract}}abstract {{/isAbstract}}class {{namePascalCase}}{{#ifContains "outgoingClassRefs[*].relationType" "Generalization"}} extends {{jp "outgoingClassRefs[?(@.relationType=='Generalization')].value.namePascalCase"}}{{/ifContains}}{{#ifContains "outgoingClassRefs[*].relationType" "Realization"}} implements {{jp "outgoingClassRefs[?(@.relationType=='Realization')].value.namePascalCase"}}{{/ifContains}}
{

{{#fieldDescriptors}}
    {{className}} {{nameCamelCase}};
{{/fieldDescriptors}}

{{#operations}}
    {{#isOverride}}
    @Override
    {{/isOverride}}
    {{returnType}} {{name}}() {
        //
    }
{{/operations}}
  
}

{{/isInterface}}
