package com.coddingchallenge;

public class TddCodingChallenge1 {

    /**
     * - Write a program which return
     *
     * - "fizz" if the number is a multiple of 3,
     * - return "buzz" if its multiple of 5
     * - return "fizzbuzz" if the number is divisible by both 3 and 5.
     * - If the number is not divisible by either 3 or 5 then it should
     *   just return the number itself.
     *
     * - Enhance your program to print out the outcome if provided a range of numbers 1 to 20.
     *
     * For example it should print:
     *
     * 1
     * 2 fizz
     * 4 buzz fizz …
     */




    public String calculate(Integer number) {

        StringBuilder result = new StringBuilder();

        if(number % 15 == 0) {
            result.append("fizzbuzz");
        }else if(number % 3 == 0) {
            result.append("fizz");
        }else if(number % 5 == 0) {
            result.append("buzz");
        }else{
            result.append(number);
        }
        return result.toString();
    }
}
