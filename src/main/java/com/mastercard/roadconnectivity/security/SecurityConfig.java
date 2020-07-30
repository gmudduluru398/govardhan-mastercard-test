/**
 * 
 */
package com.mastercard.roadconnectivity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * @author Govardhan Mudduluru
 *
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public BCryptPasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Value("${spring.security.user.name}")
	private String user;
	
	@Value("${spring.security.user.password}")
	private String pass;
	
	@Value("${spring.security.user.roles}")
	private String role;
	
	@Autowired
	private SecurityEntryPoint securityEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.anyRequest().authenticated()
				.and().httpBasic()
				.authenticationEntryPoint(securityEntryPoint);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication().withUser(user).password(pass).roles(role);
	}
}
