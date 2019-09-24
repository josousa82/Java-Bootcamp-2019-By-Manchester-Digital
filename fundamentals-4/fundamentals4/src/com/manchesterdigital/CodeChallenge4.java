package com.manchesterdigital;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jose Sousa
 * Rock Paper Scissors Game
 *
 */
public class CodeChallenge4 {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        System.out.println("Do you want to play agaisn´t the computer or other player?\n " +
                "Enter 1 for computer, 2 for other player");

        Scanner userInput = new Scanner(System.in);

        Integer playerChoice = Integer.valueOf(userInput.nextLine());

        if(playerChoice == 1){

           int computerChoice = new Random().nextInt(4) + 1 ;

           String computerPlay = "";

                   switch(computerChoice){
                       case 1:
                           computerPlay = ROCK;
                           break;
                       case 2:
                           computerPlay = PAPER;
                           break;
                       case 3:
                           computerPlay = SCISSORS;
                           break;
                   }

            System.out.println("Enter Rock, Paper or Scissors");
            String player1 = userInput.nextLine();
            winner(player1, computerPlay);
            System.out.println(computerChoice);

        }else if(playerChoice == 2) {

            System.out.println("Enter Rock, Paper or Scissors");
            String player1 = userInput.nextLine();
            String player2 = userInput.nextLine();
            winner(player1, player2);
        }
        /*switch (winner(player1, player2)){
            case 0:
                System.out.println("It´s a tie");
                break;
            case 1:
                System.out.println("Player 1 Won");
                scorePlayer1++;
                break;
            case 2:
                System.out.println("Player 2 Won");
                scorePlayer2++;

        }*/

    }


    private static int winner(String player1, String player2 ){
        int winPlayer = 0;

        if(player1 == player2) winPlayer = 0;
        if(player1 == ROCK && player2 == PAPER ) winPlayer = 2;
        if(player1 == ROCK && player2 == SCISSORS) winPlayer = 1;
        if(player1 == PAPER && player2 == ROCK) winPlayer = 1;
        if(player1 == PAPER && player2 == SCISSORS) winPlayer = 2;
        if(player1 == SCISSORS && player2 == ROCK) winPlayer = 1;

        return winPlayer;
    }

}
