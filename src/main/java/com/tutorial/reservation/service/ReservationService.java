package com.tutorial.reservation.service;

import com.tutorial.reservation.dto.ReservationRequest;
import com.tutorial.reservation.entities.Reservation;

public interface ReservationService {
	
	Reservation bookFlight(ReservationRequest request);

}
