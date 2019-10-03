package com.manchesterdigital.classexamples;

import java.util.Arrays;


public class Student extends Person {

    private String universityName;

    public Student(String firstName, String lastName, String age, Address address) {
        super(firstName, lastName, age, address);
    }

    public void haveLunch() {
        System.out.println("Has lunch at 12");
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();

        out.append(Arrays.asList( "University name:", universityName,
                                  "Name: ", getFirstName(), getLastName(), "\n",
                                  "Age: ", getAge()));

        return out.toString();
    }
}
