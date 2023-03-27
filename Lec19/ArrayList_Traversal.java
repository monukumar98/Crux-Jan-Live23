package Lec19;

import java.util.*;

public class ArrayList_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(2, -6);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		int[] arr = { 1, 2, 3, 4, 5, 89 };

		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");

		}
		System.out.println();
		for (int v : arr) {
			System.out.print(v + " ");

		}
		System.out.println();
		char[] a = { 'a', 'n', 'c' };
		for (char v : a) {
			System.out.print(v + " ");
		}
		
		

	}

}
