package storeGame;
import java.util.Scanner;
public class StoreGame {
	//Meiler's Convenience 
	//North Korean Flag $5.75	
	//Kim Jung Un Body Pillows $100.00
	//Kim Jung Un Framed Painting $500.00
	
	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in); 
		Scanner scanNum = new Scanner(System.in);
		double flagCost = 5.75; 
		double bodypillowCost = 100.00;
		double paintingCost = 500.00;
		final double TAX = 0.05; //GST
		double cost = 0; //cost of the item
		int choiceOne; //menu choice 
		//int flagQty = 0;
		//int bodypillowQty = 0;
		//int paintingQty = 0;
		
		System.out.print("What is your name?: "); //prompting user
		
		String name = scanWords. nextLine(); //input and store name
		
		System.out.println("Welcome " + name + " to Meiler's Convenience");
		do {
		System.out.println("\nWhat would you like to buy? enter a number:" 
							+ "\n0. Exit"
							+ "\n1. North Korean Flag"
							+ "\n2. Kim Jung Un Body Pollow"
							+ "\n3. Kim Jung Un Framed Painting");
		
			choiceOne = scanNum. nextInt(); //store input into choiceOne
		
		if (choiceOne != 0) {
			System.out.print("How many would you like to buy? ");
			int quantity = scanNum. nextInt(); //declare choice var and store input
		
			if(choiceOne == 1) {
				cost += flagCost * quantity; 
				//flagQty += flagQty + quantity;
			} else if (choiceOne == 2) {
				cost +=  bodypillowCost * quantity;
				//bodypillowQty += bodypillowQty + quantity;
			} else if (choiceOne == 3) {
				cost += paintingCost * quantity;
				//+paintingQty += paintingQty + quantity;
			} else { 
				System.out.println("Sorry we don't sell those");
			}
		}//end if statement
		
		} while (choiceOne != 0); //end do statement
		
		System.out.printf("Tax is: $%.2f\n", cost * TAX); //enter tax amount in 0.00 format
		double totalCost = cost + cost * TAX; //calculating total cost
		System.out.printf("Total cost is: $%.2f\n", totalCost); //enter total cost in 0.00 format
		System.out.println("Thank you for shopping at Meiler's Convenience! Bye!"); 
		
	}//end main

}//end class 
