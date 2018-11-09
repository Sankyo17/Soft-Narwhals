package problemSets;

public class ProblemSets2 {

	public static void main(String[] args) {
		
		//PROBLEM SETS 2
		
	double balance = 0;
	balance = balance + 20; //Add quarter 1 profits (thousands).
	balance = balance - 25; //Subtract quarter 1 expenses (thousands).
	balance = balance + 30; //Add quarter 2 profits (thousands).
	balance = balance - 25; //Ass quarter 1 expenses (thousands).
				
	if (balance < 0) { //if statement if balance is less than 0
		System.out.println("We're in the red!");
	} else if (balance > 0) { //elif statement if balance is more than 0
		System.out.println("We made a profit!");
	} else { // else statement if balance is 0
		System.out.println("We broke even.");
	}
				
	int dogs = 1;
	int cats = 2;
				
	if (dogs > 0 && cats == 0) {
		if (dogs > 1) {
			System.out.println("Dog lover");
		} else { 
			System.out.println("Dog person");
		}
	} else if (cats > 0 && dogs == 0) {
		if (cats > 1) {
			System.out.println("Cat lover");
		} else {
			System.out.println("Cat person");
					}
		System.out.println("Meow!");
	} else if (cats > 0 && dogs > 0) {
		if (dogs > cats) {
			System.out.println("I guess you like dogs more");
		} else if (dogs == cats) {
			System.out.println("I guess you like both equally");
		} else {
			System.out.println("I guess you like cats more");
		}
	} else {
		System.out.println("What, don't you like pets?");
	}
					
	int canSeePlayer = 1;
	int playerPoweredUp = 2;
	
	if (canSeePlayer > 0) { 
		if (canSeePlayer > playerPoweredUp) {
			System.out.println("Attack!");
		} else {
			System.out.println("Run away!");
		}
	} else {
		System.out.println("Wander.");
	
		}
	
	boolean isSnowing = false;
	boolean isRaining = true;
	double temperature = 60.0;
	
	if (temperature < 50) {
		if (isSnowing == false && isRaining == true) {
			System.out.println("Let's stay home.");
		} else {
			System.out.println("Let's go out!");
		}
	} else {
		System.out.println("Let's go out!");
	}
	
	double time = 18.0;
	String timeOfDay = "As";
	
		if (time >= 5 && time < 12) {
			timeOfDay = "morning";
		} else if (time >= 12 && time < 20) {
			timeOfDay = "daytime";
		} else {
			timeOfDay = "night";
	}
		System.out.println(timeOfDay);
		
	int dayOfTheWeek = 5;
	boolean holiday = false;
		
		if (dayOfTheWeek >= 5 && holiday == false) {
			System.out.println("Wake up at 7:00");
		} else if (dayOfTheWeek > 5 && holiday == true) {
			System.out.println("Sleep in!");
		}
	double playbackPosition = 120;
	boolean rewinding = true;
	
	if (rewinding) {
		double rewindAmount = 0.1;
	
	playbackPosition = playbackPosition - rewindAmount;
	}
	


	}
}
		
	
	
				
				
		
				
			




	


