package arrays;
import java.util.ArrayList;
public class ArrayListPractice {

	public static void main(String[] args) {
		//create new ArrayLost object
		ArrayList<Integer> grades = new ArrayList<>();
		int num;
		//useful methods for ArrayList
		grades.add(76); //adds to ArrayList
		grades.add(86);
		grades.add(1, 90);//insert at index 1
		grades.remove(0);//remove first item (index 0) in ArrayList
		grades.get(0);//return index 0
		num = grades.get(1);//assign value of index 1 to num 
		grades.size();//return length of ArrayList
		grades.add(35);
		grades.add(75);
		
		//print ArrayList
		for(int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
		}
		
		grades.remove(1);
		
		for(int grade: grades) {
			System.out.println(grade);
		}
		
	}//end main

}//end class
