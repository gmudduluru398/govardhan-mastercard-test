/**
 * 
 */
package com.mastercard.roadconnectivity.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastercard.roadconnectivity.service.DestinationCityService;
import com.mastercard.roadconnectivity.service.OriginCityService;

/**
 * @author Govardhan Mudduluru
 *
 */


@Component
public class OriginDestinationLinkServiceHandler {
	
	
	@Autowired
	private OriginCityService originService;
	
	@Autowired
	private DestinationCityService destinationService;
	
	
	

}
