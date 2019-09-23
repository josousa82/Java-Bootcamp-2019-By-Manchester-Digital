package com.manchesterdigital;

/**
 *
 * @author Jose Sousa
 *
 * Operators challenge
 *
 */
public class Challenge1 {

    public static void main(String[] args) {
        double number1 = 20d;
        double number2 = 80d;

        double result = ((number1 + number2) * 25) % 40;

        if(result <= 20) {
            System.out.printf("Total was over the limit, the reminder is %.2f.", result);
        };

    }
}
