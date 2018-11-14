package games;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class GameConversion {

	static int UserHP= 50;
	
	public static void main(String[] args) {
		System.out.println ("This game will be based on your choices.");
		 //System.out.printlns "This game will be based on your choices."
		System.out.println ("Choose Wisely.");
		// System.out.printlns "Choose Wisely.
		// sets UserHP to 50
		 ArrayList<String> Backpack = new ArrayList<String>(); 
		// makes a backpack which will be filled with items during gameplay
		 YourRoom();
	}//end main
	
	public static void YourRoom() {
		// creates YourRoom with no arguments  
		  System.out.println ("Your name is Rebly.");
		  //System.out.printlns Your name is Rebly
		  thread.sleep(4000);
		  // thread.sleeps the program for 4 seconds
		  System.out.println ("Rebly wakes up in their room.");
		  // System.out.printlns UserName <- Choice of user + "wakes up in their room"
		  thread.sleep(3000);
		  //thread.sleeps the program for 3 seconds
		  System.out.println ("You wake up with only underwear on.");
		  // System.out.printlns "You wake up with only underwear on."
		  thread.sleep(3000);
		  //thread.sleeps the program for 3 seconds
		  System.out.println ("You hear glass breaking outside.");
		  // System.out.printlns "You hear glass breaking outside"
		  thread.sleep(3000); 
		  //thread.sleeps the program for 3 seconds
		  System.out.println ("You look out the window and zombies are overrunning the place.");
		  // System.out.printlns "You look out the window and zombie are overrunning the place."
		  thread.sleep(4000);
		  //thread.sleeps the program for 4 seconds
		  System.out.println ("You know you have to make quick decisions.");
		  // System.out.printlns "You know you have to make quick decisions."
		  thread.sleep(3000);
		  //thread.sleeps the program for 3 seconds
		  System.out.println ("Your options are: \n +"
		  		+ "1: Jump out the Window(Potential Danger) \n" 
				+ "2: Walk out of the Room(Potential Danger)");
		  // System.out.printlns "Your options are
		  // 1: Jump out the Window(Potential Danger)
		  // 2: Walk out of the Room(Potential Danger)
		  
		  System.out.println("Enter a Number for your Choice, Remember Both have potential Danger");
		  // makes the variable choice and System.out.printlns "Enter a number for your Choice, Remember both have potential Danger"
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
		  if (choice == 1) {
		  // if the choice == 1 continues  
		    window01();
		    // continues through window01
		  }
		  else if(choice == 2) {
		  // if the choice is 2 continues
		    door1();
		    // continues through door01
	 	  }
		  else {
		  // if the anwser is different than 1 or 2 continue
		    System.out.println ("Invalid choice, Try again");
		    // System.out.printlns Invalid choice, Try again
		    YourRoom();
		  }
	}//end YourRoom
		  
	public static void window01() { 	  
		//defines window01 with no arguments
		    System.out.println ("You die from the fall. Bad choice");
		    //System.out.printlns You die from the fall. Bad choice
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    YourRoom();
		    //calls YourRoom so it goes back to the beginning
	}//window01
	
	public static void door1() {
		//defines door1 with no arguments 
		  System.out.println ("You end up in your kitchen.");
		  //System.out.printlns You end up in your kitchen
		  thread.sleep(3000);
		  //thread.sleeps the program for 3 seconds
		  System.out.println ("You hear a noise coming from the basement");
		  //System.out.printlns You head a noise coming from the basement
		  thread.sleep(3000);
		  //thread.sleeps the program for 3 seconds
		  System.out.println ("Go to see what caused the noise? or Stay?");
		  // System.out.printlns "Go to see what caused the noise? or Stay?"
		  
		  System.out.println("Choose 1 to Go, Choose 2 to Stay");
		  choice = input.nextInt();
		  //makes the variable choice and says "Go see what cause the noise? Or Stay?"
		  if (choice == 1) {
		  //if the userchoice is equal to "Go" continue
		    basement1();
		    // calls basement1()
		  }
		  else if (choice == 2) {
		  // else if the choice is equal to "Stay" continue
		    kitchen1();
		    // calls kitchen1()
		  }  
		  else {
		  // if the anwser is something either than "Go" or "Stay" continue
		    System.out.println ("Invalid choice, Try again");
		    // System.out.printlns "Invalid choice, Try again"
		    door1();
		    // calls door1()
		  }
		  
	public static void basement() {	 
		// defines basement1 with nho arguments
		  System.out.println ("You enter the Basement")
		  // System.out.printlns "You enter the Basement"
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println ("False alarm, It was just a box")
		  // System.out.printlns "False alarm, It was just a box"
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println ("There is however clothes for you to take")
		  // System.out.printlns There is however clothes for you to take
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println ("Would you like to take these clothes?")
		  // System.out.printlns Would you like to take these clothes?
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  
		  System.out.println("Say 1 to take clothes. Say 2 to leave them");
		  choice = input.nextInt();
		  // makes the choice variable and System.out.printlns "Say yes to take clothes. Say no to leave them"
		  if(choice == 1 && !Backpack.contain("Clothes"); {
		  // if the user choice equals to Yes and clothes are not in the variable Backpack continue  
		    if (Backpack.contain("Clothes")) {
		    // if Clothes are in Backpack continue  
		      System.out.println ("You already have clothes. Why would you need more?");
		      // System.out.printlns "You already have clothes. Why would you need more?"
		    }
		    if (!Backpack.contain("Clothes")) {
		    // if Clothes are not in Backpack continue
		      Backpack.add("Clothes");
		      // goes to Backpack and adds the Item "Clothes to it"
		    }
		  }
		  else if(choice == 2) {
		  // if the user choice is equal to No continue  
		    System.out.println ("Thats alright, I also like being without clothes");
		    // System.out.printlns Thats alright, I also like being without clothes
		  }
		  else {
		  // if anything other than 'No' or 'no' or 'Yes' or 'yes' continue
		    System.out.println ("I don't think you understood the question")
		    //System.out.printlns "I don't think you understood the question"
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    basement1();
		    //calls the function basement1() to go to it
		  }
		  
		  System.out.println ("You suddenly remember your dad had a safe with guns.");
		  //System.out.printlns You suddenly remember your dad had a safe with guns.
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println ("There is however an alarm on the door to the room");
		  // System.out.printlns There is however an alarm on the door to the room
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println ("You do not know what the passcode to turn off the alarm is.");
		  // System.out.printlns "You do not know what the passcode to turn off the alarm is."
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds 
		  System.out.println ("Your choices are \n "
		  		+ "1. Continue Through the door anyways. \n"
		  		+ "2. Go back to the kitchen");
		  // System.out.printlns Your choices are
		  // 1. Continue Through the door anyways.
		  // 2. Go back to the kitchen
		  System.out.println("Say 1 to Continue, or Say 2 to go Back");
		  Scanner input = new Scanner(System.in);
		  choice = input.nextInt();
		  // creates the variable choice and System.out.printlns "Say 1 to Continue, or Say 2 to go Back"
		  if(choice == 1) {
			  // if the choice is equal to 1 continue 
			    System.out.println ("Might as well go since we're down here.");
			    // System.out.printlns "Might as well go since we're down here."
			    gunroom();
			 // calls gunroom() to go there
		  }
		  else if (choice == 2) {
		  // else if the choice is equal to 2 continue  
		    System.out.println ("I'm not going to take that chance, it might be too loud.");
		    // System.out.printlns "I'm not going to take that chance, it might be too loud."
		    kitchen1();
		    //calls kitchen1() to go to that function
		  }
		  else {
		  // if the choice is anything other than 1 or 2 continue  
		    System.out.println ("Invalid choice, maybe you didn't understand?");
		    // System.out.printlns "Invalid choice, maybe you didn't understand?"
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    basement1();
		    // calls the basement1() function to go there
		  }
		  
		public static void kitchen1() {
		// defines Kitchen1 with no arguments
		  System.out.println ("You return to the kitchen.");
		  //System.out.printlns You return to the kitchen
		  thread.sleep(2000);
		  // thread.sleeps the program for 2 seconds
		  System.out.println ("You have to make a choice whether to leave the house and find people, or stay and make a hideout?");
		  //System.out.printlns "You have to make a choice whether to leave the house and find people, or stay and make a hideout?"
		  
		  System.out.println("Enter 1 to leave, or Enter 2 to Stay");
		  choice = input.nextInt();
		  // creates the variable choice and System.out.printlns "Enter Leave to leave, or Enter Stay to Stay"
		  if (choice == 1) {
		  // if the user choice is equal to 'Leave' or 'leave' continue
		    System.out.println ("You leave the house to try and find people");
		    // System.out.printlns "You leave the house to try and find people"
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    System.out.println ("The moment you leave the house you see people");
		    // System.out.printlns "The moment you leave the house you see people"
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    System.out.println ("The people you have found are your family members.");
		    // System.out.printlns "The people you have found are your family members."
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    Endgame();
		    // calls the function Endgame() to continue to it
		  }
		  else if(choice == 2) {
		  // else if the user choice = 'Stay' or 'stay' continue
		    System.out.println ("Ok, well if we're going to stay we might as well secure this place.");
		    //System.out.printlns "Ok, well if we're going to stay we might as well secure this place."
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    System.out.println ("There's a couple of things that you could take apart.");
		    // System.out.printlns "There's a couple of things that you could take apart."
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    System.out.println ("Would you like to take apart the chair's, the table's, or the cabinet's?");
		    // System.out.printlns "Would you like to take apart the chair's, the table's, or the cabinet's?"
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    System.out.println ("There are 3 chair's and each chair gives 4 wood");
		    // System.out.printlns "There are 3 chair's and each chair gives 4 wood"
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    System.out.println ("There is 1 table and it gives 10 wood");
		    // System.out.printlns "There is 1 table and it gives 10 wood"
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    System.out.println("There are 7 cabinets which give 3 wood each.");
		    // System.out.printlns "There are 7 cabinets which give 3 wood each."
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    System.out.println("You require 21 wood to complete the house, you only have enough energy to take apart 1 item.");
		    // System.out.printlns "You require 21 wood to complete the house, you only have enough energy to take apart 1 item."
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    
		    System.out.println("Enter 1 for chair's, 2 for table's, 3 for Cabinets");
		    	choiceOne = input.nextInt();
		    	// creates the variable choice and System.out.printlns "Enter Ch for chair's, T for table's, C for Cabinets"
		    	if (choiceOne == 1) {
		    		// if the user choice equals to 1 continue
		    		System.out.println ("Calculating...");
		    		// System.out.printlns "Calculating..."
		    		thread.sleep(2000);
		    		//thread.sleeps the program for 2 seconds 
		    		System.out.println ("...........");
		    		// pritns ...........
		    		thread.sleep(2000);
		    		// thread.sleeps the frogram for 2 seconds
		    		System.out.println ("I think you might need to practice your math a bit.");
		    		// System.out.printlns "I think you might need to practice your math a bit."
		    		kitchen1();
		    		// calls the function kitchen1() to go back to it
		    	}
		    	else if(choiceOne == 2) {
		    		// else if the chocie is equal to 2 continue
		    		System.out.println ("Calculating...");
		    		// System.out.printlns "Calculating..."
		    		thread.sleep(2000);
		    		// thread.sleeps the program for 2 seconds
		    		System.out.println ("...........");
		    		//System.out.printlns "..........."
		    		thread.sleep(2000);
		    		System.out.println ("If only there was another table than you would be good.");
		    		// System.out.printlns "If only there was another table than you would be good."
		    		thread.sleep(3000);
		    		// thread.sleeps the program for 3 seconds
		    		System.out.println ("But sadly I think your math is a bit off");
		    		// System.out.printlns "But sadly I think your math is a bit off"
		    		kitchen1();
		    		// call the function kitchen1() to go back to it
		    	}
		    	else if(choiceOne == 3) {
		    		// else if the choice is equal to 3 continue
		    		System.out.println ("Calculating...");
		    		//System.out.printlns "Calculating..."
		    		thread.sleep(2000);
		    		// thread.sleeps the program for 2 seconds
		    		System.out.println ("..........");
		    		// System.out.printlns ".........."
		    		thread.sleep(2000);
		    		// thread.sleeps the program for 2 seconds
		    		System.out.println ("Well done sir! Your math is on point!");
		    		// System.out.printlns "Well don sir! Your math is on point!"
		    		thread.sleep(3000);
		    		//thread.sleeps the program for 3 seconds
		    		System.out.println ("Wow, that was some hard work.");
		    		// System.out.printlns "Wow, that was some hard work."
		    		thread.sleep(3000);
		    		// thread.sleeps the program for 3 seconds
		    		System.out.println ("I think you deserve some well rest, you'll continue tomorrow.");
		    		// System.out.printlns "I think you deserve some well rest, you'll continue tomorrow."
		    		thread.sleep (4000);
		    		// thread.sleeps the program for 4 seconds
		    		wakeup();
		    		// calls the function wakeup() to go to it
		    	}
		    	else {
		    		// if anything else is written than 1, 2 or 3 continue
		    		System.out.println ("I don't think you know your numbers.");
		    		// System.out.printlns "I don't think you know your numbers."
		    		thread.sleep(3000);
		    		// thread.sleeps the program for 3 seconds
		    		System.out.println ("Try again");
		    		// System.out.printlns "Try again"
		    		thread.sleep(2000);
		    		// thread.sleeps the program for 2 seconds
		    		kitchen1();
		    		// calls the function kitchen1() to go back to it
		    	}
		  }
		  else {
		  // if anything else is typed other than 1 or 2 continue
		    System.out.println("I don't think you understood the question.");
		    // System.out.printlns "I dont think you understood the question."
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    System.out.println ("Try again");
		    // System.out.printlns "Try again"
		    thread.sleep(2000);
		    //thread.sleeps the program for 2 seconds
		    kitchen1();
		    // calls the function kitchen1() to go back to it
		  }
		}
	
	
		def wakeup():
		// defines the fuction wakeup()
		  System.out.println ("Yawwwwn!")
		  // System.out.printlns Yawwwwn!
		  thread.sleep(2000);
		  // thread.sleeps the program for 2 seconds
		  System.out.println ("That was a good rest don't you think?")
		  // System.out.printlns "That was a good rest don't you think?"
		  
		  choice=int(input("Enter 1 for Yes, or 2 for No"))
		  // creates the function choice and System.out.printlns "Enter 1 for Yes, or 2 for No"
		  if choice == 1:
		  // if the user choice is equal to 1 continue
		    System.out.println("You bet it was!")
		    // System.out.printlns "You bet it was!"
		    thread.sleep(1)
		    // thread.sleeps the program for 1 second
		    System.out.println("Now let's continue this journey shall we?")
		    // System.out.printlns "Now let's continue this journey shall we?"
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    
		    choice=int(input("Enter 1 to continue, or 2 to stop"))
		    // creates the variable choice and System.out.printlns "Enter 1 to continue, or 2 to stop"
		    if choice== 1:
		    // if the user choice is equal to 1 continue
		      System.out.println("Great let's get back to securing this place!")
		      // System.out.printlns "Great let's get back to securing this place!"
		      thread.sleep(2000);
		      // thread.sleeps the program for 2 seconds
		      journeycontinue()
		      // calls the function journeycontinue to continue to it
		    
		    elif choice== 2:
		    // else if the choice is equal to 2 continue
		      System.out.println("You stopped the journey.")
		      // System.out.printlns "You stopped the journey"
		      thread.sleep(2000);
		      // thread.sleeps the program for 2 seconds
		      System.out.println ("Just kidding you can't stop this journey.")
		      // System.out.printlns "Just kidding you can't stop this journey"
		      thread.sleep(3000);
		      // thread.sleeps the program for 3 seconds
		      System.out.println ("Now let's continue and stop being lazy")
		      // System.out.printlns "Now let's continue and stop being lazy"
		      thread.sleep(2000);
		      // thread.sleeps the program for 2 seconds
		      journeycontinue()
		      // calls the function journeycontinue() to continue to it
		    else:
		    // if anything other than 1 or 2 is entered continue
		      System.out.println ("I don't think that you understood the question")
		      // System.out.printlns "I don't think that you understood the question"
		      thread.sleep(3000);
		      // thread.sleeps the program for 3 seconds
		      System.out.println ("Try again")
		      // System.out.printlns "Try again"
		      thread.sleep(2000);
		      // thread.sleeps the program for 2 seconds
		      wakeup()
		      // calls the function wake up to go back to it
		  
		  elif choice == 2:
		  // else if the user choice is equal to 2 continue
		    System.out.println("Well you have no choice we're continuing this journey!")
		    // System.out.printlns "Well you have no choice we're continuing this journey!"
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    journeycontinue()
		  else:
		  // if the user choice is anything other than 1 or 2 continue
		    System.out.println ("I don't think that you understood the question")
		    // System.out.printlns "I don't think that you understood the question"
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    System.out.println ("Try again")
		    // System.out.printlns "Try again"
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    wakeup()
		    // calls the function wakeup() to continue to it

		def journeycontinue():
		// defines journeycontinue()
		  System.out.println("Well we have baricaded the windows and doors already")
		  // System.out.printlns "Well we have baricaded the windows and doors already"
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println("We might as well dismantle the table and chairs too.")
		  // System.out.printlns "We might as well dismantle the table and chairs too."
		  thread.sleep(3000);
		  // thread.sleeps the program for 3 seconds
		  System.out.println("What would you like to dismantle first?")
		  // System.out.printlns "What would you like to dismantle first?"
		  thread.sleep(2000);
		  //thread.sleeps the program for 2 seconds
		  choice= int(input("Enter 1 for Tables, or 2 for chairs"))
		  // creates the variable choice and System.out.printlns "Enter 1 for Tables, or 2 for chairs"
		  if choice== 1:
		  // if the user choice is equal to 1 continue
		    System.out.println ("You begin to dismantle the tables.")
		    // System.out.printlns "You begin to dismantle the tables"
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    System.out.println ("As you dismantle one of the tables you find something wierd under it.")
		    // System.out.printlns "As you dismantle one of the tables you find something wierd under it."
		    thread.sleep(4000);
		    // thread.sleeps the program for 4 seconds
		    System.out.println ("It is a secret passage...")
		    // System.out.printlns "It is a secret passage..."
		    thread.sleep(2000);
		    //thread.sleeps the program for 2 seconds
		    secretpassageentrance()
		    // calls the function secretpassageentrance() to continue to it
		  elif choice== 2:
		  // else if the choice is equal to 2 continue
		    System.out.println ("You dismantle all of the chairs in a quick matter.")
		    // System.out.printlns "You dismantle all of the chairs in a quick matter."
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    System.out.println ("Once you finish the chairs, you begin to dismantle all the tables.")
		    // System.out.printlns "Once you finish the chairs, you begin to dismantle all the tables."
		    thread.sleep(4000);
		    // thread.sleeps the program for 4 seconds
		    System.out.println("Under one of the tables you find something rather wierd.")
		    // System.out.printlns "Under one of the tables you find something rather wierd"
		    thread.sleep(3000);
		    //thread.sleeps the program for 3 seconds
		    System.out.println("There is a secret passageway.")
		    // System.out.printlns "There is a secret passageway."
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    secretpassageentrance()
		    // calls the function secretpassageentrance() to go to it
		  else:
		  // if anything else is typed continue
		    System.out.println ("I think you wrote the wrong number.")
		    // System.out.printlns "I think you wrote the wrong number."
		    System.out.println ("Try again")
		    // System.out.printlns "Try again"
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    journeycontinue()
		    // calls the function journeycontinue() to go to it
		    
		def secretpassageentrance():
		// defines the function secretpassageentrance
		  System.out.println ("Do you want to enter this secret passage?")
		  // System.out.printlns "Do you want to enter this secret passage?"
		  thread.sleep(2000);
		  // thread.sleeps the program for 2 seconds
		  
		  choice=int(input("Enter 1 to go, or 2 to stay"))
		  // creates the variable choice and asks System.out.printlns "Enter 1 to go, or 2 to stay"
		  if choice == 1:
		  // if the choice is equal to 1 continue
		    System.out.println ("Ok here we go !")
		    // System.out.printlns "Ok here we go !"
		    thread.sleep(2000);
		    // thread.sleeps the program for 2 seconds
		    secretpassage()
		    // calls the function secretpassage to go to it
		  elif choice == 2:
		  // else if the user choice is equal to 2 continue
		    knockknock()
		    // calls the function knockknock() to go to it
		  else:
		  // if the user choice is something either than 1 or 2 continue
		    System.out.println ("I think you have misread the question")
		    // System.out.printlns "I think you have misread the question"
		    System.out.println ("Try again.")
		    // System.out.printlns "Try again"
		    thread.sleep(3000);
		    // thread.sleeps the program for 3 seconds
		    secretpassageentrance()
		    // calls the function secretpassageenetrance to go to it

		def secretpassage():
		// defines the variable secretpassage() 
		  System.out.println ("You enter the Secret passage")

	}
	