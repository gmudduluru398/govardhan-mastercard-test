package com.mastercard.roadconnectivity;

import org.modelmapper.ModelMapper;

/**
 * 
 * @author: Govardhan Mudduluru
 * 
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.mastercard.roadconnectivity.repository") 
@EntityScan("com.mastercard.roadconnectivity.entity")
@SpringBootApplication
public class RoadConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoadConnectivityApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	
	

}
