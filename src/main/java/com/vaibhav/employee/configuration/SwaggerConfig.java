package com.vaibhav.employee.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

//    This code defines an OpenAPI configuration that:

//    Sets general information (title, description) for the API.
//    Specifies a server URL (http://localhost:8080) with a description ("local").
//    Adds a tag called "Employee Api" to group API endpoints related to employee operations.

    //This configuration would help generate a well-documented and structured API specification
    // that can be used with tools like Swagger UI to visualize and interact with the API.

   @Bean
   public OpenAPI customConfig(){
       return new OpenAPI()
               .info(new Info()
                       .title("Employee Api")
                       .description("Employee Crud"))
               .servers(List.of(new Server()
                       .url("http://localhost:8080").
                       description("local")))
               .tags(List.of(new Tag()
                       .name("Employee Api")));
   }
}
