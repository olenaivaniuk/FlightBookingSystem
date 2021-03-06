package com.finnair;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Arrays;

public class Passenger {
    public enum Gender {FEMALE, MALE}

    private String name;
    private String surName;
    private Gender gender;
    private String passportNumber;
    private long creditCardNumber;
    private int age;
    private ArrayList tickets = new ArrayList();

    public Passenger() {

    }

    public Passenger(String name, String surName, Gender gender, String passportNumber, long creditCardNumber, int age) { // field ticket isn't in Constructor
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

    public ArrayList getTickets() {
        return this.tickets;
    }

    public void setTickets(ArrayList tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void addTickets(ArrayList newTickets) {
        this.tickets.addAll(newTickets);
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

    private String infoAboutTickets(ArrayList tickets) {
        if (tickets.size() == 0) {
            return "No tickets";
        }
            //0
            String info = infoAboutTicket((Ticket) tickets.get(0));

            // 1+
            for (int i = 1; i < tickets.size(); i++) {
                info += ", " +infoAboutTicket((Ticket) tickets.get(i));
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
        public void printShit(){
            System.out.println("I'm cool");
            int sum = 2+2;
            System.out.println("2+2= " + sum);
    }

    public int printShit2(int input){
        System.out.println("I'm cool");
        int sum = 2+2;
        int sum2 = 3+5;
        System.out.println("2+2= " + sum);
        return input + 2;
    }
    }


