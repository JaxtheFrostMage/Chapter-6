package Assignments;

import java.util.Random;
import java.util.Scanner;

public class OpenDoorGame {

    public static void main(String[] args)
    {
        int choice = 5;
        String prize1;
        String prize2;
        String prize3;
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        while (choice >= 4){
        int door = rand.nextInt(3) + 1;
        System.out.println("There are 3 doors in front of you, Pick one. \n1: door 1 \n2: door 2\n3: door 3");
        choice = input.nextInt();

        if(choice == door)
        {
            System.out.println("You get a brand new car!");
        }
        else
            {
                System.out.println("You get to walk away with nothing.");
            }

            prize1 = "You  get a Brand new car!";
        prize2 = "you get to walk away with nothing";
        prize3 = "oh... Sorry but you will be staying with us from now on.";
    }}
}
