package com.finnair;

public class TicketManager {
    public void buyTicket (Passenger p,  Ticket t,  Flight f) { //
        p.addTicket(t);
        t.setFlight(f);
    }

    public void buyTickets (Passenger p,  Ticket[] t,  Flight [] f) {
        p.addTickets(t);
        //t.setFlight(f);
    }
}
