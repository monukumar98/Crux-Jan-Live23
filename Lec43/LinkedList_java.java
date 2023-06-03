package Lec43;

import java.util.LinkedList;

public class LinkedList_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(4);
		ll.add(34);
		ll.add(56);
		ll.add(0, 6);
		System.out.println(ll);
		System.out.println(ll.size());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

}
