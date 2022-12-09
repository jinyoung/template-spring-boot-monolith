forEach: Exception
fileName: {{namePascalCase}}.java
path: {{path}}/{{boundedContext.nameCamelCase}}
---
package {{options.package}}.{{boundedContext.nameCamelCase}};

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus.{{httpStatus}}, reason="{{message}}")
public class {{namePascalCase}} 
{{#ifContains "outgoingClassRefs[*].relationType" "Generalization"}} extends {{jp "outgoingClassRefs[?(@.relationType=='Generalization')].value.namePascalCase"}}
{{else}} extends RuntimeException{{/ifContains}}
{

    public {{namePascalCase}}() {
        super("{{message}}");
        
    }
}


<function>

this.outgoingClassRefs = [

//    {
  //      relationType: "Generalization",
    //    value: {
 //           namePascalCase: "SameException"
 //       }
 //   },

    {
        relationType: "Realization",
        value: {
            namePascalCase: "Serializable"
        }
    },

    {
        relationType: "Realization",
        value: {
            namePascalCase: "Cloneable"
        }
    }


];


</function>
