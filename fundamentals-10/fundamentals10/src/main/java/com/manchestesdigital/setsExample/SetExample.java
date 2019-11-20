package com.manchestesdigital.setsExample;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("April");
        names.add("John");
        names.add("John");
        names.add("John");
        names.add("John");
        names.add("Emalin");

        for (String name: names){
            System.out.println("name = " + name);
        }
        Set<Integer> ages = new TreeSet<>();
        ages.add(22);
        ages.add(22);
        ages.add(22);
        ages.add(2);
        ages.add(99);
        ages.add(1);
        ages.add(77);
        System.out.println("ages " + ages);

        List<String> footPlayers = Arrays.asList("Ronaldo", "Messi", "Neymar", "Rooney", "Zlatan", "Ronaldo");

        Set<String> uniqueFootPlayers = new TreeSet<>(footPlayers);
        System.out.println(" uniqueFootPlayers = " + uniqueFootPlayers);


    }
}
