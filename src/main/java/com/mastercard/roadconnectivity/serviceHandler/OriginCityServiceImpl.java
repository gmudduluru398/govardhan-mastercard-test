/**
 * 
 */
package com.mastercard.roadconnectivity.serviceHandler;

import org.springframework.beans.factory.annotation.Autowired;

import com.mastercard.roadconnectivity.repository.OriginCityRepository;
import com.mastercard.roadconnectivity.service.OriginCityService;

/**
 * @author Govardhan Mudduluru
 *
 */
public class OriginCityServiceImpl implements OriginCityService {
	
	@Autowired
	private OriginCityRepository originCityRepo;

}
