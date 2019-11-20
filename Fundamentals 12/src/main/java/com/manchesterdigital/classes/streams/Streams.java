package com.manchesterdigital.classes.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        // this is mutable
        int result = 0;

        for(Integer i : numbers){
            result += i * 2;
        }

        System.out.println("result = " + result);

        // immutable but not to great

        System.out.println( "result = " + numbers.stream()
                .map(i -> i * 2 )
                .reduce(0, Integer::sum));


        // Range

        int sum = IntStream.range(0, 10)
                .sum();

        System.out.println("Range sum (edges not included) = " + sum);

        int sumClosed = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println("Range sum (edges included)" + sumClosed);

        // Old dirty way to capitalize names
        List<String> names = List.of("john", "amy", "jack");
        for(String name : names){
            String uCase = name.toUpperCase();
            System.out.println("uCase = " + uCase);
        }

        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("upperCaseNames = " + upperCaseNames);

        // improved version of capitalize

        List<String> uppercaseUsingMethodRef = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("uppercaseUsingMethodRef = " + uppercaseUsingMethodRef);

        // dealing with multiple streams

        List<List<String>> richPeople = List.of(
                List.of("Jeff Bezos"),
                List.of("Bill Gates"),
                List.of("Deborah Meadon"),
                List.of("Mark Zuckerberg")
        );

        // merge list of lists

        Set<String> flattedSet = richPeople.stream()
                .flatMap(sets -> sets.stream())
                .collect(Collectors.toSet());

        System.out.println("flattedSet = " + flattedSet);

        List<String> flattedList = richPeople.stream()
                .flatMap(sets -> sets.stream())
                .collect(Collectors.toList());

        System.out.println("flattedSet = " + flattedList);

        // Sorting




    }
}
