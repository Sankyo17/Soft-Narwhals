package tutorialPackage;
import java.util.Scanner;
import java.util.Random;
public class Tutorial1 {

	public static void main(String[] args) {
		int varNum1;
		varNum1 = 34;
		
		int varNum2 = 22;
		
		int varNum3 = varNum1 + varNum2;
		
		System.out.println(varNum3); 
		
	
	String inData;
	Scanner scan = new Scanner(System.in );
	
	System.out.println("Enter the data:");
	inData = scan.nextLine();
	
	System.out.println("You entered: " + inData );
	
	int num, square; //declare 2 variables
		
		System.out.println("Enter an integer:"); 
		num = scan.nextInt(); //num = input
		square = num * num ;  // squares the input
		
		System.out.println("The square of " + num + " is " + square); //prints the answer
		
	Random rand = new Random();
	int randomNum = rand.nextInt(20) + 9;
	System.out.println(randomNum);
	
	
}

public static void  printName() {
	for(int i = 0; i < 5; i++); {
		System.out.println("Hi, I'm Meiler");
	}
	
	int num = 0;
	while(num < 5) {
		System.out.println("Bye");
	}
} 
}

