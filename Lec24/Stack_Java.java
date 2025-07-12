package Lec24;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());// 10
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.peek());// view top ka data
		System.out.println(st.pop());// remove top ka data
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st);
		for (int v : st) {
			System.out.print(v + " ");
		}
		System.out.println();

	}

}







