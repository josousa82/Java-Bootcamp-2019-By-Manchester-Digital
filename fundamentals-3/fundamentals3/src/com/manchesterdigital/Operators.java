package com.manchesterdigital;

public class Operators {

    public static void main(String[] args) {

        // Example of addition operator
        int result = 1 + 2;
        System.out.println("\nResult is " + result);

        // Subtract:
        result = 3 - 1;
        System.out.println("\nResult is " + result);

        // Multiplication:
        result = 5 * 9;
        System.out.println("\nResult is " + result);

        // Division:
        result = 10 / 5;
        System.out.println("\nResult is " + result);

        // remainder modules
        result = 20 % 10;
        System.out.println("\nResult is " + result);

        // increment: result +1
        result = 10;
        result++;
        System.out.println("\nResult is " + result);

        // post increment
        result++;

        // pre-increment
        ++result;

        // remove 1 from result and re-assign outcome to result
        // decrement
        result = result - 1;

        // post decrement

        result--;

        // pre decrement
        --result;

        //addition operator in an abbreviated way

        result += 3;

        result = result -10;

        result -= 10;

        result *= 20;

        result /= 20;



        /*
        Boolean operators
         + not operator
         + equality operator
         */
        boolean isRainingToday = false;
        int number1 = 100;
        int number2 = 200;

        if(number1 == number2) System.out.println("\nSame!!!");

        if (!isRainingToday) System.out.println("\nYou won´t need a jacket today!");

        if(number1 != number2) System.out.println("\nSame!!!");

        if(number1 < number2) System.out.println("\nSame!!!");
        if(number1 > number2) System.out.println("\nIt is greater !!!");
        if(number1 >= number2) System.out.println("\nIt is greater or equal !!!");
        if(number1 <= number2) System.out.println("\nIt is less or equal !!!");

        // Example an and operator &&

        int degreeScore = 60;
        int overAllScore = 100;

        if (degreeScore >= 60 && overAllScore >= 100) System.out.println("Whooo!!");
        else System.out.println("Buuuuuu!!!");


        if(degreeScore >= 60 || overAllScore >= 100) System.out.println("Whooo!!");;

        // will assing true to isAnimal
        boolean isAnimal = false;
        if(isAnimal = true) System.out.println("\nI´m an animal");

        String lastName = "Sousa";
        if(!lastName.equals("SOUSA")) System.out.println("\n Negation: \n Surname is Sousa!!");
        if(lastName.equalsIgnoreCase("SOUSA"))  System.out.println("\n Ignore case: \nSurname is Sousa!!");

        // example of a ternary operator
        int numberOfMealsToday = 1;
        boolean isHungry = numberOfMealsToday == 1 ? true: false;
    }

}
