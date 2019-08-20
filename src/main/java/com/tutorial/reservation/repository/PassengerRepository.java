package com.tutorial.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.reservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
