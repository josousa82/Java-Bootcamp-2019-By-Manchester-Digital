package com.manchesterdigital.classexamples;

public class Dog {

    private String breed;
    private Integer age;
    private String eyeColour;
    private Integer taleLength;
    private Integer aggressionLevel;
    private DogSize dogSize;
    private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark(){

        System.out.println(dogSize.getNoise());
    }

    public void hungry(){
        if( hungerLevel > 10){

            for (int i = 0; i < 10; i++) {
                bark();
            }
            System.out.println("Gimme food!! " + dogSize.getNoise());
        }else {
            System.out.println("I´m stuffed");
        }
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setTaleLength(Integer taleLength) {
        this.taleLength = taleLength;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }

    public static void main(String[] args) {
        // instance of Dog
        Dog poodle = new Dog(DogSize.SMALL);
        poodle.setHungerLevel(100);
        poodle.hungry();

        Dog labrador = new Dog(DogSize.LARGE);
        labrador.bark();
    }
}
