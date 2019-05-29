package com.finnair;
import java.time.LocalDateTime;

public class Flight {
    String flightNumber;
    int numberOfSeats;
    LocalDateTime departureTime; // format yyyy-MM-dd-HH-mm-ss.zzz  ---- 2007-12-03T10:15:30.
    LocalDateTime arrivalTime;
    String destination;
    String departure;
    String aircraftName;

    Flight() {}

    Flight(String flightNumber, int numberOfSeats, LocalDateTime departureTime, LocalDateTime arrivalTime, String destination,
           String departure, String aircraftName) {
        this.flightNumber = flightNumber;
        this.numberOfSeats = numberOfSeats;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.departure = departure;
        this.aircraftName = aircraftName;
    }



}
