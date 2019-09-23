package com.manchesterdigital;

import sun.management.snmp.jvminstr.JvmOSImpl;

import java.util.ArrayList;

public class Scratch {

    public static void putTheKettleOn(){
        System.out.println("Putting the kettle on");
    }


    public static void main(String[] args) {
        // declaration of Variable (assigned)
        int numberOfTeams = 4;

        // declarative statement (decalred, not assigned)
        double interestRate;

        // method invocation statement
        System.out.println(System.getenv());

        // object creation statement
        Car ferrari = new Car();

        boolean isMorning = true;

        if(isMorning){
            System.out.println("It´s morning");
            putTheKettleOn();
        }

    }
}
