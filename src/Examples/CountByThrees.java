package Examples;

import java.util.Scanner;

public class CountByThrees {
    public static void main(String[] args) {

        int count = 1;
        int userInput;
        int printTimes = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("What number would you like to count by?");
        userInput = input.nextInt();

        do {
            if (count % userInput == 0) {
                System.out.print(count + " ");
                printTimes++;
            }

            count++;

            if(printTimes % 10 == 0){
                System.out.print("\n");
            }
        } while (count < 301);
    }
}
