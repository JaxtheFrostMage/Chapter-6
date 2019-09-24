package Examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 999;
        int trys = 0;
        int rand_pick = rand.nextInt(100) +1;
        while(choice != rand_pick){
            System.out.println("Please pick a number from 1 to 100");
            choice = input.nextInt();


            trys = trys + 1;
            if (choice == rand_pick){
                System.out.print("good job, and it only took " + trys + " trys.");
            } else if(choice > rand_pick){
                System.out.print("incorrect, it was lower ");
            }else if(choice < rand_pick){
                System.out.print("incorrect, it was higher ");
            }
        }
    }
}
