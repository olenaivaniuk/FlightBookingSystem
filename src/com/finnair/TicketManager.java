package com.finnair;

public class TicketManager {
    public void buyTicket (Passenger p,  Ticket t,  Flight f) { //
        p.addTicket(t);
        t.setFlight(f);
    }
}
