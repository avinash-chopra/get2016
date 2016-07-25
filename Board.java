package ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Board {
	char inputBoard[][];

	public Board() {
		inputBoard = new char[4][4];
		gameOn = true;
	}

	private int totalPossibleMoves = 0;
	// use to hold possible move's rows and column
	private int row[] = new int[20];
	private int column[] = new int[20];
	// use to check move is correct or not
	private final int CORRECT = 1;
	private final int WRONG = 0;
	// use to show blank board at first time
	private int firstShow = 1;
	boolean gameOn;

	/**
	 * This check the possible moves in board
	 * 
	 * @param board
	 *            // Board class object
	 */

	private void availableMove(Board board) {
		totalPossibleMoves = 0;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (board.inputBoard[i][j] == 0) {
					row[totalPossibleMoves] = i;
					column[totalPossibleMoves] = j;
					totalPossibleMoves++;
				}
			}
		}
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This return the row number at which user want next move
	 * 
	 * @return //row number at which user want next move
	 * @throws NumberFormatException
	 *             //if user input is not in number format
	 * @throws IOException
	 *             //when error occur in input or output
	 */
	private int getInputRow() throws NumberFormatException, IOException {
		int inputRow = Integer.parseInt(br.readLine());
		if (inputRow < 1 && inputRow > 4) {
			System.out.println("Please enter correct row number");
			return getInputRow();
		}
		return inputRow;
	}

	/**
	 * This return the column number at which user want next move
	 * 
	 * @return //column number at which user want next move
	 * @throws NumberFormatException
	 *             //if user input is not in number format
	 * @throws IOException
	 *             //when error occur in input or output
	 */
	private int getInputColumn() throws NumberFormatException, IOException {
		int inputColumn = Integer.parseInt(br.readLine());
		if (inputColumn < 1 && inputColumn > 4) {
			System.out.println("Please enter correct column number");
			return getInputColumn();
		}
		return inputColumn;
	}

	/**
	 * This check user input field is already fill or not if field is empty to
	 * move then return correct else wrong
	 * 
	 * @param rowNumber
	 *            // row number of field where user want to move
	 * @param columnNumber
	 *            // Column number of field where user want to move
	 * @return // return 1 or 0, 1 if correct field else 0 for wrong field
	 */
	private int check(int rowNumber, int columnNumber) {
		for (int i = 0; i < totalPossibleMoves; i++) {
			if (row[i] == rowNumber && column[i] == columnNumber) {
				return CORRECT;
			}
		}
		return WRONG;
	}

	public void computerMove(Board board, User user) {
		Random random = new Random();
		int randomNumber = random.nextInt(totalPossibleMoves);
		board.inputBoard[row[randomNumber]][column[randomNumber]] = user.COMPUTER_CHARACTER;
	}

	/**
	 * This get possible move from user and run a computer move randomly
	 * 
	 * @param board
	 *            // Board class object
	 * @param userCharacter
	 *            // UserCharacter class object
	 * @throws NumberFormatException
	 *             //if user input is not in number format
	 * @throws IOException
	 *             //when error occur in input or output
	 */
	void nextMove(Board board, User user) throws NumberFormatException,
			IOException {

		// show the initial board before game start
		if (firstShow == 1) {
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 4; j++) {
					if (board.inputBoard[i][j] == 0) {
						System.out.print("_" + "\t");
					} else {
						System.out.print(board.inputBoard[i][j] + "\t");
					}
				}
				System.out.println("\n");
			}
			firstShow = 0;
		}

		// initially set row and column -1
		int inputRow = -1;
		int inputColumn = -1;

		// get all possible moves
		availableMove(board);
		// run loop till user not input the correct input
		while (check(inputRow, inputColumn) != CORRECT) {
			System.out.println("Enter row number from 1 to 3 ");
			inputRow = getInputRow();
			System.out.println("Enter column number from 1 to 3");
			inputColumn = getInputColumn();
			// if a field is selected which is already filled
			if (check(inputRow, inputColumn) == WRONG) {
				System.out
						.println("This move already done choose another fiels\n");
			}
		}
		// assign correct move to the board
		board.inputBoard[inputRow][inputColumn] = user.USER_CHARACTER;
		// get all possible move for computer's move
		availableMove(board);
		// if user win after there move then computer should not move
		whoWinWhoLoss(board);
		if (totalPossibleMoves > 0 && gameOn == true) {
			computerMove(board, user);
			System.out.println("After Computer move");
			// show all the moves
			if (firstShow == 0) {
				for (int i = 1; i < 4; i++) {
					for (int j = 1; j < 4; j++) {
						if (board.inputBoard[i][j] == 0) {
							System.out.print("_" + "\t");
						} else {
							System.out.print(board.inputBoard[i][j] + "\t");
						}
					}
					System.out.println();
					System.out.println();
				}
			}
		}
		// if any user win then show board
		if (gameOn == false) {
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 4; j++) {
					if (board.inputBoard[i][j] == 0) {
						System.out.print("_" + "\t");
					} else {
						System.out.print(board.inputBoard[i][j] + "\t");
					}
				}
				System.out.println();
				System.out.println();
			}

		}

	}

	public char whoWinWhoLoss(Board board) {

		// check all the rows there are some match is present or not
		for (int i = 1; i < 4; i++) {
			if (board.inputBoard[i][2] == board.inputBoard[i][1]
					&& board.inputBoard[i][2] == board.inputBoard[i][3]
					&& board.inputBoard[i][2] != 0) {
				this.gameOn = false;
				return board.inputBoard[i][2];
			}
		}
		// now check the all column
		for (int i = 1; i < 4; i++) {
			if (board.inputBoard[2][i] == board.inputBoard[1][i]
					&& board.inputBoard[2][i] == board.inputBoard[3][i]
					&& board.inputBoard[2][i] != 0) {
				this.gameOn = false;
				return board.inputBoard[2][i];
			}
		}
		// now check for left top to right down
		if (board.inputBoard[2][2] == board.inputBoard[1][1]
				&& board.inputBoard[2][2] == board.inputBoard[3][3]
				&& board.inputBoard[2][2] != 0) {
			this.gameOn = false;
			return board.inputBoard[2][2];
		}
		// now check from left down to right top
		if (board.inputBoard[2][2] == board.inputBoard[3][1]
				&& board.inputBoard[2][2] == board.inputBoard[1][3]
				&& board.inputBoard[2][2] != 0) {
			this.gameOn = false;
			return board.inputBoard[2][2];
		}
		// now check board is full or not, if full then return 'n'
		int total = 0;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (board.inputBoard[i][j] != 0) {
					total++;
				}
			}
		}

		// if board is full return n and set gameOn is false
		if (total == 9) {
			this.gameOn = false;
			return 'n';
		}

		return 'n';
	}

	public void playerMoves(Board board, User user)
			throws NumberFormatException, IOException {

		// show the initial board before next move
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (board.inputBoard[i][j] == 0) {
					System.out.print("_" + "\t");
				} else {
					System.out.print(board.inputBoard[i][j] + "\t");
				}
			}
			System.out.println("\n");
		}

		// initially set row and column -1
		int inputRow = -1;
		int inputColumn = -1;

		// get all possible moves
		availableMove(board);
		System.out.println("Player 1 Enter the field");
		while (check(inputRow, inputColumn) != CORRECT) {
			System.out.println("Enter row number from 1 to 3 ");
			inputRow = getInputRow();
			System.out.println("Enter column number from 1 to 3");
			inputColumn = getInputColumn();
			// if a field is selected which is already filled
			if (check(inputRow, inputColumn) == WRONG) {
				System.out
						.println("This move already done choose another fiels\n");
			}
		}

		// assign correct move to the board
		board.inputBoard[inputRow][inputColumn] = user.PLAYER1;
		// get all possible move for Player 2's move
		availableMove(board);
		// if user win after there move then computer should not move
		whoWinWhoLoss(board);

		// show board
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (board.inputBoard[i][j] == 0) {
					System.out.print("_" + "\t");
				} else {
					System.out.print(board.inputBoard[i][j] + "\t");
				}
			}
			System.out.println();
			System.out.println();
		}

		// payer 2 choice
		inputRow = -1;
		inputColumn = -1;
		availableMove(board);
		if (gameOn == true) {
			System.out.println("Player 2 Enter your field");
			while (check(inputRow, inputColumn) != CORRECT) {
				System.out.println("Enter row number from 1 to 3 ");
				inputRow = getInputRow();
				System.out.println("Enter column number from 1 to 3");
				inputColumn = getInputColumn();
				// if a field is selected which is already filled
				if (check(inputRow, inputColumn) == WRONG) {
					System.out
							.println("This move already done choose another fiels\n");
				}
			}
			board.inputBoard[inputRow][inputColumn] = user.PLAYER2;
		}
		whoWinWhoLoss(board);
		// if any user win then show board
		if (gameOn == false) {
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 4; j++) {
					if (board.inputBoard[i][j] == 0) {
						System.out.print("_" + "\t");
					} else {
						System.out.print(board.inputBoard[i][j] + "\t");
					}
				}
				System.out.println("\n");
			}
		}
	}

}
