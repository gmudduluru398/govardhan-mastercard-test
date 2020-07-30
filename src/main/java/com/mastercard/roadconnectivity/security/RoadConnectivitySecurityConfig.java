/**
 * 
 */
package com.mastercard.roadconnectivity.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author Govardhan Mudduluru
 *
 */

@Configuration
@EnableWebSecurity
public class RoadConnectivitySecurityConfig {
	
	
	  protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	            .anyRequest()
	            .permitAll()
	            .and().csrf().disable();
	    }

}
