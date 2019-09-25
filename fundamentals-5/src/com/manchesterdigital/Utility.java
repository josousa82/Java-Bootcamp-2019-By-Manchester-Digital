package com.manchesterdigital;

public class Utility {

    public static Boolean isEven(int a){
        return (a % 2 == 0);
    }

    public static Boolean isNamesMatch(String firstName, String lastName){
        return firstName.equalsIgnoreCase(lastName);
    }
    // This description will appear on the description of the method

    /**
     * Converts a string to a Long.
     *
     * @param input
     * @return a long if successful.
     * @throws NumberFormatException if input is not a number and outside a long´s limit.
     */
    public static Long convertStringToLong(String input) throws NumberFormatException{
        return new Long(input);
    }
}
