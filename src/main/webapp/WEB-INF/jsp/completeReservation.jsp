<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complete reservation</title>
</head>
<body>
<h2>Complete reservation</h2>
<pre>
Airline        : ${flight.operatingAirlines}
Departure City : ${flight.departureCity}
Arrival City   : ${flight.arrivalCity}
</pre>

<form action="completeReservation" method="post">
<h3>Passenger details:</h3>
<pre>
First Name        : <input type="text" name="passengerFirstName"/>
Last Name         : <input type="text" name="passengerLastName"/>
Email             : <input type="text" name="passengerEmail"/>
Phone             : <input type="text" name="passengerPhone"/>
<h3>Card details</h3>
Name on the card  : <input type="text" name="nameOnTheCard"/>
Card N°           : <input type="text" name="cardNumber"/>
Expiration Date   : <input type="text" name="expirationDate"/>
Digit sec code    : <input type="text" name="digitSecCode"/>

<input type="hidden" name="flightId" value="${flight.id}">
<input type="submit" value="confirm">
</pre>
</form>
</body>
</html>