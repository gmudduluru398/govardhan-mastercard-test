/**
 * 
 */
package com.mastercard.roadconnectivity.serviceHandler;

import org.springframework.beans.factory.annotation.Autowired;

import com.mastercard.roadconnectivity.repository.DestinationCityRepository;
import com.mastercard.roadconnectivity.repository.OriginCityRepository;
import com.mastercard.roadconnectivity.service.DestinationCityService;

/**
 * @author Govardhan Mudduluru
 *
 */
public class DestinationCityServiceImpl implements DestinationCityService{
	
	@Autowired
	private DestinationCityRepository destinationCityRepo;
	
	
	

}
