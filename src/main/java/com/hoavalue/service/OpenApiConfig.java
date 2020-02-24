package com.hoavalue.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//import com.google.common.base.Predicate;
//
//import io.swagger.models.Contact;
//
//import static com.google.common.base.Predicates.or;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import static springfox.documentation.builders.PathSelectors.*;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

@Configuration
public class OpenApiConfig {
 
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Homeowner Association (HOA) API").description(
                        "Services for Home Owner Assocations (HOA) for real property information, reserve studies, association information, and fees.\n"
                        + "This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
    } 

//@Configuration
//@EnableSwagger2
//public class SwaggerConfig extends WebMvcConfigurationSupport{                                    
//    @Bean
//    public Docket api() { 
//        return new Docket(DocumentationType.SWAGGER_2)  
//          .groupName("HOA Value")
//          .select()                                  
//          .apis(RequestHandlerSelectors.basePackage("com.hoavalue.service")) 
//          .paths(paths())                     
//          .build()
//          .apiInfo(metaData());                                           
//    }
//    private ApiInfo metaData() {
//        return new ApiInfoBuilder()
//                .title("HOA Value REST API")
//                .description("\"Services for Home Owner Assocations (HOA) for real property information, reserve studies, association information, and fees\"")
//                .version("1.0.0") 
//                .build();
//    }
//
//    private Predicate<String> paths() {
//        return or (
//            regex("/hoauser.*"),
//            regex("/hoadetail.*"),
//            regex("/hoa.*"),
//            regex("/greeting.*"));
//      }
//     
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

}