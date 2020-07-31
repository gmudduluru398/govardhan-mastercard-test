/**
 * 
 */
package com.mastercard.roadconnectivity.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastercard.roadconnectivity.entity.OriginDestinationMapper;
import com.mastercard.roadconnectivity.exception.CityNotFoundException;
import com.mastercard.roadconnectivity.model.DestinationCityDto;
import com.mastercard.roadconnectivity.model.OriginCityDto;
import com.mastercard.roadconnectivity.repository.OriginDestinationMapperRepository;
import com.mastercard.roadconnectivity.service.DestinationCityService;
import com.mastercard.roadconnectivity.service.OriginCityService;
import com.mastercard.roadconnectivity.service.OriginDestinationLinkService;

/**
 * @author Govardhan Mudduluru
 *
 */

@Service
public class OriginDestinationLinkServiceImpl implements OriginDestinationLinkService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(OriginDestinationLinkServiceImpl.class);

	@Autowired
	private OriginDestinationMapperRepository originDestMapperRepo;

	@Autowired
	private OriginCityService originCityService;

	@Autowired
	private DestinationCityService destinationCityService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mastercard.roadconnectivity.service.OriginDestinationLinkService#
	 * citiesConnected(java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean citiesConnected(String origin, String destination) throws CityNotFoundException, Exception {

		OriginCityDto originDto = originCityService.findOriginCity(origin);
		DestinationCityDto destDto = destinationCityService.findDestinationCity(destination);

		Optional<OriginDestinationMapper> originDestMapping = originDestMapperRepo
				.findByOriginIdOrDestinationId(originDto.getId(), destDto.getId());

		if (originDestMapping.isPresent()) {

			return Boolean.TRUE;
		} else {

			return Boolean.FALSE;
		}

	}

}
