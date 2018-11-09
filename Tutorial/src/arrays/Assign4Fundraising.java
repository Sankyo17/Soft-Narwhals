package arrays;

public class Assign4Fundraising {

	public static void main(String[] args) {
		String[] names = {"Xell" , "Poki" , "Kimi" , "Lily" , "Toast" , "Albert" , "Fed" , "Leslie" , "Scarra" , "Janet"}; 
		int[] donation = {252 , 78 , 127 , 29 , 24 , 156 , 48 , 478 , 57 , 155};
		boolean[] forms = {true , false , true , false , false , true , false , true , true , false};
		int totalAmountRaised = 0;
		int averageAmountRaised = 0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Participant: " + names[i] 
					+ "\n Amount Donated: " + donation[i] 
					+ "\n Forms Returned: " + forms[i]);
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			totalAmountRaised += donation[i];
			averageAmountRaised = totalAmountRaised / names.length;
			
		}//end for
		
		System.out.println("Total amount raised: $" + totalAmountRaised);
		System.out.println("Average amount raised: $" + averageAmountRaised);
		
		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			if(donation[i] > 200) 
				System.out.println(names[i]);
		}//end for
		
		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			if(forms[i] = false) {
				System.out.println(names[i]);
			}
		}
	}//end main

}//end class
