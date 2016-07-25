package session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int HUMAN_PLAYER = 1;
	int COMPUTER = 2;
	public int getInput() throws NumberFormatException, IOException{
		int inputNumber = Integer.parseInt(br.readLine());
		if (inputNumber == HUMAN_PLAYER || inputNumber == COMPUTER) {
			return inputNumber;
		}else{
			System.out.println("Please enter correct choice");
			return getInput();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		UserCharacter userCharacter = new UserCharacter();
		Board board = new Board();
		WinLoss winLoss = new WinLoss();
		Move move = new Move();
		TicTacToe ticTacToe = new  TicTacToe();
		char drawCharacter = 'n';
		System.out.println("Enter 1 for play with human ");
		System.out.println("Enter 2 for play with computer ");
		int userChoice = ticTacToe.getInput();
		// if two human want to play the game
		if(userChoice == ticTacToe.HUMAN_PLAYER ){
			// get the players choice character 
			userCharacter.playerChoice();
			// use to check is some one win or not 
			char winingCharacter=0;		
			// start the game 
			while(winLoss.gameOn){
				// players start there move 
				move.playerMoves(board, userCharacter);
				// check if any player win or loss
				winingCharacter= winLoss.whoWinWhoLoss(board);
				if(winingCharacter != drawCharacter){
					if(winingCharacter == userCharacter.PLAYER1){
						System.out.println("Player 1 Wins");
					}
					else{
						System.out.println("Player 2 wins");
					}
				}
			}
			// if match is draw 
			if(winingCharacter == drawCharacter){
				System.out.println("Match is Draw");
			}	
			
		}
		// computer and human play 
		else{	
			// get the players choice character 
			userCharacter.getZeroOrCross();
			// use to check is some one win or not 
			char winingCharacter=0;	
			// start the game
			while(winLoss.gameOn){
				// player start move 
				move.nextMove(board, userCharacter);
				// check any one win or loss
				winingCharacter= winLoss.whoWinWhoLoss(board);
				if(winingCharacter != 'n'){
					if(winingCharacter == userCharacter.USER_CHARACTER){
						System.out.println("You win");
					}
					else{
						System.out.println("Sorry you loss,Computer win");
					}
				}
			}
			// if match is draw 
			if(winingCharacter == 'n'){
				System.out.println("Match is Draw");
			}

			
		}
					
	}

}
