package lab17;
//Author:Jackie Zablah. Java Bootcamp

import java.util.Scanner;

public class Validation {

	public static int validateMenu(Scanner scnr) {

		while (!scnr.hasNextInt()) {
			scnr.nextLine(); // clear bad line.
			System.out.println("Sorry, I can't read that. Try again, enter a number from the Menu.");
			
		}
		int Num = scnr.nextInt();
		if (Num == 1){
			return 1;
		}
		else if (Num == 2){
			return 2; 
		}else if (Num == 3){
			return 3;
		}else if (Num != 1 || Num !=2 || Num !=3){
			System.out.println("Please enter a valid number.");
			return scnr.nextInt();
		}
		Num = scnr.nextInt();
		scnr.nextLine(); // clear for next line of input.
		return Num;
		
		
		
	}	

}


