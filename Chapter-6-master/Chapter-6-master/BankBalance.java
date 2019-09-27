package Tutorials;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int choice = 1;
		double balance;
	    
	      final double INT_RATE = 0.08;
	      Scanner keyboard = new Scanner(System.in);
	      System.out.print("Enter initial bank balance > ");
	      balance = keyboard.nextDouble();
	      
	      while(choice == 1){
	    	  balance = balance + balance * INT_RATE;
	    	  System.out.println("Your new balance with interest is " + balance );
	    	 
	    	  System.out.println("Would you like to see next years balance? 1 for yes 2 for no." );
	    	  choice = keyboard.nextInt();
	    	  
	      }
	      
	}

}
