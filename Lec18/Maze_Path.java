package Lec18;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// row
		int m = 3;// col
		Print(0, 0, n - 1, m - 1, "");

	}

	// cr-> current row | cc-> cr-> current col | er-> end row | ec-> end col
	public static void Print(int cr, int cc, int er, int ec, String ans) {
		if (cc == ec && er == cr) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		Print(cr, cc + 1, er, ec, ans + "H");
		Print(cr + 1, cc, er, ec, ans + "V");
	}

}





