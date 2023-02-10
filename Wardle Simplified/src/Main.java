// This is a project purely for fun. No rights reserved. I lay no claim to the Smite content discussed. I did write the code below though :D

import java.util.HashMap;
import java.net.URL;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

// Strings used to format the colors in the console
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\033[0;93m";
  
    public static void main(String[] args) throws Exception {

        LocalDate Today = LocalDate.now();
        		
        int date = Integer.parseInt(Today.format(DateTimeFormatter.ofPattern("yyMMdd")));
        int yesterday = 0;
        
        // If statements for calculating yesterday's date
        if (date % 100 == 1) { // If first of the month then...
        	if (date % 10000 == 301 || date % 10000 == 501 || date % 10000 == 701 || date % 10000 == 801 || date % 10000 == 1001 || date % 10000 == 1201) {
        		yesterday = date - 71;
        	}
        	else if (date % 10000 == 101) {
        		yesterday = date - 8870;
        	}
        	else if (date % 10000 == 301) {
        		yesterday = date - 73;
        	}
        	else if (date % 10000 == 201 || date % 10000 == 401 || date % 10000 == 601 || date % 10000 == 901 || date % 10000 == 1101) {
        		yesterday = date - 70;
        	}
        }
        else {
        	yesterday = date - 1;
        }
    	
        URL pastebinData = new URL("https://pastebin.com/raw/AKpzU5Bb");  // Create a URL object to access the data from Pastebin.com
        
        int numGods = 0; // Instantiate an int for keeping track of the number of lines on the document, which is the number of Gods

        BufferedReader lineCounter = new BufferedReader(new InputStreamReader(pastebinData.openStream()));  // Use BufferedReader to count lines
        while (lineCounter.readLine() != null) {
            numGods++;
        }

        int randomize = (int)Math.floor(randomGenerator(date) * 1000000 * 100000 % numGods); // Get a random int with today's date as the seed
        int yestrand = (int)Math.floor(randomGenerator(yesterday) * 1000000 * 100000 % numGods); // Random int with yesterday as seed

        HashMap<String, God> GodPool = new HashMap<String, God>(); // Create the God Pool HashMap

        // Instantiate the Wordle and yWordle variables to hold today's answer and yesterday's answer respectively
        God Wordle = new God(null, null, null, null, null, null, null, 0);
        God yWordle = new God(null, null, null, null, null, null, null, 0);

        BufferedReader br = new BufferedReader(new InputStreamReader(pastebinData.openStream()));  // Use BufferedReader to read the data
            String line;
            int ReleaseNumber = 1; // Int to keep track of the line number/release order
            while ((line = br.readLine()) != null) { // Loop through the data
                String[] parts = line.split(","); // Parse the line by commas
                God god = new God(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], ReleaseNumber); // Create the God objects
                GodPool.put(parts[0], god); // Add the God object to the God Pool HashMap

                if (ReleaseNumber == randomize) {
                    Wordle = god;
                }
                else if (ReleaseNumber == yestrand) {
                    yWordle = god;
                }

                ReleaseNumber++;
            }
            br.close();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to Wardle! Today is " + Today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) + ". ");
        System.out.println("Yesterday's god was: " + yWordle.getName());
        System.out.println("");
        System.out.println("");
        
        play(Wordle, GodPool);
    }
        
    public static void play(God Wordle, HashMap<String, God> GodPool) { // Method for playing the game
    	try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Let's begin!");
            System.out.println("");
            System.out.println("Enter your guesses:");
            
            for (int i = 1; i <= 5; i++) { // Loop 5 times for 5 guesses
             
            	String guessString = scan.nextLine(); // Get the user guess
            	
                // Clean the user guess
            	guessString = guessString.replaceAll("\\s{2,}", " ").trim();
            	
            	guessString = (toTitleCase(guessString.toLowerCase()));
            	
            	if (guessString.equals("Morrigan")) {
            		guessString = "The Morrigan";
            	}
            	
                God Guess = GodPool.get(guessString); // Find the God variable based on the name the user guessed
                
            	if (Guess == Wordle) {
            		System.out.println("Correct! The god was " + Wordle.getName());
            		return;
            	}
                else if (Guess == null) {
                    System.out.println("That is not the name of a god. Please try again.");
            		i = i-1;
            	}
            	
                // Print and properly format the information based on the guess
            	else {
            		System.out.print(Guess.getName() + " ==> ");
            		if (Guess.getRole().equals(Wordle.getRole())) {
            			System.out.print(ANSI_GREEN);
            		}
            		System.out.print(Guess.getRole() + ANSI_RESET + " / ");
            		
            		if (Guess.getConquest().equals(Wordle.getConquest())) {
            			System.out.print(ANSI_GREEN);
            		}
            		System.out.print(Guess.getConquest() + ANSI_RESET + " / ");
            		
            		if (Guess.getDmg().equals(Wordle.getDmg())) {
            			System.out.print(ANSI_GREEN);
            		}
            		System.out.print(Guess.getDmg() + ANSI_RESET + " / ");
            		
            		if (Guess.getAtt().equals(Wordle.getAtt()) || Wordle.getAtt().equals("Both")) {
            			System.out.print(ANSI_GREEN);
            		}
            		System.out.print(Guess.getAtt() + ANSI_RESET + " / ");
            		
            		if (Guess.getPantheon().equals(Wordle.getPantheon())) {
            			System.out.print(ANSI_GREEN);
            		}
                    else if (Guess.getContinent().equals("Eurasia")) {
                        if (Wordle.getContinent().equals("Asia") || Wordle.getContinent().equals("Europe")) {
                            System.out.print(ANSI_YELLOW);
                        }
                    }
            		else if (Guess.getContinent().equals(Wordle.getContinent())) {
            			System.out.print(ANSI_YELLOW);
            		}
            		System.out.print(Guess.getPantheon() + ANSI_RESET + " / ");
            		
            		if (Math.abs((Guess.getOrder() - Wordle.getOrder())) <= 10) {
            			System.out.print(ANSI_YELLOW);
            		}
            		System.out.print(Guess.getOrder() + ANSI_RESET);
            		if (Guess.getOrder() > Wordle.getOrder()) {
            			System.out.print(" v");
            		}
            		else {
            			System.out.print(" ^");
            		}
            		System.out.println();
            		System.out.println("Guesses left: " + (5-i));
            		System.out.println();
            	}
            }
            System.out.println();
            System.out.println("You have failed! The answer is: " + Wordle.getName() + ". Thanks for trying! Better luck next time!");

            scan.close();
        }
    }
    
    public static double randomGenerator(long seed) {
    	Random generator = new Random(seed);
    	double num = generator.nextDouble() * (0.5);
    	
    	return num;
    }
    
    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                .append(arr[i].substring(1)).append(" ");
        }          
        return sb.toString().trim();
    }
}