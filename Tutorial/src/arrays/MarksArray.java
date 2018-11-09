package arrays;

public class MarksArray {

	public static void main(String[] args) {
		String[] studentNames = {"Johnny" , "Larry" , "Meiler" , "Angelica" , "Barry" , "Jerry"}; //list of student names
		int[] gradeNum = {10, 11, 11, 12, 12, 10}; //list of the student grades
		int[] examOne = {49, 86, 79, 80, 61, 34}; //list of student marks 
		int[] examTwo = {46, 59, 89, 70, 56, 34}; //list of student marks
		int[] examThree = {80, 79, 13, 68, 83, 90}; //list of student marks
		
		System.out.println("Name: " + studentNames[0] + "\nGrade: " + gradeNum[0] + "\nExam 1: " + examOne[0] + "\nExam 2: " + examTwo[0] + "\nExam 3: " + examThree[0]); 
		System.out.println("Name: " + studentNames[1] + "\nGrade: " + gradeNum[1] + "\nExam 1: " + examOne[1] + "\nExam 2: " + examTwo[1] + "\nExam 3: " + examThree[1]);
		System.out.println("Name: " + studentNames[2] + "\nGrade: " + gradeNum[2] + "\nExam 1: " + examOne[2] + "\nExam 2: " + examTwo[2] + "\nExam 3: " + examThree[2]);
		System.out.println("Name: " + studentNames[3] + "\nGrade: " + gradeNum[3] + "\nExam 1: " + examOne[3] + "\nExam 2: " + examTwo[3] + "\nExam 3: " + examThree[3]);
		System.out.println("Name: " + studentNames[4] + "\nGrade: " + gradeNum[4] + "\nExam 1: " + examOne[4] + "\nExam 2: " + examTwo[4] + "\nExam 3: " + examThree[4]);
	
		System.out.println("Name: " + studentNames[5] + "\nGrade: " + gradeNum[5] + "\nExam 1: " + examOne[5] + "\nExam 2: " + examTwo[5] + "\nExam 3: " + examThree[5]);
		
		for(int i = 0; i < studentNames.length; i++) { //for loop that prints out student names
			System.out.println(studentNames[i]);
		}
		
		for(int i = 0; i < studentNames.length; i++) { //for loop that prints names, grade and exam 1, 2, 3 grades
			System.out.println(studentNames[i] + " " + gradeNum[i] + " " + examOne[i] + " " + examTwo[i] + " " + examThree[i]);
		}
		
		for(int i = 0; i < studentNames.length; i++) { //for loop that prints #. before name, grade and exam 1, 2, 3 grades
			int m = i + 1;
			
			System.out.println(m + ". " + studentNames[i] + " " + gradeNum[i] + " " + examOne[i] + " " + examTwo[i] + " " + examThree[i]);
		}
		
		for(int i = 0; i < studentNames.length; i++) { //for loop that calculates the average of each student on the 3 exams
			int avg = (examOne[i] + examTwo[i] + examThree[i]) / 3;
			
			System.out.println("The average of " + studentNames[i] + " is: " + avg);
		}
		
		for(int i = 0; i < studentNames.length; i++) { //for loop that prints names of students who scored higher than 80 on exam 3
			if (examThree[i] >= 80) {
				System.out.println(studentNames[i]);
			}
		}
		
		for(int i = 0; i <studentNames.length; i++) { //for loop that prints names of students with exam one grade if they have < 50, changed to 40 
			if(examOne[i] < 50) {
				examOne[i] = 40;
				System.out.println("Name: " + studentNames[i] + "\nExam 1: " + examOne[i]);
			}
		}
	}

}
