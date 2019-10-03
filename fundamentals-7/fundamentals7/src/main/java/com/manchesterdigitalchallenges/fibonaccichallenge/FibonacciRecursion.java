package com.manchesterdigitalchallenges.fibonaccichallenge;

public class FibonacciRecursion {

    protected static Integer fibonacciNumber(Integer number){
        if(number <= 1) return number;
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }
}
