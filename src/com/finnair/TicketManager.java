package com.finnair;

public class TicketManager {
    public void buyTicket(Passenger p, Ticket t, Flight f) { //
        p.addTicket(t);
        t.setFlight(f);
    }

    public void buyTickets(Passenger p, Ticket[] t, Flight[] f) {
        p.addTickets(t);
        for (int i = 0; i < t.length; i++) {
            t[i].setFlight(f[i]);
        }
    }
}
