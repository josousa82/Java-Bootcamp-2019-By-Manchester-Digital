package com.manchesterdigital;

public class CodeChallenge2 {
  /*  private enum LicenseChar {
    *//*private static final char S = 5;
    private static final char A = 4;
    private static final char I = 1;
    private static final char B = 8;
    private static final char G = 9;*//*

     S,  5,
     A  4;
     I  1;
     B 8;
     G 9;
    }*/

    private static final String S = "5";
    private static final char A = 4;
    private static final char I = 1;
    private static final char B = 8;
    private static final char G = 9;

    /*private static String registrationGenerator(String input){
     //  String [] charToTest = {"S", "A", "I", "B", "G"};
//        int idx = input.indexOf(charToTest);

        //new String(input).contains(int i ==  ->)

        //return String.valueOf(charToTest);
    }*/

    public static void main(String[] args) {
        System.out.println();
        String input = "SB11VZY";
        String [] charToTest = {"S", "A", "I", "B", "G"};

        int idx = input.indexOf(String.valueOf("S"));
        System.out.println(S);
    }

}
