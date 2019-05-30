package com.finnair;

public class Ticket {
    enum TicketClass{BUSINESS, ECONOMY}  // private for enum also????
    enum TicketType{ADULT, CHILD}
    private String ticketNumber;
    private TicketClass ticketClass;
    private TicketType ticketType;
    private boolean checkedBag;
    private boolean food;

    Ticket() { }

    Ticket(String ticketNumber, TicketClass ticketClass, TicketType ticketType, boolean checkedBag, boolean food) {
        this.ticketNumber = ticketNumber;
        this.ticketClass = ticketClass;
        this.ticketType = ticketType;
        this.checkedBag = checkedBag;
        this.food = food;
    }

    String getTicketNumber () {return ticketNumber;}
    void setTicketNumber(String ticketNumber) {this.ticketNumber = ticketNumber;}

    TicketClass getTicketClass() {return ticketClass;}
    void setTicketClass(TicketClass ticketClass) {this.ticketClass = ticketClass;}

    TicketType getTicketType() {return ticketType;}
    void setTicketType(TicketType ticketType) {this.ticketType = ticketType;}

    boolean checkedBag() {return checkedBag;}
    void setCheckedBag(boolean checkedBag) {this.checkedBag = checkedBag;}

    boolean getFood() {return food;}
    void setFood(boolean food) {this.food = food;}

    public String toString () {
        return "Ticket number: " + this.ticketNumber + ", Ticket class: " + this.ticketClass + ", Ticket type: " +
                this.ticketType + ", Checked bag: " + this.checkedBag + ", Food: " + this.food;
    }
}
