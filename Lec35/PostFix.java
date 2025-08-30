package Lec35;

import java.util.Stack;

public class PostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "2", "3", "1", "*", "+", "9", "-" };
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			if (s.equals("+")) {
				int a = st.pop();
				int b = st.pop();
				int sum = b + a;
				st.push(sum);

			} else if (s.equals("-")) {
				int a = st.pop();
				int b = st.pop();
				int sum = b - a;
				st.push(sum);

			} else if (s.equals("/")) {
				int a = st.pop();
				int b = st.pop();
				int sum = b / a;
				st.push(sum);

			} else if (s.equals("*")) {
				int a = st.pop();
				int b = st.pop();
				int sum = b * a;
				st.push(sum);
			} else {
				st.push(Integer.parseInt(s));
			}
		}
		System.out.println(st.pop());

	}

}
