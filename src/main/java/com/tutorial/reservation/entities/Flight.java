package com.tutorial.reservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{
	
	private String flight_number;
	private String operating_airlines;
	private String departure_city;
	private String arrival_city;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getOperating_airlines() {
		return operating_airlines;
	}
	public void setOperating_airlines(String operating_airlines) {
		this.operating_airlines = operating_airlines;
	}
	public String getDeparture_city() {
		return departure_city;
	}
	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}
	public String getArrival_city() {
		return arrival_city;
	}
	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
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
