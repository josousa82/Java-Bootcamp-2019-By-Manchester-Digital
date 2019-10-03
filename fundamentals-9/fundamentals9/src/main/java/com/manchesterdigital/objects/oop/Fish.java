package com.manchesterdigital.objects.oop;

public class Fish extends Animal{

    public Fish(Integer age, String gender, Integer weighInLbs) {
        super(age, gender, weighInLbs);
    }

    public void move() {
        swim();
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
