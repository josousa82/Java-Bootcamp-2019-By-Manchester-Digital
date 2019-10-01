package com.manchesterdigitalchallenges.forloopchallenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> testArray = Arrays.asList(1, 4, 1, 4);
        List<Integer> testArray2 = Arrays.asList(1, 4, 3, 4);
        List<Integer> testArray3 = Arrays.asList(1, 1);


        System.out.println(only1or4(testArray));
        System.out.println(only1or4(testArray2));
        System.out.println(only1or4(testArray3));
    }

    private static Boolean only1or4(List<Integer> numbers){
       Boolean result = true;
        for(Integer number : numbers){
            if(number != 1 && number != 4){
                result = false;
                break;
            }
        }
        return result;
    }

    }
