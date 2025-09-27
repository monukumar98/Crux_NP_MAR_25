package Lec43;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 2, 5, 1, 2, 5 }, nums2 = { 10, 5, 2, 1, 5, 2 };
	}

	public static int LCSBU(int [] text1, int [] text2) {
		int[][] dp = new int[text1.length + 1][text2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (text1[i-1] == text2[j-1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i][j - 1];
					int s = dp[i - 1][j];
					dp[i][j] = Math.max(s, f);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}
}
