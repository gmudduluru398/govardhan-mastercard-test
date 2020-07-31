/**
 * 
 */
package com.mastercard.roadconnectivity.service;

import com.mastercard.roadconnectivity.exception.CityNotFoundException;
import com.mastercard.roadconnectivity.model.DestinationCityDto;

/**
 * @author Govardhan Mudduluru
 *
 */

public interface DestinationCityService {

	public DestinationCityDto findDestinationCity(String destCity) throws CityNotFoundException;

}
