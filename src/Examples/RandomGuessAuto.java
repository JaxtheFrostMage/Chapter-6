package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessAuto {
    public static void main(String[] args){


        Random rand = new Random();

        int max = 101;
        int min = 1;
        int choice;
        int playerChoice;
        int trys = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 100 and the computer will guess it");
        playerChoice = input.nextInt();
        do {

            choice= rand.nextInt(max - min) + min;

            trys = trys + 1;
            if (choice == playerChoice) {
                System.out.println("good job, and it only took " + trys + " trys. " + choice);
            } else if (choice > playerChoice) {
                System.out.println("incorrect, it was lower " + choice);
                max = choice - 1;
            } else if (choice < playerChoice) {
                System.out.println("incorrect, it was higher " +choice);
                min = choice + 1;
            }
            wait(1000);
        }while(choice != playerChoice);
        }

    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
