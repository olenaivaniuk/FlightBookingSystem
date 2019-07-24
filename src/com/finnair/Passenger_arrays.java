package com.finnair;

import java.util.Arrays;

public class Passenger_arrays {
    public enum Gender {FEMALE, MALE}

    private String name;
    private String surName;
    private Gender gender;
    private String passportNumber;
    private long creditCardNumber;
    private int age;
    private Ticket[] tickets = new Ticket[0];

    public Passenger_arrays() {

    }

    public Passenger_arrays(String name, String surName, Gender gender, String passportNumber, long creditCardNumber, int age) { // field ticket isn't in Constructor
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.creditCardNumber = creditCardNumber;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Gender getGenger() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassportNumber() {
        return this.passportNumber;
    }

    void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public long getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ticket[] getTickets() {
        return this.tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        int num = this.tickets.length;
        Ticket[] list = Arrays.copyOf(tickets, num + 1);
        list[num] = ticket;
        System.out.println("Buying a ticket: " + ticket);
        this.tickets = list;

    }

    public void addTickets(Ticket[] newTickets) {
        int num = this.tickets.length;
        Ticket[] list = Arrays.copyOf(this.tickets, num + newTickets.length);
        for (int i = 0; i < newTickets.length; i++) {
            list[num + i] = newTickets[i];
        }
        this.tickets = list;

    }


    public String toString() {
        return "Passenger name: " + this.name + ", Passenger surname: " + this.surName + ", Gender: " + this.gender +
                ", Passport number: " + this.passportNumber + ", Credit card number: " + this.creditCardNumber +
                ", Age of passenger: " + this.age + "\nTicket: " + infoAboutTickets(this.tickets);
    }

    private String infoAboutTicket(Ticket ticket) {
        if (ticket== null) {
            return  "No ticket";
        } else if (ticket.getFlight() == null) {
            return ticket.getTicketNumber() + "(No flight)";
        } else
            return ticket.getTicketNumber() + "(" + ticket.getFlight().getFlightNumber() + ")";

    }

    private String infoAboutTickets(Ticket[] tickets) {
        if (tickets.length == 0) {
            return "No tickets";
        }
            //0
            String info = infoAboutTicket(tickets[0]);

            // 1+
            for (int i = 1; i < tickets.length; i++) {
                info += ", " +infoAboutTicket(tickets[i]);
            }


        /*String info = "";
        for (int i = 0; i < tickets.length; i++) {
            if(i!=0){
                info += ", ";
            }
            info += tickets[i].getTicketNumber();

        }*/


            return info;


        }
    }


