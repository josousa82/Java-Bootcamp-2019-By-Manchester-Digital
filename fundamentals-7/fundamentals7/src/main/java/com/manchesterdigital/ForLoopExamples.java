package com.manchesterdigital;

public class ForLoopExamples {

    public static void main(String[] args) {
        /**
         *
         * for(initialization; boolean expression; update initialization){
         *  // block logic
         * }
         *
         */

        // pure
        for (int i = 0; i <= 100; i++){
            System.out.println("i = " + i);
        }

        // initialize outside
        int x = 0;
        for (x = 0; x <= 100; x++) {
            System.out.println("x = " + x);
        }
        System.out.println("x outside = " + x);
    }
}
