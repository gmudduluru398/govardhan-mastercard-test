/**
 * 
 */
package com.mastercard.roadconnectivity.serviceHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastercard.roadconnectivity.repository.DestinationCityRepository;
import com.mastercard.roadconnectivity.repository.OriginCityRepository;
import com.mastercard.roadconnectivity.service.DestinationCityService;

/**
 * @author Govardhan Mudduluru
 *
 */

@Service
public class DestinationCityServiceImpl implements DestinationCityService{
	
	@Autowired
	private DestinationCityRepository destinationCityRepo;
	
	
	

}
