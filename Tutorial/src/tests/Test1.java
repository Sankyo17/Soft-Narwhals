package tests;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		System.out.print("Fire");
		System.out.println(" Ants");
		
		String s = "Mona Lisa";
		System.out.println(s.length());
		
		//int i = 203.932;
		double d = 27; 
		int a = 5/2;
		
		isSingleDigit(17);
		System.out.println(isSingleDigit(17));
		
		smallest(10,11,7);
		System.out.println(smallest(10,11,7));
		
	}

	public static boolean isSingleDigit (int digit) { //function that returns a boolean and takes in an int perameter
		if (digit < 10) { //if statement if digit is less than 10 
			return true;	//return true if digit < 10
		} else {	
			return false;	//else returns false
		}
	}

	
	public static int smallest (int x, int y , int z) { //function that returns the smallest int

		if (x < y) { // if x < y
			if ( x < z) { // if x < z
				return x; //if both are true, will return x
			} else { //else, it will return z
				return z;
			}
		} else if ( y < z) { //if y < z 
			return y; //it will return y
			
		} else {
			return z; //else return z
		}
		
		}
	}

