package Lec35;

import java.util.Stack;

public class Infix_to_PostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "2-3/(5*2)+1";
		String s = "";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				s += ch;
			} else if (ch == '(') {
				st.push(ch);
			} else if (ch == ')') {
				while (st.peek() != '(') {
					s = s + st.pop();
				}
				st.pop();// '('
			} else {
				while (!st.isEmpty() && getvale(st.peek()) >= getvale(ch)) {
					s = s + st.pop();
				}
				st.push(ch);
			}
		}
		while (!st.isEmpty()) {
			s = s + st.pop();
		}
		System.out.println(s);
	}

	public static int getvale(char ch) {
		if (ch == '*' || ch == '/') {
			return 2;
		} else if (ch == '+' || ch == '-') {
			return 1;
		}
		return 0;
	}

}
