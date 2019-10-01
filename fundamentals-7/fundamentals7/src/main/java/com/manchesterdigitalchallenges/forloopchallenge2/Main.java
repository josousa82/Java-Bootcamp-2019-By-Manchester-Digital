package com.manchesterdigitalchallenges.forloopchallenge2;

public class Main {

    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 4));
    }

    public static String stringTimes(String str, int times){

        StringBuilder result = new StringBuilder();

        for(int i = 1; i <= times; i++){
            result.append(str);
        }
        return result.toString();
    }
}
