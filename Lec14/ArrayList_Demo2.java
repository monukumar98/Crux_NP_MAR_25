package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(120);
		ll.add(130);
		ll.add(1, 7);// O(N)
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int[] arr = new int[8];

		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}

	}

}
