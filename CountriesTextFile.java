package lab17;
//Author:Jackie Zablah. Java Bootcamp
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CountriesTextFile{

	private static Path filePath = Paths.get("src/lab17/countries.txt");
	

	static void ensureFileExists() throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
			System.out.println("File created for first time. Nothing to show yet. ");
		}
	}


	//read the file
	public static void printFile() throws IOException {
		List<String> lines = Files.readAllLines(filePath);
		for (String thisLine : lines) {
			System.out.println(thisLine);
		}
	} 

	// to add in the file
	public static void appendToFile(Country country) throws IOException {
		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
			} catch (IOException e) {
				System.out.println("Sorry, that's not right.");
			}
		}
		List<String> countryList = Arrays.asList(country.toString());
		Files.write(filePath, countryList, StandardOpenOption.APPEND);
	}


}//end class
