package Assignments;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLoop {

    public static void main(String[] args) {

        int playerPick;
        int playerWins = 0;
        int computerWins = 0;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        do {
            System.out.println("Pick Rock, Paper or Scissors. \n1: Rock \n2: paper \n3: Scissors\n4: end Program");
            playerPick = input.nextInt();

            int aiPick = rand.nextInt(3) + 1;

            if (playerPick == 1) {
                if (aiPick == 1) {
                    System.out.println("Rock and Rock, Draw!");
                } else if (aiPick == 2) {
                    System.out.println("Paper covers Rock, Computer Wins!");
                    computerWins++;
                } else if (aiPick == 3) {
                    System.out.println("Rock crushes Scissors, Player wins!");
                    playerWins++;

                }
            } else if (playerPick == 2) {
                if (aiPick == 1) {
                    System.out.println("paper covers Rock, Player wins!");
                    playerWins++;
                } else if (aiPick == 2) {
                    System.out.println("Paper and Paper, Draw!");
                } else if (aiPick == 3) {
                    System.out.println("Scissors cuts Paper, Computer wins!");
                    computerWins++;
                }
            } else if (playerPick == 3) {
                if (aiPick == 1) {
                    System.out.println("Rock crushes Scissors, Computer Wins!");
                    computerWins++;
                } else if (aiPick == 2) {
                    System.out.println("Scissors cuts Paper, Player Wins!");
                    playerWins++;
                } else if (aiPick == 3) {
                    System.out.println("Scissors and Scissors, Draw!");
                }
            }

        }while(playerPick != 4);
        System.out.println("you won " + playerWins + " Times");
        System.out.println("The computer won " + computerWins + " Times");

    }
}

