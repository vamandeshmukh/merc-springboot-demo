package com.merc.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;

@RestController
public class DeliveryController {

	private String myApiKey = "asdf";
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

//	http://localhost:8090/get-directions/madhapur/maitrivanam

	@RequestMapping(path = "get-directions/{origin}/{destination}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<DirectionsResult> getDirections(@PathVariable(name = "origin") String origin,
			@PathVariable(name = "destination") String destination) {
		LOG.info(origin);
		LOG.info(destination);
		DirectionsApiRequest directionsApiRequest = null;
		DirectionsResult directionsResult = null;
		GeoApiContext context = new GeoApiContext.Builder().apiKey(myApiKey).build();
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<DirectionsResult> response;

		Path path = Paths.get("C:\\Users\\DELL\\Documents\\my-api-key.txt");
		try {
			myApiKey = Files.readAllLines(path).get(0);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}

		try {
			directionsApiRequest = DirectionsApi.getDirections(context, origin, destination);
			directionsResult = directionsApiRequest.await();
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}

		response = new ResponseEntity<>(directionsResult, status);

		return response;
	}
}
