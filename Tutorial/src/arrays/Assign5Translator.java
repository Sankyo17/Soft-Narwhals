package arrays;
import java.util.Scanner;
public class Assign5Translator {

	public static void main(String[] args) {
		String[] englishWords = {"hello" , "goodbye" , "thanks" ,
				"morning" , "evening" ,
				"how" , "are" , "you" , "awesome" ,  
				"ramen" , "icecream" , "water" , 
				"sunny" , "rainy" , "snowy" };
		String[] japaneseWords = {"こんにちは (Kon'nichiwa)" , "さようなら (Sayōnara)" ,"ありがとう (Arigatō)" , 
				"朝 (Asa)" , "イブニング (Ibuningu)" ,
				"どうやって (Dō yatte)" , "は (Wa)" , "君は (Kimi wa)" , "すごう(Sugō" , 
				"ラーメン(Rāmen)" , "アイスクリーム (Aisukurīmu)" , "水 (Mizu)" , 
				"晴れた (Hareta)" , "雨の (Ame no)" , "雪が降る (Yukigafuru)"};
		
		Scanner scanWords = new Scanner(System.in);
		String name = " ";
		String wordChoice = " ";
		int exitChoice = 0;
		//int choiceOne = 1;
		
		System.out.println("What is your name English Traveller?");
		name = scanWords. nextLine();
		
		System.out.println("こんにちは (Kon'nichiwa), Welcome " + name + 
				" to your personal Japanese translator!");
		System.out.println();
		
		do {
			System.out.println("These are the words I am able to translate into Japanese: \nGreetings: ");
			for(int i = 0; i < 3; i++) {
				System.out.println(" " + englishWords[i]);
			}
			System.out.println();
			System.out.println("Time Of Day: ");
			for(int i = 3; i < 5; i++) {
				System.out.println(" " + englishWords[i]);
			}
			System.out.println();
			System.out.println("Food and Drink: ");
			for(int i = 9; i < 12; i++) {
				System.out.println(" " + englishWords[i]);
			}
			System.out.println();
			System.out.println("Weather: ");
			for(int i = 12; i < 15; i++) {
				System.out.println(" " + englishWords[i]);
			}
			System.out.println();
			System.out.println("Other Words: ");
			for(int i = 5; i < 9; i++) {
				System.out.println(" " + englishWords[i]);
			}
		}
		while (exitChoice != 0);
			System.out.println();
			System.out.println("Please enter the word you would like to translate: ");
			wordChoice = scanWords.nextLine();
			wordChoice.toLowerCase();
			
			for(int i = 0; i < englishWords.length; i++) {
				if (wordChoice == englishWords[i]) {
					System.out.println(wordChoice + "in Japanese is: " + japaneseWords[i]);
				} 
			}//end for 
			System.out.println("Would you like to translate another word?\n 1. Yes \n 2. No");
			
		//end while
	}//end main

}//end class


