package com.finnair;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Ticket t1 = generateTicket1();
        Ticket t2 = generateTicket2();
        Ticket t3 = generateTicket3();
        Ticket t4 = generateTicket4();

        Passenger p1 = generatePassenger1();
        Passenger p2 = generatePassenger2();

        Flight f1 = generateFlight1();
        Flight f2 = generateFlight2();
        Flight f3 = generateFlight3();

        ArrayList arTickets = new ArrayList();
        arTickets.add(t3);
        arTickets.add(t4);

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
        a.add(t4);
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

    public static Ticket generateTicket4() {
        Ticket t = new Ticket();
        t.setTicketNumber("DE45555");
        t.setTicketClass(Ticket.TicketClass.BUSINESS);
        t.setTicketType(Ticket.TicketType.ADULT);
        t.setCheckedBag(false);
        t.setFood(true);
        return t;
    }

    public static Passenger generatePassenger1() {
        Passenger p = new Passenger();
        p.setName("Mia");
        p.setSurName("Fisher");
        p.setGender(Passenger.Gender.FEMALE);
        p.setPassportNumber("LP256366");
        p.setCreditCardNumber(522255);
        p.setAge(28);
        return p;
    }

    public static Passenger generatePassenger2() {
        Passenger p = new Passenger();
        p.setName("Leonard");
        p.setSurName("Hofsteder");
        p.setGender(Passenger.Gender.MALE);
        p.setPassportNumber("KM522525");
        p.setCreditCardNumber(5555522);
        p.setAge(34);
        return p;
    }




    public static Flight generateFlight1() {
        LocalDateTime nyToMucDepartureTime = LocalDateTime.of(2019, 6, 26, 22,30, 50);
        LocalDateTime mucToNyArrivalTime = LocalDateTime.of(2019, 10,5, 6, 30, 50);

        Flight f = new Flight();
        f.setFlightNumbet("LA256");
        f.setNumberOfSeats(56);
        f.setDepartureTime(nyToMucDepartureTime);
        f.setArrivalTime(mucToNyArrivalTime);
        f.setDestination("New York");
        f.setDeparture("Munchen");
        f.setPlaneName("Boing");
        return f;
    }

    public static Flight generateFlight2() {
        LocalDateTime nyToMucDepartureTime = LocalDateTime.of(2019, 6, 26, 22,30, 50);
        LocalDateTime mucToNyArrivalTime = LocalDateTime.of(2019, 10,5, 6, 30, 50);
        Flight f = new Flight();

        f.setFlightNumbet("DB526333");
        f.setNumberOfSeats(100);
        f.setDepartureTime(nyToMucDepartureTime);
        f.setArrivalTime(mucToNyArrivalTime);
        f.setDestination("London");
        f.setDeparture("Chicago");
        f.setPlaneName("Mi-8");
        return f;
    }

    public static Flight generateFlight3() {
        LocalDateTime nyToMucDepartureTime = LocalDateTime.of(2019, 6, 26, 22,30, 50);
        LocalDateTime mucToNyArrivalTime = LocalDateTime.of(2019, 10,5, 6, 30, 50);

        Flight f = new Flight();
        f.setFlightNumbet("PL636666");
        f.setNumberOfSeats(200);
        f.setDepartureTime(nyToMucDepartureTime);
        f.setArrivalTime(mucToNyArrivalTime);
        f.setDestination("Chicago");
        f.setDeparture("Paris");
        f.setPlaneName("Airbus");
        return f;
    }

}
