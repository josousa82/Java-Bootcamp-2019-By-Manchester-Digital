package com.manchesterdigitalchallenges.tenGreenBottlesChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main.tenGreenBottles();

    }

    private static void tenGreenBottles(){
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("zero", "one",
                "two", "three", "four",
                "five", "six", "seven",
                "eight", "nine", "ten"));

        for(int i = 10; i >= 0; i--){

            System.out.printf("%s green bottles hanging on the wall, \n" +
                            "%s green bottles hanging on the wall, \n " +
                            "And if one green bottle should accidentally fall, \n " +
                    "There will be %s green bottles hanging on the wall. \n\n\n",
                    numbers.get(i),
                    numbers.get(i),
                    numbers.get(((i != 0) ? i - 1 : i )));
        }



    }
}


