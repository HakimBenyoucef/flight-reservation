package com.tutorial.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
