package com.tutorial.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.reservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
