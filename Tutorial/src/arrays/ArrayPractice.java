package arrays;
import java.util.Random;
public class ArrayPractice {

	public static void main(String[] args) {
		String[] studentsArray = {"thanos" , "peter parker" , "shrek" , "barney" , "bradley" , "jesus" };
		int[] gradesArray = new int[studentsArray.length];
		int avg = 0;
		
		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println("name: " + studentsArray[i] + "\n grades: " + gradesArray[i]);
		}
		
		Random r = new Random();
		
		for (int i = 0; i < gradesArray.length; i++) {
			gradesArray[i] = r.nextInt(101);
			System.out.println("name: " + studentsArray[i] + "\n grades: " + gradesArray[i]);
		}
		
		gradesArray[5] =  85;
		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println("name: " + studentsArray[i] + "\n grades: " + gradesArray[i]);
		}
		
		
		for (int i = 0; i < gradesArray.length; i++) {
			avg += gradesArray[i];	
		}
		avg = avg / gradesArray.length;
		System.out.println("class avg: " + avg);
	}

}
