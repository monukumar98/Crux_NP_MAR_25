package Lec30;

import java.util.LinkedList;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// add last
		ll.add(20);
		ll.addFirst(12);
		ll.addFirst(15);
		ll.addLast(2);
		ll.add(1, -9);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.peek());// getFirst()
		System.out.println(ll);
		System.out.println(ll.getLast());
		System.out.println(ll.get(1));
		System.out.println(ll.remove());// remove first
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll.remove(1));
		System.out.println(ll);
		System.out.println(ll.poll());// remove first

	}

}
