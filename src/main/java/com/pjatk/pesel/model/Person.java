package com.pjatk.pesel.model;

import java.security.SecureRandom;
import java.time.LocalDate;

public class Person {
    public String peselNumber;
    public String name;
    public String surname;
    public String gender;
    public LocalDate dateOfBirth;
    public Person(String peselNumber){
        this.peselNumber= peselNumber;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        int value = Integer.parseInt(String.valueOf(peselNumber.charAt(9)));
        if(value % 2 == 0)
            return "female";
        else
            return "male";

    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

}
