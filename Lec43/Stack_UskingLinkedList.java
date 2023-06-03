package Lec43;

import java.util.LinkedList;

public class Stack_UskingLinkedList {
	private LinkedList<Integer> ll = new LinkedList<>();

	public void push(int item) {
		ll.add(0, item);
	}

	public int pop() {
		return ll.remove();// first wala
	}

	public int peek() {
		return ll.get(0);// first wala
	}

	public int size() {
		return ll.size();
	}

	public void Dispaly() {
		System.out.println(ll);
	}
	public static void main(String[] args) {
		Stack_UskingLinkedList st = new Stack_UskingLinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.Dispaly();
		
	}

}
