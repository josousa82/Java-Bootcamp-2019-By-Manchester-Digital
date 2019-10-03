package com.manchesterdigital.objects.oop;

public class Magpie extends Bird implements Flyable{

    public Magpie(Integer age, String gender, Integer weighInLbs, Integer wingSpan) {
        super(age, gender, weighInLbs, wingSpan);
    }


    public void fly() {
        System.out.println("Flying like a bird...");
    }

    public void move() {
        System.out.println("Flapping..");
    }

}
