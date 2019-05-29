package com.finnair;

import java.sql.PseudoColumnUsage;

public class Passenger {
    enum Gender {FEMALE, MALE}

    String name;
    String surName;
    Gender gender;
    String passportNumber;
    long creditCardNumber;
    int age;

    Passenger() {
    }


    Passenger(String name, String surName, Gender gender, String passportNumber, long creditCardNumber, int age) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.creditCardNumber = creditCardNumber;
        this.age = age;

    }

}