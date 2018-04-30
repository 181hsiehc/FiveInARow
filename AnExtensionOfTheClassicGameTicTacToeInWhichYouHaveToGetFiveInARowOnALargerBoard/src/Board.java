public class Board {
	private int size;
	private int[][] board;

	public Board(int s) {
		size = s;
		board = new int[size][size];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				board[r][c] = 0;
			}
		}
	}

	public Board() {
		size = 15;
		board = new int[size][size];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				board[r][c] = 0;
			}
		}
	}

	public int gameWon() {
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				int id = board[r][c];
				if (!c < 4) {

				}
			}
		}
		return 0;
	}
}
