package problemSets;

import java.util.Random;

public class ProblemSet4 {

	public static void main(String[] args) {
		
		int n = 10; 
		while (n < 50) {
			n = n * 2;
		}
		System.out.println(n);
		
		System.out.println(factorial(5));
		
		System.out.println(yearsTilOneMillion(1000));
		
		System.out.println(monopolyRoll());
		
		int rows = 3;
		for (int i = 1; i <= rows; i++) {
			String thisRow = "";
			for (int j = 0; j < i; j++) {
				thisRow = thisRow + "#";
			}
			System.out.println(thisRow);
		}//end rows
		
		}//end main
	
	public static int factorial(int n) { 
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * i;
		
		} return a; 
		
	}//end factorial
	
	public static int yearsTilOneMillion(double initialBalance) {
		double interest = initialBalance / 0.05; 
		int year = 0;
		while (initialBalance < 1000000) {
			year++;
			initialBalance = initialBalance + interest;
		}return year;
		
	} //end yearsTillOneMillion
	
	public static int monopolyRoll() {
		Random dice = new Random();
		int rand = dice.nextInt(6) + 1;
		int randTwo = dice.nextInt(6) + 1;
		int roll = 0;
		
		while (roll < rand) {
			if (rand != randTwo) {
				roll = rand + randTwo; 
			} else if (rand == randTwo) {
				int randThree = dice.nextInt(6) + 1;
				int randFour = dice.nextInt(6) + 1;
				roll +=  roll + rand + randTwo + randThree + randFour;
			}
		}
		return roll;
	}
	
	}//end class

