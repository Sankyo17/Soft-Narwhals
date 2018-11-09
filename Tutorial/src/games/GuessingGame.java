package games;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in); //take in and store numbers
		Scanner scanWord = new Scanner(System.in); //take in and store strings
		int choice; 
		int guessCount = 0; 
		int count = 1;
		Random r = new Random();
		
		System.out.println("Please enter your name: "); 
		String name = scanWord. nextLine(); //take input and store in name 
		System.out.println("Welcome " + name + " to the guessing game!");
		
		System.out.println("Do you want to play? \n1 for yes \n2 for no");
		int playAgain = scanNum. nextInt(); //takes number input and sets it to playAgain
		if (playAgain == 2) { //if choice is 2 will print goodbye message 
			System.out.println("Goodbye!");
		}
		while (playAgain == 1) { //while playAgain is 1 
			System.out.println("Let's begin!");
	
			int compNum = r.nextInt(100); //computer chooses a number between 0 and 100
			int userNum = 0; 
			guessCount = 0;
			
			while(userNum != compNum) { 
				System.out.println("Choose a number between 1 and 100");
				userNum = scanNum.nextInt(); //take user guess 
				
				if (userNum == compNum) {
					guessCount += count; //add to the guess counter 
					System.out.println("You got it right! \nYou had " + guessCount + " guesses\nDo you wanna play again? \n1 for yes \n2 for no" );
					playAgain = scanNum. nextInt(); //take in playAgain choice 
					if (playAgain == 2) {
						System.out.println("Goodbye!");
					}
				} else if (userNum > compNum) { //if computer number is lower than user guess 
					System.out.println("Your choice is too high \nPlease guess again"); 
					guessCount += count; //add to the guess counter 
				} else if (userNum < compNum) { //if computer number is higher than user guess 
					System.out.println("Your choice is too low \nPlease guess again");
					guessCount += count; //add to the guess counter 
				} else {
					System.out.println("Your choice is invalid");
				}
			}//end nested while
			
			
		}//end while
		
	}//end main

}//end class
