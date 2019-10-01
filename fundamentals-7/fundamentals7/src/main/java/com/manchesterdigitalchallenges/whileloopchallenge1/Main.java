package com.manchesterdigitalchallenges.whileloopchallenge1;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

      Main.sumAndAverage(1, 3);
    }

    private static void sumAndAverage(Integer idxStart, Integer idxEnd){

        Integer count = idxStart;
        Integer sum = 0;

        while (!count.equals(idxEnd)){
            count++;
            sum  += count;
        }

        Integer average = sum / (count - idxStart);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

}
