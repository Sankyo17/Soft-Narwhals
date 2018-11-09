package storeGame;
import java.util.Scanner;
public class StoreGame2 {
	static final double TAX = 0.05; //GST
	static double cost = 0; //cost of the item
	static int flagQty = 0;
	static int bodypillowQty = 0;
	static int paintingQty = 0;
	
	//Meiler's Convenience 
	//North Korean Flag $5.75	
	//Kim Jung Un Body Pillows $100.00
	//Kim Jung Un Framed Painting $500.00
	

	public static void main(String[] args) {
		menu(); //call menu function
		
	}//end main

	public static void menu() {
		Scanner scanWords = new Scanner(System.in); //take and store word input 
		Scanner scanNum = new Scanner(System.in); //take and store number input
		double flagCost = 5.75;  //flag cost
		double bodypillowCost = 100.00; //bodypillow cost 
		double paintingCost = 500.00; //painting cost 
		
		int choiceOne; //menu choice 
		
		System.out.print("What is your name?: "); //prompting user
		
		String name = scanWords. nextLine(); //input and store name
		
		System.out.println("Welcome " + name + " to Meiler's Convenience"); //prints name in statement
		do { //start do-while 
		System.out.println("\nWhat would you like to buy? enter a number:"  //prints menu
							+ "\n0. Exit"
							+ "\n1. North Korean Flag $5.75"
							+ "\n2. Kim Jung Un Body Pillow $100.00"
							+ "\n3. Kim Jung Un Framed Painting $500.00");
		
			choiceOne = scanNum. nextInt(); //store input into choiceOne 
		
		if (choiceOne != 0) { //if choice is not 0, if statement will execute 
			System.out.print("How many would you like to buy? ");
			int quantity = scanNum. nextInt(); //declare choice var and store input
		
			if(choiceOne == 1) { 
				cost += calcCost(flagCost , quantity); //if choice is one multiplies flag cost with quantity demanded 
				flagQty += quantity; //adds to flagQty counter
			} else if (choiceOne == 2) {
				cost +=  calcCost(bodypillowCost , quantity); //if choice is two multiplies bodypillow cost with quantity demanded
				bodypillowQty += quantity; //adds to bodypillowQty counter 
			} else if (choiceOne == 3) {
				cost += calcCost(paintingCost , quantity); //if choice is three multiplies painting cost with quantity demanded
				paintingQty += quantity; //adds to paintingQty counter 
			} else { 
				System.out.println("Sorry we don't sell those"); //if choice is not a number or a number out of the choices 
			}
		}//end if statement
		
		} while (choiceOne != 0); //end do statement
			printSummary(); //call printSummary function
		
	} //end menu
	
	public static double calcCost(double price, int quantity) { //calculate total cost of item and quantity
		return price * quantity; 
	}//end calcCost 
	
	public static double calcTax(double TAX , double cost) { //calculates total cost and tax
		return TAX * cost; 
	}//end calcTax
	public static void printSummary() { 
		if (flagQty > 0) { //if flagQty is > 0 will print this statement 
			System.out.println("North Korean Flags: " + flagQty);
		}
		if (bodypillowQty > 0) {//if bodypillowQty is > 0 will print this statement 
			System.out.println("Kim Jung Un Body Pillow: " + bodypillowQty);
		}
		if (paintingQty > 0) { //if paintingQty is > 0 will print this statement 
			System.out.println("Kim Jung Un Framed Painting: " + paintingQty);
		}
		System.out.printf("Tax is: $%.2f\n", calcTax(cost , TAX)); //enter tax amount in 0.00 format
		double totalCost = cost + calcTax(cost , TAX); //calculating total cost
		System.out.printf("Total cost is: $%.2f\n", totalCost); //enter total cost in 0.00 format
		System.out.println("Thank you for shopping at Meiler's Convenience! Bye!"); //goodbye statement
	}//end printSummary
	

}//end class 
