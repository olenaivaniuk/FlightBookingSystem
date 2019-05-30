package com.finnair;
import java.sql.PseudoColumnUsage;

public class Passenger {
    enum Gender {FEMALE, MALE}
    private String name;
    private String surName;
    private Gender gender;
    private String passportNumber;
    private long creditCardNumber;
    private int age;

    Passenger() {  }

    Passenger(String name, String surName, Gender gender, String passportNumber, long creditCardNumber, int age) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.creditCardNumber = creditCardNumber;
        this.age = age;
    }

    String getName () {return name;}
    void setName(String name) {this.name = name;}

    String getSurName () {return surName;}
    void setSurName(String surName) {this.surName = surName;}

    Gender getGenger() {return gender;}
    void setGender(Gender gender) {this.gender = gender;}

    String getPassportNumber() {return passportNumber;}
    void setPassportNumber(String passportNumber) {this.passportNumber = passportNumber;}

    long getCreditCardNumber() {return  creditCardNumber;}
    void setCreditCardNumber(long creditCardNumber) {this.creditCardNumber = creditCardNumber;}

    int getAge() {return age;}
    void setAge(int age) {this.age = age;}


    public String toString() {
        return "Passenger name: " + this.name + ", Passenger surname: " + this.surName + ", Gender: " + this.gender +
                ", Passport number: " + this.passportNumber + ", Credit card number: " + this.creditCardNumber +
                "Age of passenger: " + this.age;
    }

}