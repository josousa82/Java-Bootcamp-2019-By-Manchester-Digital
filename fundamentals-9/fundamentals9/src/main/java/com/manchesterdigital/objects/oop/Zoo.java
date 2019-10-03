package com.manchesterdigital.objects.oop;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        //Abstract
        /*Animal animal = new Animal(20, "Female", 100);
        animal.eat();
        animal.sleep();*/

       // Bird bird = new Bird(23, "Male", 20, 5 );

        Chicken fromFarm = new Chicken(5, "Female", 7, 6);
                fromFarm.move();
                fromFarm.eat();
                fromFarm.sleep();

        Magpie magpie = new Magpie(34, "Male", 50, 30);

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(magpie);
        animals.add(fromFarm);

        for ( Animal animal: animals) {
            animal.move();
        }

        Flyable someAnimalThatFlies = new Magpie(34, "Male", 50, 6);

        List<Flyable> flyables = new ArrayList<Flyable>();
        flyables.add(someAnimalThatFlies);

        // flyables.add(fromFarm); ---- Not a implementor or Flyable


    }


}
