package ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int HUMAN_PLAYER = 1;
	static int COMPUTER = 2;

	public static int getInput() throws NumberFormatException, IOException {
		int inputNumber = Integer.parseInt(br.readLine());
		if (inputNumber == HUMAN_PLAYER || inputNumber == COMPUTER) {
			return inputNumber;
		} else {
			System.out.println("Please enter correct choice");
			return getInput();
		}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		User user = new User();
		Board board = new Board();
		char drawCharacter = 'n';
		System.out.println("Enter 1 for play with human ");
		System.out.println("Enter 2 for play with computer ");
		int userChoice = getInput();
		// if two human want to play the game
		if (userChoice == HUMAN_PLAYER) {
			// get the players choice character
			user.playerChoice();
			// use to check is some one win or not
			char winingCharacter = 0;
			// start the game
			while (board.gameOn) {
				// players start there move
				board.playerMoves(user);
				// check if any player win or loss
				winingCharacter = board.whoWinWhoLoss();
				if (winingCharacter != drawCharacter) {
					if (winingCharacter == user.PLAYER1) {
						System.out.println("Player 1 Wins");
					} else {
						System.out.println("Player 2 wins");
					}
				}
			}
			// if match is draw
			if (winingCharacter == drawCharacter) {
				System.out.println("Match is Draw");
			}

		}
		// computer and human play
		else {
			// get the players choice character
			user.getZeroOrCross();
			// use to check is some one win or not
			char winingCharacter = 0;
			// start the game
			while (board.gameOn) {
				// player start move
				board.nextMove(user);
				// check any one win or loss
				winingCharacter = board.whoWinWhoLoss();
				if (winingCharacter != 'n') {
					if (winingCharacter == user.USER_CHARACTER) {
						System.out.println("You win");
					} else {
						System.out.println("Sorry you loss,Computer win");
					}
				}
			}
			// if match is draw
			if (winingCharacter == 'n') {
				System.out.println("Match is Draw");
			}
		}

	}

}
