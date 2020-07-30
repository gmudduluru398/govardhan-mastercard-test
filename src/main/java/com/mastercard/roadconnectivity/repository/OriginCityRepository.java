/**
 * 
 */
package com.mastercard.roadconnectivity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.mastercard.roadconnectivity.entity.OriginCity;

/**
 * @author Govardhan Mudduluru
 *
 */
public interface OriginCityRepository extends CrudRepository<OriginCity, Long>{
	
	Optional<OriginCity> findById(Long id);
	
	Optional<OriginCity> findByName(String name);

}
