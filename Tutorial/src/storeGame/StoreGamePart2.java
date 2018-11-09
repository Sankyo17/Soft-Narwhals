package storeGame;
import java.util.Scanner;
public class StoreGamePart2 {
	static final double TAX = 0.05; //GST
	static double cost = 0; //cost of the ite
	static int choiceOne; //menu choice 
	static double sale = 0.10;
	
	static String[] products = {"North Korean Flag" ,  "North Korean Flag PhoneCase" 
			, "Kim Jong Un Framed Painting", "Kim Jong Un PhoneCase" ,
			"Kim Jong Un Body Pillow" ,  "Kim Jong Un Miniture Statue" , "Shovel" 
			, "Hammer" , "Sickle" , "Fake Food"};
	 
	static double[] prices = {5.75 , 6.99 , 500.99 , 6.99 , 100.99 , 250.99 , 2.69 , 2.69 , 2.69 , 10.99}; //array for prices
	
	static int[]numBought = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0}; //array for counter for each item
	
	static double[] itemCost = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0}; //array for total cost of 1 item
	
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
		
		System.out.print("What is your name?: "); //prompting user
		
		String name = scanWords. nextLine(); //input and store name
		
		System.out.println("Welcome " + name + " to Meiler's Convenience"); //prints name in statement
		do { //start do-while 
			System.out.println("\nWhat would you like to buy? \nPlease enter a number: \n");
					
			System.out.println("0: Exit");
			
			for(int i = 0; i < products.length; i++) {
				System.out.printf((i + 1) + ": " + products[i] + "\t " + "$%.2f\n" , prices[i] );  //prints menu
				
			}
			
			choiceOne = scanNum. nextInt(); //store input into choiceOne 
		
			if(choiceOne == -1) { //activate secret sale that takes %10 off 
				System.out.println("You have activated the secret sale! All products from now on are 10% off");
				for(int i = 0; i < prices.length; i++) {
					prices[i] = prices[i] * 0.90;
				}
				
			}else if (choiceOne > 10){ 
				System.out.println("Sorry we don't sell those"); //if choice is not a number or a number out of the choices
			}else if (choiceOne != 0) { //if choice is not 0, if statement will execute 
				System.out.print("How many " + products[choiceOne - 1] + " would you like to buy? ");
				numBought[choiceOne -1] += scanNum.nextInt(); //declare choice var and store input
				itemCost[choiceOne - 1] += numBought[choiceOne - 1] * prices[choiceOne - 1]; 
				//adds number bought and adds price of that item to update total cost of the 1 item
				cost += calcCost(prices[choiceOne - 1] , numBought[choiceOne - 1]); //calculate cost 
			}
		} while (choiceOne != 0); //end do statement
			printSummary(); //call printSummary function
		
	} //end menu
	
	public static double calcCost(double prices, int numBought) { //calculate total cost of item and quantity
		return prices * numBought; 
	}//end calcCost 
	
	public static double saleCost(double prices, int numBought) {
		return ((prices * numBought) * sale);
	}
	public static double calcTax(double TAX , double cost) { //calculates total cost and tax
		return TAX * cost; 
	}//end calcTax
	
	public static void printSummary() { 
		for(int i = 0; i < products.length; i++) {
			if (numBought[i] > 0 && itemCost[i] > 0) { //numBought[i] is greater than 0 it will print
				System.out.printf("Product : " + products[i] + "\n Quantity: " +
			numBought[i] + "\n Total: $%.2f\n" , itemCost[i] );
			}//end if 
		}//end for
		System.out.println();
		System.out.printf("GST is: $%.2f\n", calcTax(cost , TAX)); //enter tax amount in 0.00 format
		double totalCost = cost + calcTax(cost , TAX); //calculating total cost
		System.out.printf("Total cost is: $%.2f\n", totalCost); //enter total cost in 0.00 format
		System.out.println("Thank you for shopping at Meiler's Convenience! Bye!"); //goodbye statement
	}//end printSummary
}//end class
