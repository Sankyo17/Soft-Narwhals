package games;
import java.util.Scanner;
public class CeasarsCipher {
	
	public static String encrypt(String plainText, int shiftValue) {
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		String encryptText = "";
		
		plainText = plainText.toLowerCase(); 
		
		for (int letters = 0; letters < plainText.length(); letters++) {
			if ((plainText.charAt (letters) + shiftValue) > 122) {	
				//System.out.println("shift "+(plainText.charAt (letters) + shiftValue) % 122);
				//System.out.println("char "+(96 + shiftValue)); 
				encryptText += (char) (96 + (plainText.charAt (letters) + shiftValue) % 122); 
			} else {
				encryptText += (char)(plainText.charAt (letters) + shiftValue); 	
			}
			
		}
			
		return encryptText;
	}//end encrypt
		
	public static String decrypt(String encryptText, int shiftValue) {
		String decryptText = "";
		
		for (int letters = 0; letters < encryptText.length(); letters++) {
			
			if((encryptText.charAt (letters) - shiftValue) < 97) {
				//System.out.println("shift "+(encryptText.charAt (letters) - shiftValue) % 97);
				//System.out.println("char "+(96 - shiftValue)); 
				decryptText += (char) (122 - (96 %(encryptText.charAt (letters) - shiftValue) )); 
			} else {
				decryptText += (char)(encryptText.charAt (letters) - shiftValue); 
			}
		}
		return decryptText;
	}//end decrypt

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in);
		System.out.println("Please enter a message: ");
		String plainText = scanWords. nextLine();
		String encryptTextTwo = (encrypt(plainText , 5));
		System.out.println(encryptTextTwo);
		System.out.println(decrypt ((encryptTextTwo) , 5));
		
	}//end main

	
}
