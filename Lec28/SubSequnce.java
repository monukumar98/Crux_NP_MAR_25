package Lec28;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		print(str);

	}

	public static void print(String str) {
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattren(i, str);
		}
	}

	private static void Pattren(int i, String str) {
		// TODO Auto-generated method stub
		int idx = 0;
		String ans = "";
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans + str.charAt(idx);
			}
			idx++;
			i >>= 1;
		}
		System.out.println(ans);
	}

}
