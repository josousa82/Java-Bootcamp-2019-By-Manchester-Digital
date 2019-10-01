package com.manchesterdigitalchallenges.dowhilechallenge;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        do{
            System.out.println(count);
            count++;
            if(count == 7) break;
        }while(count != 11);
    }
}
