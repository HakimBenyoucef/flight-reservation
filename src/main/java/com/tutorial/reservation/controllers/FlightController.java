package com.tutorial.reservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutorial.reservation.entities.Flight;
import com.tutorial.reservation.repository.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern="dd-MM-yyyy") Date departureDate,
			ModelMap modelMap) {
	
//		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);

		List<Flight> flights = flightRepository.findAll();
		modelMap.addAttribute("flights", flights);
		
		return "displayFlights";
	}
}
