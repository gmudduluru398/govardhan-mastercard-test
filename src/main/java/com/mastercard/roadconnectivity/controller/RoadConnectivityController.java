/**
 * 
 */
package com.mastercard.roadconnectivity.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.roadconnectivity.exception.BadRequestException;
import com.mastercard.roadconnectivity.exception.ServerRuntimeError;
import com.mastercard.roadconnectivity.service.OriginDestinationLinkService;

/**
 * @author Govardhan Mudduluru
 *
 */

@RestController
public class RoadConnectivityController {

	@Autowired
	private OriginDestinationLinkService originDestlinkService;

	@RequestMapping(path = "/v1/connected", method = RequestMethod.GET)
	public ResponseEntity<String> isConnected(@RequestParam(name = "origin") String origin,
			@RequestParam(name = "destination") String destination) throws BadRequestException {
		
		if(StringUtils.isEmpty(origin) || StringUtils.isEmpty(destination))
		{	
			throw new BadRequestException("Origin or Destination request parameters are empty",null);
		}

		try {
		boolean connected = originDestlinkService.citiesConnected(origin, destination);

		if (connected) {
			return new ResponseEntity<String>("Yes", HttpStatus.OK);
		} else {

			return new ResponseEntity<String>("No", HttpStatus.OK);
		}
		}catch(Exception e)
		{
			
			throw new ServerRuntimeError("Internal Server Error",null);
			
		}
	}

}
