package com.manchesterdigital.challenges.navigator;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {

                Scanner userDirectionInput = new Scanner(System.in);
                System.out.println("Which direction? \n N, S, E, W");

                String userDirection = userDirectionInput.nextLine();
                Scanner userStepsInput = new Scanner(System.in);

                System.out.println("How many steps?");
                Integer userSteps = userStepsInput.nextInt();

                Navigator userMove = new Navigator(userDirection, userSteps);

                String test = Directions.W.getDirection();
                System.out.println(test);
            }
}
