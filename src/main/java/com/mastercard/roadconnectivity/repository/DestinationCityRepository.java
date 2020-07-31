/**
 * 
 */
package com.mastercard.roadconnectivity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.mastercard.roadconnectivity.entity.DestinationCity;


/**
 * @author Govardhan Mudduluru
 *
 */
public interface DestinationCityRepository extends CrudRepository<DestinationCity, Long>{
	
	
	Optional<DestinationCity> findByName(String name);

}
