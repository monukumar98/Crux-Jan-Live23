package Lec46;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lec44.BinaryTree.Node;

public class Create_tree_Using_level_Order {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}

	TreeNode root;
	Scanner sc = new Scanner(System.in);

	public Create_tree_Using_level_Order() {
		// TODO Auto-generated constructor stub
		root = buildTree();
	}

	private TreeNode buildTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		TreeNode node = new TreeNode();
		node.val = item;
		root = node;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			TreeNode rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				TreeNode n = new TreeNode();
				n.val = c1;
				rv.left = n;
				q.add(n);
			}
			if (c2 != -1) {
				TreeNode n = new TreeNode();
				n.val = c2;
				rv.right = n;
				q.add(n);
			}

		}
		return root;

	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.val + " ");

	}

	public static void main(String[] args) {
		Create_tree_Using_level_Order cl = new Create_tree_Using_level_Order();
		cl.POStOrder();
	}

}
