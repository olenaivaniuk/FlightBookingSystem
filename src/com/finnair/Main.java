package com.finnair;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Passenger p1 = new Passenger("Jane", "Bohn", Passenger.Gender.FEMALE, "HH578909", 3333333333333L, 25);
        //System.out.println(p1.gender);
        //p1.gender = Passenger.Gender.FEMALE;
        System.out.println("p1 name: " + p1.name);
        System.out.println("p1 surname: " + p1.surName);
        System.out.println("p1 gender: " + p1.gender);
        System.out.println("p1 passport number: " + p1.passportNumber);
        System.out.println("p1 credic card: " + p1.creditCardNumber);
        System.out.println("p1 age: " + p1.age);
        System.out.println();

          /*Passenger p2 = new Passenger();
        p2.gender = Passenger.Gender.MALE;
        p2.name = "John";
        p2.surName = "Smith";
        p2.passportNumber = "GG234654";
        p2.creditCardNumber = 123456789876L;
        p2.age = 69;
        System.out.println("p2 name: " + p2.name);
        System.out.println("p2 surname: " + p2.surName);
        System.out.println("p2 gender: " + p2.gender);
        System.out.println("p2 passport number: " + p2.passportNumber);
        System.out.println("p2 credic card: " + p2.creditCardNumber);
        System.out.println("p2 age: " + p2.age);*/

        Ticket t1 = new Ticket("HG2365", Ticket.TicketClass.BUSINESS, Ticket.TicketType.ADULT, true, true);
        System.out.println("Ticket number is " + t1.ticketNumber);
        System.out.println("Ticket class is " + t1.ticketClass);
        System.out.println("Ticket type is " + t1.ticketType);
        System.out.println("Checked bags " + t1.checkedBag);
        System.out.println("Food " + t1.food);
        System.out.println();


        LocalDateTime nyToMucDepartureTime = LocalDateTime.of(2019, 6, 26, 22,30, 50);
        LocalDateTime mucToNyArrivalTime = LocalDateTime.of(2019, 10,5, 6, 30, 50);

        Flight f1 = new Flight("DA235", 60, nyToMucDepartureTime , mucToNyArrivalTime,"New York", "Munchen", "Boing");
        System.out.println("f1: " + f1);

        Flight f2 = new Flight();
        System.out.println(f2.getAircraftName());
        f2.setAircraftName("Airbus");
        System.out.println(f2.getAircraftName());
        System.out.println(f2);


    }

}
