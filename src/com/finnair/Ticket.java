package com.finnair;

public class Ticket {
    public enum TicketClass{BUSINESS, ECONOMY}
    public enum TicketType{ADULT, CHILD}

    private String ticketNumber;
    private TicketClass ticketClass;
    private TicketType ticketType;
    private boolean checkedBag;
    private boolean food;
    private Flight flight;

    public Ticket() { }

    public Ticket(String ticketNumber, TicketClass ticketClass, TicketType ticketType, boolean checkedBag, boolean food) { // field flight isn't in Constructor
        this.ticketNumber = ticketNumber;
        this.ticketClass = ticketClass;
        this.ticketType = ticketType;
        this.checkedBag = checkedBag;
        this.food = food;
    }

    public String getTicketNumber () {return this.ticketNumber;}
    public void setTicketNumber(String ticketNumber) {this.ticketNumber = ticketNumber;}

    public TicketClass getTicketClass() {return this.ticketClass;}
    public void setTicketClass(TicketClass ticketClass) {this.ticketClass = ticketClass;}

    public TicketType getTicketType() {return this.ticketType;}
    public void setTicketType(TicketType ticketType) {this.ticketType = ticketType;}

    public boolean checkedBag() {return this.checkedBag;}
    public void setCheckedBag(boolean checkedBag) {this.checkedBag = checkedBag;}

    public boolean getFood() {return this.food;}
    public void setFood(boolean food) {this.food = food;}

    public Flight getFlight() {return  this.flight;}
    public  void setFlight(Flight flight ){this.flight = flight;}

    public String toString () {
        return "Ticket number: " + this.ticketNumber + ", Ticket class: " + this.ticketClass + ", Ticket type: " +
                this.ticketType + ", Checked bag: " + this.checkedBag + ", Food: " + this.food + "\nFlight: " + this.flight;
    }
}
