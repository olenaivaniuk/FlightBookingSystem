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

    public Flight() {}

    public Flight(String flightNumber, int numberOfSeats, LocalDateTime departureTime, LocalDateTime arrivalTime, String destination,
           String departure, String planeName) {
        this.flightNumber = flightNumber;
        this.numberOfSeats = numberOfSeats;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.departure = departure;
        this.planeName = planeName;
    }

    public String getFlightNumber () {return this.flightNumber;}
    public void setFlightNumbet(String flightNumber) {this.flightNumber = flightNumber;}

    public int gerNumberOfSeat () {return  this.numberOfSeats;}
    public void setNumberOfSeats (int numberOfSeats) {this.numberOfSeats = numberOfSeats;}

    public LocalDateTime getDepartureTime () {return this.departureTime;}
    public void setDepartureTime (LocalDateTime departureTime) {this.departureTime = departureTime;}

    public LocalDateTime getArrivalTime () {return this.arrivalTime;}
    public void setArrivalTime (LocalDateTime arrivalTime) {this.arrivalTime = arrivalTime;}

    public String getDestination () {return this.destination;}
    public void setDestination (String destination) {this.destination = destination;}

    public String getDeparture () {return this.departure;}
    public void setDeparture (String departure) {this.departure = departure;}

    public String getPlaneName (){return this.planeName;}
    public void setPlaneName(String planeName){this.planeName = planeName.toUpperCase();}

    @Override
    public String toString() {
        return "Flight number: " +this.flightNumber + ", Number of seats: " + this.numberOfSeats + ", Departure time: " + this.departureTime + ", Arrival time: " +this.arrivalTime +
                ", Destanation: " + this.destination + ", Departure: " + this.departure +  ", Aircraft name: " + this.planeName;
    }
}
