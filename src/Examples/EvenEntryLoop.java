package Examples;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args){


        int userInput;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a even number or 999 to end the program.");
            userInput = input.nextInt();
            if(userInput % 2 == 0){
                System.out.println("Good Job\n");
            }
            else if (userInput % 2 != 0 && userInput != 999){
                System.out.println("ERROR: Entered number was not even.\n");
            }

        }while(userInput != 999);

        System.out.println("Good Bye");
    }
}
