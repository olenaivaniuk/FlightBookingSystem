package com.finnair;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Ticket t1 = new Ticket();
        t1.setTicketNumber("JJ5263");
        t1.setTicketClass(Ticket.TicketClass.ECONOMY);
        t1.setTicketType(Ticket.TicketType.ADULT);
        t1.setCheckedBag(true);
        t1.setFood(true);

        Ticket t2 = new Ticket();
        t2.setTicketNumber("TT55263");
        t2.setTicketClass(Ticket.TicketClass.ECONOMY);
        t2.setTicketType(Ticket.TicketType.ADULT);
        t2.setCheckedBag(true);
        t2.setFood(true);
        //System.out.println(t2);
        //System.out.println();

        Ticket t3 = new Ticket();
        t3.setTicketNumber("LL55555");
        t3.setTicketClass(Ticket.TicketClass.BUSINESS);
        t3.setTicketType(Ticket.TicketType.ADULT);
        t3.setCheckedBag(false);
        t3.setFood(false);

        Ticket t4 = new Ticket();
        t4.setTicketNumber("DE45555");
        t4.setTicketClass(Ticket.TicketClass.BUSINESS);
        t4.setTicketType(Ticket.TicketType.ADULT);
        t4.setCheckedBag(false);
        t4.setFood(true);

        Ticket[] arTickets = new Ticket[] {t3, t4};

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

        Flight [] arFlight = new Flight[] {f2, f3};

        TicketManager tm = new TicketManager();
        tm.buyTicket(p1, t1, f1);
        tm.buyTicket(p1, t2, f2);
        System.out.println(p1);
        System.out.println();

        tm.buyTickets(p2, arTickets, arFlight);
        System.out.println(p2);
        System.out.println();

        Ticket [] a = p2.getTickets();
        int num = a.length;
        Ticket[] list = Arrays.copyOf(a, num + 1);
        list[num] = t6;
        //t6.setFlight(f3);
        p2.setTickets(list);
        System.out.println(p2);

        //System.out.println(t3.getFlight());
        /*p2.addTicket(t1); // adding 1 ticket (t6) to passenger (p1)
        System.out.println(p2);*/

    }

}
