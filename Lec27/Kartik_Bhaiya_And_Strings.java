package Lec27;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaababbabababababbabbaaa";
		int k = 3;
		int flip_a = maximumlength(s, k, 'a');
		int flip_b = maximumlength(s, k, 'b');
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int maximumlength(String s, int k, char ch) {
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			// shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans calculate
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}
}
