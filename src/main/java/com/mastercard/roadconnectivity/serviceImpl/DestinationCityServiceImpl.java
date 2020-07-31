/**
 * 
 */
package com.mastercard.roadconnectivity.serviceImpl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastercard.roadconnectivity.entity.DestinationCity;
import com.mastercard.roadconnectivity.exception.CityNotFoundException;
import com.mastercard.roadconnectivity.model.DestinationCityDto;
import com.mastercard.roadconnectivity.repository.DestinationCityRepository;
import com.mastercard.roadconnectivity.security.SecurityEntryPoint;
import com.mastercard.roadconnectivity.service.DestinationCityService;

/**
 * @author Govardhan Mudduluru
 *
 */

@Service
public class DestinationCityServiceImpl implements DestinationCityService {
	
	
	private static final Logger LOGGER=LoggerFactory.getLogger(DestinationCityServiceImpl.class);

	@Autowired
	private DestinationCityRepository destinationCityRepo;

	@Autowired
	private ModelMapper modelMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mastercard.roadconnectivity.service.DestinationCityService#
	 * findDestinationCity()
	 */
	@Override
	public DestinationCityDto findDestinationCity(String destCity) throws CityNotFoundException {

		Optional<DestinationCity> destCityPersistant = destinationCityRepo.findByName(destCity);

		if (destCityPersistant.isPresent()) {
			return modelMapper.map(destCityPersistant.get(), DestinationCityDto.class);
		} else {

			throw new CityNotFoundException("Destination city not found in records", null);
		}
	}

}
