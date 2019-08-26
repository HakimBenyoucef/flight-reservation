package com.tutorial.reservation.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	JavaMailSender sender;

	@Override
	public void sendEmail(String toAddress, String subject, String body) {

		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);

			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(body);

			sender.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendItinerary(String toAddress, String filePath) {
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);

			helper.setTo(toAddress);
			helper.setSubject("Itinerary for your flight");
			helper.setText("Please find your itinerary attached");
			helper.addAttachment("Itinerary", new File(filePath));;

			sender.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
