package Lec52;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(2);
		set.add(19);
		set.add(29);
		set.add(-12);
		set.add(120);
		set.add(125);
		set.add(120);
		System.out.println(set);
//		System.out.println(set.contains(125));
//		System.out.println(set.contains(1250));
//      System.out.println(set.remove(12));		
//		System.out.println(set.remove(129));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(12);
		set1.add(2);
		set1.add(19);
		set1.add(29);
		set1.add(-12);
		set1.add(120);
		set1.add(125);
		set1.add(120);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(12);
		set2.add(2);
		set2.add(19);
		set2.add(29);
		set2.add(-12);
		set2.add(120);
		set2.add(125);
		set2.add(120);
		System.out.println(set2);
		for (int v : set2) {
			System.out.print(v + " ");
		}
		if (set.contains(42)) {

		}
		System.out.println();
		ArrayList<Integer> ll = new ArrayList<>(set1);
		System.out.println(ll + "ll");
//		System.out.println(ll.remove(2));

	}

}
