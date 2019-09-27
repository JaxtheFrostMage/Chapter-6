package Examples;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String[] args){


        int userInput;
        int numberOfTests = 0;
        int lowestScore = 100;
        int highestScore = 0;
        double totalScore = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please a Test score of 1 to 100 or 999 to end the program.");
            userInput = input.nextInt();
            if(userInput >= 1 && userInput <= 100){
                numberOfTests++;
                totalScore = totalScore + userInput;
            }
            else if (userInput < 1 || userInput >= 100 && userInput != 999){
                System.out.println("ERROR: Entered number was not valid.\n");
            }

            if (userInput > highestScore && userInput <= 100){
                highestScore = userInput;
            }

            if (userInput < lowestScore && userInput >= 1){
                lowestScore = userInput;
            }


        }while(userInput != 999);

        System.out.println("Good Bye");
        System.out.println("There were " + numberOfTests + " Tests scores entered.");
        System.out.println("The highest score was " + highestScore + ".");
        System.out.println("The lowest score was " + lowestScore + ".");
        System.out.println("The class average was " + (totalScore / numberOfTests) + ".");


    }
}
