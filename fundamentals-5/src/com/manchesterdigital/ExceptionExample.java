package com.manchesterdigital;

public class ExceptionExample {

    public static void main(String[] args) {
        int[] intArr = { 8,9,3 };

        printArray(0, intArr );
        printArray(1, intArr );
        printArray(2, intArr );

        //
        try {
            printArray(3, intArr);
        }catch (ArrayIndexOutOfBoundsException e){

            // called by alias serr
            System.err.println("ERROR : Array has only " + intArr.length + " elements!");
            System.err.println("Element does not exist: " + e.getLocalizedMessage());
        }
    }

    private static void printArray(int index, int[] arr) {
        System.out.println("Element " + index + " is " + arr[index]);
    }


}
