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

import com.mastercard.roadconnectivity.entity.OriginCity;
import com.mastercard.roadconnectivity.exception.CityNotFoundException;
import com.mastercard.roadconnectivity.model.OriginCityDto;
import com.mastercard.roadconnectivity.repository.OriginCityRepository;
import com.mastercard.roadconnectivity.service.OriginCityService;

/**
 * @author Govardhan Mudduluru
 *
 */

@Service
public class OriginCityServiceImpl implements OriginCityService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(OriginCityServiceImpl.class);

	@Autowired
	private OriginCityRepository originCityRepo;

	@Autowired
	private ModelMapper modelMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mastercard.roadconnectivity.service.OriginCityService#findOriginCity()
	 */
	@Override
	public OriginCityDto findOriginCity(String originCity) throws CityNotFoundException {

		Optional<OriginCity> originCityPersistant = originCityRepo.findByName(originCity);

		if (originCityPersistant.isPresent()) {
			return modelMapper.map(originCityPersistant.get(), OriginCityDto.class);
		} else {

			throw new CityNotFoundException("Origin city not found in records", null);
		}

	}

}
