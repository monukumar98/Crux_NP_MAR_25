package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(120);
		ll.add(130);
		System.out.println(ll);
		ll.add(1, 7);// O(N)
		System.out.println(ll);
		System.out.println(ll.get(2));// O(1)
		System.out.println(ll.size());
		System.out.println(ll.remove(2));// O(N)
		System.out.println(ll);
		// update
		ll.set(1, -9);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
	}

}
