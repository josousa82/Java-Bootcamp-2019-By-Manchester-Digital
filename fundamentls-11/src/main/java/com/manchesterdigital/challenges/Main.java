package com.manchesterdigital.challenges;

import com.manchesterdigital.classes.funtionalprogramming.NumericTest;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Functional Interface way
        Multiply multiply = number -> number * 2;
        System.out.println("result = " + multiply.multiplyBy2(5));

        // lambda function version
        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        System.out.println("multiplyBy2.apply(2 = " + multiplyBy2.apply(2));

        // Functional Interface way
        MultiplyTwoNumbers calculate = (n, x) -> n * x;
        System.out.println("result = " + calculate.calculate(2, 5));

        // lambda function version

        Function<Numbers, Integer> MultiplyTwoNumbersLambda = a -> a.getA() * a.getB();
        Numbers num = new Numbers(2, 3);




    }

}
