package com.tutorial.reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{
	
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flight_number) {
		this.flightNumber = flight_number;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operating_airlines) {
		this.operatingAirlines = operating_airlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departure_city) {
		this.departureCity = departure_city;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrival_city) {
		this.arrivalCity = arrival_city;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	} 
	

}
