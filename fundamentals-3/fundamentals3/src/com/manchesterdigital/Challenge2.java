package com.manchesterdigital;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Challenge2 {

    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));

        System.out.println("ternary " + lastDigit2(7, 17));
        System.out.println("ternary " + lastDigit2(6, 17));
        System.out.println("ternary " + lastDigit2(3, 113));

        System.out.println("Simpler " + lastDigit3(7, 17));
        System.out.println("Simpler " + lastDigit3(6, 17));
        System.out.println("Simpler " + lastDigit3(3, 113));
    }

    public static boolean lastDigit(int var1, int var2){
         int var11 = var1 % 10;
         int var12  = var2 % 10;

         if (var11 == var12){
             return true;
         }else {
             return false;
         }

    }

    public static boolean lastDigit2(int var1, int var2) {
            return (var1 % 10) == (var2 % 10) ? true: false;
    }

    public static boolean lastDigit3(int var1, int var2) {
        return (var1 % 10 == var2 % 10);
    }

}
