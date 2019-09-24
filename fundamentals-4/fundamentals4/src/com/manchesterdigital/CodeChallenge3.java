package com.manchesterdigital;

import com.sun.deploy.util.StringUtils;

public class CodeChallenge3 {


    public static void main(String[] args) {
        printStringAge("Hello", 50);
        printStringAge("Hi", 61);

    }

    private static void printStringAge(String string, int age){

        if(age> 60 ) {
            System.out.println(string);
            System.out.println(string);
        }else{
            System.out.println(string);
        }
    }
}
