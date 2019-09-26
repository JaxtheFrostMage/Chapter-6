package Examples;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String[] args){


        int userInput;
        int numberOfTests = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please a Test score of 1 to 100 or 999 to end the program.");
            userInput = input.nextInt();
            if(userInput >= 1 && userInput <= 100){
                numberOfTests++;
            }
            else if (userInput < 1 || userInput >= 100 && userInput != 999){
                System.out.println("ERROR: Entered number was not valid.\n");
            }

        }while(userInput != 999);

        System.out.println("Good Bye");
        System.out.println("There were " + numberOfTests + " Tests scores entered.");

    }
}
