package Lec49;

public class LinkedList<T> {

	public class Node {
		T val;
		Node next;

	}

	private Node head;// 1st Node of LinkedList
	private int size;// number of node
	private Node tail;// last Node of LinkedList
	// O(1)

	public void addfirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void addlast(T item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

//O(N)
	public void addatindex(T item, int k) throws Exception {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node k_1th = GetNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;

		}
	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k out of range hai");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;

		}
		return temp;

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}

//O(1)
	public T getfirst() throws Exception {
		if (head == null) {
			throw new Exception("Bklol list empty hai");
		}
		return head.val;
	}

	// O(1)
	public T getlast() throws Exception {
		if (head == null) {
			throw new Exception("Bklol list empty hai");
		}
		return tail.val;
	}

//O(n)
	public T getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

//O(1)
	public T removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;

		}
		size--;
		return temp.val;
	}

	public T removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = GetNode(size - 2);
			Node temp = tail;
			tail = prev;
			size--;
			return temp.val;

		}
	}

	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = prev.next; // GetNode(k);
			prev.next = curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}

	}

}