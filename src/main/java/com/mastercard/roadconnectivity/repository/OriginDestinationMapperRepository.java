/**
 * 
 */
package com.mastercard.roadconnectivity.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.mastercard.roadconnectivity.entity.OriginDestinationMapper;

/**
 * @author Govardhan Mudduluru
 *
 */
public interface OriginDestinationMapperRepository extends CrudRepository<OriginDestinationMapper, Long> {
	
	Optional<OriginDestinationMapper> findById(Long id);
	
	Optional<OriginDestinationMapper> findByOriginId(Long id);
	
	Optional<OriginDestinationMapper> findByDestinationId(Long id);
}
