/**
 * 
 */
package com.mastercard.roadconnectivity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.roadconnectivity.service.OriginDestinationLinkService;

/**
 * @author Govardhan Mudduluru
 *
 */


@RestController
@RequestMapping("/connected")
public class RoadConnectivityController {
	
	@Autowired
	private OriginDestinationLinkService linkService;
	
	
	
	
	
	

}
