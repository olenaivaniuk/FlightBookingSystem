package com.finnair;

public class TicketManager {
    public void buyTicket(Passenger p, Ticket t, Flight f) {
        if (f == null) {
            throw new RuntimeException();
        }
        p.addTicket(t);
        t.setFlight(f);
    }

    public void buyTickets(Passenger p, Ticket[] t, Flight[] f) {
        p.addTickets(t);
        for (int i = 0; i < t.length; i++) {
            if (f[i] == null) {
                throw new RuntimeException();
            }
            t[i].setFlight(f[i]);
        }
    }
}
