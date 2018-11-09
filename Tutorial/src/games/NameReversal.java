package games;
import java.util.Scanner;
public class NameReversal {

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);  //scanner for name
	
		System.out.println("Enter your name: ");
		String name = scanWords. nextLine(); //take in a store input
		
		name = name.toLowerCase(); //convert all input to lower case
		int length= name.length(); //calculate length of input
		int q = length -1;	//q will start 1 less than input 
		int r = length; //r is the same amount as input 
		String newName = ""; //final name backwards 
		
		for(int p = length; p >= 1; p--) {	//start at length of input until p is 1
		    
			
			name.substring(q, r); //take only one character 
			
			newName += name.substring(q, r); //moves it to the front 
			q--; r--; //subtract q and r to select next letter down
		}
		
		
		System.out.println(newName); //print name backwards

	}//end main

}//end class 
