package Lec37;

import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(2);
		set.add(12);
		set.add(-2);
		set.add(9);
		set.add(7);
		set.add(39);
		set.add(-2);
		System.out.println(set);
//		// get
//		System.out.println(set.contains(7));
//		System.out.println(set.contains(71));
//		// remove
//		System.out.println(set.remove(7));
//		System.out.println(set.remove(71));
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(2);
		set1.add(12);
		set1.add(-2);
		set1.add(9);
		set1.add(7);
		set1.add(39);
		set1.add(-2);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(2);
		set2.add(12);
		set2.add(-2);
		set2.add(9);
		set2.add(7);
		set2.add(39);
		set2.add(-2);
		System.out.println(set2);

		for (int v : set) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : set1) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : set2) {
			System.out.print(v + " ");
		}
		System.out.println();

	}

}
