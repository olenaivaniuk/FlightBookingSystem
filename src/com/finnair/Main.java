package com.finnair;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Passenger p1 = new Passenger();
        p1.setName("Mia");
        p1.setSurName("Fisher");
        p1.setGender(Passenger.Gender.FEMALE);
        p1.setPassportNumber("LP256366");
        p1.setCreditCardNumber(522255);
        p1.setAge(28);
        System.out.println(p1);
        System.out.println();

        Ticket t1 = new Ticket();
        t1.setTicketNumber("JJ5263");
        t1.setTicketClass(Ticket.TicketClass.ECONOMY);
        t1.setTicketType(Ticket.TicketType.ADULT);
        t1.setCheckedBag(true);
        t1.setFood(true);
        System.out.println(t1);
        System.out.println();

        LocalDateTime nyToMucDepartureTime = LocalDateTime.of(2019, 6, 26, 22,30, 50);
        LocalDateTime mucToNyArrivalTime = LocalDateTime.of(2019, 10,5, 6, 30, 50);

        Flight f1 = new Flight();
        f1.setFlightNumbet("LA256");
        f1.setNumberOfSeats(56);
        f1.setDepartureTime(nyToMucDepartureTime);
        f1.setArrivalTime(mucToNyArrivalTime);
        f1.setDestination("New York");
        f1.setDeparture("Munchen");
        f1.setPlaneName("Boing");
        System.out.println(f1);
        System.out.println();


        /*Flight f2 = new Flight();
        f2.setAircraftName("Airbus");
        System.out.println(f2.getAircraftName());

        Passenger p3 = new Passenger();
        p3.setAge(56);
        System.out.println("Age of passenger p3 is " + p3.getAge());

        Ticket t2 = new Ticket();
        t2.setFood(true);
        t2.setTicketClass(Ticket.TicketClass.BUSINESS);
        System.out.println(t2); */



    }

}
