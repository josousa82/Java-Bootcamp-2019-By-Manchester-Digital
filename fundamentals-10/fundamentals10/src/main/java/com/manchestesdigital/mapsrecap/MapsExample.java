package com.manchestesdigital.mapsrecap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(2, "Jill");
        names.put(1, "John");
        names.put(4, "John");
        names.put(3, "Susan");

        for(Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.println("entry.getKey()" + entry.getKey());
            System.out.println("entry.getValue()" + entry.getValue());
        }

        Map<Integer, String> countries = new TreeMap<>();
        countries.put(23, "England");
        countries.put(2, "Spain");
        countries.put(99, "France");
        countries.put(77, "Germany");

        for(Map.Entry<Integer, String> entry: countries.entrySet()){
            System.out.println("TreeMap order by key, key = " + entry.getKey() + " Value = " + entry.getValue());
        }






    }
}
