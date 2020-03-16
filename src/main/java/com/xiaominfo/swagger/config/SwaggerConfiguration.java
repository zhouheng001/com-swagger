
package com.xiaominfo.swagger.config;

import com.fasterxml.classmate.TypeResolver;
import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static springfox.documentation.schema.AlternateTypeRules.newRule;

@EnableSwagger2
@EnableSwaggerBootstrapUI
@Import(BeanValidatorPluginsConfiguration.class)
@EnableWebMvc
public class SwaggerConfiguration {


    @Bean(value = "defaultApi")
    public Docket defaultApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(groupApiInfo())
                .groupName("rank")
                .host("devtest.meme.chat")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xiaominfo.swagger.controller.ranks"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .securityContexts(Lists.newArrayList(securityContext())).securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey()));
    }

    @Bean(value = "activityApi")
    public Docket activityApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(groupApiInfo())
                .groupName("activity")
                .host("devtest.meme.chat")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xiaominfo.swagger.controller.activity"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .securityContexts(Lists.newArrayList(securityContext())).securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey()));
    }


    private ApiInfo groupApiInfo(){
        return new ApiInfoBuilder()
                .title("MEME直播后台接口文档")
                .description("swagger-bootstrap-ui-demo RESTful APIs")
                .termsOfServiceUrl("http://www.group.com/")
                .contact("heng.zhou@nextentertain.com kai.ji@nextentertain.com")
                .version("1.0")
                .build();
    }


    private ApiKey apiKey() {
        return new ApiKey("BearerToken", "Authorization", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("/.*"))
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("BearerToken", authorizationScopes));
    }

}
