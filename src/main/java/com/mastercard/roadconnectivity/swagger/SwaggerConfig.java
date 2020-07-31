/**
 * 
 */
package com.mastercard.roadconnectivity.swagger;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Govardhan Mudduluru
 *
 */
public class SwaggerConfig {
	
	
	@Bean
	public Docket swaggerPersonApi10() {

	    return new Docket(DocumentationType.SWAGGER_2)

	        .groupName("road-connectivity-api-1.0")
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("com.mastercard.roadconnectivity.controller"))
	        .paths((PathSelectors.regex("/v1/connected.*")))
	        .build()
	        .apiInfo(new ApiInfoBuilder().version("1.0").title("Road Connectivity API").description("Documentation Road Connectivity API v1.0").build());

	}



}
