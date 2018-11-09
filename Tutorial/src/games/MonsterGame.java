package games;

import java.util.Scanner;

public class MonsterGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] monster = {"Spooky Spooky Skeletons" , "Tactical Nuke" , "BeyBlade Betty" , "Zombie" , "Stefano" , "Player"};
		
		System.out.println("What is player name?: ");
		monster[monster.length - 1] = "Player: " + input.nextLine();
		
		int[] coins = new int[monster.length];
		
		//create coin array and gill randomly
		for(int i = 0; i < monster.length; i++) {
			coins[i] = (int)(Math.random() * 8 + 2); //new way to do random
		}
		
		String[] ability = new String[monster.length];
		ability[0] = "Sharp Bones";
		ability[1] = "Exploding";
		ability[2] = "BeyBlade";
		ability[3] = "Hitting";
		ability[4] = "Depression";
		ability[5] = "Invisible";
		
		for(int i = 0; i < monster.length; i++) { 
			System.out.println(monster[i] + " attacks with " + ability[i] + " has " + coins[i] + " gold coins");
		}
		
		System.out.println();
		
		//randomly assign HP
		int[] hp = new int[monster.length];
		for(int i = 0; i < monster.length; i++) {
			hp[i] = (int)(Math.random() * 15 + 5);
			System.out.println(monster[i] + " has " + hp[i] + " HP");
		}
		
		System.out.println();
			
		System.out.println("Spooky Spooky Skeletons killed a teenager by synchronized dancing, how many coins did they collect?: ");
		coins[0] += input.nextInt(); 
		System.out.println(monster[0] + " has " + coins[0] + " gold coins");
		
		System.out.println();
		
		System.out.println(monster[1] + " gets mutated into what?");
		input.nextLine();//eats up extra return/enter symbol
		monster[1] = input.nextLine();
		
		System.out.println("New monster: " + monster[1]); //set total to initial value
		
		int totalCoins = coins[monster.length - 1];
		int turns = 0;
		
		//fight while player hp > 0 
		while(hp[monster.length -1] > 0) {
			int randomMonster = (int)(Math.random() * monster.length);//pick random monster
			if(randomMonster != monster.length - 1) {//check to make sure not fighting self
				int hitChance = (int)(Math.random() * 2);
			
				if(hitChance % 2 == 0) {
					System.out.println(" You hit with your " + ability[monster.length -1] 
							+ " ability and " + monster[randomMonster] + " drops " 
							+ coins[randomMonster] + " Gold Coins");
					totalCoins += coins[randomMonster];
				}//if
				else if(hitChance % 2 == 1) {
					int randomDmg = (int)(Math.random() * 2 + 1);
					hp[monster.length - 1] -= randomDmg;
					System.out.println(monster[randomMonster] + " hit you for "
							 + randomDmg + " damage. \n" + hp[monster.length -1 ]
							 + " hp remaining");
				}//else if
				turns++;
			}//end if 
			System.out.println();
		}//end while
		System.out.println("you walkaway with " + totalCoins +
				" coins and lasted " + turns + " turns");
		
		
		
		
		
		
		
		
		
		
		
		

	}//end main

}//end class
