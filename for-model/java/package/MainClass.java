forEach: Aggregate
path: {{path}}/{{boundedContext.nameCamelCase}}
fileName: {{namePascalCase}}.java
---
package {{options.package}}.{{boundedContext.nameCamelCase}};

public class {{namePascalCase}}{

{{#aggregateRoot.fieldDescriptors}}
    {{className}} {{nameCamelCase}};
{{/aggregateRoot.fieldDescriptors}}

{{#aggregateRoot.operations}}
    {{#isOverride}}
    @Override
    {{/isOverride}}
    {{returnType}} {{name}}() {
    }
{{/aggregateRoot.operations}}

    public static void main(String args[]){
    }

}