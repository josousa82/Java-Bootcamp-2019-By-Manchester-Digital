package com.manchesterdigital.classes.funtionalprogramming;

import com.manchesterdigital.challenges.Multiply;

import java.util.function.Function;

public class Scratch {

    public static void main(String[] args) {
        Artist skepta = new Artist("Skepta", 2_000_000L);

        Function<Integer, Double> half = a -> a / 2.0d;

        Function<Integer, Double> compose = half.compose(a -> a * 3);

        half = half.compose(a -> a * 3);
        System.out.println("half = " + half.apply(5));

        half = half.andThen(a -> a * 3);

        System.out.println("half.apply(10) = " + half.apply(10));

        // Functional Interface way
        Multiply multiply = number -> number * 2;
        System.out.println("result = " + multiply.multiplyBy2(5));

        // lambda function version
        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        System.out.println("multiplyBy2.apply(2 = " + multiplyBy2.apply(2));


    }
}
