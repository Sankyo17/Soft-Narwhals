package problemSets;

public class ProblemSets {
	
	public static void main(String[] args) {
	
	//PROBLEM SETS 1
		int x = 5;
		double temperature = 75.6;
		char grade = 'A';
		
		
		double register = 10.0;
		register = register + 5;
		register = register - 2.5;
		register = register + 10;
		register = register - 3;
		System.out.println(register);
		
		
		int bankBalance = 500; //assign bank balance to 500
		int depositOne = 250; //assign first deposit as 250
		int depositTwo = 100; //assign second deposit as 100
		
		int bankBalanceOne = bankBalance + depositOne; //adding 500 and 250 to get new balance
		int bankBalanceTwo = bankBalanceOne - depositTwo; // subtracting the new balance from 100 
		
		System.out.println(bankBalanceTwo); // printing out the final balance
		
		System.out.println(2.0 * (5/2));
		
		
		int day = 20; //assign day to 20
		String month = "June"; //assign string variable to "June"
		
		System.out.print(month + " ");
		System.out.println(day);
		
		
		String firstName = "Meiler"; //assign string variable to "Meiler" 
		String lastName = " Varquez"; //assign string variable to "Varquez"
		String fullName = firstName + lastName; //adding first name and last name
		int number = fullName.length(); //getting the amount of letters in the fullName
		
		System.out.println("Hello, my name is " + fullName + "."); //prints fullName
		System.out.println("There are " + number + " letters in my name."); //prints number of letters in fullName
		
		double fahrenheit = 50; //assign double variable to 50
		//double celcius = fahrenheit (- 32) * 5 / 9; //assign double variable to convert fahrenheit to celcius
		
		//System.out.println(celcius); //prints out the converted temp. in celcius
	}}
		
	