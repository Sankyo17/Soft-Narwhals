package tutorialPackage;

public class Employees {

	public static void main(String[] args) {
		String[] employeeName = {"John" , "Jill" , "George" , "Greg" , "Basil"};
		int[] wage = {15, 17, 20, 24 , 18};
		
		int[] hours = new int[5];
		
		hours[0] = 34;
		hours[1] = 42;
		hours[2] = 45;
		hours[3] = 49;
		hours[4] = 36;
		
		for(int i = 0; i < wage.length; i++) { //print name and wage
			System.out.println("i: " + i + " Name: " + employeeName[i] + " \twage: " + wage[i]);
		}
		
		System.out.println();

		for(int i = 0; i < wage.length; i++) { //print pay
			System.out.println("Name: " + employeeName[i] + " \tpay: " + wage[i] * hours[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) { //fired employees
			if(hours[i] < 40) {
				System.out.println("FIRE Name: " + employeeName[i]);
				employeeName[i] = "";
				wage[i] = 0;
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < wage.length; i++) { //print name and wage
			System.out.println("i: " + i + " Name: " + employeeName[i] + " \twage: " + wage[i]);
		}
		
		System.out.println();

	}

}
