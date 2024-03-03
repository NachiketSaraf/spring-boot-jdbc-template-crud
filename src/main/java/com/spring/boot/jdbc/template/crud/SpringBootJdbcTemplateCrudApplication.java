package com.spring.boot.jdbc.template.crud;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Tours",
        description = "Spring Boot CRUD using JDBC Template " ))
public class SpringBootJdbcTemplateCrudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcTemplateCrudApplication.class, args);
    }
}
