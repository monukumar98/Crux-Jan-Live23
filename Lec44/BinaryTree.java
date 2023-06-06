package Lec44;

import java.util.Scanner;

public class BinaryTree {

	public class Node {
		int val;
		Node left;
		Node right;

	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub

		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();

		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "";
		s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;

		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;

		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);

	}

}
