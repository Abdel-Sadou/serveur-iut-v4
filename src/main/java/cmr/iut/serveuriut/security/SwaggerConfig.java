package cmr.iut.serveuriut.security;

import cmr.iut.serveuriut.constant.SwaggerConstant;
import cmr.iut.serveuriut.constant.SwaggerConstant.*;
import io.swagger.v3.oas.models.security.SecurityScheme;
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

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .securityContexts(Arrays.asList(securityContext()))
                .securitySchemes(Arrays.asList(apiKey()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "API REST DE PREINSCRIPTION AU CONCOURS DE L'IUT DE DOUALA",
                "Une description personnalisée de l'API.",
                "1.0",
                "Conditions d'utilisation",
                new Contact("IUT DE DOUALA ", "www.iut-douala.cm", "infos.iut@univ-douala.com"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }
    private Contact contact(){
        return new Contact(SwaggerConstant.CONTACT_NAME,SwaggerConstant.CONTACT_URL, SwaggerConstant.CONTACT_EMAIL);
    }
    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).build();
    }
    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
    }

}
