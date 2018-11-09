package games;
import java.util.Scanner;
public class PlayTicTacToe {
	static char token = '-';
	static int rowChoice = 0;
	static int columnChoice = 0;
	static char playerOneToken = 'X';
	static char playerTwoToken = 'O';
	static String playerOneName = " ";
	static String playerTwoName = " ";
	static String playerWinName = " ";
	static int playerOneReady = 0;
	static int playerTwoReady = 0;
	static int turns = 0;
	
	public static boolean wonDiagonal(char[][]board, int player) {
		if(player == 1) {
			if(board[0][0] == playerOneToken && board[1][1] == playerOneToken && board[2][2] == playerOneToken) {
				return true;
			} else if (board[0][2] == playerOneToken && board [1][1] == playerOneToken && board[2][1] == playerOneToken) {
				return true;
			} else {
				return false;
			}
		} else if(player == 2) {
			if(board[0][0] == playerTwoToken && board[1][1] ==playerTwoToken && board[2][2] == playerTwoToken) {
				return true;
			} else if (board[0][2] == playerTwoToken && board [1][1] == playerTwoToken && board[2][1] == playerTwoToken) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}//end wonDiagonal
	public static boolean wonStraightLines(char[][]board, int player) {
		if(player == 1) {
			if(board[0][0] == playerOneToken && board[0][1] == playerOneToken && board[0][2] == playerOneToken) {
				return true;
			}else if(board[1][0] == playerOneToken && board[1][1] == playerOneToken && board[1][2] == playerOneToken) {
				return true;
			}else if(board[2][0] == playerOneToken && board[2][1] == playerOneToken && board[2][2] == playerOneToken) {
				return true;
			}else if(board[0][0] == playerOneToken && board[1][0] == playerOneToken && board[2][0] == playerOneToken) {
				return true;
			}else if(board[0][1] == playerOneToken && board[1][1] == playerOneToken && board[2][1] == playerOneToken) {
				return true;
			}else if(board[0][2] == playerOneToken && board[1][2] == playerOneToken && board[2][2] == playerOneToken) {
				return true;
			}else {
				return false;
			}
		}else if(player == 2) {
			if(board[0][0] == playerTwoToken && board[0][1] == playerTwoToken && board[0][2] == playerTwoToken) {
				return true;
			}else if(board[1][0] == playerTwoToken && board[1][1] == playerTwoToken && board[1][2] == playerTwoToken) {
				return true;
			}else if(board[2][0] == playerTwoToken && board[2][1] == playerTwoToken && board[2][2] == playerTwoToken) {
				return true;
			}else if(board[0][0] == playerTwoToken && board[1][0] == playerTwoToken && board[2][0] == playerTwoToken) {
				return true;
			}else if(board[0][1] == playerTwoToken && board[1][1] == playerTwoToken && board[2][1] == playerTwoToken) {
				return true;
			}else if(board[0][2] == playerTwoToken && board[1][2] == playerTwoToken && board[2][2] == playerTwoToken) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}//end wonStraightLines
	public static boolean draw(char[][]board, int turns) {
		if(turns >= 9) {
			return true;
		}else {
			return false;
		}
	}//end draw
	public static boolean win(char[][] board, int player) {
		if(wonDiagonal(board , player) == true || wonStraightLines(board , player) == true) {
			return true;
		}else {
			return false;
		}
	}//end win
	public static void drawBoard(char[][]board) {
		//fill the array
		board[rowChoice][columnChoice] = token;
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col <board[row].length; col++) {
				
				if(board[row][col] == token) {
					System.out.print(board[row][col] = token);
				}else if(board[row][col] == 'X') {
					System.out.print(board[row][col] = 'X');
				}else if(board[row][col] == 'O') {
					System.out.print(board[row][col] = 'O');
				}else {
					System.out.print(board[row][col] = '-');
				}
				
			}//end nested for 
			System.out.println();
		}//end for
	}//end drawBoard
	public static void name() {
		System.out.println("Welcome contestants to Tic Tac Toe! "
				+ "\nI am your host Mr.Tic and we will be playing the exiting game of Tic Tac Toe! "
				+ "\nNow player 1, what is your name?");
		Scanner name = new Scanner(System.in);
				playerOneName = name.nextLine();
				System.out.println("Welcome " + playerOneName + " to the game!"
						+ "\nNow player 2, what is your name?");
				playerTwoName = name.nextLine();
				System.out.println("Welcome " + playerTwoName + " to the game! ");
				ready(playerOneName , playerTwoName);
	}//end name
	public static void ready(String playerOneName , String playerTwoName) {
		Scanner name = new Scanner(System.in);
		System.out.println("Is " + playerOneName + " ready? (1 for yes and 2 for no)");
		playerOneReady = name.nextInt();
		System.out.println("Is " + playerTwoName + " ready? (1 for yes and 2 for no)");
		playerTwoReady = name.nextInt();
		if(playerOneReady == 1 && playerTwoReady == 1) {
			System.out.println("Let's Begin!");
			startGame(playerOneReady , playerTwoReady);
		}else if (playerOneReady == 2 || playerTwoReady == 2) {
			System.out.println("Goodbye!");
		}
	}//end ready
	
	public static void startGame(int playerOneReady , int PlayerTwoReady) {
		Scanner in = new Scanner(System.in);
		while(playerOneReady == 1 && playerTwoReady == 1) {
		char[][]board = new char [3][3];
		
		int player = 2;
		
		drawBoard(board);
			while(!win(board, player) && playerOneReady == 1 && playerTwoReady == 1 && !draw(board , turns)) {
				if (player == 1) {
					player = 2;
					playerWinName = playerTwoName;
				} else {
					player = 1;
					playerWinName = playerOneName;
				}
				while(true) {
					System.out.println(playerWinName + " choose a row: ");
					rowChoice = in.nextInt() - 1;
					System.out.println(playerWinName + " choose a column: ");
					columnChoice = in.nextInt() - 1;
					if(board[rowChoice][columnChoice] == 'X' || board[rowChoice][columnChoice] == 'O') {
						System.out.println("Sorry that is not a valid choice \nPlease choose again");		
					} else {
						if(player == 1) {
							token = 'X';
							turns++;
							break;
						} if(player == 2) {
							token = 'O';
							turns++;
							break;
						}
					}
				}//end while(true)
				drawBoard(board);
			}//end while(!win(board, player) && playerOneReady == 1 && playerTwoReady == 1)
			if(win(board , player)) {
				System.out.println(playerWinName + " wins!");
				System.out.println();
			} else if (draw(board , turns)) {
				System.out.println("It's a draw! \nGood Game " + playerOneName + " and " + playerTwoName + "!");
			}
			System.out.println("Do you want to play again? ");
			
			ready(playerOneName , playerTwoName);
					
		}//end while(playerOneReady == 1 && playerTwoReady == 1)
	}
	public static void main(String[] args) {
		name();
	}//end main

}//end class
