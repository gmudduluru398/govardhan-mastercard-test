/**
 * 
 */
package com.mastercard.roadconnectivity.serviceHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastercard.roadconnectivity.repository.OriginCityRepository;
import com.mastercard.roadconnectivity.repository.OriginDestinationMapperRepository;
import com.mastercard.roadconnectivity.service.OriginDestinationLinkService;
import com.mastercard.roadconnectivity.serviceImpl.OriginDestinationLinkServiceHandler;

/**
 * @author Govardhan Mudduluru
 *
 */

@Service
public class OriginDestinationLinkServiceImpl implements OriginDestinationLinkService{
	
	
	@Autowired
	private OriginDestinationMapperRepository originDestMapperRepo;
	
	@Autowired
	private OriginDestinationLinkServiceHandler linkServiceHandler;

}
