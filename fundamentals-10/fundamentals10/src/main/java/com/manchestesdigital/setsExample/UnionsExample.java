package com.manchestesdigital.setsExample;

import java.util.HashSet;
import java.util.Set;

public class UnionsExample {

    public static void main(String[] args) {

        Set<String> cats = new HashSet<>();
        cats.add("Lion");
        cats.add("Cheetah");

        Set<String> reptiles = new HashSet<>();
        reptiles.add("Snake");
        reptiles.add("Crocodile");

        // creating Zoo..
        Set<String> zoo = new HashSet<>(cats);
        zoo.addAll(reptiles);

        System.out.println("zoo = " + zoo);

        // intersection:

        Set<String> namesInt = new HashSet<>();
        namesInt.add("John");
        namesInt.add("April");
        namesInt.add("Jose");
        namesInt.add("Emalin");

        Set<String> otherNames = new HashSet<>();
        otherNames.add("John");
        otherNames.add("Joanne");
        otherNames.add("Jill");
        otherNames.add("Emalin");


        Set<String> intersectionOfBoth = new HashSet<>(namesInt);
        intersectionOfBoth.retainAll(otherNames);

        System.out.println("intersectionOfBoth = " + intersectionOfBoth);

        // differences

        Set<String> nameDifferences = new HashSet<>(namesInt);
        nameDifferences.removeAll(otherNames);

        System.out.println("nameDifferences = " + nameDifferences);




    }
}
