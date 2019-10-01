package com.manchesterdigital;

import java.util.*;

public class ArraysListExample {

    public static void main(String[] args) {

        // Generic way to create an ArrayList
        ArrayList names1 = new ArrayList();

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("John");
        names2.add("Sue");
        names2.add(2, "Steve");

        int numberOfElements  = names2.size();

        System.out.printf("names2 has %d elements \n", numberOfElements);

        names2.stream().forEach(e -> System.out.println(e));

        // print first element
        String firstElement = names2.get(0);
        System.out.println("firstElement = " + firstElement);

        // remove an element
        String removedElement = names2.remove(0);
        System.out.println("removedElement = " + removedElement);

        System.out.println(names2.get(0));
        boolean removedElementViaObject = names2.remove("Steve");

        System.out.println("removedElementViaObject = " + removedElementViaObject);

        //----------------------------//

        ArrayList<String> zooAnimals = new ArrayList<>();

        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        // are there any leopard in the zoo
        System.out.println("Contains leopards?? " + zooAnimals.contains("Leopard"));

        // collections

        // sort without  comparator
        Collections.sort(zooAnimals);

        // shuffle

        Collections.shuffle(zooAnimals);

        // Random number array list

        int [] lotteryArr = new int[10];


        List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88 );


        //------------------------//
        System.out.println("zooAnimals at position 0 should be " + zooAnimals.get(0));

        // overrides a element at index X:
        zooAnimals.set(1, "Cheetah");
        System.out.println("zooAnimals.get(1) = " + zooAnimals.get(1));







    }
}
