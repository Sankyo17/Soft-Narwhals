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
				"どうやって (Dō yatte)" , "は (Wa)" , "君は (Kimi wa)" , "すごう(Sugō)" , 
				"ラーメン(Rāmen)" , "アイスクリーム (Aisukurīmu)" , "水 (Mizu)" , 
				"晴れた (Hareta)" , "雨の (Ame no)" , "雪が降る (Yukigafuru)"};
		
		String[] japaneseWordsLetters = {"kon'nichiwa" , "sayonara" , "arigato" ,
				"asa" , "ibuningu" , 
				"do yatte" , "wa" , "kimi wa" , "sugo" ,
				"ramen" , "aisukurimu" , "mizu" , 
				"haretta" , "ame no" , "yukigafuru"};
		
		
		Scanner scanWords = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		String name = " ";
		String wordChoice = " ";
		int languageChoice;
		int exitChoice;
		//int choiceOne = 1;
		
		System.out.println("What is your name Traveller?");
		name = scanWords.nextLine();
		exitChoice = 1;
		
		while(exitChoice == 1) {
		
			System.out.println("What are you translating too? "
					+ "\n 1. English - Japanese "
					+ "\n 2. Japanese - English");
			languageChoice = scanInt.nextInt();
		
			if(languageChoice == 1) {
				System.out.println("こんにちは (Kon'nichiwa), Welcome " + name + 
						" to your personal Japanese translator!");
				System.out.println();
			
				do {
					System.out.println("These are the words I am able to translate into Japanese: \nGreetings: ");
					for(int i = 0; i < 3; i++) {
						System.out.println(" " + englishWords[i]);
					}//end for
					System.out.println();
					System.out.println("Time Of Day: ");
					for(int i = 3; i < 5; i++) {
						System.out.println(" " + englishWords[i]);
					}//end for
					System.out.println();
					System.out.println("Food and Drink: ");
					for(int i = 9; i < 12; i++) {
						System.out.println(" " + englishWords[i]);
					}//end for
					System.out.println();
					System.out.println("Weather: ");
					for(int i = 12; i < 15; i++) {
						System.out.println(" " + englishWords[i]);
					}//end for
					System.out.println();
					System.out.println("Other Words: ");
					for(int i = 5; i < 9; i++) {
						System.out.println(" " + englishWords[i]);
					}//end for
				}while (exitChoice != 2); {
					System.out.println();
					System.out.println("Please enter the word you would like to translate: ");
					wordChoice = scanWords.nextLine();
					wordChoice.toLowerCase();
				
					for(int i = 0; i < englishWords.length; i++) {
						if (wordChoice.equals(englishWords[i])) {
							System.out.println(wordChoice + " in Japanese is: " + japaneseWords[i]);
						} else { 
							System.out.println("That is not a valid word!");
						}//end if
					}//end for 
						System.out.println("Would you like to translate another word?\n 1. Yes \n 2. No");
						if(exitChoice == 1) {
							exitChoice = 1;	
						}else if(exitChoice == 2) {
							exitChoice = 2;
						}//end if
				}//end while
			} else if (languageChoice == 2) {
				do {
					System.out.println("These are the words I am able to translate into English: \nGreetings: ");
					for(int i = 0; i < 3; i++) {
						System.out.println(" " + japaneseWordsLetters[i]);
					}//end for
					System.out.println();
					System.out.println("Time Of Day: ");
					for(int i = 3; i < 5; i++) {
						System.out.println(" " + japaneseWordsLetters[i]);
					}//end for
					System.out.println();
					System.out.println("Food and Drink: ");
					for(int i = 9; i < 12; i++) {
						System.out.println(" " + japaneseWordsLetters[i]);
					}//end for
					System.out.println();
					System.out.println("Weather: ");
					for(int i = 12; i < 15; i++) {
						System.out.println(" " + japaneseWordsLetters[i]);
					}//end for
					System.out.println();
					System.out.println("Other Words: ");
					for(int i = 5; i < 9; i++) {
						System.out.println(" " + japaneseWordsLetters[i]);
					}//end for
				} while (exitChoice != 0); {
					System.out.println();
					System.out.println("Please enter the word you would like to translate: ");
					wordChoice = scanWords.nextLine();
					wordChoice.toLowerCase();
			
					for(int i = 0; i < japaneseWordsLetters.length; i++) {
						if (wordChoice.equals(japaneseWordsLetters[i])) {
							System.out.println(wordChoice + " in English is: " + englishWords[i]);
						} else { 
							System.out.println("That is not a valid word!");
						}//end if
					}//end for 
						System.out.println("Would you like to translate another word?\n 1. Yes \n 2. No");
						if(exitChoice == 1) {
							exitChoice = 1;	
						}else if(exitChoice == 2) {
							exitChoice = 2;
						}//end if
				}//end nested while
			}//end if
		}//end while
	}//end main
}//end class


