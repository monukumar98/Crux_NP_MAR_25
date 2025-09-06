package Lec37;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Ankit", 77);
		map.put("Rajesh", 67);
		map.put("Raju", 77);
		map.put("Kunal", 87);
		map.put("Amisha", 37);
		map.put("Ankita", 37);
		map.put("Shiva", 47);
		map.put("Rajesh", 17);
//	//	map.put(null, 10);
		System.out.println(map);
//		// get 
//		System.out.println(map.get("Raj"));
//		System.out.println(map.get("Raju"));
//		// containsKey
//		System.out.println(map.containsKey("Raj"));
//		System.out.println(map.containsKey("Raju"));
//		// remove
//		System.out.println(map.remove("Raj"));
//		System.out.println(map.remove("Raju"));
//		System.out.println(map);
		TreeMap<String, Integer> map2 = new TreeMap<>();
		// add
		map2.put("Ankit", 77);
		map2.put("Rajesh", 67);
		map2.put("Raju", 77);
		map2.put("Kunal", 87);
		map2.put("Amisha", 37);
		map2.put("Ankita", 37);
		map2.put("Shiva", 47);
		map2.put("Rajesh", 17);
		System.out.println(map2);
		LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>();
		// add
		map3.put("Ankit", 77);
		map3.put("Rajesh", 67);
		map3.put("Raju", 77);
		map3.put("Kunal", 87);
		map3.put("Amisha", 37);
		map3.put("Ankita", 37);
		map3.put("Shiva", 47);
		map3.put("Rajesh", 17);
		map3.put(null, 10);
		System.out.println(map3);
//		// System.out.println(map.keySet());
//		Set<String> set = map.keySet();
//		for(String key:set) {
//			System.out.println(key+" "+map.get(key));
//		}
//		Set<String> set = map.keySet();
		for(String key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}

}













