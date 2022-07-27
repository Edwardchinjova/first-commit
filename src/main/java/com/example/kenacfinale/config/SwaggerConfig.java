package com.example.kenacfinale.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final String BASIC_AUTH = "basicAuth";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.bezkoder.spring.mssql")).paths(PathSelectors.any()).build().apiInfo(apiInfo())
                .securitySchemes(securitySchemes()).securityContexts(List.of(securityContext()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Redsphere Kenac Integration", "Redsphere Kenac Integration API, provides for methods to expose various methods", "1.0", "Terms of service",
                new Contact("Escrow Systems", "www.escrowsystems.net", "mtmabvira98@gmail.com"), "License of API", "API license URL", Collections.emptyList());
    }

    private List<SecurityScheme> securitySchemes() {
        return List.of(new BasicAuth(BASIC_AUTH));
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(Arrays.asList(basicAuthReference())).forPaths(PathSelectors.any()).build();
    }

    private SecurityReference basicAuthReference() {
        return new SecurityReference(BASIC_AUTH, new AuthorizationScope[0]);
    }
}
