package Lec13;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(2, 2));
		System.out.println(s.substring(2));
		printallSubString(s);
		

	}

	public static void printallSubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
