package Lec13;

public class lenght_Wise_SunString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		printallSubString(s);

	}

	public static void printallSubString(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i=j-len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}
