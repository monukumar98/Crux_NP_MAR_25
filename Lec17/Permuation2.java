package Lec17;

public class Permuation2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		print(ques, "");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if(Is_Present(ques, ch, i)==false) {
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			print(s1 + s2, ans + ch);
			}
		}

	}
	public static boolean Is_Present(String str, char ch, int idx) {
		for (int i = idx + 1; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}
		}
		return false;

	}


}

