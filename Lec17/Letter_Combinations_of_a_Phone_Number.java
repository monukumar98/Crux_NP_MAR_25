package Lec17;

import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "239";
		List<String> ll = new ArrayList<>();
		Letter_Combinations(ques, "",ll);
		System.out.println(ll);

	}

	public static void Letter_Combinations(String ques, String ans,List<String> ll) {
		if (ques.length() == 0) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String press = key[ch - '0'];// abc
		for (int i = 0; i < press.length(); i++) {
			Letter_Combinations(ques.substring(1), ans + press.charAt(i),ll);
		}

	}

}
