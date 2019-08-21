package com.tutorial.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.reservation.dto.ReservationRequest;
import com.tutorial.reservation.entities.Flight;
import com.tutorial.reservation.entities.Passenger;
import com.tutorial.reservation.entities.Reservation;
import com.tutorial.reservation.repository.FlightRepository;
import com.tutorial.reservation.repository.PassengerRepository;
import com.tutorial.reservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		//Make payment
		
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		return reservationRepository.save(reservation);
	}

}
