/**
 * 
 */
package com.mastercard.roadconnectivity.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.roadconnectivity.exception.BadRequestException;
import com.mastercard.roadconnectivity.exception.ServerRuntimeError;
import com.mastercard.roadconnectivity.service.OriginDestinationLinkService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Govardhan Mudduluru
 *
 */
@Api(value = "RoadConnectivityController", tags = { "RoadConnectivity Controller" })
@RestController("/v1")
public class RoadConnectivityController {

	@Autowired
	private OriginDestinationLinkService originDestlinkService;

	@ApiOperation(value = "Check if two given cities are connected by roads", response = String.class, tags = "isConnected")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 400, message = "400 error"),
			@ApiResponse(code = 404, message = "404 error"), @ApiResponse(code = 500, message = "500 error") })
	@GetMapping(path = "/connected")
	public ResponseEntity<String> isConnected(@RequestParam(name = "origin") String origin,
			@RequestParam(name = "destination") String destination) throws BadRequestException {

		if (StringUtils.isEmpty(origin) || StringUtils.isEmpty(destination)) {
			throw new BadRequestException("Origin or Destination request parameters are empty", null);
		}

		try {
			boolean connected = originDestlinkService.citiesConnected(origin, destination);

			if (connected) {
				return new ResponseEntity<String>("Yes", HttpStatus.OK);
			} else {

				return new ResponseEntity<String>("No", HttpStatus.OK);
			}
		} catch (Exception e) {

			throw new ServerRuntimeError("Internal Server Error", null);

		}
	}

}
