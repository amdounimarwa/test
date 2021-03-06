
/*package org.sid.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	public Docket api() {
	
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(
						new ApiInfoBuilder()
						.description("Gestion Commande API Documentation")
						.title("Gestion Commande REST API")
						.build()
						) 
				.groupName("REST API V1")
				.select()
				.apis(RequestHandlerSelectors.basePackage("org.sid"))
				.paths(PathSelectors.ant("/**"))
				.build();
		
	}
	

}
*/