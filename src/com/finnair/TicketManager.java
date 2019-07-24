package com.finnair;

import java.util.ArrayList;

public class TicketManager {
    public static void buyTicket(Passenger p, Ticket t, Flight f) {
        if (f == null) {
            throw new RuntimeException();
        }
        p.addTicket(t);
        t.setFlight(f);
    }

    public static void buyTickets(Passenger p, ArrayList t, ArrayList f) {
        if(t.size() != f.size()){
            throw new RuntimeException();
        }
        p.addTickets(t);
        for (int i = 0; i < t.size(); i++) {

            ((Ticket) t.get(i)).setFlight((Flight) f.get(i));
        }
    }
}
