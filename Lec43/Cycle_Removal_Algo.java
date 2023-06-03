package Lec43;

public class Cycle_Removal_Algo {

	public class Node {
		int val;
		Node next;

	}

	private Node head;// 1st Node of LinkedList
	private int size;// number of node
	private Node tail;// last Node of LinkedList
	// O(1)

	public void addfirst(int item) {
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
	public void addlast(int item) {
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

	public void CreateCycle() throws Exception {
		Node nn = GetNode(2);
		tail.next = nn;

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

	public Node hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}

		}
		return null;
	}

	public void RemovalCycle1() {
		Node meet = hasCycle(head);
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;

		}

	}

	public void RemovalCycle2() {
		Node meet = hasCycle(head);
		if (meet == null) {
			return;
		}
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void floyedCycleremoval() {
		Node meet = hasCycle(head);
		if (meet == null) {
			return;
		}
		Node slow = head;
		Node fast = meet;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal_Algo cl = new Cycle_Removal_Algo();
		cl.addlast(10);
		cl.addlast(20);
		cl.addlast(30);
		cl.addlast(40);
		cl.addlast(50);
		cl.addlast(60);
		cl.addlast(70);
		cl.addlast(80);
		cl.CreateCycle();
		// cl.RemovalCycle1();
		cl.RemovalCycle2();

		cl.Display();
	}

}
