package Lec20;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		print(board, n, 0);

	}

	public static void print(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				print(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int r = row;
		int c = col;
		// left daigonal
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// right daigonal
		r = row;
		c = col;
		// left daigonal
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		// up
		r = row;

		// left daigonal
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;

		}
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
