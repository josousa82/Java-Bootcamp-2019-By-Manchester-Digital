package com.manchesterdigital.objects.oop;

public abstract class Animal {

    protected Integer age;
    protected String gender;
    private Integer weighInLbs;

    public Animal(Integer age, String gender, Integer weighInLbs) {
        this.age = age;
        this.gender = gender;
        this.weighInLbs = weighInLbs;
    }

    public void eat(){
        System.out.println("Eating!!!");
    }

    public void sleep(){
        System.out.println("Sleeping ... zzzz");
    }

    public abstract void move();
}
