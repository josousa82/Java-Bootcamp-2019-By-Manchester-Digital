package com.manchesterdigital.classexamples;

public class Main {

    public static void main(String[] args) {
     Address address = new Address("1st Street", "Manchester", "M23 4TT");
     //Person person = new Person("Jose", "Sousa", "37", address);
     //person.printAddress();

     Student student = new Student("Jose", "Sousa", "37", address);
            student.setUniversityName("Manchester United");
            System.out.println(student.toString());
    }

}
