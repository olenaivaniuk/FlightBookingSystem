package com.finnair;

public class TicketManager {
    public void buyTicket (Passenger p, Ticket t, Flight f) {
        p.setTicket(t);
        t.setFlight(f);
    }
}
