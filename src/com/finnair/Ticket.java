package com.finnair;

public class Ticket {
    enum TicketClass{BUSINESS, ECONOMY};
    enum TicketType{ADULT, CHILD};

    String ticketNumber;
    TicketClass ticketClass;
    TicketType ticketType;
    boolean checkedBag;
    boolean food;

    Ticket() { }

    Ticket(String ticketNumber, TicketClass ticketClass, TicketType ticketType, boolean checkedBag, boolean food) {
        this.ticketNumber = ticketNumber;
        this.ticketClass = ticketClass;
        this.ticketType = ticketType;
        this.checkedBag = checkedBag;
        this.food = food;
    }
}
