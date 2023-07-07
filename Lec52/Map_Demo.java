package Lec52;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Mohini", 78);
		map.put("Hunir", 98);
		map.put("Raja", 88);
		map.put("Nandini", 55);
		map.put("Amisha", 48);
		map.put("Kunal", 78);
		map.put("Ankit", 69);
		map.put("Ankita", 53);
		map.put("Ankit", 99);
		// map.put(null, 89);
		System.out.println(map);
//		System.out.println(map.get("Mohini"));
//		System.out.println(map.get("Mohine"));
//		System.out.println(map.containsKey("Raja"));
//		System.out.println(map.containsKey("Rani"));
//		System.out.println(map.remove("Kunal"));
//		System.out.println(map.remove("Kunala"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Mohini", 78);
		map1.put("Hunir", 98);
		map1.put("Raja", 88);
		map1.put("Nandini", 55);
		map1.put("Amisha", 48);
		map1.put("Kunal", 78);
		map1.put("Ankit", 69);
		map1.put("Ankita", 53);
		map1.put("Ankit", 99);
		// map1.put(null, 90);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Mohini", 78);
		map2.put("Hunir", 98);
		map2.put("Raja", 88);
		map2.put("Nandini", 55);
		map2.put("Amisha", 48);
		map2.put("Kunal", 78);
		map2.put("Ankit", 69);
		map2.put("Ankita", 53);
		map2.put("Ankit", 99);
		// map2.put(null, 90);
		System.out.println(map2);
		// 1st way
//		Set<String> key = map.keySet();
//		System.out.println(key);
//		for (String k : key) {
//			System.out.println(k + " " + map.get(k));
//		}
//		Set<String> key = map.keySet();
//		System.out.println(key);
		// 2nd way
		for (String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}

//		ArrayList<String> key = new ArrayList<>(map.keySet());
//		System.out.println(key);
//		// 3rd way
//		for (String k : map.keySet()) {
//			System.out.println(k + " " + map.get(k));
//		}

	}

}
