package lab17;
//Author:Jackie Zablah. Java Bootcamp
import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		Country userInput = new Country();
		int userChoice;

		System.out.println("- - - Welcome to Countries of the Planet Earth. - - - ");

		do {
			
				System.out.println("MENU. Please select an option.");
				System.out.println("1. See the list of countries");
				System.out.println("2. Add a country");
				System.out.println("3. Exit");
				userChoice = Validation.validateMenu(scnr);
			
			if (userChoice == 1) {
				CountriesTextFile.ensureFileExists();
				CountriesTextFile.printFile();
				System.out.println();
			} else if (userChoice == 2) {
				userInput = getCountryInput(scnr);
				CountriesTextFile.appendToFile(userInput);
				System.out.println("Country added!");
				System.out.println();
			} 
			
		} while (userChoice != 3);
		System.out.println("Goodbye!");


	}//end main
	
	
	private static Country getCountryInput(Scanner scnr) {
		String name = "";
		int population = 0;
		scnr.nextLine();
		System.out.println("Enter the name of a country: ");
		name = scnr.nextLine();

		System.out.println("Enter it's population: ");
		population = scnr.nextInt();

		Country userEntry = new Country(name, population);
		return userEntry;
	}
	
	
}//end classs

