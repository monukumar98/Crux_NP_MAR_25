package Lec30;

import java.util.*;

public class Queue_using_linkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);// enqueue
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q.poll());// remove() --> Dequeue
		System.out.println(q.peek());// getfirst --> getfront
		System.out.println(q);

	}

}
