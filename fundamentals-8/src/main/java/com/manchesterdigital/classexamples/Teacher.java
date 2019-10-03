package com.manchesterdigital.classexamples;

public class Teacher extends Person {

    public Teacher(String firstName, String lastName, String age, Address address) {
        super(firstName, lastName, age, address);
    }

    public void haveLunch() {
        System.out.println("Having lunch at 13:00");
    }
}
