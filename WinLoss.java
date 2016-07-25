package session3;

public class WinLoss {

	boolean gameOn;
	public WinLoss() {
		gameOn = true;
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
		int total=0;
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				if(board.inputBoard[i][j] != 0){
					total++;
				}
			}
		}
		
		// if board is full return n and set gameOn is false
		if(total == 9){
			this.gameOn = false;
			return 'n';
		}
		
		return 'n';
	}

}
