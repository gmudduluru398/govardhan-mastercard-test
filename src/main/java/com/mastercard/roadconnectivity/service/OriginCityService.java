/**
 * 
 */
package com.mastercard.roadconnectivity.service;

import com.mastercard.roadconnectivity.exception.CityNotFoundException;
import com.mastercard.roadconnectivity.model.OriginCityDto;

/**
 * @author Govardhan Mudduluru
 *
 */

public interface OriginCityService {

	public OriginCityDto findOriginCity(String originCity) throws CityNotFoundException;

}
