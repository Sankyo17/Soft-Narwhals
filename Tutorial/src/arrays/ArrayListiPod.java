package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListiPod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		ArrayList<String> allSongs = new ArrayList<String>();
		ArrayList<String> artists = new ArrayList<>();
		
		//2
		allSongs.add("Happier");
		artists.add("Marshmello");
		allSongs.add("This Feeling");
		artists.add("The Chainsmokers");
		allSongs.add("Entertainer");
		artists.add("ZAYN");
		allSongs.add("Nobody");
		artists.add("LEISURE");
		allSongs.add("Bleep Blop");
		artists.add("Fauves");
		
		//3
		ArrayList<String> partyPlayList = new ArrayList<>();
		
		//5
		for(int i = 0; i <allSongs.size(); i ++) {
			System.out.println((i + 1) + " " + allSongs.get(i) + " " 
					+ artists.get(i));
		}//end for
		System.out.println();
		
		System.out.println("Select menu option: \n" + 
		"1. Add song to Library \n" + 
		"2. Delete song from Library \n" + 
		"3. Add song to Party Playlist");
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
			while (choice != 0) {
				if(choice == 1) {//add song
					input.nextLine();//clear extra enter character
					System.out.print("Enter title: ");
					allSongs.add(input.nextLine());
					System.out.println("Enter artist name: ");
					artists.add(input.nextLine());
				}
				else if(choice == 2) {//delete from Library
					System.out.println("Enter song number to delete: ");
					if(input.nextInt()-1 > allSongs.size()) {
						System.out.println("That is an invalid number");
					}else {
						allSongs.remove(input.nextInt()-1);
						artists.remove(input.nextInt()-1);
					}
			
				}
				else if(choice == 3) {//add song to PartyPlayList
					System.out.print("Enter title: ");
					partyPlayList.add(input.nextLine());
			
			
				}
		
		}
	}//end main

}//end class
