package com.finnair;
import java.time.LocalDateTime;

public class Flight {
    private String flightNumber;
    private int numberOfSeats;
    private LocalDateTime departureTime; // format yyyy-MM-dd-HH-mm-ss.zzz  ---- 2007-12-03T10:15:30.
    private LocalDateTime arrivalTime;
    private String destination;
    private String departure;
    private String planeName;

    Flight() {}

    Flight(String flightNumber, int numberOfSeats, LocalDateTime departureTime, LocalDateTime arrivalTime, String destination,
           String departure, String planeName) {
        this.flightNumber = flightNumber;
        this.numberOfSeats = numberOfSeats;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.departure = departure;
        this.planeName = planeName;
    }

    String getAircraftName (){
        return this.planeName;
    }

    void setAircraftName(String planeName){
        this.planeName = planeName.toUpperCase();
    }



    @Override
    public String toString() {
        return "Flight number: " +this.flightNumber + ", Number of seats: " + this.numberOfSeats + ", Departure time: " + this.departureTime + ", Arrival time: " +this.arrivalTime +
                ", Destanation: " + this.destination + ", Departure: " + this.departure +  ", Aircraft name: " + this.planeName;
    }
}
