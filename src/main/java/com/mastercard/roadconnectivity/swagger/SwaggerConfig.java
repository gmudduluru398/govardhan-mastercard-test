/**
 * 
 */
package com.mastercard.roadconnectivity.swagger;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mastercard.roadconnectivity.serviceImpl.OriginDestinationLinkServiceImpl;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Govardhan Mudduluru
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	private static final Logger LOGGER=LoggerFactory.getLogger(SwaggerConfig.class);
	
	  /**
    *
    * @return Docket
    */
   @Bean
   public Docket api() {
       return new Docket(DocumentationType.SWAGGER_2)
           .select()
           .apis(RequestHandlerSelectors.basePackage("com.mastercard.roadconnectivity.controller"))
           .paths(PathSelectors.any())
           .build()
           .apiInfo(getApiInfo());
   }

   private ApiInfo getApiInfo() {
	      return new ApiInfo("RoadConnectivity Api Documentation",
	          "RoadConnectivity Rest API",
	          "1.0", "http://test.termsofservice.com",
	          new Contact("Govardhan Mudduluru", "www.govarblog.com", "contact-us@govarblog.com"),
	          "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
	  }

}
