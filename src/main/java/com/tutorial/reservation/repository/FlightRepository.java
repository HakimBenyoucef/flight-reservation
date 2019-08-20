package com.tutorial.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.reservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
