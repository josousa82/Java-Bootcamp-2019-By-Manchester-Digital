package com.manchesterdigital.classes;

import com.manchesterdigital.classes.funtionalprogramming.Artist;
import com.manchesterdigital.classes.funtionalprogramming.DivideNumbers;
import com.manchesterdigital.classes.funtionalprogramming.Divider;

import java.util.*;
import java.util.function.Function;

public class Scratch {

    public static void main(String[] args) {

        Artist adele = new Artist("Adele", 9_000_000L);

        Artist prince = new Artist("Prince", 20_000_000L);

        List<Artist> artists = Arrays.asList(adele, prince);

        for(Artist artist: artists){
            System.out.println("artist = " + artist.toString());
        }

        // iterating  hashmap

        Map<Long, Artist> artistMap = new HashMap<>();
        artistMap.put(1L, adele);
        artistMap.put(2L, prince);

        for(Map.Entry<Long, Artist> entry : artistMap.entrySet()){

            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        // iterate over keys
        for(Long key : artistMap.keySet()){
            System.out.println("key = " + key);
            if (artistMap.containsKey(key)){
                System.out.println("key = " + key + " exists");
            }
        }

        // for values

        for(Artist artist : artistMap.values()){
            System.out.println("artist = " + artist);
        }

        // Sets:
        Set<Artist> artistSet = new HashSet<>(artistMap.values());


        // iterate over unique values artists
        for(Artist artist : artistSet){
            System.out.println("artist = " + artist);
        }

        // Immutability ...  :) good practice
        // available in JDK 9 on..
        List<Integer> number = List.of(1, 2, 3, 4, 5);

        for(Integer i : number){
            System.out.println("i = " + i);
        }

        Set<Long> distances = Set.of(1L, 2L, 3L, 4L);

       Map<Long, String> namesMap = Map.of(1L, "John", 2L, "April");
       
       for(Map.Entry<Long, String> nameEntry : namesMap.entrySet()){
           System.out.println("nameEntry.getValue() = " + nameEntry.getValue());
       }

       // Divide a number by another number:

        Divider divider = (a, b) -> a / b;
        Double doubleResult = divider.divider(6d, 3d);
        System.out.println("doubleResult = " + doubleResult);

        // This will fail
        Double doubleResult2 = divider.divider(6d, 0d);

        // But...

        Divider safeDivider = (a, b) -> {
            if(b == 0){
                return 0d;
            }
            return a / b;
        };

        // Shorter version

        Divider safeDivider2 = (a, b) -> (b == 0) ? b : a / b;
        System.out.println("safeDivider2.divider(3d) = " + safeDivider2.divider(3d, 8d));


        // Function method
        Function<DivideNumbers, Double> divideFunc =  (a) -> (a.getB() == 0) ? a.getB(): a.getA() / a.getB();
        System.out.println("divideFunc.apply(new) = " + divideFunc.apply(new DivideNumbers(6d, 4d)));


        // List

        List<Artist> allArtists = List.of(adele, prince);

        allArtists.forEach(artist -> System.out.println("artist = " + artist));

        allArtists.forEach(System.out::println);

    }
}
