package com.github.simpleSpringBoot.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.simpleSpringBoot.domain.Car;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "health")
@RestController
@RequestMapping("/api/v1")
// http://javasampleapproach.com/java-integration/integrate-jquery-ajax-post-get-spring-boot-web-service
// http://tutorials.jenkov.com/java-web-apps/web-app-maintenance.html
// https://codebeautify.org/yaml-to-json-xml-csv
public class YuriyController {

	private static final String PRIVIT_VID_YURI = "Privit Vid yuri";

	@ApiOperation(value = "Provides hello status", tags = "health")
	@GetMapping(value = "sayhello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return PRIVIT_VID_YURI;
	}

	@ApiOperation(value = "Provides cars List", tags = "health")
	@GetMapping(value = "cars-list", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<Car> carsList() {
		List<Car> cars = new LinkedList<Car>();
		cars.add(new Car("VW", "JR5837"));
		cars.add(new Car("Zaz", "BT 777"));
		return cars;
	}

}
