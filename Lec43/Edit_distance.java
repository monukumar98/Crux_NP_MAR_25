package Lec43;

import java.util.Arrays;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		int [][] dp = new int [s.length()][t.length()];
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(min_opp(s, t, 0, 0, dp));

	}
	public static int min_opp(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = min_opp(s, t, i + 1, j + 1, dp);
		} else {
			int D = min_opp(s, t, i + 1, j, dp);
			int I = min_opp(s, t, i, j + 1, dp);
			int R = min_opp(s, t, i + 1, j + 1, dp);
			ans = Math.min(I, Math.min(D, R)) + 1;
		}
		return dp[i][j] = ans;
	}

}
