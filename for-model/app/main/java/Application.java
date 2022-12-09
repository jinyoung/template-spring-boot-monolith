forEach: Model
fileName: {{namePascalCase}}Application.java
path: {{path}}
---
package {{options.package}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{namePascalCase}}Application {

  public static void main(String[] args) {
    SpringApplication.run({{namePascalCase}}Application.class, args);
  }

}
