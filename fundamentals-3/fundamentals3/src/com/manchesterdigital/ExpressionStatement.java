package com.manchesterdigital;

public class ExpressionStatement {

    public static void main(String[] args) {

        int years = 5;

        // d on the var decla, means this type is sepcificly double, compiler wont cast
        double interestRate = 0.4d;

        double amountOfInterest = interestRate * years;

        System.out.println("Interest is" + amountOfInterest);

        double radius = 12.0d;

         double  outcome = Math.PI * radius * radius;
        System.out.println(outcome);

        int score = 2000;

        if(score > 1000) System.out.println("Score is greater than 1000!");

    }
}
