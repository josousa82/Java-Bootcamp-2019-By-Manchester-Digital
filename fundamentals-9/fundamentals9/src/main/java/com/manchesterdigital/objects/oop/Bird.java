package com.manchesterdigital.objects.oop;

public abstract class Bird extends Animal {

    private Integer wingSpan;

    public Bird(Integer age, String gender, Integer weighInLbs, Integer wingSpan) {
        super(age, gender, weighInLbs);
        this.wingSpan = wingSpan;
    }
}

