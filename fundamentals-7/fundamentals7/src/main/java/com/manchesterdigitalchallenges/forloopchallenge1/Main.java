package com.manchesterdigitalchallenges.forloopchallenge1;

public class Main {

    public static void main(String[] args) {
        Integer sum = 0;
        for(int i = 1; i <= 500; i++){

            if(i % 15 == 0){
                System.out.println("i = " + i);
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
