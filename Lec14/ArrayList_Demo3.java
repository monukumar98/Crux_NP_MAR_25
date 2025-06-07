package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(120);
		ll.add(130);
		ll.add(1, 7);// O(N)
		ll.add(2);
		ll.add(21);
		ll.add(12);
		ll.add(211);
		ll.add(3);
		System.out.println(ll);

	}

}
