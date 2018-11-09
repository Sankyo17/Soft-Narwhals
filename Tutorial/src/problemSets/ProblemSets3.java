package problemSets;
import java.util.Random;
public class ProblemSets3 {

	public static void main(String[] args) {

		absoluteValue(-17);
		System.out.println(absoluteValue(-17));
		
		calculateTip(50);
		System.out.println(calculateTip(50));
		
		System.out.println(nametagText(" Meiler"));
		
		fahrenheitToCelsius(50.0);
		printTemperature(50.0);
		
		System.out.println(monopolyRoll());
	}
	
	public boolean isPrime(int num) {
		return true;
	}
	
	public static double absoluteValue(double num) {
		
		if (num < 0) {
			num = num * -1;
			
		} else {
			
		} return num; 
	}
	
	public static double calculateTip(double cost) {
		
		if (cost > 0) {
			cost = cost * 15 / 100;

		} else {
			
		} return cost;
	}
	
	public static String nametagText(String name) {
	
		
		return "Hello, my name is" + name;
	} 
	
	public static double fahrenheitToCelsius(double fahrenheit) {
	
		double celsuis = (fahrenheit - 32) * 5 / 9;
			
		return celsuis;
	}
	
	public static void printTemperature(double fahrenheit) {
		System.out.println("F" + fahrenheit + " C" + fahrenheitToCelsius(fahrenheit));
		
	}
	
	public static int monopolyRoll() {
		Random dice = new Random();
		int rand = dice.nextInt(6) + 1;
		int randTwo = dice.nextInt(6) + 1;
		int roll = 0;
				
		if (rand != randTwo) {
			roll = rand + randTwo; 
		} else if (rand == randTwo) {
				int randThree = dice.nextInt(6) + 1;
				int randFour = dice.nextInt(6) + 1;
				roll = roll + randThree + randFour;	
		} 
		return roll;
	}

}
