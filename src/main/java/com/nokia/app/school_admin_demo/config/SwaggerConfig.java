package com.nokia.app.school_admin_demo.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
import static springfox.documentation.builders.PathSelectors.ant;

@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {
    
    private static final String API_NAME = "School Admin API";
    private static final String API_VERSION = "1.0.0";

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title(API_NAME).version(API_VERSION).build();
    }

    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select().apis(RequestHandlerSelectors.any())
        .paths(ant("/api/**"))
        .build()
        .apiInfo(apiInfo())
        .pathMapping("/");
    }
}