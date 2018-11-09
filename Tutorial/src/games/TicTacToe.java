package games;

public class TicTacToe {

	public static void main(String[] args) {
		char[] board= new char[3];//single dimension array
		board[0] = '-';
		board[1] = '-';
		board[2] = '-';
		
		for(char token:board) { //enhanced for loop
			System.out.println(token);
		}//end for
		
		char[][] gameboard = new char[3][3];//2D array [rows][columns]
		
		//fill the array
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col <gameboard[row].length; col++) {
				System.out.print(gameboard[row][col] = '-');
				
			}//end nested for 
			System.out.println();
		}//end for
		
		gameboard[1][2] = 'X';
		
		//fill the array
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col <gameboard[row].length; col++) {
				System.out.print(gameboard[row][col] = '-');
						
			}//end nested for 
			System.out.println();
		}//end for
		
		int player = 1; //track who's turn it is
		//ask for input
		//place token
		//switch to player 2
		player = 2;
		//ask for input
	}//end main	

}//end class
