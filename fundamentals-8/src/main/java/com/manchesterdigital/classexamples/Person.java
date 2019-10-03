package com.manchesterdigital.classexamples;

// Abstract prevent to create an instance, of the class, only to extends

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final String age;
    private final Address address;

    public Person(String firstName, String lastName, String age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public abstract void haveLunch();

    public final String sayHello() {
        return "Hello";
    }

    public final void printAddress() {
        System.out.println(address);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}



