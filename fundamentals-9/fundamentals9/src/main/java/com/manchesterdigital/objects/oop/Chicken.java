package com.manchesterdigital.objects.oop;

public class Chicken extends Bird{

    public Chicken(Integer age, String gender, Integer weighInLbs, Integer wingSpan) {
        super(age, gender, weighInLbs, wingSpan);
    }

    public void move() {
        System.out.println("I´m waddling...");
    }


}
