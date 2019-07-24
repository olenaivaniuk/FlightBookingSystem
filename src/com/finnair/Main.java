package com.finnair;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Ticket t1 = generateTicket1();
        Ticket t2 = generateTicket2();
        Ticket t3 = generateTicket3();

        Ticket t4 = new Ticket();
        t4.setTicketNumber("DE45555");
        t4.setTicketClass(Ticket.TicketClass.BUSINESS);
        t4.setTicketType(Ticket.TicketType.ADULT);
        t4.setCheckedBag(false);
        t4.setFood(true);

        ArrayList arTickets = new ArrayList();
        arTickets.add(t3);
        arTickets.add(t4);

        Ticket t6 = new Ticket();
        t6.setTicketNumber("FV55555444");
        t6.setTicketClass(Ticket.TicketClass.BUSINESS);
        t6.setTicketType(Ticket.TicketType.CHILD);
        t6.setCheckedBag(false);
        t6.setFood(false);

        Passenger p1 = new Passenger();
        p1.setName("Mia");
        p1.setSurName("Fisher");
        p1.setGender(Passenger.Gender.FEMALE);
        p1.setPassportNumber("LP256366");
        p1.setCreditCardNumber(522255);
        p1.setAge(28);
        //p1.setTickets(ar1);
        System.out.println(p1);
        System.out.println();

        Passenger p2 = new Passenger();
        p2.setName("Leonard");
        p2.setSurName("Hofsteder");
        p2.setGender(Passenger.Gender.MALE);
        p2.setPassportNumber("KM522525");
        p2.setCreditCardNumber(5555522);
        p2.setAge(34);

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

        Flight f2 = new Flight();
        f2.setFlightNumbet("DB526333");
        f2.setNumberOfSeats(100);
        f2.setDepartureTime(nyToMucDepartureTime);
        f2.setArrivalTime(mucToNyArrivalTime);
        f2.setDestination("London");
        f2.setDeparture("Chicago");
        f2.setPlaneName("Mi-8");

        Flight f3 = new Flight();
        f3.setFlightNumbet("PL636666");
        f3.setNumberOfSeats(200);
        f3.setDepartureTime(nyToMucDepartureTime);
        f3.setArrivalTime(mucToNyArrivalTime);
        f3.setDestination("Chicago");
        f3.setDeparture("Paris");
        f3.setPlaneName("Airbus");

        ArrayList arFlight = new ArrayList();
        arFlight.add(f2);
        arFlight.add(f3);


        TicketManager.buyTicket(p1, t1, f1);
        TicketManager.buyTicket(p1, t2, f2);
        System.out.println(p1);
        System.out.println();

        TicketManager.buyTickets(p2, arTickets, arFlight);
        System.out.println(p2);
        System.out.println();

        ArrayList a = p2.getTickets();
        a.add(t6);
        p2.setTickets(a);
        System.out.println(p2);
        p2.getTickets().add(t1);
        System.out.println(p2);

        //System.out.println(t3.getFlight());
        /*p2.addTicket(t1); // adding 1 ticket (t6) to passenger (p1)
        System.out.println(p2);*/

        p2.printShit();
        int lok = p2.printShit2(32);
        // int lok = 4;

        System.out.println(lok + 2);
        System.out.println(p2.printShit2(32) + 2);

        int fuckmea = 10;

        Integer fuckmeb = new Integer(10);

        System.out.println(fuckmea);
        System.out.println(fuckmeb);
        System.out.println(fuckmea + fuckmeb);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);

        System.out.println(p1);
        TicketManager.buyTicket(p1, t4, f1);
        System.out.println(p1);
    }

    public static Ticket generateTicket1() {
        Ticket t = new Ticket();
        t.setTicketNumber("JJ5263");
        t.setTicketClass(Ticket.TicketClass.ECONOMY);
        t.setTicketType(Ticket.TicketType.ADULT);
        t.setCheckedBag(true);
        t.setFood(true);
        return t;
    }

    public static Ticket generateTicket2() {
        Ticket t = new Ticket();
        t.setTicketNumber("TT55263");
        t.setTicketClass(Ticket.TicketClass.ECONOMY);
        t.setTicketType(Ticket.TicketType.ADULT);
        t.setCheckedBag(true);
        t.setFood(true);
        return t;
    }

    public static Ticket generateTicket3() {
        Ticket t = new Ticket();
        t.setTicketNumber("LL55555");
        t.setTicketClass(Ticket.TicketClass.BUSINESS);
        t.setTicketType(Ticket.TicketType.ADULT);
        t.setCheckedBag(false);
        t.setFood(false);
        return t;
    }


}
