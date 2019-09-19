package com.manchesterdigital;

import java.util.Arrays;
import java.util.Date;

import static java.lang.String.format;

/**
 * Describes usage of variables and data types
 *
 * @author Jose Sousa.
 */
public class Variables {

    public static void main(String[] args) {

        /*
          Primitive Data types

         */
        int Number; // Bad Practice
        int numberOfAnimals = 0; // GOOD PRACTICE

        System.out.println("Number of Animals is: " + numberOfAnimals);

        /*
            This declares variables of type int, however only d3 is set to 3.
            The others are set to not initialised.
         */
        int i1, i2, i3; // BAD PRACTICE
        // int i1, i2 , i3 = 3; // WILL ONLY ASSIGN THE 3 TO THE LAST VAR
        long diameterOfSunInMiles = 12L;
        int miles = 1000000; // same has 1_000_000, new feature from java 8
        short sh = 12; // not used to often

        boolean itsRaining = false;

        float pi = 3.14f; // how to define a float, the "f" in the end makes it explicit, can´t be casted
        // float vs double use case have to do with precision points
        double pi2 = 3.14d; // how to define a double, the "d" in the end makes it explicit, can´t be casted

        char initial = 'D';

        System.out.println(itsRaining);


        /*
        Non primitive data types
         */

        String firstName = "John";
        String lastName = "Doe";

        /*
        One is firstName
        One is anonymous
        One lastName
        one is the whole string 'John Doe'
         */
        System.out.println("Name" + firstName + " " + lastName);


        // Formated output

        System.out.printf("Name:%s %s \n", firstName, lastName);
        //System.out.printf(String.format("Name:%s %s", firstName, lastName);

        StringBuilder output = new StringBuilder();

       /* output.append(firstName);
        output.append(" ");
        output.append(lastName);*/

        output.append(firstName).append(" ").append(lastName);

        System.out.println(output);

        /**
         * Arrays definition
         */

        int[] numbers = new int[10]; // not great
        numbers[0] = 99;

        int[] loteryNumbers = {23, 45, 66};  // initialize Array
        //this will print the array of the specific index

        System.out.println(numbers[0]);

        for (int i = 0; i < loteryNumbers.length; i++) {
            System.out.println(loteryNumbers[i]);
        }

        System.out.println(Arrays.toString(numbers));

        String[] names = {"John", "Doe", "mike"};

        Date today = new Date();

        System.out.println(today);
        System.out.println(today.getTime());
        hello();

        int numberOfAnimals2;
        Integer numberOfStudents = null;


        System.out.println(numberOfStudents);

        Boolean myBoolean = Boolean.FALSE;
        Short myShort = 3;

        System.out.println(Integer.MAX_VALUE);


    }

    /**
     * This is my hello method!!!
     *
     * @deprecated because is crap. Use {@link CodingStandards},
     * how to signal a deprecated method whithin a library
     * will overline the method
     */

    @Deprecated
    private static void hello() {
        System.out.println("Hello");
    }

}
