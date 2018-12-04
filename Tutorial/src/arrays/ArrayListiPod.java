
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
			while (choice != 4) 
			{
				int choice = 0;
					System.out.println("Select menu option: \n" + 
					"1. Add song to Library \n" + 
					"2. Delete song from Library \n" + 
					"3. Add song to Party Playlist \n" + 
					"4. Exit");
		
					Scanner input = new Scanner(System.in);
					choice = input.nextInt();
		
			
				switch(choice) {
					case 1: 
						input.nextLine();//clear extra enter character
						System.out.print("Enter title: ");
						allSongs.add(input.nextLine());
						System.out.println("Enter artist name: ");
						artists.add(input.nextLine());
						break;
					case 2:
						System.out.println("Enter song number to delete: ");
						int delete = input.nextInt();
						allSongs.remove(delete);
						artists.remove(delete);
						break;
					case 3:
						partyPlayList.add(allSongs.get(input.nextInt()));
						break;
					case 4:
						System.out.println("Bye");
						break;
					default:
						System.out.println("Invalid choice");
				}//end switch
			for(int i = 0; i <allSongs.size(); i ++) {
				System.out.println((i + 1) + " " + allSongs.get(i) + " " 
						+ artists.get(i));
			}//end for
		}//end while
	}//end main

}//end class
