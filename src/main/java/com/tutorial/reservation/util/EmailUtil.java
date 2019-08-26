package com.tutorial.reservation.util;

public interface EmailUtil {
	
	void sendEmail(String toAddress, String subject, String body);
	
	void sendItinerary(String toAddress, String filePath);

}
