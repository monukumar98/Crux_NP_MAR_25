package Lec30;

import java.util.*;

public class Stack_using_linkedList {

	private LinkedList<Integer> ll = new LinkedList<>();

	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();
	}

	public int peek() {
		return ll.getFirst();
	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll);
	}
}
