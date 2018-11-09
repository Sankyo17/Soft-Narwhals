package games;
import java.util.Random;
public class GameConversion {

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		System.out.println ("This game will be based on your choices.");
		// System.out.printlns "This game will be based on your choices."
		System.out.println ("Choose Wisely.");
		// System.out.printlns "Choose Wisely."
		
		Random r = new Random();
		// imports random numbers
		int rad = r.nextInt(5) +5;
		
		int UserHP = 50;
		// sets UserHP to 50
		int Backpack = 100; 
		// makes a backpack which will be filled with items during gameplay
		
		yourRoom();
	}
	
	public static void yourRoom() {// creates YourRoom with no arguments  
		  System.out.println("Your name is Rebly");
		  Thread.sleep(4);
		  // sleeps the program for 4 seconds
		  System.out.println ("Rebly wakes up in their room.");
		  Thread.sleep(3);
		  //sleeps the program for 3 seconds
		  System.out.println ("You wake up with only underwear on.");		  
		  Thread.sleep(3);
		  //sleeps the program for 3 seconds
		  System.out.println ("You hear glass breaking outside.");		  
		  Thread.sleep(3);
		  //sleeps the program for 3 seconds
		  System.out.println ("You look out the window and zombies are overrunning the place.");		  
		  Thread.sleep(4);
		  //sleeps the program for 4 seconds
		  System.out.println ("You know you have to make quick decisions.");		  
		  Thread.sleep(3);
		  //sleeps the program for 3 seconds
		  
		  System.out.println ("Your options are \n1: Jump out the window (Potenial Danger) "
		  		+ "\n2: Walk out of the Room (Potantial Danger");
	}

}
