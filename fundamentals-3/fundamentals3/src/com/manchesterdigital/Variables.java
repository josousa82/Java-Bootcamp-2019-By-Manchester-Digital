package com.manchesterdigital;

public class Variables {
    // variable
    static boolean isHungry = false;
    static int  count = 0;
    public static void main(String[] args) {
        greetWhenAdult(12);
        Variables var = new Variables();
        boolean v = var.isHungry;

    }

    // this coment will kappear on the description of the method

    /**
     * Greets based on age
     * @param age this is the age required
     * */

    private static void greetWhenAdult(int age){

        boolean isHAppy = true;
        if(!isHungry) {
            if (isHAppy && age >= 18) System.out.println("Hello");
        }
    }
} // end of class
