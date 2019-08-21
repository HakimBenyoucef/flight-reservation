package com.tutorial.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutorial.reservation.dto.ReservationRequest;
import com.tutorial.reservation.entities.Flight;
import com.tutorial.reservation.entities.Reservation;
import com.tutorial.reservation.repository.FlightRepository;
import com.tutorial.reservation.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap)
	{
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute(flight);
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and the id is : "+reservation.getId());
		
		return "reservationConfirmation";
	}
}
