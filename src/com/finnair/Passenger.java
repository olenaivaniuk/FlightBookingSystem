package com.finnair;

import java.sql.PseudoColumnUsage;

public class Passenger {
    public enum Gender {FEMALE, MALE}

    private String name;
    private String surName;
    private Gender gender;
    private String passportNumber;
    private long creditCardNumber;
    private int age;
    private Ticket[] tickets;

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

    public Ticket[] getTickets() {return this.tickets;}
    public void setTickets(Ticket[] tickets) {this.tickets = tickets;}

    public void addTicket(Ticket[] tickets) {
        int num = tickets.length;
       Ticket [] list = new Ticket[num+1];
        System.out.println("Number of tickets:" + list.length);

    }

    public String toString() {
        return "Passenger name: " + this.name + ", Passenger surname: " + this.surName + ", Gender: " + this.gender +
                ", Passport number: " + this.passportNumber + ", Credit card number: " + this.creditCardNumber +
                ", Age of passenger: " + this.age + "\nTicket: " + this.tickets;
    }

}